package com.inspector.dto.par;

import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductorDto extends BaseDto {

    private Long idProductor;
    private String nombre;

    @Override
    public Long getId() {
        return idProductor;
    }
}
