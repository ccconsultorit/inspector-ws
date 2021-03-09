package com.inspector.dto.sol;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class SolControlPesoDto extends BaseDto {

    private Long idSolControlPeso;
    private Long idSolicitud;
    private Long idSolProductor;
    String balanzaRepesa;
    String condicionBalanza;
    String tipoBalanza;
    double pesoNetoFruta;
    String observacion;

    public SolControlPesoDto() {}

    @Override
    public Long getId() {
        return idSolControlPeso;
    }
}
