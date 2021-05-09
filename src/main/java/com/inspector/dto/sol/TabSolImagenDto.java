package com.inspector.dto.sol;

import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TabSolImagenDto extends BaseDto {

    private Long  idSolImagen;
    private Long  idSolicitud;
    private Long  idSolContenedor = 0L;
    private Long  idSolSelloLlegada = 0L;
    private Long  idSolSelloInstalado = 0L;
    private Long  idSolTransportista = 0L;
    private Long  idSolProceso = 0L;
    private Long  idSolControlPeso = 0L;
    private Long  idSolFinca = 0L;
    private Long  idSolConsolidadoGancho = 0L;
    private Long  idSolCalidad = 0L;
    private Long  idSolCalPackingList = 0L;
    String nombre;
    String descripcion;
    String seccion;
    String cargar;
    String imagen;

    public TabSolImagenDto() {}

    @Override
    public Long getId() {
        return idSolImagen;
    }
}
