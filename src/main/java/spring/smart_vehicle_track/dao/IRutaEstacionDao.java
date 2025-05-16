package spring.smart_vehicle_track.dao;

import org.springframework.stereotype.Service;

import spring.smart_vehicle_track.model.RutaEstacion;

@Service
public interface IRutaEstacionDao {
    RutaEstacion asignarEstacionARuta(RutaEstacion rutaEstacion);
    
}