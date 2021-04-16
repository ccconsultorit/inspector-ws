package com.inspector.dto.sol;

import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SolCalPackingListDto {

    private Long idSolCalPackingList;
    private Long idSolCalidad;
    private Long idSolicitud;
    int numeracion;
    String sticker;
    String estRegPL; // nuevo
    String areaAGuardar;

    public SolCalPackingListDto() {}

}
