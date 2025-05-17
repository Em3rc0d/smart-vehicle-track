package spring.smart_vehicle_track.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.smart_vehicle_track.dao.interfaces.IRutaDao;
import spring.smart_vehicle_track.dao.interfaces.IRutaPuntoDao;
import spring.smart_vehicle_track.dao.generic.IGenericDao;
import spring.smart_vehicle_track.dto.RutaPuntoDto;
import spring.smart_vehicle_track.model.Ruta;
import spring.smart_vehicle_track.model.RutaPunto;
import spring.smart_vehicle_track.service.interfaces.IRutaPuntoService;

import java.util.List;
import java.util.Map;

@Data
@Service
public class RutaPuntoService implements IRutaPuntoService {

    @Autowired
    private IRutaPuntoDao rutaPuntoDao;

    @Autowired
    private IRutaDao rutaDao;

    @Autowired
    private IGenericDao genericDao;

    @Override
    public RutaPunto crearRutaPunto(RutaPuntoDto rutaPuntoDto) {
        Ruta ruta = rutaDao.encontrarRutaById(rutaPuntoDto.getIdRuta());
        if (ruta == null) {
            throw new IllegalArgumentException("Ruta no encontrada con ID: " + rutaPuntoDto.getIdRuta());
        }

        RutaPunto rutaPunto = new RutaPunto();
        rutaPunto.setRuta(ruta);
        rutaPunto.setOrden(rutaPuntoDto.getOrden());
        rutaPunto.setLatitud(rutaPuntoDto.getLatitud());
        rutaPunto.setLongitud(rutaPuntoDto.getLongitud());

        return rutaPuntoDao.crearRutaPunto(rutaPunto);
    }

    @Override
    public RutaPunto actualizarRutaPunto(Map<String, Object> datos, Long id) {
        RutaPunto rutaPunto = rutaPuntoDao.encontrarRutaPuntoById(id);
        rutaPunto = genericDao.actualizarCampos(rutaPunto, datos);
        return rutaPuntoDao.actualizarRutaPunto(rutaPunto);
    }

    @Override
    public void eliminarRutaPunto(Long id) {
        RutaPunto rp = rutaPuntoDao.encontrarRutaPuntoById(id);
        rutaPuntoDao.eliminarRutaPunto(rp);
    }

    @Override
    public List<RutaPunto> obtenerRutaPuntos() {
        return rutaPuntoDao.obtenerRutaPuntos();
    }

    @Override
    public List<RutaPunto> obtenerPorRutaId(Long rutaId) {
        return rutaPuntoDao.obtenerPorRutaId(rutaId);
    }

    @Override
    public RutaPunto obtenerRutaPuntoPorId(Long id) {
        return rutaPuntoDao.encontrarRutaPuntoById(id);
    }
}
