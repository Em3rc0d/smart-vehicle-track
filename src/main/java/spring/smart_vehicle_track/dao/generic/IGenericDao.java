package spring.smart_vehicle_track.dao.generic;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public interface IGenericDao {
    <T> T actualizarCampos(T entidad, Map<String, Object> campos);
    Object convertirValor(Class<?> tipo, Object valor);
}
