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
    double totalEmbarcado;
    double totalCluster;
    double totalDefecto;
    double calidad;
    double calibracion;
    double largoDedo;
    double totalPeso;
    double pesoPromedio;
    String mayorDefectoSeleccion;
    String mayorDefectoEmpaque;
    String estRegCal; // nuevo
    String areaAGuardar;

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
    int		lar80	;
    int		lar82	;
    int		lar84	;
    int		lar86	;
    int		lar88	;
    int		lar90	;
    int		lar92	;
    int		lar94	;
    int		lar96	;
    int		lar98	;
    int		lar100	;
    int		lar102	;
    int		lar104	;
    int		lar106	;
    int		lar108	;
    int		lar110	;
    int		lar112	;
    int		lar114	;
    int		lar116	;
    int		lar118	;
    String estRegLD; // nuevo

    List<SolCalDefectoSeleccionDto> listSolCalDefectoSeleccion;
    List<SolCalPesoClusterDto> listSolCalPesoCluster;
    List<SolCalPackingListDto> listSolCalPackingList;

    public SolCalidadDto() {}


}
