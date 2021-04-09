package com.inspector.dto.sol;

import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TabSolProductorDto extends BaseDto {

    private Long idSolProductor;
    private Long idSolicitud;
    String nombre;

    TabSolTransportistaDto tabSolTransportistaDto;
    TabSolProcesoDto tabSolProcesoDto;
    TabSolControlPesoDto tabSolControlPesoDto;
    TabSolFincaDto tabSolFincaDto;
    List<TabSolCalidadDto> listTabSolCalidadDto;
    TabSolConsolidadoGanchoDto tabSolConsolidadoGanchoDto;

    public TabSolProductorDto() {}

    @Override
    public Long getId() {
        return idSolProductor;
    }
}
