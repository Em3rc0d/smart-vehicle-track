package spring.smart_vehicle_track.controllers;

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

    @DeleteMapping("/{id}")
    public ResponseEntity<Chofer> eliminarChofer(@PathVariable Long id) {
        return ResponseEntity.ok(choferService.eliminarChofer(id));
    }
}
