package spring.smart_vehicle_track.dao;

import spring.smart_vehicle_track.model.HistorialViaje;

public interface IHistorialViajeDao {
    HistorialViaje registrarPaso(HistorialViaje historialViaje);
}
