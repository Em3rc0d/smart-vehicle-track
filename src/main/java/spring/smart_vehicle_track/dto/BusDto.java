package spring.smart_vehicle_track.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import spring.smart_vehicle_track.model.Chofer;
import spring.smart_vehicle_track.model.Ruta;
import spring.smart_vehicle_track.model.STATUS_CAR;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BusDto {
    private String placa;
    private String modelo;
    private Integer capacidad;

    @Enumerated(EnumType.STRING)
    private STATUS_CAR estado;

    private Long idRuta;

    private Long idChofer;
}
