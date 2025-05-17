package spring.smart_vehicle_track.dao.interfaces;

import org.springframework.stereotype.Service;

import spring.smart_vehicle_track.model.Estacion;

@Service
public interface IEstacionDao {
    Estacion crearEstacion(Estacion estacion);
    Estacion obtenerEstacion(Long id);
}
