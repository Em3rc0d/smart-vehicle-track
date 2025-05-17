package spring.smart_vehicle_track.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import spring.smart_vehicle_track.model.enums.ROL_USER;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String correo;
    private String contraseña;

    @Enumerated(EnumType.STRING)
    private ROL_USER rol;
}
