package com.inspector.dto.sol;

import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TabSolCalCalibreDto extends BaseDto {

    private Long idSolCalCalibre;
    private Long idSolCalidad;
    private Long idSolicitud;
    int		calUg	;
    int		calOg	;
    int		cal37	;
    int		cal38	;
    int		cal39	;
    int		cal40	;
    int		cal41	;
    int		cal42	;
    int		cal43	;
    int		cal44	;
    int		cal45	;
    int		cal46	;
    int		cal47	;
    int		cal48	;
    int		cal49	;
    int		cal50	;
    int		cal51	;
    int		cal52	;
    int		cal53	;
    int		cal54	;

    public TabSolCalCalibreDto() {}

    @Override
    public Long getId() {
        return idSolCalCalibre;
    }
}
