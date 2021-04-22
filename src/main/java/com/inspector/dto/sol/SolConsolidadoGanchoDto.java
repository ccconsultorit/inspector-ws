package com.inspector.dto.sol;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SolConsolidadoGanchoDto {

    private Long idSolicitud;
    private Long idSolConsolidadoGancho;
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
    String observacionCG;
    String estRegCG;

    List<SolConCalibracionFrutaDto> listSolConCalibracionFrutaDto;

    public SolConsolidadoGanchoDto() {}


}
