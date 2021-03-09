package com.inspector.dto.sol;

import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SolProductorDto extends BaseDto {

    private Long idSolProductor;
    private Long idSolicitud;
    String nombre;

    SolTransportistaDto solTransportistaDto;
    SolProcesoDto solProcesoDto;
    SolControlPesoDto solControlPesoDto;
    SolFincaDto solFincaDto;
    List<SolCalidadDto> listSolCalidadDto;
    SolConsolidadoGanchoDto solConsolidadoGanchoDto;

    public SolProductorDto() {}

    @Override
    public Long getId() {
        return idSolProductor;
    }
}
