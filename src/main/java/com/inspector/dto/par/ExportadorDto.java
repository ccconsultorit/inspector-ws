package com.inspector.dto.par;

import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExportadorDto extends BaseDto {

    private Long idExportador;
    private String nombre;

    @Override
    public Long getId() {
        return idExportador;
    }
}
