package spring.smart_vehicle_track.dto;

import java.math.BigInteger;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EstacionDto {
    private String nombre;
    private BigInteger latitud;
    private BigInteger longitud;
    private String distrito;
}

