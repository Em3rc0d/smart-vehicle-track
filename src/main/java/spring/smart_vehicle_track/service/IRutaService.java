package spring.smart_vehicle_track.service;

import spring.smart_vehicle_track.model.Ruta;

import java.util.Map;

public interface IRutaService {
    Ruta crearRuta(Ruta ruta);
    Ruta actualizarRuta(Long id, Map<String, Object> datosRuta);
    Ruta eliminarRuta(Long id);
    Ruta obtenerRutaPorId(Long id);
}
