/*
 * This file is generated by jOOQ.
 */
package com.inspector.ws.db.schema.tables;


import com.inspector.ws.db.schema.Indexes;
import com.inspector.ws.db.schema.Keys;
import com.inspector.ws.db.schema.Public;
import com.inspector.ws.db.schema.tables.records.TabSolCalCalibreRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
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
public class TabSolCalCalibre extends TableImpl<TabSolCalCalibreRecord> {

    private static final long serialVersionUID = 672198193;

    /**
     * The reference instance of <code>public.tab_sol_cal_calibre</code>
     */
    public static final TabSolCalCalibre TAB_SOL_CAL_CALIBRE = new TabSolCalCalibre();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TabSolCalCalibreRecord> getRecordType() {
        return TabSolCalCalibreRecord.class;
    }

    /**
     * The column <code>public.tab_sol_cal_calibre.id_sol_cal_calibre</code>.
     */
    public final TableField<TabSolCalCalibreRecord, Long> ID_SOL_CAL_CALIBRE = createField(DSL.name("id_sol_cal_calibre"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.tab_sol_cal_calibre.cal_ug</code>.
     */
    public final TableField<TabSolCalCalibreRecord, Integer> CAL_UG = createField(DSL.name("cal_ug"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.tab_sol_cal_calibre.cal_og</code>.
     */
    public final TableField<TabSolCalCalibreRecord, Integer> CAL_OG = createField(DSL.name("cal_og"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.tab_sol_cal_calibre.cal_37</code>.
     */
    public final TableField<TabSolCalCalibreRecord, Integer> CAL_37 = createField(DSL.name("cal_37"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.tab_sol_cal_calibre.cal_38</code>.
     */
    public final TableField<TabSolCalCalibreRecord, Integer> CAL_38 = createField(DSL.name("cal_38"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.tab_sol_cal_calibre.cal_39</code>.
     */
    public final TableField<TabSolCalCalibreRecord, Integer> CAL_39 = createField(DSL.name("cal_39"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.tab_sol_cal_calibre.cal_40</code>.
     */
    public final TableField<TabSolCalCalibreRecord, Integer> CAL_40 = createField(DSL.name("cal_40"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.tab_sol_cal_calibre.cal_41</code>.
     */
    public final TableField<TabSolCalCalibreRecord, Integer> CAL_41 = createField(DSL.name("cal_41"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.tab_sol_cal_calibre.cal_42</code>.
     */
    public final TableField<TabSolCalCalibreRecord, Integer> CAL_42 = createField(DSL.name("cal_42"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.tab_sol_cal_calibre.cal_43</code>.
     */
    public final TableField<TabSolCalCalibreRecord, Integer> CAL_43 = createField(DSL.name("cal_43"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.tab_sol_cal_calibre.cal_44</code>.
     */
    public final TableField<TabSolCalCalibreRecord, Integer> CAL_44 = createField(DSL.name("cal_44"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.tab_sol_cal_calibre.cal_45</code>.
     */
    public final TableField<TabSolCalCalibreRecord, Integer> CAL_45 = createField(DSL.name("cal_45"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.tab_sol_cal_calibre.cal_46</code>.
     */
    public final TableField<TabSolCalCalibreRecord, Integer> CAL_46 = createField(DSL.name("cal_46"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.tab_sol_cal_calibre.cal_47</code>.
     */
    public final TableField<TabSolCalCalibreRecord, Integer> CAL_47 = createField(DSL.name("cal_47"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.tab_sol_cal_calibre.cal_48</code>.
     */
    public final TableField<TabSolCalCalibreRecord, Integer> CAL_48 = createField(DSL.name("cal_48"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.tab_sol_cal_calibre.cal_49</code>.
     */
    public final TableField<TabSolCalCalibreRecord, Integer> CAL_49 = createField(DSL.name("cal_49"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.tab_sol_cal_calibre.cal_50</code>.
     */
    public final TableField<TabSolCalCalibreRecord, Integer> CAL_50 = createField(DSL.name("cal_50"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.tab_sol_cal_calibre.cal_51</code>.
     */
    public final TableField<TabSolCalCalibreRecord, Integer> CAL_51 = createField(DSL.name("cal_51"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.tab_sol_cal_calibre.cal_52</code>.
     */
    public final TableField<TabSolCalCalibreRecord, Integer> CAL_52 = createField(DSL.name("cal_52"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.tab_sol_cal_calibre.cal_53</code>.
     */
    public final TableField<TabSolCalCalibreRecord, Integer> CAL_53 = createField(DSL.name("cal_53"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.tab_sol_cal_calibre.cal_54</code>.
     */
    public final TableField<TabSolCalCalibreRecord, Integer> CAL_54 = createField(DSL.name("cal_54"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.tab_sol_cal_calibre.estado</code>.
     */
    public final TableField<TabSolCalCalibreRecord, String> ESTADO = createField(DSL.name("estado"), org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>public.tab_sol_cal_calibre.fecha_ingreso</code>.
     */
    public final TableField<TabSolCalCalibreRecord, LocalDateTime> FECHA_INGRESO = createField(DSL.name("fecha_ingreso"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>public.tab_sol_cal_calibre.fecha_modifica</code>.
     */
    public final TableField<TabSolCalCalibreRecord, LocalDateTime> FECHA_MODIFICA = createField(DSL.name("fecha_modifica"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>public.tab_sol_cal_calibre.usuario_ingreso</code>.
     */
    public final TableField<TabSolCalCalibreRecord, Integer> USUARIO_INGRESO = createField(DSL.name("usuario_ingreso"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.tab_sol_cal_calibre.usuario_modifica</code>.
     */
    public final TableField<TabSolCalCalibreRecord, Integer> USUARIO_MODIFICA = createField(DSL.name("usuario_modifica"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.tab_sol_cal_calibre.id_sol_calidad</code>.
     */
    public final TableField<TabSolCalCalibreRecord, Long> ID_SOL_CALIDAD = createField(DSL.name("id_sol_calidad"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>public.tab_sol_cal_calibre</code> table reference
     */
    public TabSolCalCalibre() {
        this(DSL.name("tab_sol_cal_calibre"), null);
    }

    /**
     * Create an aliased <code>public.tab_sol_cal_calibre</code> table reference
     */
    public TabSolCalCalibre(String alias) {
        this(DSL.name(alias), TAB_SOL_CAL_CALIBRE);
    }

    /**
     * Create an aliased <code>public.tab_sol_cal_calibre</code> table reference
     */
    public TabSolCalCalibre(Name alias) {
        this(alias, TAB_SOL_CAL_CALIBRE);
    }

    private TabSolCalCalibre(Name alias, Table<TabSolCalCalibreRecord> aliased) {
        this(alias, aliased, null);
    }

    private TabSolCalCalibre(Name alias, Table<TabSolCalCalibreRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TabSolCalCalibre(Table<O> child, ForeignKey<O, TabSolCalCalibreRecord> key) {
        super(child, key, TAB_SOL_CAL_CALIBRE);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TAB_SOL_CAL_CALIBRE_PKEY);
    }

    @Override
    public UniqueKey<TabSolCalCalibreRecord> getPrimaryKey() {
        return Keys.TAB_SOL_CAL_CALIBRE_PKEY;
    }

    @Override
    public List<UniqueKey<TabSolCalCalibreRecord>> getKeys() {
        return Arrays.<UniqueKey<TabSolCalCalibreRecord>>asList(Keys.TAB_SOL_CAL_CALIBRE_PKEY);
    }

    @Override
    public List<ForeignKey<TabSolCalCalibreRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TabSolCalCalibreRecord, ?>>asList(Keys.TAB_SOL_CAL_CALIBRE__TAB_SOL_CAL_CALIBRE_USUARIO_INGRESO_FKEY, Keys.TAB_SOL_CAL_CALIBRE__TAB_SOL_CAL_CALIBRE_USUARIO_MODIFICA_FKEY, Keys.TAB_SOL_CAL_CALIBRE__TAB_SOL_CAL_CALIBRE_ID_SOL_CALIDAD_FKEY);
    }

    public TabUsuario tabSolCalCalibre_TabSolCalCalibreUsuarioIngresoFkey() {
        return new TabUsuario(this, Keys.TAB_SOL_CAL_CALIBRE__TAB_SOL_CAL_CALIBRE_USUARIO_INGRESO_FKEY);
    }

    public TabUsuario tabSolCalCalibre_TabSolCalCalibreUsuarioModificaFkey() {
        return new TabUsuario(this, Keys.TAB_SOL_CAL_CALIBRE__TAB_SOL_CAL_CALIBRE_USUARIO_MODIFICA_FKEY);
    }

    public TabSolCalidad tabSolCalidad() {
        return new TabSolCalidad(this, Keys.TAB_SOL_CAL_CALIBRE__TAB_SOL_CAL_CALIBRE_ID_SOL_CALIDAD_FKEY);
    }

    @Override
    public TabSolCalCalibre as(String alias) {
        return new TabSolCalCalibre(DSL.name(alias), this);
    }

    @Override
    public TabSolCalCalibre as(Name alias) {
        return new TabSolCalCalibre(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TabSolCalCalibre rename(String name) {
        return new TabSolCalCalibre(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TabSolCalCalibre rename(Name name) {
        return new TabSolCalCalibre(name, null);
    }
}
