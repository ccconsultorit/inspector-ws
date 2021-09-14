/*
 * This file is generated by jOOQ.
 */
package com.inspector.ws.db.schema.tables.records;


import com.inspector.ws.db.schema.tables.TabSolImagen;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record21;
import org.jooq.Row21;
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
public class TabSolImagenRecord extends UpdatableRecordImpl<TabSolImagenRecord> implements Record21<Long, String, String, String, byte[], String, Long, Long, Long, Long, Long, Long, Long, Long, Long, Long, LocalDateTime, LocalDateTime, Integer, Integer, Long> {

    private static final long serialVersionUID = -1816708882;

    /**
     * Setter for <code>public.tab_sol_imagen.id_sol_imagen</code>.
     */
    public void setIdSolImagen(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.tab_sol_imagen.id_sol_imagen</code>.
     */
    public Long getIdSolImagen() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.tab_sol_imagen.nombre</code>.
     */
    public void setNombre(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.tab_sol_imagen.nombre</code>.
     */
    public String getNombre() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.tab_sol_imagen.descripcion</code>.
     */
    public void setDescripcion(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.tab_sol_imagen.descripcion</code>.
     */
    public String getDescripcion() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.tab_sol_imagen.seccion</code>.
     */
    public void setSeccion(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.tab_sol_imagen.seccion</code>.
     */
    public String getSeccion() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.tab_sol_imagen.imagen</code>.
     */
    public void setImagen(byte... value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.tab_sol_imagen.imagen</code>.
     */
    public byte[] getImagen() {
        return (byte[]) get(4);
    }

    /**
     * Setter for <code>public.tab_sol_imagen.estado</code>.
     */
    public void setEstado(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.tab_sol_imagen.estado</code>.
     */
    public String getEstado() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.tab_sol_imagen.id_sol_cal_packing_list</code>.
     */
    public void setIdSolCalPackingList(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.tab_sol_imagen.id_sol_cal_packing_list</code>.
     */
    public Long getIdSolCalPackingList() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>public.tab_sol_imagen.id_sol_calidad</code>.
     */
    public void setIdSolCalidad(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.tab_sol_imagen.id_sol_calidad</code>.
     */
    public Long getIdSolCalidad() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>public.tab_sol_imagen.id_sol_consolidado_gancho</code>.
     */
    public void setIdSolConsolidadoGancho(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.tab_sol_imagen.id_sol_consolidado_gancho</code>.
     */
    public Long getIdSolConsolidadoGancho() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>public.tab_sol_imagen.id_sol_contenedor</code>.
     */
    public void setIdSolContenedor(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.tab_sol_imagen.id_sol_contenedor</code>.
     */
    public Long getIdSolContenedor() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>public.tab_sol_imagen.id_sol_control_peso</code>.
     */
    public void setIdSolControlPeso(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.tab_sol_imagen.id_sol_control_peso</code>.
     */
    public Long getIdSolControlPeso() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>public.tab_sol_imagen.id_sol_finca</code>.
     */
    public void setIdSolFinca(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.tab_sol_imagen.id_sol_finca</code>.
     */
    public Long getIdSolFinca() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>public.tab_sol_imagen.id_sol_proceso</code>.
     */
    public void setIdSolProceso(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.tab_sol_imagen.id_sol_proceso</code>.
     */
    public Long getIdSolProceso() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>public.tab_sol_imagen.id_sol_sello_instalado</code>.
     */
    public void setIdSolSelloInstalado(Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.tab_sol_imagen.id_sol_sello_instalado</code>.
     */
    public Long getIdSolSelloInstalado() {
        return (Long) get(13);
    }

    /**
     * Setter for <code>public.tab_sol_imagen.id_sol_sello_llegada</code>.
     */
    public void setIdSolSelloLlegada(Long value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.tab_sol_imagen.id_sol_sello_llegada</code>.
     */
    public Long getIdSolSelloLlegada() {
        return (Long) get(14);
    }

    /**
     * Setter for <code>public.tab_sol_imagen.id_sol_transportista</code>.
     */
    public void setIdSolTransportista(Long value) {
        set(15, value);
    }

    /**
     * Getter for <code>public.tab_sol_imagen.id_sol_transportista</code>.
     */
    public Long getIdSolTransportista() {
        return (Long) get(15);
    }

    /**
     * Setter for <code>public.tab_sol_imagen.fecha_ingreso</code>.
     */
    public void setFechaIngreso(LocalDateTime value) {
        set(16, value);
    }

    /**
     * Getter for <code>public.tab_sol_imagen.fecha_ingreso</code>.
     */
    public LocalDateTime getFechaIngreso() {
        return (LocalDateTime) get(16);
    }

    /**
     * Setter for <code>public.tab_sol_imagen.fecha_modifica</code>.
     */
    public void setFechaModifica(LocalDateTime value) {
        set(17, value);
    }

    /**
     * Getter for <code>public.tab_sol_imagen.fecha_modifica</code>.
     */
    public LocalDateTime getFechaModifica() {
        return (LocalDateTime) get(17);
    }

    /**
     * Setter for <code>public.tab_sol_imagen.usuario_ingreso</code>.
     */
    public void setUsuarioIngreso(Integer value) {
        set(18, value);
    }

    /**
     * Getter for <code>public.tab_sol_imagen.usuario_ingreso</code>.
     */
    public Integer getUsuarioIngreso() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>public.tab_sol_imagen.usuario_modifica</code>.
     */
    public void setUsuarioModifica(Integer value) {
        set(19, value);
    }

    /**
     * Getter for <code>public.tab_sol_imagen.usuario_modifica</code>.
     */
    public Integer getUsuarioModifica() {
        return (Integer) get(19);
    }

    /**
     * Setter for <code>public.tab_sol_imagen.id_solicitud</code>.
     */
    public void setIdSolicitud(Long value) {
        set(20, value);
    }

    /**
     * Getter for <code>public.tab_sol_imagen.id_solicitud</code>.
     */
    public Long getIdSolicitud() {
        return (Long) get(20);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record21 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row21<Long, String, String, String, byte[], String, Long, Long, Long, Long, Long, Long, Long, Long, Long, Long, LocalDateTime, LocalDateTime, Integer, Integer, Long> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    @Override
    public Row21<Long, String, String, String, byte[], String, Long, Long, Long, Long, Long, Long, Long, Long, Long, Long, LocalDateTime, LocalDateTime, Integer, Integer, Long> valuesRow() {
        return (Row21) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return TabSolImagen.TAB_SOL_IMAGEN.ID_SOL_IMAGEN;
    }

    @Override
    public Field<String> field2() {
        return TabSolImagen.TAB_SOL_IMAGEN.NOMBRE;
    }

    @Override
    public Field<String> field3() {
        return TabSolImagen.TAB_SOL_IMAGEN.DESCRIPCION;
    }

    @Override
    public Field<String> field4() {
        return TabSolImagen.TAB_SOL_IMAGEN.SECCION;
    }

    @Override
    public Field<byte[]> field5() {
        return TabSolImagen.TAB_SOL_IMAGEN.IMAGEN;
    }

    @Override
    public Field<String> field6() {
        return TabSolImagen.TAB_SOL_IMAGEN.ESTADO;
    }

    @Override
    public Field<Long> field7() {
        return TabSolImagen.TAB_SOL_IMAGEN.ID_SOL_CAL_PACKING_LIST;
    }

    @Override
    public Field<Long> field8() {
        return TabSolImagen.TAB_SOL_IMAGEN.ID_SOL_CALIDAD;
    }

    @Override
    public Field<Long> field9() {
        return TabSolImagen.TAB_SOL_IMAGEN.ID_SOL_CONSOLIDADO_GANCHO;
    }

    @Override
    public Field<Long> field10() {
        return TabSolImagen.TAB_SOL_IMAGEN.ID_SOL_CONTENEDOR;
    }

    @Override
    public Field<Long> field11() {
        return TabSolImagen.TAB_SOL_IMAGEN.ID_SOL_CONTROL_PESO;
    }

    @Override
    public Field<Long> field12() {
        return TabSolImagen.TAB_SOL_IMAGEN.ID_SOL_FINCA;
    }

    @Override
    public Field<Long> field13() {
        return TabSolImagen.TAB_SOL_IMAGEN.ID_SOL_PROCESO;
    }

    @Override
    public Field<Long> field14() {
        return TabSolImagen.TAB_SOL_IMAGEN.ID_SOL_SELLO_INSTALADO;
    }

    @Override
    public Field<Long> field15() {
        return TabSolImagen.TAB_SOL_IMAGEN.ID_SOL_SELLO_LLEGADA;
    }

    @Override
    public Field<Long> field16() {
        return TabSolImagen.TAB_SOL_IMAGEN.ID_SOL_TRANSPORTISTA;
    }

    @Override
    public Field<LocalDateTime> field17() {
        return TabSolImagen.TAB_SOL_IMAGEN.FECHA_INGRESO;
    }

    @Override
    public Field<LocalDateTime> field18() {
        return TabSolImagen.TAB_SOL_IMAGEN.FECHA_MODIFICA;
    }

    @Override
    public Field<Integer> field19() {
        return TabSolImagen.TAB_SOL_IMAGEN.USUARIO_INGRESO;
    }

    @Override
    public Field<Integer> field20() {
        return TabSolImagen.TAB_SOL_IMAGEN.USUARIO_MODIFICA;
    }

    @Override
    public Field<Long> field21() {
        return TabSolImagen.TAB_SOL_IMAGEN.ID_SOLICITUD;
    }

    @Override
    public Long component1() {
        return getIdSolImagen();
    }

    @Override
    public String component2() {
        return getNombre();
    }

    @Override
    public String component3() {
        return getDescripcion();
    }

    @Override
    public String component4() {
        return getSeccion();
    }

    @Override
    public byte[] component5() {
        return getImagen();
    }

    @Override
    public String component6() {
        return getEstado();
    }

    @Override
    public Long component7() {
        return getIdSolCalPackingList();
    }

    @Override
    public Long component8() {
        return getIdSolCalidad();
    }

    @Override
    public Long component9() {
        return getIdSolConsolidadoGancho();
    }

    @Override
    public Long component10() {
        return getIdSolContenedor();
    }

    @Override
    public Long component11() {
        return getIdSolControlPeso();
    }

    @Override
    public Long component12() {
        return getIdSolFinca();
    }

    @Override
    public Long component13() {
        return getIdSolProceso();
    }

    @Override
    public Long component14() {
        return getIdSolSelloInstalado();
    }

    @Override
    public Long component15() {
        return getIdSolSelloLlegada();
    }

    @Override
    public Long component16() {
        return getIdSolTransportista();
    }

    @Override
    public LocalDateTime component17() {
        return getFechaIngreso();
    }

    @Override
    public LocalDateTime component18() {
        return getFechaModifica();
    }

    @Override
    public Integer component19() {
        return getUsuarioIngreso();
    }

    @Override
    public Integer component20() {
        return getUsuarioModifica();
    }

    @Override
    public Long component21() {
        return getIdSolicitud();
    }

    @Override
    public Long value1() {
        return getIdSolImagen();
    }

    @Override
    public String value2() {
        return getNombre();
    }

    @Override
    public String value3() {
        return getDescripcion();
    }

    @Override
    public String value4() {
        return getSeccion();
    }

    @Override
    public byte[] value5() {
        return getImagen();
    }

    @Override
    public String value6() {
        return getEstado();
    }

    @Override
    public Long value7() {
        return getIdSolCalPackingList();
    }

    @Override
    public Long value8() {
        return getIdSolCalidad();
    }

    @Override
    public Long value9() {
        return getIdSolConsolidadoGancho();
    }

    @Override
    public Long value10() {
        return getIdSolContenedor();
    }

    @Override
    public Long value11() {
        return getIdSolControlPeso();
    }

    @Override
    public Long value12() {
        return getIdSolFinca();
    }

    @Override
    public Long value13() {
        return getIdSolProceso();
    }

    @Override
    public Long value14() {
        return getIdSolSelloInstalado();
    }

    @Override
    public Long value15() {
        return getIdSolSelloLlegada();
    }

    @Override
    public Long value16() {
        return getIdSolTransportista();
    }

    @Override
    public LocalDateTime value17() {
        return getFechaIngreso();
    }

    @Override
    public LocalDateTime value18() {
        return getFechaModifica();
    }

    @Override
    public Integer value19() {
        return getUsuarioIngreso();
    }

    @Override
    public Integer value20() {
        return getUsuarioModifica();
    }

    @Override
    public Long value21() {
        return getIdSolicitud();
    }

    @Override
    public TabSolImagenRecord value1(Long value) {
        setIdSolImagen(value);
        return this;
    }

    @Override
    public TabSolImagenRecord value2(String value) {
        setNombre(value);
        return this;
    }

    @Override
    public TabSolImagenRecord value3(String value) {
        setDescripcion(value);
        return this;
    }

    @Override
    public TabSolImagenRecord value4(String value) {
        setSeccion(value);
        return this;
    }

    @Override
    public TabSolImagenRecord value5(byte... value) {
        setImagen(value);
        return this;
    }

    @Override
    public TabSolImagenRecord value6(String value) {
        setEstado(value);
        return this;
    }

    @Override
    public TabSolImagenRecord value7(Long value) {
        setIdSolCalPackingList(value);
        return this;
    }

    @Override
    public TabSolImagenRecord value8(Long value) {
        setIdSolCalidad(value);
        return this;
    }

    @Override
    public TabSolImagenRecord value9(Long value) {
        setIdSolConsolidadoGancho(value);
        return this;
    }

    @Override
    public TabSolImagenRecord value10(Long value) {
        setIdSolContenedor(value);
        return this;
    }

    @Override
    public TabSolImagenRecord value11(Long value) {
        setIdSolControlPeso(value);
        return this;
    }

    @Override
    public TabSolImagenRecord value12(Long value) {
        setIdSolFinca(value);
        return this;
    }

    @Override
    public TabSolImagenRecord value13(Long value) {
        setIdSolProceso(value);
        return this;
    }

    @Override
    public TabSolImagenRecord value14(Long value) {
        setIdSolSelloInstalado(value);
        return this;
    }

    @Override
    public TabSolImagenRecord value15(Long value) {
        setIdSolSelloLlegada(value);
        return this;
    }

    @Override
    public TabSolImagenRecord value16(Long value) {
        setIdSolTransportista(value);
        return this;
    }

    @Override
    public TabSolImagenRecord value17(LocalDateTime value) {
        setFechaIngreso(value);
        return this;
    }

    @Override
    public TabSolImagenRecord value18(LocalDateTime value) {
        setFechaModifica(value);
        return this;
    }

    @Override
    public TabSolImagenRecord value19(Integer value) {
        setUsuarioIngreso(value);
        return this;
    }

    @Override
    public TabSolImagenRecord value20(Integer value) {
        setUsuarioModifica(value);
        return this;
    }

    @Override
    public TabSolImagenRecord value21(Long value) {
        setIdSolicitud(value);
        return this;
    }

    @Override
    public TabSolImagenRecord values(Long value1, String value2, String value3, String value4, byte[] value5, String value6, Long value7, Long value8, Long value9, Long value10, Long value11, Long value12, Long value13, Long value14, Long value15, Long value16, LocalDateTime value17, LocalDateTime value18, Integer value19, Integer value20, Long value21) {
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
        value21(value21);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TabSolImagenRecord
     */
    public TabSolImagenRecord() {
        super(TabSolImagen.TAB_SOL_IMAGEN);
    }

    /**
     * Create a detached, initialised TabSolImagenRecord
     */
    public TabSolImagenRecord(Long idSolImagen, String nombre, String descripcion, String seccion, byte[] imagen, String estado, Long idSolCalPackingList, Long idSolCalidad, Long idSolConsolidadoGancho, Long idSolContenedor, Long idSolControlPeso, Long idSolFinca, Long idSolProceso, Long idSolSelloInstalado, Long idSolSelloLlegada, Long idSolTransportista, LocalDateTime fechaIngreso, LocalDateTime fechaModifica, Integer usuarioIngreso, Integer usuarioModifica, Long idSolicitud) {
        super(TabSolImagen.TAB_SOL_IMAGEN);

        set(0, idSolImagen);
        set(1, nombre);
        set(2, descripcion);
        set(3, seccion);
        set(4, imagen);
        set(5, estado);
        set(6, idSolCalPackingList);
        set(7, idSolCalidad);
        set(8, idSolConsolidadoGancho);
        set(9, idSolContenedor);
        set(10, idSolControlPeso);
        set(11, idSolFinca);
        set(12, idSolProceso);
        set(13, idSolSelloInstalado);
        set(14, idSolSelloLlegada);
        set(15, idSolTransportista);
        set(16, fechaIngreso);
        set(17, fechaModifica);
        set(18, usuarioIngreso);
        set(19, usuarioModifica);
        set(20, idSolicitud);
    }
}
