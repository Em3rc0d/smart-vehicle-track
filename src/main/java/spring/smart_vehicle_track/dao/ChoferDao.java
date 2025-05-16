package spring.smart_vehicle_track.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;
import spring.smart_vehicle_track.model.Chofer;
import spring.smart_vehicle_track.repository.ChoferRepository;

@Data
@Service
public class ChoferDao implements IChoferDao {
    @Autowired
    private ChoferRepository choferRepository;

    @Override
    public Chofer crearChofer(Chofer chofer) {
        return choferRepository.save(chofer);
    }

    @Override
    public Chofer encontrarChoferById(Long id) {
        return choferRepository.findById(id).orElseThrow();
    }

}
