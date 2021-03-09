package com.inspector.dto.seg;

import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioDto extends BaseDto {

    private Long idUsuario;
    private String usuario;
    private String nombres;
    private String apellidos;
    private String correo;
    private String telefono;
    private String celular;
    private String clave;
    private String direccion;

    @Override
    public Long getId() {
        return idUsuario;
    }
}
