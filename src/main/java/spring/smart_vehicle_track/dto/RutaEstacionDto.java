package spring.smart_vehicle_track.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RutaEstacionDto {
    private Long idEstacion;
    private Long idRuta;
    private Integer orden;
    private Double distanciaKm;
}   