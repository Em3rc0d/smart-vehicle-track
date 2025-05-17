package spring.smart_vehicle_track.dao;

import java.util.List;

import lombok.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.smart_vehicle_track.dao.interfaces.IBusDao;
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

    @Override
    public Bus encontrarBusById(Long id){
        return busRepository.findById(id).orElseThrow();
    }

    @Override
    public Bus actualizarBus(Bus bus) {
        return busRepository.save(bus);
    }

    @Override
    public Bus eliminarBus(Long id) {
        Bus bus = encontrarBusById(id);
        busRepository.delete(bus);
        return bus;
    }

    @Override
    public List<Bus> obtenerBuses() {
        return busRepository.findAll();
    }
}
