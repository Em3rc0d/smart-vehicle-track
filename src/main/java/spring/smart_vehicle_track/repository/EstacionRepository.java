package spring.smart_vehicle_track.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.smart_vehicle_track.model.Bus;
import spring.smart_vehicle_track.model.Estacion;

public interface EstacionRepository extends JpaRepository<Estacion, Long>{
    
}
