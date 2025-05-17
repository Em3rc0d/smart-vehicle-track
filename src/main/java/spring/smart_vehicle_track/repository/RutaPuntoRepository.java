package spring.smart_vehicle_track.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.smart_vehicle_track.model.RutaPunto;
import java.util.List;

public interface RutaPuntoRepository extends JpaRepository<RutaPunto, Long> {
    List<RutaPunto> findByRutaIdOrderByOrdenAsc(Long rutaId);
}
