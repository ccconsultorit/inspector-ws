/*
 * This file is generated by jOOQ.
 */
package com.inspector.ws.db.schema.tables;


import com.inspector.ws.db.schema.Indexes;
import com.inspector.ws.db.schema.Keys;
import com.inspector.ws.db.schema.Public;
import com.inspector.ws.db.schema.tables.records.TabSolSelloInstaladoRecord;

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
public class TabSolSelloInstalado extends TableImpl<TabSolSelloInstaladoRecord> {

    private static final long serialVersionUID = -1576960517;

    /**
     * The reference instance of <code>public.tab_sol_sello_instalado</code>
     */
    public static final TabSolSelloInstalado TAB_SOL_SELLO_INSTALADO = new TabSolSelloInstalado();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TabSolSelloInstaladoRecord> getRecordType() {
        return TabSolSelloInstaladoRecord.class;
    }

    /**
     * The column <code>public.tab_sol_sello_instalado.id_sol_sello_instalado</code>.
     */
    public final TableField<TabSolSelloInstaladoRecord, Long> ID_SOL_SELLO_INSTALADO = createField(DSL.name("id_sol_sello_instalado"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.tab_sol_sello_instalado.candado_naviera</code>.
     */
    public final TableField<TabSolSelloInstaladoRecord, String> CANDADO_NAVIERA = createField(DSL.name("candado_naviera"), org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.tab_sol_sello_instalado.sello_verificadora</code>.
     */
    public final TableField<TabSolSelloInstaladoRecord, String> SELLO_VERIFICADORA = createField(DSL.name("sello_verificadora"), org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.tab_sol_sello_instalado.cable_naviera</code>.
     */
    public final TableField<TabSolSelloInstaladoRecord, String> CABLE_NAVIERA = createField(DSL.name("cable_naviera"), org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.tab_sol_sello_instalado.cable_exportadora</code>.
     */
    public final TableField<TabSolSelloInstaladoRecord, String> CABLE_EXPORTADORA = createField(DSL.name("cable_exportadora"), org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.tab_sol_sello_instalado.sticker_exportadora</code>.
     */
    public final TableField<TabSolSelloInstaladoRecord, String> STICKER_EXPORTADORA = createField(DSL.name("sticker_exportadora"), org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.tab_sol_sello_instalado.rastreo</code>.
     */
    public final TableField<TabSolSelloInstaladoRecord, String> RASTREO = createField(DSL.name("rastreo"), org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.tab_sol_sello_instalado.termografo1</code>.
     */
    public final TableField<TabSolSelloInstaladoRecord, String> TERMOGRAFO1 = createField(DSL.name("termografo1"), org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.tab_sol_sello_instalado.ubicacion1</code>.
     */
    public final TableField<TabSolSelloInstaladoRecord, String> UBICACION1 = createField(DSL.name("ubicacion1"), org.jooq.impl.SQLDataType.VARCHAR(100).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.tab_sol_sello_instalado.termografo2</code>.
     */
    public final TableField<TabSolSelloInstaladoRecord, String> TERMOGRAFO2 = createField(DSL.name("termografo2"), org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.tab_sol_sello_instalado.ubicacion2</code>.
     */
    public final TableField<TabSolSelloInstaladoRecord, String> UBICACION2 = createField(DSL.name("ubicacion2"), org.jooq.impl.SQLDataType.VARCHAR(100).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.tab_sol_sello_instalado.filtro_proporcionado</code>.
     */
    public final TableField<TabSolSelloInstaladoRecord, String> FILTRO_PROPORCIONADO = createField(DSL.name("filtro_proporcionado"), org.jooq.impl.SQLDataType.VARCHAR(3).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.tab_sol_sello_instalado.termoking</code>.
     */
    public final TableField<TabSolSelloInstaladoRecord, String> TERMOKING = createField(DSL.name("termoking"), org.jooq.impl.SQLDataType.VARCHAR(3).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.tab_sol_sello_instalado.estado</code>.
     */
    public final TableField<TabSolSelloInstaladoRecord, String> ESTADO = createField(DSL.name("estado"), org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>public.tab_sol_sello_instalado.fecha_ingreso</code>.
     */
    public final TableField<TabSolSelloInstaladoRecord, LocalDateTime> FECHA_INGRESO = createField(DSL.name("fecha_ingreso"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>public.tab_sol_sello_instalado.fecha_modifica</code>.
     */
    public final TableField<TabSolSelloInstaladoRecord, LocalDateTime> FECHA_MODIFICA = createField(DSL.name("fecha_modifica"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>public.tab_sol_sello_instalado.usuario_ingreso</code>.
     */
    public final TableField<TabSolSelloInstaladoRecord, Integer> USUARIO_INGRESO = createField(DSL.name("usuario_ingreso"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.tab_sol_sello_instalado.usuario_modifica</code>.
     */
    public final TableField<TabSolSelloInstaladoRecord, Integer> USUARIO_MODIFICA = createField(DSL.name("usuario_modifica"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.tab_sol_sello_instalado.id_solicitud</code>.
     */
    public final TableField<TabSolSelloInstaladoRecord, Long> ID_SOLICITUD = createField(DSL.name("id_solicitud"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>public.tab_sol_sello_instalado</code> table reference
     */
    public TabSolSelloInstalado() {
        this(DSL.name("tab_sol_sello_instalado"), null);
    }

    /**
     * Create an aliased <code>public.tab_sol_sello_instalado</code> table reference
     */
    public TabSolSelloInstalado(String alias) {
        this(DSL.name(alias), TAB_SOL_SELLO_INSTALADO);
    }

    /**
     * Create an aliased <code>public.tab_sol_sello_instalado</code> table reference
     */
    public TabSolSelloInstalado(Name alias) {
        this(alias, TAB_SOL_SELLO_INSTALADO);
    }

    private TabSolSelloInstalado(Name alias, Table<TabSolSelloInstaladoRecord> aliased) {
        this(alias, aliased, null);
    }

    private TabSolSelloInstalado(Name alias, Table<TabSolSelloInstaladoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TabSolSelloInstalado(Table<O> child, ForeignKey<O, TabSolSelloInstaladoRecord> key) {
        super(child, key, TAB_SOL_SELLO_INSTALADO);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TAB_SOL_SELLO_INSTALADO_PKEY);
    }

    @Override
    public UniqueKey<TabSolSelloInstaladoRecord> getPrimaryKey() {
        return Keys.TAB_SOL_SELLO_INSTALADO_PKEY;
    }

    @Override
    public List<UniqueKey<TabSolSelloInstaladoRecord>> getKeys() {
        return Arrays.<UniqueKey<TabSolSelloInstaladoRecord>>asList(Keys.TAB_SOL_SELLO_INSTALADO_PKEY);
    }

    @Override
    public List<ForeignKey<TabSolSelloInstaladoRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TabSolSelloInstaladoRecord, ?>>asList(Keys.TAB_SOL_SELLO_INSTALADO__TAB_SOL_SELLO_INSTALADO_USUARIO_INGRESO_FKEY, Keys.TAB_SOL_SELLO_INSTALADO__TAB_SOL_SELLO_INSTALADO_USUARIO_MODIFICA_FKEY, Keys.TAB_SOL_SELLO_INSTALADO__TAB_SOL_SELLO_INSTALADO_ID_SOLICITUD_FKEY);
    }

    public TabUsuario tabSolSelloInstalado_TabSolSelloInstaladoUsuarioIngresoFkey() {
        return new TabUsuario(this, Keys.TAB_SOL_SELLO_INSTALADO__TAB_SOL_SELLO_INSTALADO_USUARIO_INGRESO_FKEY);
    }

    public TabUsuario tabSolSelloInstalado_TabSolSelloInstaladoUsuarioModificaFkey() {
        return new TabUsuario(this, Keys.TAB_SOL_SELLO_INSTALADO__TAB_SOL_SELLO_INSTALADO_USUARIO_MODIFICA_FKEY);
    }

    public TabSolicitud tabSolicitud() {
        return new TabSolicitud(this, Keys.TAB_SOL_SELLO_INSTALADO__TAB_SOL_SELLO_INSTALADO_ID_SOLICITUD_FKEY);
    }

    @Override
    public TabSolSelloInstalado as(String alias) {
        return new TabSolSelloInstalado(DSL.name(alias), this);
    }

    @Override
    public TabSolSelloInstalado as(Name alias) {
        return new TabSolSelloInstalado(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TabSolSelloInstalado rename(String name) {
        return new TabSolSelloInstalado(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TabSolSelloInstalado rename(Name name) {
        return new TabSolSelloInstalado(name, null);
    }

    // -------------------------------------------------------------------------
    // Row19 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row19<Long, String, String, String, String, String, String, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime, Integer, Integer, Long> fieldsRow() {
        return (Row19) super.fieldsRow();
    }
}
