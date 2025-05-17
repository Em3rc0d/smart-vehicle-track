package spring.smart_vehicle_track.service.interfaces;

import spring.smart_vehicle_track.dto.EstacionDto;
import spring.smart_vehicle_track.model.Estacion;

public interface IEstacionService {
    Estacion crearEstacion(EstacionDto estacionDto);
    Estacion obtenerEstacion(Long id);
}
