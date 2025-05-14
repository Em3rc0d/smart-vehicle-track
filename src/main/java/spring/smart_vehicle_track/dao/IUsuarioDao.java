package spring.smart_vehicle_track.dao;

import org.springframework.stereotype.Service;
import spring.smart_vehicle_track.model.Usuario;

@Service
public interface IUsuarioDao {
    Usuario crearUsuario(Usuario usuario);
}
