package spring.smart_vehicle_track.service.interfaces;

import spring.smart_vehicle_track.dto.RutaPuntoDto;
import spring.smart_vehicle_track.model.RutaPunto;

import java.util.List;
import java.util.Map;

public interface IRutaPuntoService {
    RutaPunto crearRutaPunto(RutaPuntoDto rutaPuntoDto);
    RutaPunto actualizarRutaPunto(Map<String, Object> datos, Long id);
    void eliminarRutaPunto(Long id);
    List<RutaPunto> obtenerRutaPuntos();
    List<RutaPunto> obtenerPorRutaId(Long rutaId);
    RutaPunto obtenerRutaPuntoPorId(Long id);
}
