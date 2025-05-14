package spring.smart_vehicle_track.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.smart_vehicle_track.dto.BusDto;
import spring.smart_vehicle_track.model.Bus;
import spring.smart_vehicle_track.service.IBusService;

@RestController
@RequestMapping("/api/bus")
public class BusController {
    @Autowired
    private IBusService busService;

    @PostMapping
    public ResponseEntity<Bus> crearBus(@RequestBody BusDto busDto) {
        return ResponseEntity.ok(busService.crearBus(busDto));
    }
}
