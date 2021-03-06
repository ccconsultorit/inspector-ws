/*
 * This file is generated by jOOQ.
 */
package com.inspector.ws.db.schema.tables;


import com.inspector.ws.db.schema.Indexes;
import com.inspector.ws.db.schema.Keys;
import com.inspector.ws.db.schema.Public;
import com.inspector.ws.db.schema.tables.records.TabSolFincaRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row19;
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
public class TabSolFinca extends TableImpl<TabSolFincaRecord> {

    private static final long serialVersionUID = -441315258;

    /**
     * The reference instance of <code>public.tab_sol_finca</code>
     */
    public static final TabSolFinca TAB_SOL_FINCA = new TabSolFinca();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TabSolFincaRecord> getRecordType() {
        return TabSolFincaRecord.class;
    }

    /**
     * The column <code>public.tab_sol_finca.id_sol_finca</code>.
     */
    public final TableField<TabSolFincaRecord, Long> ID_SOL_FINCA = createField(DSL.name("id_sol_finca"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.tab_sol_finca.nombre</code>.
     */
    public final TableField<TabSolFincaRecord, String> NOMBRE = createField(DSL.name("nombre"), org.jooq.impl.SQLDataType.VARCHAR(100).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.tab_sol_finca.fuente_agua</code>.
     */
    public final TableField<TabSolFincaRecord, String> FUENTE_AGUA = createField(DSL.name("fuente_agua"), org.jooq.impl.SQLDataType.VARCHAR(3).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.tab_sol_finca.agua_corrida</code>.
     */
    public final TableField<TabSolFincaRecord, String> AGUA_CORRIDA = createField(DSL.name("agua_corrida"), org.jooq.impl.SQLDataType.VARCHAR(3).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.tab_sol_finca.estado_piso</code>.
     */
    public final TableField<TabSolFincaRecord, String> ESTADO_PISO = createField(DSL.name("estado_piso"), org.jooq.impl.SQLDataType.VARCHAR(3).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.tab_sol_finca.cable_via</code>.
     */
    public final TableField<TabSolFincaRecord, String> CABLE_VIA = createField(DSL.name("cable_via"), org.jooq.impl.SQLDataType.VARCHAR(3).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.tab_sol_finca.estado_techo</code>.
     */
    public final TableField<TabSolFincaRecord, String> ESTADO_TECHO = createField(DSL.name("estado_techo"), org.jooq.impl.SQLDataType.VARCHAR(3).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.tab_sol_finca.estado_tina</code>.
     */
    public final TableField<TabSolFincaRecord, String> ESTADO_TINA = createField(DSL.name("estado_tina"), org.jooq.impl.SQLDataType.VARCHAR(3).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.tab_sol_finca.fumigacion</code>.
     */
    public final TableField<TabSolFincaRecord, String> FUMIGACION = createField(DSL.name("fumigacion"), org.jooq.impl.SQLDataType.VARCHAR(3).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.tab_sol_finca.lavado_racimo</code>.
     */
    public final TableField<TabSolFincaRecord, String> LAVADO_RACIMO = createField(DSL.name("lavado_racimo"), org.jooq.impl.SQLDataType.VARCHAR(3).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.tab_sol_finca.embudo</code>.
     */
    public final TableField<TabSolFincaRecord, String> EMBUDO = createField(DSL.name("embudo"), org.jooq.impl.SQLDataType.VARCHAR(3).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.tab_sol_finca.division_tina</code>.
     */
    public final TableField<TabSolFincaRecord, String> DIVISION_TINA = createField(DSL.name("division_tina"), org.jooq.impl.SQLDataType.VARCHAR(3).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.tab_sol_finca.estado</code>.
     */
    public final TableField<TabSolFincaRecord, String> ESTADO = createField(DSL.name("estado"), org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>public.tab_sol_finca.fecha_ingreso</code>.
     */
    public final TableField<TabSolFincaRecord, LocalDateTime> FECHA_INGRESO = createField(DSL.name("fecha_ingreso"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>public.tab_sol_finca.fecha_modifica</code>.
     */
    public final TableField<TabSolFincaRecord, LocalDateTime> FECHA_MODIFICA = createField(DSL.name("fecha_modifica"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>public.tab_sol_finca.usuario_ingreso</code>.
     */
    public final TableField<TabSolFincaRecord, Integer> USUARIO_INGRESO = createField(DSL.name("usuario_ingreso"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.tab_sol_finca.usuario_modifica</code>.
     */
    public final TableField<TabSolFincaRecord, Integer> USUARIO_MODIFICA = createField(DSL.name("usuario_modifica"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.tab_sol_finca.id_solicitud</code>.
     */
    public final TableField<TabSolFincaRecord, Long> ID_SOLICITUD = createField(DSL.name("id_solicitud"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.tab_sol_finca.id_sol_productor</code>.
     */
    public final TableField<TabSolFincaRecord, Long> ID_SOL_PRODUCTOR = createField(DSL.name("id_sol_productor"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>public.tab_sol_finca</code> table reference
     */
    public TabSolFinca() {
        this(DSL.name("tab_sol_finca"), null);
    }

    /**
     * Create an aliased <code>public.tab_sol_finca</code> table reference
     */
    public TabSolFinca(String alias) {
        this(DSL.name(alias), TAB_SOL_FINCA);
    }

    /**
     * Create an aliased <code>public.tab_sol_finca</code> table reference
     */
    public TabSolFinca(Name alias) {
        this(alias, TAB_SOL_FINCA);
    }

    private TabSolFinca(Name alias, Table<TabSolFincaRecord> aliased) {
        this(alias, aliased, null);
    }

    private TabSolFinca(Name alias, Table<TabSolFincaRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TabSolFinca(Table<O> child, ForeignKey<O, TabSolFincaRecord> key) {
        super(child, key, TAB_SOL_FINCA);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TAB_SOL_FINCA_PKEY);
    }

    @Override
    public UniqueKey<TabSolFincaRecord> getPrimaryKey() {
        return Keys.TAB_SOL_FINCA_PKEY;
    }

    @Override
    public List<UniqueKey<TabSolFincaRecord>> getKeys() {
        return Arrays.<UniqueKey<TabSolFincaRecord>>asList(Keys.TAB_SOL_FINCA_PKEY);
    }

    @Override
    public List<ForeignKey<TabSolFincaRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TabSolFincaRecord, ?>>asList(Keys.TAB_SOL_FINCA__TAB_SOL_FINCA_USUARIO_INGRESO_FKEY, Keys.TAB_SOL_FINCA__TAB_SOL_FINCA_USUARIO_MODIFICA_FKEY);
    }

    public TabUsuario tabSolFinca_TabSolFincaUsuarioIngresoFkey() {
        return new TabUsuario(this, Keys.TAB_SOL_FINCA__TAB_SOL_FINCA_USUARIO_INGRESO_FKEY);
    }

    public TabUsuario tabSolFinca_TabSolFincaUsuarioModificaFkey() {
        return new TabUsuario(this, Keys.TAB_SOL_FINCA__TAB_SOL_FINCA_USUARIO_MODIFICA_FKEY);
    }

    @Override
    public TabSolFinca as(String alias) {
        return new TabSolFinca(DSL.name(alias), this);
    }

    @Override
    public TabSolFinca as(Name alias) {
        return new TabSolFinca(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TabSolFinca rename(String name) {
        return new TabSolFinca(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TabSolFinca rename(Name name) {
        return new TabSolFinca(name, null);
    }

    // -------------------------------------------------------------------------
    // Row19 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row19<Long, String, String, String, String, String, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime, Integer, Integer, Long, Long> fieldsRow() {
        return (Row19) super.fieldsRow();
    }
}
