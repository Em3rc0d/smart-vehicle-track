package spring.smart_vehicle_track.service;

import org.springframework.stereotype.Service;
import spring.smart_vehicle_track.dto.ChoferDto;
import spring.smart_vehicle_track.model.Chofer;

@Service
public interface IChoferService {
    Chofer crearChofer(ChoferDto chofer);
    Chofer eliminarChofer(Long id);
}
