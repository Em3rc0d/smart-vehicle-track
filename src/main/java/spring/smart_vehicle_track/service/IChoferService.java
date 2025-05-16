package spring.smart_vehicle_track.service;

import org.springframework.stereotype.Service;
import spring.smart_vehicle_track.dto.ChoferDto;
import spring.smart_vehicle_track.model.Chofer;

import java.util.Map;

@Service
public interface IChoferService {
    Chofer crearChofer(ChoferDto chofer);

    Chofer actualizarChofer(Map<String, Object> chofer, Long id);

//    // Método para actualizar un chofer
//    Chofer actualizarChofer(Long id, ChoferDto choferDto);
//
//    // Método para eliminar un chofer
//    void eliminarChofer(Long id);
//
//    // Método para obtener un chofer por su ID
//    Chofer obtenerChofer(Long id);
}
