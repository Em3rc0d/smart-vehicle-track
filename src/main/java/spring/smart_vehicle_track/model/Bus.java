package spring.smart_vehicle_track.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Bus")
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String placa;
    private String modelo;
    private Integer capacidad;

    @Enumerated(EnumType.STRING)
    private STATUS_CAR estado;

    @ManyToOne
    @JoinColumn(name = "ruta_id", nullable = true)
    private Ruta ruta;

    @ManyToOne
    @JoinColumn(name = "chofer_id", nullable = true)
    private Chofer chofer;
}
