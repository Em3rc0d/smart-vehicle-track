package spring.smart_vehicle_track.dto;

import java.sql.Time;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HistorialViajeDto {
    private Long idRuta;
    private Long idBus;
    private Long idEstacion;
    private Time fechaHora;
    private String estado;
    private String observaciones;

}
