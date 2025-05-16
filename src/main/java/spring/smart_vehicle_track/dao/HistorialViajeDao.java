package spring.smart_vehicle_track.dao;

import org.springframework.beans.factory.annotation.Autowired;

import spring.smart_vehicle_track.model.HistorialViaje;
import spring.smart_vehicle_track.repository.HistorialViajeRepository;

public class HistorialViajeDao implements IHistorialViajeDao {

    @Autowired
    private HistorialViajeRepository rutaEstacionRepository;

    @Override
    public HistorialViaje registrarPaso(HistorialViaje historialViaje) {
        return rutaEstacionRepository.save(historialViaje);
    }    
}
