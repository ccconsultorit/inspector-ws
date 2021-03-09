package com.inspector.dto.sol;

import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SolCalPackingListDto extends BaseDto {

    private Long idSolCalPackingList;
    private Long idSolicitud;
    private Long idSolCalidad;
    int numeracion;
    String sticker;

    public SolCalPackingListDto() {}

    @Override
    public Long getId() {
        return idSolCalPackingList;
    }
}
