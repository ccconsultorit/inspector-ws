package com.inspector.dto.sol;

import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SolCalidadDto{

    private Long idSolCalidad;
    private Long idSolicitud;
    String nomMarca;
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
    String estRegCal; // nuevo

    private Long idSolCalCalibre;
    int		calUg	;
    int		calOg	;
    int		cal37	;
    int		cal38	;
    int		cal39	;
    int		cal40	;
    int		cal41	;
    int		cal42	;
    int		cal43	;
    int		cal44	;
    int		cal45	;
    int		cal46	;
    int		cal47	;
    int		cal48	;
    int		cal49	;
    int		cal50	;
    int		cal51	;
    int		cal52	;
    int		cal53	;
    int		cal54	;
    String estRegClb; // nuevo

    private Long idSolCalLargoDedo;
    int		lar8	;
    int		lar8_2	;
    int		lar8_4	;
    int		lar8_6	;
    int		lar8_8	;
    int		lar9	;
    int		lar9_2	;
    int		lar9_4	;
    int		lar9_6	;
    int		lar9_8	;
    int		lar10	;
    int		lar10_2	;
    int		lar10_4	;
    int		lar10_6	;
    int		lar10_8	;
    int		lar11	;
    int		lar11_2	;
    int		lar11_4	;
    int		lar11_6	;
    int		lar11_8	;
    String estRegLD; // nuevo

    List<SolCalDefectoSeleccionDto> listSolCalDefectoSeleccionDto;
    List<SolCalPesoClusterDto> listSolCalPesoClusterDto;
    List<SolCalPackingListDto> listSolCalPackingListDto;

    public SolCalidadDto() {}


}
