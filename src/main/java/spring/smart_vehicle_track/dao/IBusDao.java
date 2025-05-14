package spring.smart_vehicle_track.dao;

import lombok.Data;
import org.springframework.stereotype.Service;
import spring.smart_vehicle_track.model.Bus;

@Service
public interface IBusDao {
    Bus crearBus(Bus bus);

    Bus encontrarBusById(Long id);
}
