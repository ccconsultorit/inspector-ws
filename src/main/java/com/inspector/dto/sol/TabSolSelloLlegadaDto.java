package com.inspector.dto.sol;

import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TabSolSelloLlegadaDto extends BaseDto {

    private Long idSolSelloLlegada;
    private Long idSolicitud;
    String candadoPlastico;
    String candadoBotella;
    String stickerLlegada;
    String rastreoSatelital;
    String selloCadena;
    String stickerNaviera;
    String selloLlegada1;
    String selloLlegada2;
    String stickerPatioVentolera1;
    String stickerPatioVentolera2;
    String nroSerie;
    String candadoExportador;
    String observacion;

    public TabSolSelloLlegadaDto() {}

    @Override
    public Long getId() {
        return idSolSelloLlegada;
    }
}
