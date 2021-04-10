package com.inspector.dto.sol;

import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SolCalPesoClusterDto {

    private Long idSolCalPesoCluster;
    private Long idSolCalidad;
    private Long idSolProductor;
    private Long idSolicitud;
    int		numero	;
    double	peso	;
    String estRegPC; // nuevo

    public SolCalPesoClusterDto() {}

}
