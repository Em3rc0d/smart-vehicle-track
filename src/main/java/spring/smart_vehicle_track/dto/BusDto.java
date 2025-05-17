package spring.smart_vehicle_track.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import spring.smart_vehicle_track.model.enums.STATUS_CAR;

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
