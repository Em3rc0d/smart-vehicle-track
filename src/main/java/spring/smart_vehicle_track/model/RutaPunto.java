package spring.smart_vehicle_track.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "RutaPunto")
public class RutaPunto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ruta_id", nullable = false)
    private Ruta ruta;

    private Integer orden;

    @Column(precision = 9, scale = 6, nullable = false)
    private BigDecimal latitud;

    @Column(precision = 9, scale = 6, nullable = false)
    private BigDecimal longitud;
}
