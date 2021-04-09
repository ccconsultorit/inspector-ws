package com.inspector.dto.sol;

import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TabSolSelloInstaladoDto extends BaseDto {

    private Long idSolSelloInstalado;
    private Long idSolicitud;
    String candadoNaviera;
    String selloVerificador;
    String cableNaviera;
    String cableExportadora;
    String stickerNaviera;
    String stickerExportadora;
    String rastreo;
    String termografo01;
    String ubicacionTermografo01;
    String termografo02;
    String ubicacionTermografo02;
    String filtroProporcionado;
    String termoking;

    public TabSolSelloInstaladoDto() {}

    @Override
    public Long getId() {
        return idSolSelloInstalado;
    }
}
