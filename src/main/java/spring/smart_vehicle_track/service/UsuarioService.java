package spring.smart_vehicle_track.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;
import spring.smart_vehicle_track.dao.interfaces.IUsuarioDao;
import spring.smart_vehicle_track.dto.UsuarioDto;
import spring.smart_vehicle_track.model.Usuario;
import spring.smart_vehicle_track.service.interfaces.IUsuarioService;

@Data
@Service
public class UsuarioService implements IUsuarioService {
    @Autowired
    private IUsuarioDao usuarioDao;

    @Override
    public Usuario crearUsuario(UsuarioDto usuarioDto){
        Usuario usuario = new Usuario();
        usuario.setNombre(usuarioDto.getNombre());
        usuario.setCorreo(usuarioDto.getCorreo());
        usuario.setContraseña(usuarioDto.getContraseña());
        usuario.setRol(usuarioDto.getRol());
        return usuarioDao.crearUsuario(usuario);
    }
}
