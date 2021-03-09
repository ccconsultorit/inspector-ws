package com.inspector.dto.sol;

import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SolSelloLlegadaDto extends BaseDto {

    private Long idSolSelloLlegada;
    private Long idSolicitud;
    String candadoPlastico;
    String candadoBotella;
    String stickerLlegada;
    String rastreoSatelital;
    String selloCadena;
    String stickerNavieraVentilador;
    String selloLlegadaInterno01;
    String selloLlegadaInterno02;
    String stickerPatioVentoleraExterna01;
    String stickerPatioVentoleraExterna02;
    String nroSerieFunda;
    String candadoExportador;
    String observacion;

    public SolSelloLlegadaDto() {}

    @Override
    public Long getId() {
        return idSolSelloLlegada;
    }
}
