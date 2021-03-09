package com.inspector.dto.sol;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class SolFincaDto extends BaseDto {

    private Long idSolFinca;
    private Long idSolicitud;
    private Long idSolProductor;
    String nombre;
    String fuenteAgua;
    String aguaCorrida;
    String estadoPiso;
    String cableVia;
    String estadoTecho;
    String estadoTina;
    String fumigacion;
    String lavadoRacimo;
    String embudo;
    String divisionTina;

    public SolFincaDto() {}

    @Override
    public Long getId() {
        return idSolFinca;
    }
}
