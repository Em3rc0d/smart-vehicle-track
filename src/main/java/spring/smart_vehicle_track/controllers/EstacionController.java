package spring.smart_vehicle_track.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import spring.smart_vehicle_track.dto.EstacionDto;
import spring.smart_vehicle_track.model.Estacion;
import spring.smart_vehicle_track.service.interfaces.IEstacionService;

@RestController
@RequestMapping("/api/estacion")
public class EstacionController {

    @Autowired
    private IEstacionService estacionService;

    @PostMapping
    public ResponseEntity<Estacion> crearEstacion(@RequestBody EstacionDto estacionDto) {
        Estacion nuevaEstacion = estacionService.crearEstacion(estacionDto);
        return ResponseEntity.ok(nuevaEstacion);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estacion> obtenerEstacion(@PathVariable Long id) {
        Estacion estacion = estacionService.obtenerEstacion(id);
        if (estacion != null) {
            return ResponseEntity.ok(estacion);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
