package spring.smart_vehicle_track.dao;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.smart_vehicle_track.dao.interfaces.IUsuarioDao;
import spring.smart_vehicle_track.model.Usuario;
import spring.smart_vehicle_track.repository.UsuarioRepository;

@Data
@Service
public class UsuarioDao implements IUsuarioDao {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario crearUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
