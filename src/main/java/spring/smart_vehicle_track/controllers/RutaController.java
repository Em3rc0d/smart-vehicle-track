package spring.smart_vehicle_track.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.smart_vehicle_track.model.Ruta;
import spring.smart_vehicle_track.service.IHorarioService;

@RestController
@RequestMapping("/api/ruta")
public class RutaController {
    
}
