package spring.smart_vehicle_track.dao;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import spring.smart_vehicle_track.dao.interfaces.IRutaEstacionDao;
import spring.smart_vehicle_track.model.RutaEstacion;
import spring.smart_vehicle_track.repository.RutaEstacionRepository;

@Data
@Service
public class RutaEstacionDao implements IRutaEstacionDao {
    // Implement the methods from IRutaEstacion interface here
    @Autowired
    private RutaEstacionRepository rutaEstacionRepository;
    
    @Override
    public RutaEstacion asignarEstacionARuta(RutaEstacion rutaEstacion) {
        return rutaEstacionRepository.save(rutaEstacion);
    }
    
}
