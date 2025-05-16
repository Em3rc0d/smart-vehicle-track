package spring.smart_vehicle_track.service;

import spring.smart_vehicle_track.dto.HistorialViajeDto;
import spring.smart_vehicle_track.model.HistorialViaje;

public interface IHistorialViajeService {
    HistorialViaje registrarPaso(HistorialViajeDto historialViajeDto);
}
