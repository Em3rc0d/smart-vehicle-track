package spring.smart_vehicle_track.service.interfaces;

import org.springframework.stereotype.Service;

import spring.smart_vehicle_track.dto.UsuarioDto;
import spring.smart_vehicle_track.model.Usuario;

@Service
public interface IUsuarioService {
    Usuario crearUsuario(UsuarioDto usuarioDto);
}
