/*
 * This file is generated by jOOQ.
 */
package com.inspector.ws.db.schema.tables.records;


import com.inspector.ws.db.schema.tables.TabSolSelloLlegada;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record20;
import org.jooq.Row20;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TabSolSelloLlegadaRecord extends UpdatableRecordImpl<TabSolSelloLlegadaRecord> implements Record20<Long, String, String, String, String, String, String, String, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime, Integer, Integer, Long> {

    private static final long serialVersionUID = -529633392;

    /**
     * Setter for <code>public.tab_sol_sello_llegada.id_sol_sello_llegada</code>.
     */
    public void setIdSolSelloLlegada(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.tab_sol_sello_llegada.id_sol_sello_llegada</code>.
     */
    public Long getIdSolSelloLlegada() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.tab_sol_sello_llegada.candado_plastico</code>.
     */
    public void setCandadoPlastico(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.tab_sol_sello_llegada.candado_plastico</code>.
     */
    public String getCandadoPlastico() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.tab_sol_sello_llegada.candado_botella</code>.
     */
    public void setCandadoBotella(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.tab_sol_sello_llegada.candado_botella</code>.
     */
    public String getCandadoBotella() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.tab_sol_sello_llegada.sticker_llegada</code>.
     */
    public void setStickerLlegada(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.tab_sol_sello_llegada.sticker_llegada</code>.
     */
    public String getStickerLlegada() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.tab_sol_sello_llegada.rastreo_satelital</code>.
     */
    public void setRastreoSatelital(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.tab_sol_sello_llegada.rastreo_satelital</code>.
     */
    public String getRastreoSatelital() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.tab_sol_sello_llegada.sello_cadena</code>.
     */
    public void setSelloCadena(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.tab_sol_sello_llegada.sello_cadena</code>.
     */
    public String getSelloCadena() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.tab_sol_sello_llegada.sticker_naviera</code>.
     */
    public void setStickerNaviera(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.tab_sol_sello_llegada.sticker_naviera</code>.
     */
    public String getStickerNaviera() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.tab_sol_sello_llegada.sellos_llegada_1</code>.
     */
    public void setSellosLlegada_1(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.tab_sol_sello_llegada.sellos_llegada_1</code>.
     */
    public String getSellosLlegada_1() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.tab_sol_sello_llegada.sellos_llegada_2</code>.
     */
    public void setSellosLlegada_2(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.tab_sol_sello_llegada.sellos_llegada_2</code>.
     */
    public String getSellosLlegada_2() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.tab_sol_sello_llegada.sticker_patio_ventolera_1</code>.
     */
    public void setStickerPatioVentolera_1(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.tab_sol_sello_llegada.sticker_patio_ventolera_1</code>.
     */
    public String getStickerPatioVentolera_1() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.tab_sol_sello_llegada.sticker_patio_ventolera_2</code>.
     */
    public void setStickerPatioVentolera_2(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.tab_sol_sello_llegada.sticker_patio_ventolera_2</code>.
     */
    public String getStickerPatioVentolera_2() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.tab_sol_sello_llegada.nro_serie</code>.
     */
    public void setNroSerie(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.tab_sol_sello_llegada.nro_serie</code>.
     */
    public String getNroSerie() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.tab_sol_sello_llegada.candado_exportador</code>.
     */
    public void setCandadoExportador(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.tab_sol_sello_llegada.candado_exportador</code>.
     */
    public String getCandadoExportador() {
        return (String) get(12);
    }

    /**
     * Setter for <code>public.tab_sol_sello_llegada.observacion</code>.
     */
    public void setObservacion(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.tab_sol_sello_llegada.observacion</code>.
     */
    public String getObservacion() {
        return (String) get(13);
    }

    /**
     * Setter for <code>public.tab_sol_sello_llegada.estado</code>.
     */
    public void setEstado(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.tab_sol_sello_llegada.estado</code>.
     */
    public String getEstado() {
        return (String) get(14);
    }

    /**
     * Setter for <code>public.tab_sol_sello_llegada.fecha_ingreso</code>.
     */
    public void setFechaIngreso(LocalDateTime value) {
        set(15, value);
    }

    /**
     * Getter for <code>public.tab_sol_sello_llegada.fecha_ingreso</code>.
     */
    public LocalDateTime getFechaIngreso() {
        return (LocalDateTime) get(15);
    }

    /**
     * Setter for <code>public.tab_sol_sello_llegada.fecha_modifica</code>.
     */
    public void setFechaModifica(LocalDateTime value) {
        set(16, value);
    }

    /**
     * Getter for <code>public.tab_sol_sello_llegada.fecha_modifica</code>.
     */
    public LocalDateTime getFechaModifica() {
        return (LocalDateTime) get(16);
    }

    /**
     * Setter for <code>public.tab_sol_sello_llegada.usuario_ingreso</code>.
     */
    public void setUsuarioIngreso(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>public.tab_sol_sello_llegada.usuario_ingreso</code>.
     */
    public Integer getUsuarioIngreso() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>public.tab_sol_sello_llegada.usuario_modifica</code>.
     */
    public void setUsuarioModifica(Integer value) {
        set(18, value);
    }

    /**
     * Getter for <code>public.tab_sol_sello_llegada.usuario_modifica</code>.
     */
    public Integer getUsuarioModifica() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>public.tab_sol_sello_llegada.id_solicitud</code>.
     */
    public void setIdSolicitud(Long value) {
        set(19, value);
    }

    /**
     * Getter for <code>public.tab_sol_sello_llegada.id_solicitud</code>.
     */
    public Long getIdSolicitud() {
        return (Long) get(19);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record20 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row20<Long, String, String, String, String, String, String, String, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime, Integer, Integer, Long> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    @Override
    public Row20<Long, String, String, String, String, String, String, String, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime, Integer, Integer, Long> valuesRow() {
        return (Row20) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return TabSolSelloLlegada.TAB_SOL_SELLO_LLEGADA.ID_SOL_SELLO_LLEGADA;
    }

    @Override
    public Field<String> field2() {
        return TabSolSelloLlegada.TAB_SOL_SELLO_LLEGADA.CANDADO_PLASTICO;
    }

    @Override
    public Field<String> field3() {
        return TabSolSelloLlegada.TAB_SOL_SELLO_LLEGADA.CANDADO_BOTELLA;
    }

    @Override
    public Field<String> field4() {
        return TabSolSelloLlegada.TAB_SOL_SELLO_LLEGADA.STICKER_LLEGADA;
    }

    @Override
    public Field<String> field5() {
        return TabSolSelloLlegada.TAB_SOL_SELLO_LLEGADA.RASTREO_SATELITAL;
    }

    @Override
    public Field<String> field6() {
        return TabSolSelloLlegada.TAB_SOL_SELLO_LLEGADA.SELLO_CADENA;
    }

    @Override
    public Field<String> field7() {
        return TabSolSelloLlegada.TAB_SOL_SELLO_LLEGADA.STICKER_NAVIERA;
    }

    @Override
    public Field<String> field8() {
        return TabSolSelloLlegada.TAB_SOL_SELLO_LLEGADA.SELLOS_LLEGADA_1;
    }

    @Override
    public Field<String> field9() {
        return TabSolSelloLlegada.TAB_SOL_SELLO_LLEGADA.SELLOS_LLEGADA_2;
    }

    @Override
    public Field<String> field10() {
        return TabSolSelloLlegada.TAB_SOL_SELLO_LLEGADA.STICKER_PATIO_VENTOLERA_1;
    }

    @Override
    public Field<String> field11() {
        return TabSolSelloLlegada.TAB_SOL_SELLO_LLEGADA.STICKER_PATIO_VENTOLERA_2;
    }

    @Override
    public Field<String> field12() {
        return TabSolSelloLlegada.TAB_SOL_SELLO_LLEGADA.NRO_SERIE;
    }

    @Override
    public Field<String> field13() {
        return TabSolSelloLlegada.TAB_SOL_SELLO_LLEGADA.CANDADO_EXPORTADOR;
    }

    @Override
    public Field<String> field14() {
        return TabSolSelloLlegada.TAB_SOL_SELLO_LLEGADA.OBSERVACION;
    }

    @Override
    public Field<String> field15() {
        return TabSolSelloLlegada.TAB_SOL_SELLO_LLEGADA.ESTADO;
    }

    @Override
    public Field<LocalDateTime> field16() {
        return TabSolSelloLlegada.TAB_SOL_SELLO_LLEGADA.FECHA_INGRESO;
    }

    @Override
    public Field<LocalDateTime> field17() {
        return TabSolSelloLlegada.TAB_SOL_SELLO_LLEGADA.FECHA_MODIFICA;
    }

    @Override
    public Field<Integer> field18() {
        return TabSolSelloLlegada.TAB_SOL_SELLO_LLEGADA.USUARIO_INGRESO;
    }

    @Override
    public Field<Integer> field19() {
        return TabSolSelloLlegada.TAB_SOL_SELLO_LLEGADA.USUARIO_MODIFICA;
    }

    @Override
    public Field<Long> field20() {
        return TabSolSelloLlegada.TAB_SOL_SELLO_LLEGADA.ID_SOLICITUD;
    }

    @Override
    public Long component1() {
        return getIdSolSelloLlegada();
    }

    @Override
    public String component2() {
        return getCandadoPlastico();
    }

    @Override
    public String component3() {
        return getCandadoBotella();
    }

    @Override
    public String component4() {
        return getStickerLlegada();
    }

    @Override
    public String component5() {
        return getRastreoSatelital();
    }

    @Override
    public String component6() {
        return getSelloCadena();
    }

    @Override
    public String component7() {
        return getStickerNaviera();
    }

    @Override
    public String component8() {
        return getSellosLlegada_1();
    }

    @Override
    public String component9() {
        return getSellosLlegada_2();
    }

    @Override
    public String component10() {
        return getStickerPatioVentolera_1();
    }

    @Override
    public String component11() {
        return getStickerPatioVentolera_2();
    }

    @Override
    public String component12() {
        return getNroSerie();
    }

    @Override
    public String component13() {
        return getCandadoExportador();
    }

    @Override
    public String component14() {
        return getObservacion();
    }

    @Override
    public String component15() {
        return getEstado();
    }

    @Override
    public LocalDateTime component16() {
        return getFechaIngreso();
    }

    @Override
    public LocalDateTime component17() {
        return getFechaModifica();
    }

    @Override
    public Integer component18() {
        return getUsuarioIngreso();
    }

    @Override
    public Integer component19() {
        return getUsuarioModifica();
    }

    @Override
    public Long component20() {
        return getIdSolicitud();
    }

    @Override
    public Long value1() {
        return getIdSolSelloLlegada();
    }

    @Override
    public String value2() {
        return getCandadoPlastico();
    }

    @Override
    public String value3() {
        return getCandadoBotella();
    }

    @Override
    public String value4() {
        return getStickerLlegada();
    }

    @Override
    public String value5() {
        return getRastreoSatelital();
    }

    @Override
    public String value6() {
        return getSelloCadena();
    }

    @Override
    public String value7() {
        return getStickerNaviera();
    }

    @Override
    public String value8() {
        return getSellosLlegada_1();
    }

    @Override
    public String value9() {
        return getSellosLlegada_2();
    }

    @Override
    public String value10() {
        return getStickerPatioVentolera_1();
    }

    @Override
    public String value11() {
        return getStickerPatioVentolera_2();
    }

    @Override
    public String value12() {
        return getNroSerie();
    }

    @Override
    public String value13() {
        return getCandadoExportador();
    }

    @Override
    public String value14() {
        return getObservacion();
    }

    @Override
    public String value15() {
        return getEstado();
    }

    @Override
    public LocalDateTime value16() {
        return getFechaIngreso();
    }

    @Override
    public LocalDateTime value17() {
        return getFechaModifica();
    }

    @Override
    public Integer value18() {
        return getUsuarioIngreso();
    }

    @Override
    public Integer value19() {
        return getUsuarioModifica();
    }

    @Override
    public Long value20() {
        return getIdSolicitud();
    }

    @Override
    public TabSolSelloLlegadaRecord value1(Long value) {
        setIdSolSelloLlegada(value);
        return this;
    }

    @Override
    public TabSolSelloLlegadaRecord value2(String value) {
        setCandadoPlastico(value);
        return this;
    }

    @Override
    public TabSolSelloLlegadaRecord value3(String value) {
        setCandadoBotella(value);
        return this;
    }

    @Override
    public TabSolSelloLlegadaRecord value4(String value) {
        setStickerLlegada(value);
        return this;
    }

    @Override
    public TabSolSelloLlegadaRecord value5(String value) {
        setRastreoSatelital(value);
        return this;
    }

    @Override
    public TabSolSelloLlegadaRecord value6(String value) {
        setSelloCadena(value);
        return this;
    }

    @Override
    public TabSolSelloLlegadaRecord value7(String value) {
        setStickerNaviera(value);
        return this;
    }

    @Override
    public TabSolSelloLlegadaRecord value8(String value) {
        setSellosLlegada_1(value);
        return this;
    }

    @Override
    public TabSolSelloLlegadaRecord value9(String value) {
        setSellosLlegada_2(value);
        return this;
    }

    @Override
    public TabSolSelloLlegadaRecord value10(String value) {
        setStickerPatioVentolera_1(value);
        return this;
    }

    @Override
    public TabSolSelloLlegadaRecord value11(String value) {
        setStickerPatioVentolera_2(value);
        return this;
    }

    @Override
    public TabSolSelloLlegadaRecord value12(String value) {
        setNroSerie(value);
        return this;
    }

    @Override
    public TabSolSelloLlegadaRecord value13(String value) {
        setCandadoExportador(value);
        return this;
    }

    @Override
    public TabSolSelloLlegadaRecord value14(String value) {
        setObservacion(value);
        return this;
    }

    @Override
    public TabSolSelloLlegadaRecord value15(String value) {
        setEstado(value);
        return this;
    }

    @Override
    public TabSolSelloLlegadaRecord value16(LocalDateTime value) {
        setFechaIngreso(value);
        return this;
    }

    @Override
    public TabSolSelloLlegadaRecord value17(LocalDateTime value) {
        setFechaModifica(value);
        return this;
    }

    @Override
    public TabSolSelloLlegadaRecord value18(Integer value) {
        setUsuarioIngreso(value);
        return this;
    }

    @Override
    public TabSolSelloLlegadaRecord value19(Integer value) {
        setUsuarioModifica(value);
        return this;
    }

    @Override
    public TabSolSelloLlegadaRecord value20(Long value) {
        setIdSolicitud(value);
        return this;
    }

    @Override
    public TabSolSelloLlegadaRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, String value14, String value15, LocalDateTime value16, LocalDateTime value17, Integer value18, Integer value19, Long value20) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TabSolSelloLlegadaRecord
     */
    public TabSolSelloLlegadaRecord() {
        super(TabSolSelloLlegada.TAB_SOL_SELLO_LLEGADA);
    }

    /**
     * Create a detached, initialised TabSolSelloLlegadaRecord
     */
    public TabSolSelloLlegadaRecord(Long idSolSelloLlegada, String candadoPlastico, String candadoBotella, String stickerLlegada, String rastreoSatelital, String selloCadena, String stickerNaviera, String sellosLlegada_1, String sellosLlegada_2, String stickerPatioVentolera_1, String stickerPatioVentolera_2, String nroSerie, String candadoExportador, String observacion, String estado, LocalDateTime fechaIngreso, LocalDateTime fechaModifica, Integer usuarioIngreso, Integer usuarioModifica, Long idSolicitud) {
        super(TabSolSelloLlegada.TAB_SOL_SELLO_LLEGADA);

        set(0, idSolSelloLlegada);
        set(1, candadoPlastico);
        set(2, candadoBotella);
        set(3, stickerLlegada);
        set(4, rastreoSatelital);
        set(5, selloCadena);
        set(6, stickerNaviera);
        set(7, sellosLlegada_1);
        set(8, sellosLlegada_2);
        set(9, stickerPatioVentolera_1);
        set(10, stickerPatioVentolera_2);
        set(11, nroSerie);
        set(12, candadoExportador);
        set(13, observacion);
        set(14, estado);
        set(15, fechaIngreso);
        set(16, fechaModifica);
        set(17, usuarioIngreso);
        set(18, usuarioModifica);
        set(19, idSolicitud);
    }
}
