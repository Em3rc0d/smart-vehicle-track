package spring.smart_vehicle_track.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import spring.smart_vehicle_track.dao.interfaces.IChoferDao;
import spring.smart_vehicle_track.dao.generic.IGenericDao;
import spring.smart_vehicle_track.dto.ChoferDto;
import spring.smart_vehicle_track.model.Chofer;
import spring.smart_vehicle_track.service.interfaces.IChoferService;

@Slf4j
@Data
@Service
public class ChoferService implements IChoferService {

    @Autowired
    private IChoferDao choferDao;
    
    @Autowired
    private IGenericDao genericDao;

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
    public Chofer actualizarChofer(Map<String, Object> datosChofer, Long id){
        Chofer chofer = choferDao.encontrarChoferById(id);
        chofer = genericDao.actualizarCampos(chofer, datosChofer);
        return choferDao.crearChofer(chofer);
    }

//    @Override
//    public Chofer actualizarChofer(Long id, ChoferDto choferDto) {
//        // Buscamos el chofer por su ID
//        Chofer chofer = choferRepository.findById(id).orElseThrow(() -> new RuntimeException("Chofer no encontrado"));
//
//        // Actualizamos los datos del chofer con los datos del DTO
//        chofer.setNombre(choferDto.getNombre());
//        chofer.setDni(choferDto.getDni());
//        chofer.setLicencia(choferDto.getLicencia());
//        chofer.setTelefono(choferDto.getTelefono());
//
//        // Guardamos el chofer actualizado en la base de datos
//        return choferRepository.save(chofer);
//    }
//
//    @Override
//    public void eliminarChofer(Long id) {
//        // Eliminamos el chofer por su ID
//        choferRepository.deleteById(id);
//    }
//
//    @Override
//    public Chofer obtenerChofer(Long id) {
//        return choferRepository.findById(id).orElseThrow(() -> new RuntimeException("Chofer no encontrado"));
//    }
    public Chofer eliminarChofer(Long id) {
        return choferDao.eliminarChofer(id);
    }
}
