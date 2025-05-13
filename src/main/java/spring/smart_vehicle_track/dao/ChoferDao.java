package spring.smart_vehicle_track.dao;

import org.springframework.beans.factory.annotation.Autowired;
import spring.smart_vehicle_track.model.Chofer;
import spring.smart_vehicle_track.repository.ChoferRepository;

public class ChoferDao implements IChoferDao{
    @Autowired
    private ChoferRepository choferRepository;
    @Override
    public Chofer crearChofer(Chofer chofer){
        return choferRepository.save(chofer);
    }
}
