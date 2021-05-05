package com.inspector.dto.sol;

import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TabSolConCalibracionFrutaDto extends BaseDto {

    private Long idSolConCalibracionFruta;
    private Long idSolConsolidadoGancho;
    int numSemana;
    String color;
    int numRacimo;

    public TabSolConCalibracionFrutaDto() {}

    @Override
    public Long getId() {
        return idSolConCalibracionFruta;
    }
}
