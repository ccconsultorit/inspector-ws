package com.inspector.dto.sol;

import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TabSolCalPackingListDto extends BaseDto {

    private Long idSolCalPackingList;
    private Long idSolCalidad;
    int numeracion;
    String sticker;

    public TabSolCalPackingListDto() {}

    @Override
    public Long getId() {
        return idSolCalPackingList;
    }
}
