package spring.smart_vehicle_track.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;
import spring.smart_vehicle_track.dao.interfaces.IEstacionDao;
import spring.smart_vehicle_track.model.Estacion;
import spring.smart_vehicle_track.repository.EstacionRepository;

@Data
@Service
public class EstacionDao implements IEstacionDao {

    @Autowired
    private EstacionRepository estacionRepository;

    @Override
    public Estacion crearEstacion(Estacion estacion) {
        return estacionRepository.save(estacion);
    }

    @Override
    public Estacion obtenerEstacion(Long id) {
        return estacionRepository.findById(id).orElseThrow();
    }
}
