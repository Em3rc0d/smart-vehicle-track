package spring.smart_vehicle_track.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.smart_vehicle_track.dto.BusDto;
import spring.smart_vehicle_track.model.Bus;
import spring.smart_vehicle_track.service.interfaces.IBusService;

@RestController
@RequestMapping("/api/bus")
public class BusController {
    @Autowired
    private IBusService busService;

    @PostMapping
    public ResponseEntity<Bus> crearBus(@RequestBody BusDto busDto) {
        return ResponseEntity.ok(busService.crearBus(busDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Bus> actualizarBus(@RequestBody Map<String, Object> bus, @PathVariable Long id) {
        return ResponseEntity.ok(busService.actualizarBus(bus, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Bus> eliminarBus(@PathVariable Long id) {
        return ResponseEntity.ok(busService.eliminarBus(id));
    }

    @GetMapping()
    public ResponseEntity<List<Bus>> obtenerBuses() {
        return ResponseEntity.ok(busService.obtenerBuses());
    }
}
