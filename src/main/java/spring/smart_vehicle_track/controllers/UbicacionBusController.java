package spring.smart_vehicle_track.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.smart_vehicle_track.dto.UbicacionBusDto;
import spring.smart_vehicle_track.model.UbicacionBus;
import spring.smart_vehicle_track.service.IUbicacionBusService;

import java.util.List;

@RestController
@RequestMapping("/api/ubicacion-bus")
public class UbicacionBusController {

    @Autowired
    private IUbicacionBusService ubicacionBusService;

    @PostMapping
    public ResponseEntity<UbicacionBus> registrarUbicacion(@RequestBody UbicacionBusDto ubicacionBusDto) {
        return ResponseEntity.ok(ubicacionBusService.registrarUbicacion(ubicacionBusDto));
    }

    @GetMapping("/historial/{id}")
    public ResponseEntity<List<UbicacionBus>> obtenerHistorialBus(@PathVariable Long id) {
        return ResponseEntity.ok(ubicacionBusService.obtenerHistorialBus(id));
    }

}
