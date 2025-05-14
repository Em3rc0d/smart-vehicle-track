package spring.smart_vehicle_track.dao;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.smart_vehicle_track.model.Ruta;
import spring.smart_vehicle_track.repository.RutaRepository;

@Data
@Service
public class RutaDao implements IRutaDao{
    @Autowired
    private RutaRepository rutaRepository;

    @Override
    public Ruta encontrarRutaById(Long id){
        return rutaRepository.findById(id).orElseThrow();
    }
}
