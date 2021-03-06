/*
 * This file is generated by jOOQ.
 */
package com.inspector.ws.db.schema.tables.records;


import com.inspector.ws.db.schema.tables.TabSolConCalibracionFruta;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
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
public class TabSolConCalibracionFrutaRecord extends UpdatableRecordImpl<TabSolConCalibracionFrutaRecord> implements Record10<Long, Integer, String, Integer, String, LocalDateTime, LocalDateTime, Integer, Integer, Long> {

    private static final long serialVersionUID = -1424665588;

    /**
     * Setter for <code>public.tab_sol_con_calibracion_fruta.id_sol_con_calibracion_fruta</code>.
     */
    public void setIdSolConCalibracionFruta(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.tab_sol_con_calibracion_fruta.id_sol_con_calibracion_fruta</code>.
     */
    public Long getIdSolConCalibracionFruta() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.tab_sol_con_calibracion_fruta.num_semana</code>.
     */
    public void setNumSemana(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.tab_sol_con_calibracion_fruta.num_semana</code>.
     */
    public Integer getNumSemana() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.tab_sol_con_calibracion_fruta.color</code>.
     */
    public void setColor(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.tab_sol_con_calibracion_fruta.color</code>.
     */
    public String getColor() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.tab_sol_con_calibracion_fruta.num_racimo</code>.
     */
    public void setNumRacimo(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.tab_sol_con_calibracion_fruta.num_racimo</code>.
     */
    public Integer getNumRacimo() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.tab_sol_con_calibracion_fruta.estado</code>.
     */
    public void setEstado(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.tab_sol_con_calibracion_fruta.estado</code>.
     */
    public String getEstado() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.tab_sol_con_calibracion_fruta.fecha_ingreso</code>.
     */
    public void setFechaIngreso(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.tab_sol_con_calibracion_fruta.fecha_ingreso</code>.
     */
    public LocalDateTime getFechaIngreso() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>public.tab_sol_con_calibracion_fruta.fecha_modifica</code>.
     */
    public void setFechaModifica(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.tab_sol_con_calibracion_fruta.fecha_modifica</code>.
     */
    public LocalDateTime getFechaModifica() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>public.tab_sol_con_calibracion_fruta.usuario_ingreso</code>.
     */
    public void setUsuarioIngreso(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.tab_sol_con_calibracion_fruta.usuario_ingreso</code>.
     */
    public Integer getUsuarioIngreso() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>public.tab_sol_con_calibracion_fruta.usuario_modifica</code>.
     */
    public void setUsuarioModifica(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.tab_sol_con_calibracion_fruta.usuario_modifica</code>.
     */
    public Integer getUsuarioModifica() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>public.tab_sol_con_calibracion_fruta.id_sol_consolidado_gancho</code>.
     */
    public void setIdSolConsolidadoGancho(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.tab_sol_con_calibracion_fruta.id_sol_consolidado_gancho</code>.
     */
    public Long getIdSolConsolidadoGancho() {
        return (Long) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, Integer, String, Integer, String, LocalDateTime, LocalDateTime, Integer, Integer, Long> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Long, Integer, String, Integer, String, LocalDateTime, LocalDateTime, Integer, Integer, Long> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return TabSolConCalibracionFruta.TAB_SOL_CON_CALIBRACION_FRUTA.ID_SOL_CON_CALIBRACION_FRUTA;
    }

    @Override
    public Field<Integer> field2() {
        return TabSolConCalibracionFruta.TAB_SOL_CON_CALIBRACION_FRUTA.NUM_SEMANA;
    }

    @Override
    public Field<String> field3() {
        return TabSolConCalibracionFruta.TAB_SOL_CON_CALIBRACION_FRUTA.COLOR;
    }

    @Override
    public Field<Integer> field4() {
        return TabSolConCalibracionFruta.TAB_SOL_CON_CALIBRACION_FRUTA.NUM_RACIMO;
    }

    @Override
    public Field<String> field5() {
        return TabSolConCalibracionFruta.TAB_SOL_CON_CALIBRACION_FRUTA.ESTADO;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return TabSolConCalibracionFruta.TAB_SOL_CON_CALIBRACION_FRUTA.FECHA_INGRESO;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return TabSolConCalibracionFruta.TAB_SOL_CON_CALIBRACION_FRUTA.FECHA_MODIFICA;
    }

    @Override
    public Field<Integer> field8() {
        return TabSolConCalibracionFruta.TAB_SOL_CON_CALIBRACION_FRUTA.USUARIO_INGRESO;
    }

    @Override
    public Field<Integer> field9() {
        return TabSolConCalibracionFruta.TAB_SOL_CON_CALIBRACION_FRUTA.USUARIO_MODIFICA;
    }

    @Override
    public Field<Long> field10() {
        return TabSolConCalibracionFruta.TAB_SOL_CON_CALIBRACION_FRUTA.ID_SOL_CONSOLIDADO_GANCHO;
    }

    @Override
    public Long component1() {
        return getIdSolConCalibracionFruta();
    }

    @Override
    public Integer component2() {
        return getNumSemana();
    }

    @Override
    public String component3() {
        return getColor();
    }

    @Override
    public Integer component4() {
        return getNumRacimo();
    }

    @Override
    public String component5() {
        return getEstado();
    }

    @Override
    public LocalDateTime component6() {
        return getFechaIngreso();
    }

    @Override
    public LocalDateTime component7() {
        return getFechaModifica();
    }

    @Override
    public Integer component8() {
        return getUsuarioIngreso();
    }

    @Override
    public Integer component9() {
        return getUsuarioModifica();
    }

    @Override
    public Long component10() {
        return getIdSolConsolidadoGancho();
    }

    @Override
    public Long value1() {
        return getIdSolConCalibracionFruta();
    }

    @Override
    public Integer value2() {
        return getNumSemana();
    }

    @Override
    public String value3() {
        return getColor();
    }

    @Override
    public Integer value4() {
        return getNumRacimo();
    }

    @Override
    public String value5() {
        return getEstado();
    }

    @Override
    public LocalDateTime value6() {
        return getFechaIngreso();
    }

    @Override
    public LocalDateTime value7() {
        return getFechaModifica();
    }

    @Override
    public Integer value8() {
        return getUsuarioIngreso();
    }

    @Override
    public Integer value9() {
        return getUsuarioModifica();
    }

    @Override
    public Long value10() {
        return getIdSolConsolidadoGancho();
    }

    @Override
    public TabSolConCalibracionFrutaRecord value1(Long value) {
        setIdSolConCalibracionFruta(value);
        return this;
    }

    @Override
    public TabSolConCalibracionFrutaRecord value2(Integer value) {
        setNumSemana(value);
        return this;
    }

    @Override
    public TabSolConCalibracionFrutaRecord value3(String value) {
        setColor(value);
        return this;
    }

    @Override
    public TabSolConCalibracionFrutaRecord value4(Integer value) {
        setNumRacimo(value);
        return this;
    }

    @Override
    public TabSolConCalibracionFrutaRecord value5(String value) {
        setEstado(value);
        return this;
    }

    @Override
    public TabSolConCalibracionFrutaRecord value6(LocalDateTime value) {
        setFechaIngreso(value);
        return this;
    }

    @Override
    public TabSolConCalibracionFrutaRecord value7(LocalDateTime value) {
        setFechaModifica(value);
        return this;
    }

    @Override
    public TabSolConCalibracionFrutaRecord value8(Integer value) {
        setUsuarioIngreso(value);
        return this;
    }

    @Override
    public TabSolConCalibracionFrutaRecord value9(Integer value) {
        setUsuarioModifica(value);
        return this;
    }

    @Override
    public TabSolConCalibracionFrutaRecord value10(Long value) {
        setIdSolConsolidadoGancho(value);
        return this;
    }

    @Override
    public TabSolConCalibracionFrutaRecord values(Long value1, Integer value2, String value3, Integer value4, String value5, LocalDateTime value6, LocalDateTime value7, Integer value8, Integer value9, Long value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TabSolConCalibracionFrutaRecord
     */
    public TabSolConCalibracionFrutaRecord() {
        super(TabSolConCalibracionFruta.TAB_SOL_CON_CALIBRACION_FRUTA);
    }

    /**
     * Create a detached, initialised TabSolConCalibracionFrutaRecord
     */
    public TabSolConCalibracionFrutaRecord(Long idSolConCalibracionFruta, Integer numSemana, String color, Integer numRacimo, String estado, LocalDateTime fechaIngreso, LocalDateTime fechaModifica, Integer usuarioIngreso, Integer usuarioModifica, Long idSolConsolidadoGancho) {
        super(TabSolConCalibracionFruta.TAB_SOL_CON_CALIBRACION_FRUTA);

        set(0, idSolConCalibracionFruta);
        set(1, numSemana);
        set(2, color);
        set(3, numRacimo);
        set(4, estado);
        set(5, fechaIngreso);
        set(6, fechaModifica);
        set(7, usuarioIngreso);
        set(8, usuarioModifica);
        set(9, idSolConsolidadoGancho);
    }
}
