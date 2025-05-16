package spring.smart_vehicle_track.service;

import org.springframework.stereotype.Service;

import spring.smart_vehicle_track.dto.RutaEstacionDto;
import spring.smart_vehicle_track.model.Ruta;
import spring.smart_vehicle_track.model.RutaEstacion;

@Service
public interface IRutaEstacionService {
    RutaEstacion asignarEstacionARuta(RutaEstacionDto rutaEstacionDto);
    
    // Otros métodos relacionados con la entidad RutaEstacion
}
