package spring.smart_vehicle_track.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.smart_vehicle_track.model.RutaEstacion;

public interface RutaEstacionRepository extends JpaRepository<RutaEstacion, Long> {
    
}
