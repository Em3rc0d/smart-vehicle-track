package spring.smart_vehicle_track.dao;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.smart_vehicle_track.model.UbicacionBus;
import spring.smart_vehicle_track.repository.UbicacionBusRepository;

import java.util.List;

@Data
@Service
public class UbicacionBusDao implements IUbicacionBusDao{

    @Autowired
    private UbicacionBusRepository ubicacionBusRepository;

    @Override
    public UbicacionBus registrarUbicacion(UbicacionBus ubicacionBus){
        return ubicacionBusRepository.save(ubicacionBus);
    }

    @Override
    public List<UbicacionBus> obtenerHistorialBus(Long id) {
        return ubicacionBusRepository.findByBusId(id);
    }

}
