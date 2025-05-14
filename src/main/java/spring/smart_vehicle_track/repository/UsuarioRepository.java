package spring.smart_vehicle_track.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.smart_vehicle_track.model.UbicacionBus;
import spring.smart_vehicle_track.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>  {
}
