package spring.smart_vehicle_track.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;
import spring.smart_vehicle_track.dao.interfaces.IBusDao;
import spring.smart_vehicle_track.dao.interfaces.IEstacionDao;
import spring.smart_vehicle_track.dto.EstacionDto;
import spring.smart_vehicle_track.model.Estacion;
import spring.smart_vehicle_track.service.interfaces.IEstacionService;

@Data
@Service
public class EstacionService implements IEstacionService {
    @Autowired
    private IEstacionDao estacionDao;
    
    @Autowired
    private IBusDao busDao;

    @Override
    public Estacion crearEstacion(EstacionDto estacionDto) {
        Estacion estacion = new Estacion();
        estacion.setNombre(estacionDto.getNombre());
        estacion.setLatitud(estacionDto.getLatitud());
        estacion.setLongitud(estacionDto.getLongitud());
        estacion.setDistrito(estacionDto.getDistrito());
        return estacionDao.crearEstacion(estacion);
    }

    @Override
    public Estacion obtenerEstacion(Long id) {
        return estacionDao.obtenerEstacion(id);
    }
}
