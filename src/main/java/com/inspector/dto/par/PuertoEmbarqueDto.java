package com.inspector.dto.par;

import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PuertoEmbarqueDto extends BaseDto {

    private Long idPuertoEmbarque;
    private String nombre;

    @Override
    public Long getId() {
        return idPuertoEmbarque;
    }
}
