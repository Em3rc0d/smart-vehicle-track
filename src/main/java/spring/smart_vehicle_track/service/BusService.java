package spring.smart_vehicle_track.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.smart_vehicle_track.dao.IBusDao;
import spring.smart_vehicle_track.dao.IChoferDao;
import spring.smart_vehicle_track.dao.IRutaDao;
import spring.smart_vehicle_track.dao.generic.IGenericDao;
import spring.smart_vehicle_track.dto.BusDto;
import spring.smart_vehicle_track.model.Bus;
import spring.smart_vehicle_track.model.Chofer;
import spring.smart_vehicle_track.model.Ruta;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Data
@Service
public class BusService implements IBusService {

    @Autowired
    private IBusDao busDao;

    @Autowired
    private IRutaDao rutaDao;

    @Autowired
    private IChoferDao choferDao;

    @Autowired
    private IGenericDao genericDao;

    @Override
    public Bus crearBus(BusDto busDto) {
        try {
            Ruta ruta = rutaDao.encontrarRutaById(busDto.getIdRuta());
            Chofer chofer = choferDao.encontrarChoferById(busDto.getIdChofer());

            if (ruta == null) {
                throw new IllegalArgumentException("Ruta no encontrada con ID: " + busDto.getIdRuta());
            }
            if (chofer == null) {
                throw new IllegalArgumentException("Chofer no encontrado con ID: " + busDto.getIdChofer());
            }

            Bus bus = new Bus();
            bus.setPlaca(busDto.getPlaca());
            bus.setModelo(busDto.getModelo());
            bus.setCapacidad(busDto.getCapacidad());
            bus.setEstado(busDto.getEstado());
            bus.setRuta(ruta);
            bus.setChofer(chofer);

            return busDao.crearBus(bus);
        } catch (Exception e) {
            throw new RuntimeException("Error al crear el bus", e);
        }
    }

    @Override
    public Bus actualizarBus(Map<String, Object> datosBus, Long id) {
        Bus bus = busDao.encontrarBusById(id);
        bus = genericDao.actualizarCampos(bus, datosBus);
        return busDao.crearBus(bus);
    }

    @Override
    public Bus eliminarBus(Long id) {
        try {
            Optional<Bus> optionalBus = Optional.ofNullable(busDao.encontrarBusById(id));
            if (optionalBus.isEmpty()) {
                throw new IllegalArgumentException("Bus no encontrado con ID: " + id);
            }
            return busDao.eliminarBus(id);
        } catch (Exception e) {
            throw new RuntimeException("Error al eliminar el bus", e);
        }
    }

    @Override 
    public List<Bus> obtenerBuses() {
        return busDao.obtenerBuses();
    }
}
