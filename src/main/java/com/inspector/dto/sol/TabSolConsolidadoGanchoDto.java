package com.inspector.dto.sol;

import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TabSolConsolidadoGanchoDto extends BaseDto {

    private Long idSolConsolidadoGancho;
    private Long idSolicitud;
    int enFunde;
    int racimoCosechado;
    int racimoRechazado;
    int racimoProcesado;
    int mutante;
    int spacklin;
    int puntaAmarilla;
    int crema;
    int manchaRoja;
    int alterado;
    int pobre;
    int caido;
    int sobreGrado;
    int bajoGrado;
    int mosaico;
    int rasgunoAnimal;
    int explosivo;
    int herwinea;
    int sinCinta;
    int cochinilla;
    int escama;
    int fumagina;
    int pesonudo;
    String observacion;

    List<TabSolConCalibracionFrutaDto> listTabSolConCalibracionFrutaDto;

    public TabSolConsolidadoGanchoDto() {}

    @Override
    public Long getId() {
        return idSolConsolidadoGancho;
    }
}
