package com.inspector.dto.sol;

import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SolConCalibracionFrutaDto {

    private Long idSolConCalibracionFruta;
    private Long idSolicitud;
    private Long idSolConsolidadoGancho;
    int numSemana;
    String color;
    int numRacimo;
    String estRegCF;

    public SolConCalibracionFrutaDto() {}

}
