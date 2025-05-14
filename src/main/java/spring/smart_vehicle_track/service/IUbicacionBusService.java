package spring.smart_vehicle_track.service;

import org.springframework.stereotype.Service;
import spring.smart_vehicle_track.dto.UbicacionBusDto;
import spring.smart_vehicle_track.model.UbicacionBus;

import java.util.List;

@Service
public interface IUbicacionBusService {
    UbicacionBus registrarUbicacion(UbicacionBusDto ubicacionBusDto);

    List<UbicacionBus> obtenerHistorialBus(Long id);
}
