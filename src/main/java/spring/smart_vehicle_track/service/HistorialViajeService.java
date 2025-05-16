package spring.smart_vehicle_track.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;
import spring.smart_vehicle_track.dao.IBusDao;
import spring.smart_vehicle_track.dao.IEstacionDao;
import spring.smart_vehicle_track.dao.IHistorialViajeDao;
import spring.smart_vehicle_track.dao.IRutaDao;
import spring.smart_vehicle_track.dto.HistorialViajeDto;
import spring.smart_vehicle_track.model.Bus;
import spring.smart_vehicle_track.model.Estacion;
import spring.smart_vehicle_track.model.HistorialViaje;
import spring.smart_vehicle_track.model.Ruta;


@Data
@Service
public class HistorialViajeService implements IHistorialViajeService {

    @Autowired
    private IHistorialViajeDao historialViajeDao;

    @Autowired
    private IRutaDao rutaDao;

    @Autowired
    private IBusDao busDao;
    
    @Autowired
    private IEstacionDao estacionDao;

    @Override
    public HistorialViaje registrarPaso(HistorialViajeDto historialViajeDto) {
        try {
            Ruta ruta = rutaDao.encontrarRutaById(historialViajeDto.getIdRuta());
            Bus bus = busDao.encontrarBusById(historialViajeDto.getIdBus());
            Estacion estacion = estacionDao.obtenerEstacion(historialViajeDto.getIdEstacion());

            if (ruta == null) {
                throw new IllegalArgumentException("Ruta no encontrada con ID: " + historialViajeDto.getIdRuta());
            }

            if (bus == null) {
                throw new IllegalArgumentException("Bus no encontrado con ID: " + historialViajeDto.getIdBus());
            }

            if (estacion == null) {
                throw new IllegalArgumentException("Estacion no encontrada con ID: " + historialViajeDto.getIdEstacion());
            }

            HistorialViaje historialViaje = new HistorialViaje();
            historialViaje.setRuta(ruta);
            historialViaje.setBus(bus);
            historialViaje.setEstacion(estacion);
            historialViaje.setFechaHoraPaso(historialViajeDto.getFechaHora());
            
            return historialViajeDao.registrarPaso(historialViaje);
        } catch (Exception e) {
            throw new RuntimeException("Error al registrar el paso", e);
        }
    }

}
