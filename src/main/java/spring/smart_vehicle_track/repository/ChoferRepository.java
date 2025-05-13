package spring.smart_vehicle_track.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.smart_vehicle_track.model.Chofer;

public interface ChoferRepository extends JpaRepository<Chofer, Long> {
    
}
