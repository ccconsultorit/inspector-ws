package com.inspector.dto.sol;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.inspector.dto.BaseDto;
import com.inspector.dto.BaseSolicitudDto;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class TabSolicitudDto extends BaseSolicitudDto {

    private Long idSolicitud;
    int nroSemana;
    String exportador;
    String cliente;
    String tipoSolicitud;
    String productor;
    String codProductor;
    String codMagap;
    String puertoEmbarque;
    String zona;
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    //protected LocalDateTime fechaInicio;
    String fechaInicio;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    protected LocalDateTime fechaTermino;
    String contenedor;
    String nomEvaluador01;
    String ciEvaluador01;
    String nomEvaluador02;
    String ciEvaluador02;
    String observacion;

    public TabSolicitudDto() {}

    @Override
    public Long getId() {
        return idSolicitud;
    }
}
