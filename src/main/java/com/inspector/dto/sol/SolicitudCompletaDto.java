package com.inspector.dto.sol;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class SolicitudCompletaDto  {

    private Long idSolicitud;
    int nroSemana;
    String tipoSolicitud;
    String cliente;
    String exportador;
    String productor;
    String codProductor;
    String codMagap;
    String puertoEmbarque;
    String zona;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    protected LocalDateTime fechaInicio;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    protected LocalDateTime fechaFin;
    String contenedor;
    String nomEvaluador01;
    String ciEvaluador01;
    String nomEvaluador02;
    String ciEvaluador02;
    String observacion;
    String estRegSol;
    String areaAGuardar;

    private Long idSolContenedor;
    String nroContenedor;
    String vapor;
    String booking;
    String tipoContenedor;
    String agenciaNaviera;
    String tare;
    String maxGross;
    String puertoSalida;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    protected LocalDateTime fechaLlegada;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    protected LocalDateTime fechaApertura;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    protected LocalDateTime fechaCierre;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    protected LocalDateTime fechaSalida;
    String observacionCon;
    String estRegCon;

    private Long idSolSelloArribo;
    String candadoPlastico;
    String candadoBotella;
    String stickerLlegada;
    String rastreoSatelital;
    String selloCadena;
    String stickerNaviera;
    String selloLlegada1;
    String selloLlegada2;
    String stickerPatioVentolera1;
    String stickerPatioVentolera2;
    String nroSerie;
    String candadoExportador;
    String observacionSA;
    String estRegSA;

    private Long idSolSelloInstalado;
    String candadoNaviera;
    String selloVerificador;
    String cableNaviera;
    String cableExportadora;
    //String stickerNaviera;
    String stickerExportadora;
    String rastreo;
    String termografo01;
    String ubicacion01;
    String termografo02;
    String ubicacion02;
    String filtroProporcionado;
    String termoking;
    String estRegSI;

    private Long idSolTransportista;
    String compania;
    String chofer;
    String cedula;
    String celular;
    String placa;
    String colorCabezal;
    String marcaCabezal;
    String observacionTra;
    String estRegTra;

    private Long idSolProceso;
    int cajaProcesada;
    String tipoFruta;
    String tipoFunda;
    String densidadFunda;
    String tipoCaja;
    String tipoPresentacion;
    String tipoEstiba;
    String tiempoDescarga;
    String tipoCantulina;
    String estRegPro;

    private Long idSolControlPeso;
    String balanzaRepesa;
    String condicionBalanza;
    String tipoBalanza;
    double pesoNetoFruta;
    String observacionCtr;
    String estRegCtr;

    private Long idSolFinca;
    String nombre;
    String fuenteAgua;
    String aguaCorrida;
    String estadoPiso;
    String cableVia;
    String estadoTecho;
    String estadoTina;
    String fumigacion;
    String lavadoRacimo;
    String embudo;
    String divisionTina;
    String estRegFin;

    private Long idSolConsolidadoGancho;
    int enFunde;
    int racimoCosechado;
    int racimoRechazado;
    int racimoProcesado;
    int mutante;
    int specklin;
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

    List<SolCalidadDto> listSolCalidadDto;
    SolConsolidadoGanchoDto solConsolidadoGanchoDto;

    public SolicitudCompletaDto() {}

}
