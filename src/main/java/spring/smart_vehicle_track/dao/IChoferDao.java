package spring.smart_vehicle_track.dao;

import org.springframework.stereotype.Service;
import spring.smart_vehicle_track.model.Chofer;

import java.util.Optional;

@Service
public interface IChoferDao {
    Chofer crearChofer(Chofer chofer);

    Chofer encontrarChoferById(Long id);
}
