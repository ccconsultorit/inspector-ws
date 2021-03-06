/*
 * This file is generated by jOOQ.
 */
package com.inspector.ws.db.schema.tables.records;


import com.inspector.ws.db.schema.tables.TabSolCalPackingList;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class TabSolCalPackingListRecord extends UpdatableRecordImpl<TabSolCalPackingListRecord> implements Record9<Long, Integer, String, String, LocalDateTime, LocalDateTime, Integer, Integer, Long> {

    private static final long serialVersionUID = -1786252775;

    /**
     * Setter for <code>public.tab_sol_cal_packing_list.id_sol_cal_packing_list</code>.
     */
    public void setIdSolCalPackingList(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.tab_sol_cal_packing_list.id_sol_cal_packing_list</code>.
     */
    public Long getIdSolCalPackingList() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.tab_sol_cal_packing_list.numeracion</code>.
     */
    public void setNumeracion(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.tab_sol_cal_packing_list.numeracion</code>.
     */
    public Integer getNumeracion() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.tab_sol_cal_packing_list.sticker</code>.
     */
    public void setSticker(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.tab_sol_cal_packing_list.sticker</code>.
     */
    public String getSticker() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.tab_sol_cal_packing_list.estado</code>.
     */
    public void setEstado(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.tab_sol_cal_packing_list.estado</code>.
     */
    public String getEstado() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.tab_sol_cal_packing_list.fecha_ingreso</code>.
     */
    public void setFechaIngreso(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.tab_sol_cal_packing_list.fecha_ingreso</code>.
     */
    public LocalDateTime getFechaIngreso() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>public.tab_sol_cal_packing_list.fecha_modifica</code>.
     */
    public void setFechaModifica(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.tab_sol_cal_packing_list.fecha_modifica</code>.
     */
    public LocalDateTime getFechaModifica() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>public.tab_sol_cal_packing_list.usuario_ingreso</code>.
     */
    public void setUsuarioIngreso(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.tab_sol_cal_packing_list.usuario_ingreso</code>.
     */
    public Integer getUsuarioIngreso() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.tab_sol_cal_packing_list.usuario_modifica</code>.
     */
    public void setUsuarioModifica(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.tab_sol_cal_packing_list.usuario_modifica</code>.
     */
    public Integer getUsuarioModifica() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>public.tab_sol_cal_packing_list.id_sol_calidad</code>.
     */
    public void setIdSolCalidad(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.tab_sol_cal_packing_list.id_sol_calidad</code>.
     */
    public Long getIdSolCalidad() {
        return (Long) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, Integer, String, String, LocalDateTime, LocalDateTime, Integer, Integer, Long> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, Integer, String, String, LocalDateTime, LocalDateTime, Integer, Integer, Long> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return TabSolCalPackingList.TAB_SOL_CAL_PACKING_LIST.ID_SOL_CAL_PACKING_LIST;
    }

    @Override
    public Field<Integer> field2() {
        return TabSolCalPackingList.TAB_SOL_CAL_PACKING_LIST.NUMERACION;
    }

    @Override
    public Field<String> field3() {
        return TabSolCalPackingList.TAB_SOL_CAL_PACKING_LIST.STICKER;
    }

    @Override
    public Field<String> field4() {
        return TabSolCalPackingList.TAB_SOL_CAL_PACKING_LIST.ESTADO;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return TabSolCalPackingList.TAB_SOL_CAL_PACKING_LIST.FECHA_INGRESO;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return TabSolCalPackingList.TAB_SOL_CAL_PACKING_LIST.FECHA_MODIFICA;
    }

    @Override
    public Field<Integer> field7() {
        return TabSolCalPackingList.TAB_SOL_CAL_PACKING_LIST.USUARIO_INGRESO;
    }

    @Override
    public Field<Integer> field8() {
        return TabSolCalPackingList.TAB_SOL_CAL_PACKING_LIST.USUARIO_MODIFICA;
    }

    @Override
    public Field<Long> field9() {
        return TabSolCalPackingList.TAB_SOL_CAL_PACKING_LIST.ID_SOL_CALIDAD;
    }

    @Override
    public Long component1() {
        return getIdSolCalPackingList();
    }

    @Override
    public Integer component2() {
        return getNumeracion();
    }

    @Override
    public String component3() {
        return getSticker();
    }

    @Override
    public String component4() {
        return getEstado();
    }

    @Override
    public LocalDateTime component5() {
        return getFechaIngreso();
    }

    @Override
    public LocalDateTime component6() {
        return getFechaModifica();
    }

    @Override
    public Integer component7() {
        return getUsuarioIngreso();
    }

    @Override
    public Integer component8() {
        return getUsuarioModifica();
    }

    @Override
    public Long component9() {
        return getIdSolCalidad();
    }

    @Override
    public Long value1() {
        return getIdSolCalPackingList();
    }

    @Override
    public Integer value2() {
        return getNumeracion();
    }

    @Override
    public String value3() {
        return getSticker();
    }

    @Override
    public String value4() {
        return getEstado();
    }

    @Override
    public LocalDateTime value5() {
        return getFechaIngreso();
    }

    @Override
    public LocalDateTime value6() {
        return getFechaModifica();
    }

    @Override
    public Integer value7() {
        return getUsuarioIngreso();
    }

    @Override
    public Integer value8() {
        return getUsuarioModifica();
    }

    @Override
    public Long value9() {
        return getIdSolCalidad();
    }

    @Override
    public TabSolCalPackingListRecord value1(Long value) {
        setIdSolCalPackingList(value);
        return this;
    }

    @Override
    public TabSolCalPackingListRecord value2(Integer value) {
        setNumeracion(value);
        return this;
    }

    @Override
    public TabSolCalPackingListRecord value3(String value) {
        setSticker(value);
        return this;
    }

    @Override
    public TabSolCalPackingListRecord value4(String value) {
        setEstado(value);
        return this;
    }

    @Override
    public TabSolCalPackingListRecord value5(LocalDateTime value) {
        setFechaIngreso(value);
        return this;
    }

    @Override
    public TabSolCalPackingListRecord value6(LocalDateTime value) {
        setFechaModifica(value);
        return this;
    }

    @Override
    public TabSolCalPackingListRecord value7(Integer value) {
        setUsuarioIngreso(value);
        return this;
    }

    @Override
    public TabSolCalPackingListRecord value8(Integer value) {
        setUsuarioModifica(value);
        return this;
    }

    @Override
    public TabSolCalPackingListRecord value9(Long value) {
        setIdSolCalidad(value);
        return this;
    }

    @Override
    public TabSolCalPackingListRecord values(Long value1, Integer value2, String value3, String value4, LocalDateTime value5, LocalDateTime value6, Integer value7, Integer value8, Long value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TabSolCalPackingListRecord
     */
    public TabSolCalPackingListRecord() {
        super(TabSolCalPackingList.TAB_SOL_CAL_PACKING_LIST);
    }

    /**
     * Create a detached, initialised TabSolCalPackingListRecord
     */
    public TabSolCalPackingListRecord(Long idSolCalPackingList, Integer numeracion, String sticker, String estado, LocalDateTime fechaIngreso, LocalDateTime fechaModifica, Integer usuarioIngreso, Integer usuarioModifica, Long idSolCalidad) {
        super(TabSolCalPackingList.TAB_SOL_CAL_PACKING_LIST);

        set(0, idSolCalPackingList);
        set(1, numeracion);
        set(2, sticker);
        set(3, estado);
        set(4, fechaIngreso);
        set(5, fechaModifica);
        set(6, usuarioIngreso);
        set(7, usuarioModifica);
        set(8, idSolCalidad);
    }
}
