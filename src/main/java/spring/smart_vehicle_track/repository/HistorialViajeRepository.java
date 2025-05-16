package spring.smart_vehicle_track.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import spring.smart_vehicle_track.model.HistorialViaje;

public interface HistorialViajeRepository extends JpaRepository<HistorialViaje, Long> {

    @Query(value="SELECT h FROM HistorialViaje h WHERE h.bus.id = ?1 ORDER BY h.fechaHoraPaso")
    List<HistorialViaje> obtenerHistorialBus(Long busId);

}
