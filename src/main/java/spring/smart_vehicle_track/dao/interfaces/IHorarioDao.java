package spring.smart_vehicle_track.dao.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import spring.smart_vehicle_track.model.Horario;

@Service
public interface IHorarioDao {
    List<Horario> obtenerHorariosPorRuta(Long rutaId);
}
