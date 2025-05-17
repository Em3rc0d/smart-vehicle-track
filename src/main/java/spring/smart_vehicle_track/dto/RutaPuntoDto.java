package spring.smart_vehicle_track.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RutaPuntoDto {
    private Long id;
    private Long idRuta;    // Solo el ID para referencia
    private Integer orden;
    private BigDecimal latitud;
    private BigDecimal longitud;
}
