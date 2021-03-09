package com.inspector.dto.par;

import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ZonaDto extends BaseDto {

    private Long idZona;
    private String nombre;

    @Override
    public Long getId() {
        return idZona;
    }
}
