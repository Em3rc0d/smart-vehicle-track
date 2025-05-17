package spring.smart_vehicle_track.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import spring.smart_vehicle_track.dto.RutaPuntoDto;
import spring.smart_vehicle_track.model.RutaPunto;
import spring.smart_vehicle_track.service.interfaces.IRutaPuntoService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/rutapuntos")
public class RutaPuntoController {

    @Autowired
    private IRutaPuntoService rutaPuntoService;

    @PostMapping
    public ResponseEntity<RutaPunto> crearRutaPunto(@RequestBody RutaPuntoDto dto) {
        RutaPunto creado = rutaPuntoService.crearRutaPunto(dto);
        return ResponseEntity.ok(creado);
    }

    @GetMapping
    public ResponseEntity<List<RutaPunto>> obtenerTodos() {
        return ResponseEntity.ok(rutaPuntoService.obtenerRutaPuntos());
    }

    @GetMapping("/ruta/{rutaId}")
    public ResponseEntity<List<RutaPunto>> obtenerPorRuta(@PathVariable Long rutaId) {
        return ResponseEntity.ok(rutaPuntoService.obtenerPorRutaId(rutaId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<RutaPunto> obtenerPorId(@PathVariable Long id) {
        return ResponseEntity.ok(rutaPuntoService.obtenerRutaPuntoPorId(id));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<RutaPunto> actualizar(@PathVariable Long id, @RequestBody Map<String, Object> campos) {
        RutaPunto actualizado = rutaPuntoService.actualizarRutaPunto(campos, id);
        return ResponseEntity.ok(actualizado);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        rutaPuntoService.eliminarRutaPunto(id);
    }
}
