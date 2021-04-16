package com.inspector.dto.sol;

import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TabSolCalDefectoSeleccionDto extends BaseDto {

    private Long idSolCalDefectoSeleccion;
    private Long idSolCalidad;
    private Long idSolicitud;
    double	peso	;
    int 	numeroGanchoInspeccionado	;
    double	ph	;
    int		sr	;
    int		br	;
    int		ni	;
    int		mf	;
    int		ct	;
    int		fl	;
    int		dp	;
    int		ug	;
    int		og	;
    int		ls	;
    int		lg	;
    int		bm	;
    int		ts	;
    int		cs	;
    int		wi	;
    int		sk	;
    int		yb	;
    int		rr	;
    int		tc	;
    int		sp	;
    int		sm	;
    int		tr	;
    int		ab	;
    int		ch	;
    int		tf	;
    int		ud	;
    int		pd	;
    int		ff	;
    int		bs	;
    int		dt	;
    int		sre	;
    int		bre	;
    int		nie	;
    int		fre	;
    int		sc	;
    int		ml	;
    int		md	;
    int		ec	;
    int		v	;
    int		f	;
    int		ea	;
    int		ps	;

    public TabSolCalDefectoSeleccionDto() {}

    @Override
    public Long getId() {
        return idSolCalDefectoSeleccion;
    }
}
