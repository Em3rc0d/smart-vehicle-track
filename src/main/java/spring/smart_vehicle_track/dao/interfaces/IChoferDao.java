package spring.smart_vehicle_track.dao.interfaces;

import org.springframework.stereotype.Service;

import spring.smart_vehicle_track.model.Chofer;

@Service
public interface IChoferDao {
    Chofer crearChofer(Chofer chofer);

    Chofer encontrarChoferById(Long id);
    Chofer eliminarChofer(Long id);

}
