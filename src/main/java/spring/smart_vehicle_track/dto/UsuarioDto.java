package spring.smart_vehicle_track.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import spring.smart_vehicle_track.model.ROL_USER;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UsuarioDto {
    private String nombre;
    private String correo;
    private String contraseña;

    @Enumerated(EnumType.STRING)
    private ROL_USER rol;
}
