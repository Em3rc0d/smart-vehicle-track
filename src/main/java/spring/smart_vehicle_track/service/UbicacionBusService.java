package spring.smart_vehicle_track.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;
import spring.smart_vehicle_track.dao.interfaces.IBusDao;
import spring.smart_vehicle_track.dao.interfaces.IUbicacionBusDao;
import spring.smart_vehicle_track.dto.UbicacionBusDto;
import spring.smart_vehicle_track.model.Bus;
import spring.smart_vehicle_track.model.UbicacionBus;
import spring.smart_vehicle_track.service.interfaces.IUbicacionBusService;

@Data
@Service
public class UbicacionBusService implements IUbicacionBusService {
    @Autowired
    private IUbicacionBusDao ubicacionBusDao;

    @Autowired
    private IBusDao busDao;

    @Override
    public UbicacionBus registrarUbicacion(UbicacionBusDto ubicacionBusDto) {
        UbicacionBus ubicacionBus = new UbicacionBus();
        Bus bus = busDao.encontrarBusById(ubicacionBusDto.getIdBus());
        ubicacionBus.setBus(bus);
        ubicacionBus.setLatitud(ubicacionBusDto.getLatitud());
        ubicacionBus.setLongitud(ubicacionBusDto.getLongitud());
        ubicacionBus.setVelocidad(ubicacionBusDto.getVelocidad());
        ubicacionBus.setTimestamp(ubicacionBusDto.getTimestamp());
        return ubicacionBusDao.registrarUbicacion(ubicacionBus);
    }

    @Override
    public List<UbicacionBus> obtenerHistorialBus(Long id){
        return ubicacionBusDao.obtenerHistorialBus(id);
    }
}
