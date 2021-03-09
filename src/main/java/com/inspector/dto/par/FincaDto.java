package com.inspector.dto.par;

import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FincaDto extends BaseDto {

    private Long idFinca;
    private String nombre;

    @Override
    public Long getId() {
        return idFinca;
    }
}
