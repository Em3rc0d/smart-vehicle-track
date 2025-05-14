package spring.smart_vehicle_track.dao;

import org.springframework.stereotype.Service;
import spring.smart_vehicle_track.model.Ruta;

@Service
public interface IRutaDao {
    Ruta encontrarRutaById(Long id);
}
