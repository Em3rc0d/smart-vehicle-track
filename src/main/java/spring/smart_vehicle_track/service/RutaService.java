package spring.smart_vehicle_track.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.smart_vehicle_track.dao.IRutaDao;
import spring.smart_vehicle_track.dao.generic.IGenericDao;
import spring.smart_vehicle_track.model.Ruta;

import java.util.Map;

@Data
@Service
public class RutaService implements IRutaService {
    @Autowired
    private IRutaDao rutaDao;

    @Autowired
    private IGenericDao genericDao;

    @Override
    public Ruta crearRuta(Ruta ruta) {
        return rutaDao.crearRuta(ruta);
    }

    @Override
    public Ruta actualizarRuta(Long id, Map<String, Object> datosRuta) {
        Ruta ruta = rutaDao.encontrarRutaById(id);
        ruta = genericDao.actualizarCampos(ruta, datosRuta);
        return rutaDao.crearRuta(ruta);
    }

    @Override
    public Ruta eliminarRuta(Long id) {
        Ruta ruta = rutaDao.encontrarRutaById(id);
        if (ruta == null) {
            throw new IllegalArgumentException("Ruta no encontrada con ID: " + id);
        }
        return rutaDao.eliminarRuta(id);
    }

    @Override
    public Ruta obtenerRutaPorId(Long id) {
        Ruta ruta = rutaDao.encontrarRutaById(id);
        if (ruta == null) {
            throw new IllegalArgumentException("Ruta no encontrada con ID: " + id);
        }
        return ruta;
    }
}
