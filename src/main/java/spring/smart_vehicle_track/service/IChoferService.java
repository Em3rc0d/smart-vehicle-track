package spring.smart_vehicle_track.service;

import org.springframework.stereotype.Service;
import spring.smart_vehicle_track.dto.ChoferDto;
import spring.smart_vehicle_track.model.Chofer;

@Service
public interface IChoferService {
    Chofer crearChofer(ChoferDto chofer);

//    // Método para actualizar un chofer
//    Chofer actualizarChofer(Long id, ChoferDto choferDto);
//
//    // Método para eliminar un chofer
//    void eliminarChofer(Long id);
//
//    // Método para obtener un chofer por su ID
//    Chofer obtenerChofer(Long id);
}
