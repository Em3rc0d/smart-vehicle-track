package spring.smart_vehicle_track.dao;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.smart_vehicle_track.model.Chofer;
import spring.smart_vehicle_track.repository.ChoferRepository;

import java.util.Optional;

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

    @Override
    public Chofer eliminarChofer(Long id){
        Optional<Chofer> chofer = choferRepository.findById(id);
        if (chofer.isPresent()) {
            choferRepository.delete(chofer.get());
            return chofer.get();
        } else {
            throw new RuntimeException("Chofer not found");
        }
    }
}
