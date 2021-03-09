package com.inspector.dto.sol;

import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SolTransportistaDto extends BaseDto {

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

    public SolTransportistaDto() {}

    @Override
    public Long getId() {
        return idSolTransportista;
    }
}
