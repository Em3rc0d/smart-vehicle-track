package spring.smart_vehicle_track.service.interfaces;

import spring.smart_vehicle_track.model.Ruta;
import spring.smart_vehicle_track.dto.RutaDto;

import java.util.List;
import java.util.Map;

public interface IRutaService {
    Ruta crearRuta(RutaDto rutaDto);
    Ruta actualizarRuta(Map<String, Object> datosRuta, Long id);
    void eliminarRuta(Long id);
    List<Ruta> obtenerRutas();
}
