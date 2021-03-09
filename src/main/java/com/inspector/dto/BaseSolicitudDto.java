package com.inspector.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.inspector.enumaraciones.EstadoEnum;
import com.inspector.enumaraciones.EstadoSolicitudEnum;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Clase base de DTO
 *
 * @author ebailon
 */
@Getter
@Setter
public abstract class BaseSolicitudDto {

    protected Long usuarioIngreso;
    protected Long usuarioModifica;

    @JsonFormat(shape = Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    protected LocalDateTime fechaIngreso;

    @JsonFormat(shape = Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    protected LocalDateTime fechaModifica;

    protected EstadoSolicitudEnum estado;

    {
        estado = EstadoSolicitudEnum.ING;
        fechaIngreso = LocalDateTime.now();
    }

    public abstract Long getId();

}
