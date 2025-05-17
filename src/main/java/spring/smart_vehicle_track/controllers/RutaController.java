package spring.smart_vehicle_track.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import spring.smart_vehicle_track.dto.RutaDto;
import spring.smart_vehicle_track.model.Ruta;
import spring.smart_vehicle_track.service.interfaces.IRutaService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/ruta")
public class RutaController {

    @Autowired
    private IRutaService rutaService;

    @PostMapping
    public ResponseEntity<Ruta> crearRuta(@RequestBody RutaDto rutaDto) {
        Ruta nuevaRuta = rutaService.crearRuta(rutaDto);
        return ResponseEntity.ok(nuevaRuta);
    }

    @GetMapping
    public ResponseEntity<List<Ruta>> obtenerRutas() {
        List<Ruta> rutas = rutaService.obtenerRutas();
        return ResponseEntity.ok(rutas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ruta> obtenerRutaPorId(@PathVariable Long id) {
        Ruta ruta = rutaService.obtenerRutas()
                .stream()
                .filter(r -> r.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Ruta no encontrada con ID: " + id));
        return ResponseEntity.ok(ruta);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Ruta> actualizarRuta(@PathVariable Long id, @RequestBody Map<String, Object> campos) {
        Ruta rutaActualizada = rutaService.actualizarRuta(campos, id);
        return ResponseEntity.ok(rutaActualizada);
    }

    @DeleteMapping("/{id}")
    public void eliminarRuta(@PathVariable Long id) {
        rutaService.eliminarRuta(id);
    }
}
