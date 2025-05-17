package spring.smart_vehicle_track.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.smart_vehicle_track.dto.HistorialViajeDto;
import spring.smart_vehicle_track.model.HistorialViaje;
import spring.smart_vehicle_track.service.interfaces.IHistorialViajeService;


@RestController
@RequestMapping("/api/historial-viaje")

public class HistorialViajeController {
    
    @Autowired
    private IHistorialViajeService historialViajeService;

    @PostMapping
    public ResponseEntity<HistorialViaje> registrarPaso(@RequestBody HistorialViajeDto historialViajeDto) {
        return ResponseEntity.ok(historialViajeService.registrarPaso(historialViajeDto));
    }
}
