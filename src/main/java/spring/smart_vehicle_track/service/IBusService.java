package spring.smart_vehicle_track.service;

import org.springframework.stereotype.Service;
import spring.smart_vehicle_track.dto.BusDto;
import spring.smart_vehicle_track.model.Bus;

import java.util.List;
import java.util.Map;

@Service
public interface IBusService {
    Bus crearBus(BusDto busDto);
    Bus actualizarBus(Map<String, Object> chofer, Long id);
    Bus eliminarBus(Long id);
    List<Bus> obtenerBuses();
}
