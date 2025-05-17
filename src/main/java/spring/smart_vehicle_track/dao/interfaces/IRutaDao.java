package spring.smart_vehicle_track.dao.interfaces;

import org.springframework.stereotype.Service;
import spring.smart_vehicle_track.model.Ruta;

import java.util.List;

@Service
public interface IRutaDao {
    Ruta crearRuta(Ruta ruta);

    Ruta encontrarRutaById(Long id);

    Ruta actualizarRuta(Ruta ruta);

    void eliminarRuta(Ruta ruta);

    List<Ruta> obtenerRutas();
}
