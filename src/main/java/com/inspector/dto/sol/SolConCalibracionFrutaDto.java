package com.inspector.dto.sol;

import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SolConCalibracionFrutaDto extends BaseDto {

    private Long idSolConCalibracionFruta;
    private Long idSolicitud;
    private Long idSolConsolidadoGancho;
    int numSemana;
    String color;
    int numRacimo;

    public SolConCalibracionFrutaDto() {}

    @Override
    public Long getId() {
        return idSolConCalibracionFruta;
    }
}
