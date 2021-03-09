package com.inspector.dto.sol;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class SolProcesoDto extends BaseDto {

    private Long idSolProceso;
    private Long idSolicitud;
    private Long idSolProductor;
    int cajaProcesadaDespachada;
    String tipoFruta;
    String tipoFunda;
    String densidadFunda;
    String tipoCaja;
    String tipoPresentacion;
    String tipoEstiba;
    String tiempoDescargaFumigacion;
    String tipoCantulina;

    public SolProcesoDto() {}

    @Override
    public Long getId() {
        return idSolProceso;
    }
}
