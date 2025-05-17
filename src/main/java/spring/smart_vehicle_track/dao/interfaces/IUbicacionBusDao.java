package spring.smart_vehicle_track.dao.interfaces;

import org.springframework.stereotype.Service;
import spring.smart_vehicle_track.model.UbicacionBus;

import java.util.List;

@Service
public interface IUbicacionBusDao {
    UbicacionBus registrarUbicacion(UbicacionBus ubicacionBus);

    List<UbicacionBus> obtenerHistorialBus(Long id);
}
