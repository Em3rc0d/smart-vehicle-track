package spring.smart_vehicle_track.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;
import spring.smart_vehicle_track.model.Horario;
import spring.smart_vehicle_track.repository.HorarioRepository;

@Data
@Service
public class HorarioDao implements IHorarioDao {
    
    @Autowired
    private HorarioRepository horarioRepository;
    
    @Override
    public List<Horario> obtenerHorariosPorRuta(Long rutaId){
        return horarioRepository.obtenerHorariosPorRuta(rutaId);
    }
}
