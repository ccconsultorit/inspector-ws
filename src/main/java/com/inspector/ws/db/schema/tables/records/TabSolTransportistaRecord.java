/*
 * This file is generated by jOOQ.
 */
package com.inspector.ws.db.schema.tables.records;


import com.inspector.ws.db.schema.tables.TabSolTransportista;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
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
public class TabSolTransportistaRecord extends UpdatableRecordImpl<TabSolTransportistaRecord> implements Record16<Long, String, String, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime, Integer, Integer, Long, Long> {

    private static final long serialVersionUID = 1040396616;

    /**
     * Setter for <code>public.tab_sol_transportista.id_sol_transportista</code>.
     */
    public void setIdSolTransportista(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.tab_sol_transportista.id_sol_transportista</code>.
     */
    public Long getIdSolTransportista() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.tab_sol_transportista.compania</code>.
     */
    public void setCompania(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.tab_sol_transportista.compania</code>.
     */
    public String getCompania() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.tab_sol_transportista.chofer</code>.
     */
    public void setChofer(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.tab_sol_transportista.chofer</code>.
     */
    public String getChofer() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.tab_sol_transportista.cedula</code>.
     */
    public void setCedula(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.tab_sol_transportista.cedula</code>.
     */
    public String getCedula() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.tab_sol_transportista.celular</code>.
     */
    public void setCelular(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.tab_sol_transportista.celular</code>.
     */
    public String getCelular() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.tab_sol_transportista.placa</code>.
     */
    public void setPlaca(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.tab_sol_transportista.placa</code>.
     */
    public String getPlaca() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.tab_sol_transportista.color_cabezal</code>.
     */
    public void setColorCabezal(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.tab_sol_transportista.color_cabezal</code>.
     */
    public String getColorCabezal() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.tab_sol_transportista.marca_cabezal</code>.
     */
    public void setMarcaCabezal(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.tab_sol_transportista.marca_cabezal</code>.
     */
    public String getMarcaCabezal() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.tab_sol_transportista.observacion</code>.
     */
    public void setObservacion(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.tab_sol_transportista.observacion</code>.
     */
    public String getObservacion() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.tab_sol_transportista.estado</code>.
     */
    public void setEstado(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.tab_sol_transportista.estado</code>.
     */
    public String getEstado() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.tab_sol_transportista.fecha_ingreso</code>.
     */
    public void setFechaIngreso(LocalDateTime value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.tab_sol_transportista.fecha_ingreso</code>.
     */
    public LocalDateTime getFechaIngreso() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>public.tab_sol_transportista.fecha_modifica</code>.
     */
    public void setFechaModifica(LocalDateTime value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.tab_sol_transportista.fecha_modifica</code>.
     */
    public LocalDateTime getFechaModifica() {
        return (LocalDateTime) get(11);
    }

    /**
     * Setter for <code>public.tab_sol_transportista.usuario_ingreso</code>.
     */
    public void setUsuarioIngreso(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.tab_sol_transportista.usuario_ingreso</code>.
     */
    public Integer getUsuarioIngreso() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>public.tab_sol_transportista.usuario_modifica</code>.
     */
    public void setUsuarioModifica(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.tab_sol_transportista.usuario_modifica</code>.
     */
    public Integer getUsuarioModifica() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>public.tab_sol_transportista.id_solicitud</code>.
     */
    public void setIdSolicitud(Long value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.tab_sol_transportista.id_solicitud</code>.
     */
    public Long getIdSolicitud() {
        return (Long) get(14);
    }

    /**
     * Setter for <code>public.tab_sol_transportista.id_sol_productor</code>.
     */
    public void setIdSolProductor(Long value) {
        set(15, value);
    }

    /**
     * Getter for <code>public.tab_sol_transportista.id_sol_productor</code>.
     */
    public Long getIdSolProductor() {
        return (Long) get(15);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row16<Long, String, String, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime, Integer, Integer, Long, Long> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    @Override
    public Row16<Long, String, String, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime, Integer, Integer, Long, Long> valuesRow() {
        return (Row16) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return TabSolTransportista.TAB_SOL_TRANSPORTISTA.ID_SOL_TRANSPORTISTA;
    }

    @Override
    public Field<String> field2() {
        return TabSolTransportista.TAB_SOL_TRANSPORTISTA.COMPANIA;
    }

    @Override
    public Field<String> field3() {
        return TabSolTransportista.TAB_SOL_TRANSPORTISTA.CHOFER;
    }

    @Override
    public Field<String> field4() {
        return TabSolTransportista.TAB_SOL_TRANSPORTISTA.CEDULA;
    }

    @Override
    public Field<String> field5() {
        return TabSolTransportista.TAB_SOL_TRANSPORTISTA.CELULAR;
    }

    @Override
    public Field<String> field6() {
        return TabSolTransportista.TAB_SOL_TRANSPORTISTA.PLACA;
    }

    @Override
    public Field<String> field7() {
        return TabSolTransportista.TAB_SOL_TRANSPORTISTA.COLOR_CABEZAL;
    }

    @Override
    public Field<String> field8() {
        return TabSolTransportista.TAB_SOL_TRANSPORTISTA.MARCA_CABEZAL;
    }

    @Override
    public Field<String> field9() {
        return TabSolTransportista.TAB_SOL_TRANSPORTISTA.OBSERVACION;
    }

    @Override
    public Field<String> field10() {
        return TabSolTransportista.TAB_SOL_TRANSPORTISTA.ESTADO;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return TabSolTransportista.TAB_SOL_TRANSPORTISTA.FECHA_INGRESO;
    }

    @Override
    public Field<LocalDateTime> field12() {
        return TabSolTransportista.TAB_SOL_TRANSPORTISTA.FECHA_MODIFICA;
    }

    @Override
    public Field<Integer> field13() {
        return TabSolTransportista.TAB_SOL_TRANSPORTISTA.USUARIO_INGRESO;
    }

    @Override
    public Field<Integer> field14() {
        return TabSolTransportista.TAB_SOL_TRANSPORTISTA.USUARIO_MODIFICA;
    }

    @Override
    public Field<Long> field15() {
        return TabSolTransportista.TAB_SOL_TRANSPORTISTA.ID_SOLICITUD;
    }

    @Override
    public Field<Long> field16() {
        return TabSolTransportista.TAB_SOL_TRANSPORTISTA.ID_SOL_PRODUCTOR;
    }

    @Override
    public Long component1() {
        return getIdSolTransportista();
    }

    @Override
    public String component2() {
        return getCompania();
    }

    @Override
    public String component3() {
        return getChofer();
    }

    @Override
    public String component4() {
        return getCedula();
    }

    @Override
    public String component5() {
        return getCelular();
    }

    @Override
    public String component6() {
        return getPlaca();
    }

    @Override
    public String component7() {
        return getColorCabezal();
    }

    @Override
    public String component8() {
        return getMarcaCabezal();
    }

    @Override
    public String component9() {
        return getObservacion();
    }

    @Override
    public String component10() {
        return getEstado();
    }

    @Override
    public LocalDateTime component11() {
        return getFechaIngreso();
    }

    @Override
    public LocalDateTime component12() {
        return getFechaModifica();
    }

    @Override
    public Integer component13() {
        return getUsuarioIngreso();
    }

    @Override
    public Integer component14() {
        return getUsuarioModifica();
    }

    @Override
    public Long component15() {
        return getIdSolicitud();
    }

    @Override
    public Long component16() {
        return getIdSolProductor();
    }

    @Override
    public Long value1() {
        return getIdSolTransportista();
    }

    @Override
    public String value2() {
        return getCompania();
    }

    @Override
    public String value3() {
        return getChofer();
    }

    @Override
    public String value4() {
        return getCedula();
    }

    @Override
    public String value5() {
        return getCelular();
    }

    @Override
    public String value6() {
        return getPlaca();
    }

    @Override
    public String value7() {
        return getColorCabezal();
    }

    @Override
    public String value8() {
        return getMarcaCabezal();
    }

    @Override
    public String value9() {
        return getObservacion();
    }

    @Override
    public String value10() {
        return getEstado();
    }

    @Override
    public LocalDateTime value11() {
        return getFechaIngreso();
    }

    @Override
    public LocalDateTime value12() {
        return getFechaModifica();
    }

    @Override
    public Integer value13() {
        return getUsuarioIngreso();
    }

    @Override
    public Integer value14() {
        return getUsuarioModifica();
    }

    @Override
    public Long value15() {
        return getIdSolicitud();
    }

    @Override
    public Long value16() {
        return getIdSolProductor();
    }

    @Override
    public TabSolTransportistaRecord value1(Long value) {
        setIdSolTransportista(value);
        return this;
    }

    @Override
    public TabSolTransportistaRecord value2(String value) {
        setCompania(value);
        return this;
    }

    @Override
    public TabSolTransportistaRecord value3(String value) {
        setChofer(value);
        return this;
    }

    @Override
    public TabSolTransportistaRecord value4(String value) {
        setCedula(value);
        return this;
    }

    @Override
    public TabSolTransportistaRecord value5(String value) {
        setCelular(value);
        return this;
    }

    @Override
    public TabSolTransportistaRecord value6(String value) {
        setPlaca(value);
        return this;
    }

    @Override
    public TabSolTransportistaRecord value7(String value) {
        setColorCabezal(value);
        return this;
    }

    @Override
    public TabSolTransportistaRecord value8(String value) {
        setMarcaCabezal(value);
        return this;
    }

    @Override
    public TabSolTransportistaRecord value9(String value) {
        setObservacion(value);
        return this;
    }

    @Override
    public TabSolTransportistaRecord value10(String value) {
        setEstado(value);
        return this;
    }

    @Override
    public TabSolTransportistaRecord value11(LocalDateTime value) {
        setFechaIngreso(value);
        return this;
    }

    @Override
    public TabSolTransportistaRecord value12(LocalDateTime value) {
        setFechaModifica(value);
        return this;
    }

    @Override
    public TabSolTransportistaRecord value13(Integer value) {
        setUsuarioIngreso(value);
        return this;
    }

    @Override
    public TabSolTransportistaRecord value14(Integer value) {
        setUsuarioModifica(value);
        return this;
    }

    @Override
    public TabSolTransportistaRecord value15(Long value) {
        setIdSolicitud(value);
        return this;
    }

    @Override
    public TabSolTransportistaRecord value16(Long value) {
        setIdSolProductor(value);
        return this;
    }

    @Override
    public TabSolTransportistaRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, LocalDateTime value11, LocalDateTime value12, Integer value13, Integer value14, Long value15, Long value16) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TabSolTransportistaRecord
     */
    public TabSolTransportistaRecord() {
        super(TabSolTransportista.TAB_SOL_TRANSPORTISTA);
    }

    /**
     * Create a detached, initialised TabSolTransportistaRecord
     */
    public TabSolTransportistaRecord(Long idSolTransportista, String compania, String chofer, String cedula, String celular, String placa, String colorCabezal, String marcaCabezal, String observacion, String estado, LocalDateTime fechaIngreso, LocalDateTime fechaModifica, Integer usuarioIngreso, Integer usuarioModifica, Long idSolicitud, Long idSolProductor) {
        super(TabSolTransportista.TAB_SOL_TRANSPORTISTA);

        set(0, idSolTransportista);
        set(1, compania);
        set(2, chofer);
        set(3, cedula);
        set(4, celular);
        set(5, placa);
        set(6, colorCabezal);
        set(7, marcaCabezal);
        set(8, observacion);
        set(9, estado);
        set(10, fechaIngreso);
        set(11, fechaModifica);
        set(12, usuarioIngreso);
        set(13, usuarioModifica);
        set(14, idSolicitud);
        set(15, idSolProductor);
    }
}
