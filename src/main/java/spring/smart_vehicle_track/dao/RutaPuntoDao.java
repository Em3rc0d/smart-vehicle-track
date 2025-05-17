package spring.smart_vehicle_track.dao;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.smart_vehicle_track.dao.interfaces.IRutaPuntoDao;
import spring.smart_vehicle_track.model.RutaPunto;
import spring.smart_vehicle_track.repository.RutaPuntoRepository;

import java.util.List;

@Data
@Service
public class RutaPuntoDao implements IRutaPuntoDao {

    @Autowired
    private RutaPuntoRepository rutaPuntoRepository;

    @Override
    public RutaPunto crearRutaPunto(RutaPunto rutaPunto) {
        return rutaPuntoRepository.save(rutaPunto);
    }

    @Override
    public RutaPunto encontrarRutaPuntoById(Long id) {
        return rutaPuntoRepository.findById(id).orElseThrow();
    }

    @Override
    public RutaPunto actualizarRutaPunto(RutaPunto rutaPunto) {
        return rutaPuntoRepository.save(rutaPunto);
    }

    @Override
    public void eliminarRutaPunto(RutaPunto rp) {
        rutaPuntoRepository.delete(rp);
    }

    @Override
    public List<RutaPunto> obtenerRutaPuntos() {
        return rutaPuntoRepository.findAll();
    }

    @Override
    public List<RutaPunto> obtenerPorRutaId(Long rutaId) {
        return rutaPuntoRepository.findByRutaIdOrderByOrdenAsc(rutaId);
    }
}
