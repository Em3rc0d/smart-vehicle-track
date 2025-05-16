package spring.smart_vehicle_track.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import spring.smart_vehicle_track.model.Horario;

public interface HorarioRepository extends JpaRepository<Horario, Long> {

    @Query("SELECT h FROM Horario h WHERE h.ruta.id = ?1 ORDER BY h.horaEstimada")
    List<Horario> obtenerHorariosPorRuta(Long rutaId);

}
