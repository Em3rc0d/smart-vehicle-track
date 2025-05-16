package spring.smart_vehicle_track.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;
import spring.smart_vehicle_track.dao.IHorarioDao;
import spring.smart_vehicle_track.model.Horario;

@Data
@Service
public class HorarioService implements IHorarioService {

    @Autowired
    private IHorarioDao horarioDao;
    @Override
    public List<Horario> obtenerHorariosPorRuta(Long rutaId) {
        return horarioDao.obtenerHorariosPorRuta(rutaId);
    }
}
