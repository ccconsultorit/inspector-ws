package com.inspector.dto.sol;

import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TabSolCalPesoClusterDto extends BaseDto {

    private Long idSolCalPesoCluster;
    private Long idSolCalidad;
    int		numero	;
    double	peso	;

    public TabSolCalPesoClusterDto() {}

    @Override
    public Long getId() {
        return idSolCalPesoCluster;
    }
}
