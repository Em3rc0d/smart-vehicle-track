package spring.smart_vehicle_track.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.smart_vehicle_track.dao.interfaces.IRutaDao;
import spring.smart_vehicle_track.dao.generic.IGenericDao;
import spring.smart_vehicle_track.dto.RutaDto;
import spring.smart_vehicle_track.model.Ruta;
import spring.smart_vehicle_track.service.interfaces.IRutaService;

import java.util.List;
import java.util.Map;

@Data
@Service
public class RutaService implements IRutaService {

    @Autowired
    private IRutaDao rutaDao;

    @Autowired
    private IGenericDao genericDao;

    @Override
    public Ruta crearRuta(RutaDto rutaDto) {
        Ruta ruta = new Ruta();
        ruta.setNombre(rutaDto.getNombre());
        ruta.setDescripcion(rutaDto.getDescripcion());

        return rutaDao.crearRuta(ruta);
    }

    @Override
    public Ruta actualizarRuta(Map<String, Object> datosRuta, Long id) {
        Ruta ruta = rutaDao.encontrarRutaById(id);
        ruta = genericDao.actualizarCampos(ruta, datosRuta);
        return rutaDao.actualizarRuta(ruta);
    }

    @Override
    public void eliminarRuta(Long id) {
        Ruta ruta = rutaDao.encontrarRutaById(id);
        rutaDao.eliminarRuta(ruta);
    }

    @Override
    public List<Ruta> obtenerRutas() {
        return rutaDao.obtenerRutas();
    }
}
