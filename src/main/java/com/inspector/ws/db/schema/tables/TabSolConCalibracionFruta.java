/*
 * This file is generated by jOOQ.
 */
package com.inspector.ws.db.schema.tables;


import com.inspector.ws.db.schema.Indexes;
import com.inspector.ws.db.schema.Keys;
import com.inspector.ws.db.schema.Public;
import com.inspector.ws.db.schema.tables.records.TabSolConCalibracionFrutaRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class TabSolConCalibracionFruta extends TableImpl<TabSolConCalibracionFrutaRecord> {

    private static final long serialVersionUID = 1768391197;

    /**
     * The reference instance of <code>public.tab_sol_con_calibracion_fruta</code>
     */
    public static final TabSolConCalibracionFruta TAB_SOL_CON_CALIBRACION_FRUTA = new TabSolConCalibracionFruta();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TabSolConCalibracionFrutaRecord> getRecordType() {
        return TabSolConCalibracionFrutaRecord.class;
    }

    /**
     * The column <code>public.tab_sol_con_calibracion_fruta.id_sol_con_calibracion_fruta</code>.
     */
    public final TableField<TabSolConCalibracionFrutaRecord, Long> ID_SOL_CON_CALIBRACION_FRUTA = createField(DSL.name("id_sol_con_calibracion_fruta"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.tab_sol_con_calibracion_fruta.num_semana</code>.
     */
    public final TableField<TabSolConCalibracionFrutaRecord, Integer> NUM_SEMANA = createField(DSL.name("num_semana"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.tab_sol_con_calibracion_fruta.color</code>.
     */
    public final TableField<TabSolConCalibracionFrutaRecord, String> COLOR = createField(DSL.name("color"), org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.tab_sol_con_calibracion_fruta.num_racimos</code>.
     */
    public final TableField<TabSolConCalibracionFrutaRecord, Integer> NUM_RACIMOS = createField(DSL.name("num_racimos"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.tab_sol_con_calibracion_fruta.estado</code>.
     */
    public final TableField<TabSolConCalibracionFrutaRecord, String> ESTADO = createField(DSL.name("estado"), org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>public.tab_sol_con_calibracion_fruta.fecha_ingreso</code>.
     */
    public final TableField<TabSolConCalibracionFrutaRecord, LocalDateTime> FECHA_INGRESO = createField(DSL.name("fecha_ingreso"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>public.tab_sol_con_calibracion_fruta.fecha_modifica</code>.
     */
    public final TableField<TabSolConCalibracionFrutaRecord, LocalDateTime> FECHA_MODIFICA = createField(DSL.name("fecha_modifica"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>public.tab_sol_con_calibracion_fruta.usuario_ingreso</code>.
     */
    public final TableField<TabSolConCalibracionFrutaRecord, Integer> USUARIO_INGRESO = createField(DSL.name("usuario_ingreso"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.tab_sol_con_calibracion_fruta.usuario_modifica</code>.
     */
    public final TableField<TabSolConCalibracionFrutaRecord, Integer> USUARIO_MODIFICA = createField(DSL.name("usuario_modifica"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.tab_sol_con_calibracion_fruta.id_sol_consolidado_gancho</code>.
     */
    public final TableField<TabSolConCalibracionFrutaRecord, Long> ID_SOL_CONSOLIDADO_GANCHO = createField(DSL.name("id_sol_consolidado_gancho"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>public.tab_sol_con_calibracion_fruta</code> table reference
     */
    public TabSolConCalibracionFruta() {
        this(DSL.name("tab_sol_con_calibracion_fruta"), null);
    }

    /**
     * Create an aliased <code>public.tab_sol_con_calibracion_fruta</code> table reference
     */
    public TabSolConCalibracionFruta(String alias) {
        this(DSL.name(alias), TAB_SOL_CON_CALIBRACION_FRUTA);
    }

    /**
     * Create an aliased <code>public.tab_sol_con_calibracion_fruta</code> table reference
     */
    public TabSolConCalibracionFruta(Name alias) {
        this(alias, TAB_SOL_CON_CALIBRACION_FRUTA);
    }

    private TabSolConCalibracionFruta(Name alias, Table<TabSolConCalibracionFrutaRecord> aliased) {
        this(alias, aliased, null);
    }

    private TabSolConCalibracionFruta(Name alias, Table<TabSolConCalibracionFrutaRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TabSolConCalibracionFruta(Table<O> child, ForeignKey<O, TabSolConCalibracionFrutaRecord> key) {
        super(child, key, TAB_SOL_CON_CALIBRACION_FRUTA);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TAB_SOL_CON_CALIBRACION_FRUTA_PKEY);
    }

    @Override
    public UniqueKey<TabSolConCalibracionFrutaRecord> getPrimaryKey() {
        return Keys.TAB_SOL_CON_CALIBRACION_FRUTA_PKEY;
    }

    @Override
    public List<UniqueKey<TabSolConCalibracionFrutaRecord>> getKeys() {
        return Arrays.<UniqueKey<TabSolConCalibracionFrutaRecord>>asList(Keys.TAB_SOL_CON_CALIBRACION_FRUTA_PKEY);
    }

    @Override
    public List<ForeignKey<TabSolConCalibracionFrutaRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TabSolConCalibracionFrutaRecord, ?>>asList(Keys.TAB_SOL_CON_CALIBRACION_FRUTA__TAB_SOL_CON_CALIBRACION_FRUTA_USUARIO_INGRESO_FKEY, Keys.TAB_SOL_CON_CALIBRACION_FRUTA__TAB_SOL_CON_CALIBRACION_FRUTA_USUARIO_MODIFICA_FKEY, Keys.TAB_SOL_CON_CALIBRACION_FRUTA__TAB_SOL_CON_CALIBRACION_FRUTA_ID_SOL_CONSOLIDADO_GANCHO_FKEY);
    }

    public TabUsuario tabSolConCalibracionFruta_TabSolConCalibracionFrutaUsuarioIngresoFkey() {
        return new TabUsuario(this, Keys.TAB_SOL_CON_CALIBRACION_FRUTA__TAB_SOL_CON_CALIBRACION_FRUTA_USUARIO_INGRESO_FKEY);
    }

    public TabUsuario tabSolConCalibracionFruta_TabSolConCalibracionFrutaUsuarioModificaFkey() {
        return new TabUsuario(this, Keys.TAB_SOL_CON_CALIBRACION_FRUTA__TAB_SOL_CON_CALIBRACION_FRUTA_USUARIO_MODIFICA_FKEY);
    }

    public TabSolConsolidadoGancho tabSolConsolidadoGancho() {
        return new TabSolConsolidadoGancho(this, Keys.TAB_SOL_CON_CALIBRACION_FRUTA__TAB_SOL_CON_CALIBRACION_FRUTA_ID_SOL_CONSOLIDADO_GANCHO_FKEY);
    }

    @Override
    public TabSolConCalibracionFruta as(String alias) {
        return new TabSolConCalibracionFruta(DSL.name(alias), this);
    }

    @Override
    public TabSolConCalibracionFruta as(Name alias) {
        return new TabSolConCalibracionFruta(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TabSolConCalibracionFruta rename(String name) {
        return new TabSolConCalibracionFruta(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TabSolConCalibracionFruta rename(Name name) {
        return new TabSolConCalibracionFruta(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, Integer, String, Integer, String, LocalDateTime, LocalDateTime, Integer, Integer, Long> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}
