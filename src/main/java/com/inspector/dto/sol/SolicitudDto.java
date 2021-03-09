package com.inspector.dto.sol;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.inspector.dto.BaseDto;
import com.inspector.dto.BaseSolicitudDto;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class SolicitudDto extends BaseSolicitudDto {

    private Long idSolicitud;
    int semana;
    String exportador;
    String cliente;
    String tipoSolicitud;
    String productor;
    String codigoProductor;
    String codigoMagap;
    String puertoEmbarque;
    String zona;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    protected LocalDateTime fechaInicio;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    protected LocalDateTime fechaTermino;
    String contenedor;
    String nomEvaluador01;
    String ciEvaluador01;
    String nomEvaluador02;
    String ciEvaluador02;
    String observacion;

    public SolicitudDto() {}

    @Override
    public Long getId() {
        return idSolicitud;
    }
}
