package spring.smart_vehicle_track.dao.interfaces;

import spring.smart_vehicle_track.model.RutaPunto;

import java.util.List;

public interface IRutaPuntoDao {
    RutaPunto crearRutaPunto(RutaPunto rutaPunto);
    RutaPunto encontrarRutaPuntoById(Long id);
    RutaPunto actualizarRutaPunto(RutaPunto rutaPunto);
    void eliminarRutaPunto(RutaPunto rp);
    List<RutaPunto> obtenerRutaPuntos();
    List<RutaPunto> obtenerPorRutaId(Long rutaId);
}
