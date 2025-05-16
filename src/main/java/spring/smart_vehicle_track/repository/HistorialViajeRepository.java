package spring.smart_vehicle_track.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.smart_vehicle_track.model.HistorialViaje;

public interface HistorialViajeRepository extends JpaRepository<HistorialViaje, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
    
}
