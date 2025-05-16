package spring.smart_vehicle_track.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.smart_vehicle_track.dao.IChoferDao;
import spring.smart_vehicle_track.dto.ChoferDto;
import spring.smart_vehicle_track.model.Chofer;
import spring.smart_vehicle_track.repository.ChoferRepository;

@Data
@Service
public class ChoferService implements IChoferService {

    @Autowired
    private IChoferDao choferDao;

    @Override
    public Chofer crearChofer(ChoferDto choferDto) {
        Chofer chofer = new Chofer();
        chofer.setNombre(choferDto.getNombre());
        chofer.setDni(choferDto.getDni());
        chofer.setLicencia(choferDto.getLicencia());
        chofer.setTelefono(choferDto.getTelefono());

        return choferDao.crearChofer(chofer);
    }

    @Override
    public Chofer eliminarChofer(Long id) {
        return choferDao.eliminarChofer(id);
    }
}
