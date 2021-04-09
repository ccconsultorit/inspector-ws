package com.inspector.dto.sol;

import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TabSolCalidadDto extends BaseDto {

    private Long idSolCalidad;
    private Long idSolicitud;
    String nombreMarca;
    String nroQs;
    String guiaTransporte;
    String guiaRemision;
    int defectuoso;
    String tarjetaEmbarque;
    double totalCluster;
    double totalDefecto;
    double calidad;
    double largoDedo;
    double totalPeso;
    double pesoPromedio;
    String mayorDefectoSeleccion;
    String mayorDefectoEmpaque;

    List<TabSolCalDefectoSeleccionDto> listTabSolCalDefectoSeleccionDto;
    TabSolCalCalibreDto tabSolCalCalibreDto;
    TabSolCalLargoDedoDto tabSolCalLargoDedoDto;
    List<TabSolCalPesoClusterDto> listTabSolCalPesoClusterDto;
    List<TabSolCalPackingListDto> listTabSolCalPackingListDto;

    public TabSolCalidadDto() {}

    @Override
    public Long getId() {
        return idSolCalidad;
    }
}
