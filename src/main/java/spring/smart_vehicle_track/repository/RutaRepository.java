package spring.smart_vehicle_track.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.smart_vehicle_track.model.Ruta;

public interface RutaRepository extends JpaRepository<Ruta, Long> {
}
