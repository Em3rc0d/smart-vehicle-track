package spring.smart_vehicle_track.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.smart_vehicle_track.dao.IBusDao;
import spring.smart_vehicle_track.dao.IUbicacionBusDao;
import spring.smart_vehicle_track.dto.UbicacionBusDto;
import spring.smart_vehicle_track.model.Bus;
import spring.smart_vehicle_track.model.UbicacionBus;

import java.util.List;

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
