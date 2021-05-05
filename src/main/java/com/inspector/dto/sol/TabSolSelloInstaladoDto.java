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
    String selloVerificadora;
    String cableNaviera;
    String cableExportadora;
    //String stickerNaviera;
    String stickerExportadora;
    String rastreo;
    String termografo1;
    String ubicacion1;
    String termografo2;
    String ubicacion2;
    String filtroProporcionado;
    String termoking;

    public TabSolSelloInstaladoDto() {}

    @Override
    public Long getId() {
        return idSolSelloInstalado;
    }
}
