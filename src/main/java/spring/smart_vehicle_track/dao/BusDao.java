package spring.smart_vehicle_track.dao;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.smart_vehicle_track.model.Bus;
import spring.smart_vehicle_track.repository.BusRepository;

@Data
@Service
public class BusDao implements IBusDao {

    @Autowired
    private BusRepository busRepository;

    @Override
    public Bus crearBus(Bus bus) {
        return busRepository.save(bus);
    }
}
