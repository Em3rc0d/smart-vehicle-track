package spring.smart_vehicle_track.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import spring.smart_vehicle_track.model.Horario;

@Service
public interface IHorarioService {
    List<Horario> obtenerHorariosPorRuta(Long rutaId);
}
