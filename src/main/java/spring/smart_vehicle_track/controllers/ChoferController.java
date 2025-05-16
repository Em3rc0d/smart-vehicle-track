package spring.smart_vehicle_track.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.smart_vehicle_track.dto.ChoferDto;
import spring.smart_vehicle_track.model.Chofer;
import spring.smart_vehicle_track.service.IChoferService;

@RestController
@RequestMapping("/api/chofer")
public class ChoferController {

    @Autowired
    private IChoferService choferService;

    @PostMapping
    public ResponseEntity<Chofer> crearChofer(@RequestBody ChoferDto choferDto) {
        return ResponseEntity.ok(choferService.crearChofer(choferDto));
    }

//    // Actualizar un chofer
   @PutMapping("/{id}")
   public ResponseEntity<Chofer> actualizarChofer(@RequestBody Map<String, Object> chofer, @PathVariable Long id) {
       Chofer choferActualizado = choferService.actualizarChofer(chofer, id );
       return ResponseEntity.ok(choferActualizado);
   }
//
//    // Obtener un chofer por su ID
//    @GetMapping("/{id}")
//    public ResponseEntity<Chofer> obtenerChofer(@PathVariable Long id) {
//        Chofer chofer = choferService.obtenerChofer(id);
//        return ResponseEntity.ok(chofer);
//    }
//
//    // Eliminar un chofer por su ID
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> eliminarChofer(@PathVariable Long id) {
//        choferService.eliminarChofer(id);
//        return ResponseEntity.noContent().build();
//    }
}
