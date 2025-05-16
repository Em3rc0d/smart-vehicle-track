package spring.smart_vehicle_track.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import spring.smart_vehicle_track.model.HistorialViaje;

@Service
public interface IHistorialViajeDao {
    List<HistorialViaje> obtenerHistorialBus(Long busId);

    HistorialViaje registrarPaso(HistorialViaje historialViaje);
}
