package com.inspector.dto.sol;

import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TabSolTransportistaDto extends BaseDto {

    private Long idSolTransportista;
    private Long idSolicitud;
    private Long idSolProductor;
    String empresaTransporte;
    String chofer;
    String cedula;
    String celular;
    String placa;
    String colorCabezal;
    String marcaCabezal;
    String observacion;

    public TabSolTransportistaDto() {}

    @Override
    public Long getId() {
        return idSolTransportista;
    }
}
