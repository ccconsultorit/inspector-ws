package com.inspector.dto.sol;

import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TabSolImagenDto extends BaseDto {

    private Long  idSolImagen;
    private Long  idSolicitud;
    private Long  idDatoGeneral;
    private Long  idSolContenedor;
    private Long  idSolSelloLlegada;
    private Long  idSolSelloInstalado;
    private Long  idSolTransportista;
    private Long  idSolProceso;
    private Long  idSolControlPeso;
    private Long  idSolFinca;
    private Long  idSolConsolidadoGancho;
    private Long  idSolCalidad;
    private Long  idSolCalPackingList;
    String nombre;
    String descripcion;
    String seccion;
    String cargar;
    String imagen;
    String estRegIma;

    public TabSolImagenDto() {}

    @Override
    public Long getId() {
        return idSolImagen;
    }
}
