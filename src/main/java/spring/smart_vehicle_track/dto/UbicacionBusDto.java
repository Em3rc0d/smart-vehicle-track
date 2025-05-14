package spring.smart_vehicle_track.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UbicacionBusDto {
    private Long idBus;
    private BigDecimal latitud;
    private BigDecimal longitud;
    private BigDecimal velocidad;
    private Timestamp timestamp;
}
