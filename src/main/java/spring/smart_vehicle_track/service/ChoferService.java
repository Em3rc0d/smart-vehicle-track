package spring.smart_vehicle_track.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.smart_vehicle_track.dto.ChoferDto;
import spring.smart_vehicle_track.model.Chofer;
import spring.smart_vehicle_track.repository.ChoferRepository;

@Service
public class ChoferService implements IChoferService {

    @Autowired
    private ChoferRepository choferRepository;

    @Override
    public Chofer crearChofer(ChoferDto choferDto) {
        // Convertimos el DTO a una entidad Chofer
        Chofer chofer = new Chofer();
        chofer.setNombre(choferDto.getNombre());
        chofer.setDni(choferDto.getDni());
        chofer.setLicencia(choferDto.getLicencia());
        chofer.setTelefono(choferDto.getTelefono());

        // Guardamos el chofer en la base de datos
        Chofer choferGuardado = choferRepository.save(chofer);

        // Retornamos el chofer guardado
        return choferGuardado;
    }

    @Override
    public Chofer actualizarChofer(Long id, ChoferDto choferDto) {
        // Buscamos el chofer por su ID
        Chofer chofer = choferRepository.findById(id).orElseThrow(() -> new RuntimeException("Chofer no encontrado"));

        // Actualizamos los datos del chofer con los datos del DTO
        chofer.setNombre(choferDto.getNombre());
        chofer.setDni(choferDto.getDni());
        chofer.setLicencia(choferDto.getLicencia());
        chofer.setTelefono(choferDto.getTelefono());

        // Guardamos el chofer actualizado en la base de datos
        return choferRepository.save(chofer);
    }

    @Override
    public void eliminarChofer(Long id) {
        // Eliminamos el chofer por su ID
        choferRepository.deleteById(id);
    }

    @Override
    public Chofer obtenerChofer(Long id) {
        return choferRepository.findById(id).orElseThrow(() -> new RuntimeException("Chofer no encontrado"));
    }
}
