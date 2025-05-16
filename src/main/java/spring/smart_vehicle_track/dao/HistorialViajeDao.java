package spring.smart_vehicle_track.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;
import spring.smart_vehicle_track.model.HistorialViaje;
import spring.smart_vehicle_track.repository.HistorialViajeRepository;

@Data
@Service
public class HistorialViajeDao implements IHistorialViajeDao {

    @Autowired
    private HistorialViajeRepository historialViajeRepository;
    
    @Override
    public List<HistorialViaje> obtenerHistorialBus(Long busId) {
        return historialViajeRepository.obtenerHistorialBus(busId);
    }

    @Override
    public HistorialViaje registrarPaso(HistorialViaje historialViaje) {
        return historialViajeRepository.save(historialViaje);
    }    
}
