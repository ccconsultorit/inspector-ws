package com.inspector.dto.sol;

import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SolCalPesoClusterDto extends BaseDto {

    private Long idSolCalPesoCluster;
    private Long idSolCalidad;
    private Long idSolProductor;
    private Long idSolicitud;
    int		numero	;
    double	peso	;

    public SolCalPesoClusterDto() {}

    @Override
    public Long getId() {
        return idSolCalPesoCluster;
    }
}
