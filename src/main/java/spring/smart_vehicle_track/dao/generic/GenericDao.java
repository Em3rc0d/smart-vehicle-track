package spring.smart_vehicle_track.dao.generic;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Map;

import org.springframework.stereotype.Service;

import lombok.Data;

@Data
@Service
public class GenericDao implements IGenericDao {

    private static final String[] CAMPOS_NO_ACTUALIZABLES = {"id", "createdAt", "updatedAt"};

    @Override
    public <T> T actualizarCampos(T entidad, Map<String, Object> campos) {
        Class<?> clazz = entidad.getClass();

        campos.forEach((campo, valor) -> {
            if (!esCampoActualizable(campo)) {
                System.out.println("Campo ignorado por política: " + campo);
                return;
            }

            try {
                Field field = getCampo(clazz, campo);
                field.setAccessible(true);

                Object valorConvertido = convertirValor(field.getType(), valor);
                field.set(entidad, valorConvertido);

            } catch (NoSuchFieldException | IllegalAccessException e) {
                System.out.println("Campo ignorado: " + campo + " -> " + e.getMessage());
            }
        });

        return entidad;
    }

    private boolean esCampoActualizable(String campo) {
        return Arrays.stream(CAMPOS_NO_ACTUALIZABLES).noneMatch(campo::equalsIgnoreCase);
    }

    private Field getCampo(Class<?> clazz, String nombreCampo) throws NoSuchFieldException {
        Class<?> actual = clazz;
        while (actual != null) {
            try {
                return actual.getDeclaredField(nombreCampo);
            } catch (NoSuchFieldException e) {
                actual = actual.getSuperclass();
            }
        }
        throw new NoSuchFieldException("Campo no encontrado: " + nombreCampo);
    }

    @Override
    public Object convertirValor(Class<?> tipo, Object valor) {
        if (valor == null) return null;

        if (tipo.equals(Integer.class) || tipo.equals(int.class)) {
            return Integer.parseInt(valor.toString());
        } else if (tipo.equals(Long.class) || tipo.equals(long.class)) {
            return Long.parseLong(valor.toString());
        } else if (tipo.equals(Boolean.class) || tipo.equals(boolean.class)) {
            return Boolean.parseBoolean(valor.toString());
        } else if (tipo.equals(String.class)) {
            return valor.toString();
        }
        return valor;
    }
}
