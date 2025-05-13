package spring.smart_vehicle_track.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ChoferDto {
    private String nombre;
    private String dni;
    private String licencia;
    private String telefono;
}
