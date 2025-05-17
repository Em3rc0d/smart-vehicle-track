package spring.smart_vehicle_track.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.smart_vehicle_track.dto.RutaEstacionDto;
import spring.smart_vehicle_track.model.RutaEstacion;
import spring.smart_vehicle_track.service.interfaces.IRutaEstacionService;

@RestController
@RequestMapping("/api/ruta-estacion")
public class RutaEstacionController {
    
    @Autowired
    private IRutaEstacionService rutaEstacionService;

    @PostMapping
    public ResponseEntity<RutaEstacion> asignarEstacionARuta(@RequestBody RutaEstacionDto rutaEstacionDto) {
        return ResponseEntity.ok(rutaEstacionService.asignarEstacionARuta(rutaEstacionDto));
    }
}
