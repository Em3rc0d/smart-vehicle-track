package spring.smart_vehicle_track.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.smart_vehicle_track.model.Bus;

public interface BusRepository extends JpaRepository<Bus, Long> {
}
