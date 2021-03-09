package com.inspector.dto.sol;

import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

import java.io.File;

@Getter
@Setter
public class SolImagenDto extends BaseDto {

    private Long idSolImagen;
    private Long idSolicitud;
    String nombre;
    String descripcion;
    String seccion;
    String Imagen;

    public SolImagenDto() {}

    @Override
    public Long getId() {
        return idSolImagen;
    }
}
