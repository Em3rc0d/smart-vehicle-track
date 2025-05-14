package spring.smart_vehicle_track.service;

import org.springframework.stereotype.Service;
import spring.smart_vehicle_track.dto.BusDto;
import spring.smart_vehicle_track.model.Bus;

@Service
public interface IBusService {
    Bus crearBus(BusDto busDto);
    Bus actualizarBus(BusDto busDto, Long id);
    Bus eliminarBus(Long id);
}
