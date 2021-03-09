package com.inspector.dto.sol;

import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SolCalLargoDedoDto extends BaseDto {

    private Long idSolCalLargoDedo;
    private Long idSolCalidad;
    private Long idSolicitud;
    int		lar8	;
    int		lar8_2	;
    int		lar8_4	;
    int		lar8_6	;
    int		lar8_8	;
    int		lar9	;
    int		lar9_2	;
    int		lar9_4	;
    int		lar9_6	;
    int		lar9_8	;
    int		lar10	;
    int		lar10_2	;
    int		lar10_4	;
    int		lar10_6	;
    int		lar10_8	;
    int		lar11	;
    int		lar11_2	;
    int		lar11_4	;
    int		lar11_6	;
    int		lar11_8	;

    public SolCalLargoDedoDto() {}

    @Override
    public Long getId() {
        return idSolCalLargoDedo;
    }
}
