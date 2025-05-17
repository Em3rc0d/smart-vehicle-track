package spring.smart_vehicle_track.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;
import spring.smart_vehicle_track.dao.interfaces.IEstacionDao;
import spring.smart_vehicle_track.dao.interfaces.IRutaDao;
import spring.smart_vehicle_track.dao.interfaces.IRutaEstacionDao;
import spring.smart_vehicle_track.dto.RutaEstacionDto;
import spring.smart_vehicle_track.model.Estacion;
import spring.smart_vehicle_track.model.Ruta;
import spring.smart_vehicle_track.model.RutaEstacion;
import spring.smart_vehicle_track.service.interfaces.IRutaEstacionService;

@Data
@Service
public class RutaEstacionService implements IRutaEstacionService {

    @Autowired
    private IRutaEstacionDao rutaEstacionDao;
    @Autowired
    private IRutaDao rutaDao;
    @Autowired
    private IEstacionDao estacionDao;
    @Override
    public RutaEstacion asignarEstacionARuta(RutaEstacionDto rutaEstacionDto) {
        Ruta ruta = rutaDao.encontrarRutaById(rutaEstacionDto.getIdRuta());
        Estacion estacion = estacionDao.obtenerEstacion(rutaEstacionDto.getIdEstacion());
        RutaEstacion rutaEstacion = new RutaEstacion();
        rutaEstacion.setRuta(ruta);
        rutaEstacion.setEstacion(estacion);
        return rutaEstacionDao.asignarEstacionARuta(rutaEstacion);
        
    }
}
