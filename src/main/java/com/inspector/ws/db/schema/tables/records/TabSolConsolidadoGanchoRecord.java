/*
 * This file is generated by jOOQ.
 */
package com.inspector.ws.db.schema.tables.records;


import com.inspector.ws.db.schema.tables.TabSolConsolidadoGancho;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Record1;
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
public class TabSolConsolidadoGanchoRecord extends UpdatableRecordImpl<TabSolConsolidadoGanchoRecord> {

    private static final long serialVersionUID = 887502858;

    /**
     * Setter for <code>public.tab_sol_consolidado_gancho.id_sol_consolidado_gancho</code>.
     */
    public void setIdSolConsolidadoGancho(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.tab_sol_consolidado_gancho.id_sol_consolidado_gancho</code>.
     */
    public Long getIdSolConsolidadoGancho() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.tab_sol_consolidado_gancho.en_funde</code>.
     */
    public void setEnFunde(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.tab_sol_consolidado_gancho.en_funde</code>.
     */
    public String getEnFunde() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.tab_sol_consolidado_gancho.racimo_cosechado</code>.
     */
    public void setRacimoCosechado(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.tab_sol_consolidado_gancho.racimo_cosechado</code>.
     */
    public Integer getRacimoCosechado() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.tab_sol_consolidado_gancho.racimo_rechazado</code>.
     */
    public void setRacimoRechazado(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.tab_sol_consolidado_gancho.racimo_rechazado</code>.
     */
    public Integer getRacimoRechazado() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.tab_sol_consolidado_gancho.racimo_procesado</code>.
     */
    public void setRacimoProcesado(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.tab_sol_consolidado_gancho.racimo_procesado</code>.
     */
    public Integer getRacimoProcesado() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.tab_sol_consolidado_gancho.mutante</code>.
     */
    public void setMutante(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.tab_sol_consolidado_gancho.mutante</code>.
     */
    public Integer getMutante() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.tab_sol_consolidado_gancho.spacklin</code>.
     */
    public void setSpacklin(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.tab_sol_consolidado_gancho.spacklin</code>.
     */
    public Integer getSpacklin() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.tab_sol_consolidado_gancho.punta_amarilla</code>.
     */
    public void setPuntaAmarilla(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.tab_sol_consolidado_gancho.punta_amarilla</code>.
     */
    public Integer getPuntaAmarilla() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>public.tab_sol_consolidado_gancho.crema</code>.
     */
    public void setCrema(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.tab_sol_consolidado_gancho.crema</code>.
     */
    public Integer getCrema() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>public.tab_sol_consolidado_gancho.mancha_roja</code>.
     */
    public void setManchaRoja(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.tab_sol_consolidado_gancho.mancha_roja</code>.
     */
    public Integer getManchaRoja() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>public.tab_sol_consolidado_gancho.alterado</code>.
     */
    public void setAlterado(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.tab_sol_consolidado_gancho.alterado</code>.
     */
    public Integer getAlterado() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>public.tab_sol_consolidado_gancho.pobre</code>.
     */
    public void setPobre(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.tab_sol_consolidado_gancho.pobre</code>.
     */
    public Integer getPobre() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>public.tab_sol_consolidado_gancho.caido</code>.
     */
    public void setCaido(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.tab_sol_consolidado_gancho.caido</code>.
     */
    public Integer getCaido() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>public.tab_sol_consolidado_gancho.sobre_grado</code>.
     */
    public void setSobreGrado(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.tab_sol_consolidado_gancho.sobre_grado</code>.
     */
    public Integer getSobreGrado() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>public.tab_sol_consolidado_gancho.bajo_grado</code>.
     */
    public void setBajoGrado(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.tab_sol_consolidado_gancho.bajo_grado</code>.
     */
    public Integer getBajoGrado() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>public.tab_sol_consolidado_gancho.mosaico</code>.
     */
    public void setMosaico(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>public.tab_sol_consolidado_gancho.mosaico</code>.
     */
    public Integer getMosaico() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>public.tab_sol_consolidado_gancho.rasguno_animal</code>.
     */
    public void setRasgunoAnimal(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>public.tab_sol_consolidado_gancho.rasguno_animal</code>.
     */
    public Integer getRasgunoAnimal() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>public.tab_sol_consolidado_gancho.explosivo</code>.
     */
    public void setExplosivo(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>public.tab_sol_consolidado_gancho.explosivo</code>.
     */
    public Integer getExplosivo() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>public.tab_sol_consolidado_gancho.herwinea</code>.
     */
    public void setHerwinea(Integer value) {
        set(18, value);
    }

    /**
     * Getter for <code>public.tab_sol_consolidado_gancho.herwinea</code>.
     */
    public Integer getHerwinea() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>public.tab_sol_consolidado_gancho.sin_cinta</code>.
     */
    public void setSinCinta(Integer value) {
        set(19, value);
    }

    /**
     * Getter for <code>public.tab_sol_consolidado_gancho.sin_cinta</code>.
     */
    public Integer getSinCinta() {
        return (Integer) get(19);
    }

    /**
     * Setter for <code>public.tab_sol_consolidado_gancho.cochinilla</code>.
     */
    public void setCochinilla(Integer value) {
        set(20, value);
    }

    /**
     * Getter for <code>public.tab_sol_consolidado_gancho.cochinilla</code>.
     */
    public Integer getCochinilla() {
        return (Integer) get(20);
    }

    /**
     * Setter for <code>public.tab_sol_consolidado_gancho.escama</code>.
     */
    public void setEscama(Integer value) {
        set(21, value);
    }

    /**
     * Getter for <code>public.tab_sol_consolidado_gancho.escama</code>.
     */
    public Integer getEscama() {
        return (Integer) get(21);
    }

    /**
     * Setter for <code>public.tab_sol_consolidado_gancho.fumagina</code>.
     */
    public void setFumagina(Integer value) {
        set(22, value);
    }

    /**
     * Getter for <code>public.tab_sol_consolidado_gancho.fumagina</code>.
     */
    public Integer getFumagina() {
        return (Integer) get(22);
    }

    /**
     * Setter for <code>public.tab_sol_consolidado_gancho.pesonudo</code>.
     */
    public void setPesonudo(Integer value) {
        set(23, value);
    }

    /**
     * Getter for <code>public.tab_sol_consolidado_gancho.pesonudo</code>.
     */
    public Integer getPesonudo() {
        return (Integer) get(23);
    }

    /**
     * Setter for <code>public.tab_sol_consolidado_gancho.observacion</code>.
     */
    public void setObservacion(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>public.tab_sol_consolidado_gancho.observacion</code>.
     */
    public String getObservacion() {
        return (String) get(24);
    }

    /**
     * Setter for <code>public.tab_sol_consolidado_gancho.estado</code>.
     */
    public void setEstado(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>public.tab_sol_consolidado_gancho.estado</code>.
     */
    public String getEstado() {
        return (String) get(25);
    }

    /**
     * Setter for <code>public.tab_sol_consolidado_gancho.fecha_ingreso</code>.
     */
    public void setFechaIngreso(LocalDateTime value) {
        set(26, value);
    }

    /**
     * Getter for <code>public.tab_sol_consolidado_gancho.fecha_ingreso</code>.
     */
    public LocalDateTime getFechaIngreso() {
        return (LocalDateTime) get(26);
    }

    /**
     * Setter for <code>public.tab_sol_consolidado_gancho.fecha_modifica</code>.
     */
    public void setFechaModifica(LocalDateTime value) {
        set(27, value);
    }

    /**
     * Getter for <code>public.tab_sol_consolidado_gancho.fecha_modifica</code>.
     */
    public LocalDateTime getFechaModifica() {
        return (LocalDateTime) get(27);
    }

    /**
     * Setter for <code>public.tab_sol_consolidado_gancho.usuario_ingreso</code>.
     */
    public void setUsuarioIngreso(Integer value) {
        set(28, value);
    }

    /**
     * Getter for <code>public.tab_sol_consolidado_gancho.usuario_ingreso</code>.
     */
    public Integer getUsuarioIngreso() {
        return (Integer) get(28);
    }

    /**
     * Setter for <code>public.tab_sol_consolidado_gancho.usuario_modifica</code>.
     */
    public void setUsuarioModifica(Integer value) {
        set(29, value);
    }

    /**
     * Getter for <code>public.tab_sol_consolidado_gancho.usuario_modifica</code>.
     */
    public Integer getUsuarioModifica() {
        return (Integer) get(29);
    }

    /**
     * Setter for <code>public.tab_sol_consolidado_gancho.id_solicitud</code>.
     */
    public void setIdSolicitud(Long value) {
        set(30, value);
    }

    /**
     * Getter for <code>public.tab_sol_consolidado_gancho.id_solicitud</code>.
     */
    public Long getIdSolicitud() {
        return (Long) get(30);
    }

    /**
     * Setter for <code>public.tab_sol_consolidado_gancho.id_sol_productor</code>.
     */
    public void setIdSolProductor(Long value) {
        set(31, value);
    }

    /**
     * Getter for <code>public.tab_sol_consolidado_gancho.id_sol_productor</code>.
     */
    public Long getIdSolProductor() {
        return (Long) get(31);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TabSolConsolidadoGanchoRecord
     */
    public TabSolConsolidadoGanchoRecord() {
        super(TabSolConsolidadoGancho.TAB_SOL_CONSOLIDADO_GANCHO);
    }

    /**
     * Create a detached, initialised TabSolConsolidadoGanchoRecord
     */
    public TabSolConsolidadoGanchoRecord(Long idSolConsolidadoGancho, String enFunde, Integer racimoCosechado, Integer racimoRechazado, Integer racimoProcesado, Integer mutante, Integer spacklin, Integer puntaAmarilla, Integer crema, Integer manchaRoja, Integer alterado, Integer pobre, Integer caido, Integer sobreGrado, Integer bajoGrado, Integer mosaico, Integer rasgunoAnimal, Integer explosivo, Integer herwinea, Integer sinCinta, Integer cochinilla, Integer escama, Integer fumagina, Integer pesonudo, String observacion, String estado, LocalDateTime fechaIngreso, LocalDateTime fechaModifica, Integer usuarioIngreso, Integer usuarioModifica, Long idSolicitud, Long idSolProductor) {
        super(TabSolConsolidadoGancho.TAB_SOL_CONSOLIDADO_GANCHO);

        set(0, idSolConsolidadoGancho);
        set(1, enFunde);
        set(2, racimoCosechado);
        set(3, racimoRechazado);
        set(4, racimoProcesado);
        set(5, mutante);
        set(6, spacklin);
        set(7, puntaAmarilla);
        set(8, crema);
        set(9, manchaRoja);
        set(10, alterado);
        set(11, pobre);
        set(12, caido);
        set(13, sobreGrado);
        set(14, bajoGrado);
        set(15, mosaico);
        set(16, rasgunoAnimal);
        set(17, explosivo);
        set(18, herwinea);
        set(19, sinCinta);
        set(20, cochinilla);
        set(21, escama);
        set(22, fumagina);
        set(23, pesonudo);
        set(24, observacion);
        set(25, estado);
        set(26, fechaIngreso);
        set(27, fechaModifica);
        set(28, usuarioIngreso);
        set(29, usuarioModifica);
        set(30, idSolicitud);
        set(31, idSolProductor);
    }
}
