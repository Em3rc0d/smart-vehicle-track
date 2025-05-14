package spring.smart_vehicle_track.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.smart_vehicle_track.model.UbicacionBus;

import java.util.List;

public interface UbicacionBusRepository extends JpaRepository<UbicacionBus, Long> {
    List<UbicacionBus> findByBusId(Long busId);
}
