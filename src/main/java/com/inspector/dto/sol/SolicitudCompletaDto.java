package com.inspector.dto.sol;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.inspector.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
public class SolicitudCompletaDto  {

    private Long idSolicitud;
    int semana;
    String exportador;
    String cliente;
    String tipoSolicitud;
    String productor;
    String codigoProductor;
    String codigoMagap;
    String puertoEmbarque;
    String zona;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    protected LocalDateTime fechaInicio;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    protected LocalDateTime fechaTermino;
    String contenedor;
    String nomEvaluador01;
    String ciEvaluador01;
    String nomEvaluador02;
    String ciEvaluador02;
    String observacion;

    private Long idSolContenedor;
    String numeroContenedor;
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
    String observacionC;

    private Long idSolSelloLlegada;
    String candadoPlastico;
    String candadoBotella;
    String stickerLlegada;
    String rastreoSatelital;
    String selloCadena;
    String stickerNavieraVentilador;
    String selloLlegadaInterno01;
    String selloLlegadaInterno02;
    String stickerPatioVentoleraExterna01;
    String stickerPatioVentoleraExterna02;
    String nroSerieFunda;
    String candadoExportador;
    String observacionSL;

    private Long idSolSelloInstalado;
    String candadoNaviera;
    String selloVerificador;
    String cableNaviera;
    String cableExportadora;
    String stickerNaviera;
    String stickerExportadora;
    String rastreo;
    String termografo01;
    String ubicacionTermografo01;
    String termografo02;
    String ubicacionTermografo02;
    String filtroProporcionado;
    String termoking;

    List<SolProductorDto> listSolProductorDto;

    public SolicitudCompletaDto() {}

}
