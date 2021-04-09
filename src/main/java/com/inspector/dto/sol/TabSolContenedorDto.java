package com.inspector.dto.sol;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter
public class TabSolContenedorDto extends BaseDto {

    private Long idSolContenedor;
    private Long idSolicitud;
    String numeroContenedor;
    String vapor;
    String booking;
    String tipoContenedor;
    String agenciaNaviera;
    String tare;
    String maxGross;
    String puertoSalida;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    protected LocalDateTime fechaLlegada;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    protected LocalDateTime fechaApertura;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    protected LocalDateTime fechaCierre;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    protected LocalDateTime fechaSalida;
    String observacion;

    public TabSolContenedorDto() {}

    @Override
    public Long getId() {
        return idSolContenedor;
    }
}
