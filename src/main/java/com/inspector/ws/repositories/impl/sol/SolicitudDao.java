package com.inspector.ws.repositories.impl.sol;

import com.inspector.dto.sol.*;
import com.inspector.enumaraciones.EstadoEnum;
import com.inspector.ws.repositories.sol.ISolicitudDao;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import static org.jooq.impl.DSL.*;
import java.time.LocalDateTime;
import java.util.List;

import static com.inspector.ws.db.schema.tables.TabSolicitud.TAB_SOLICITUD;
import static com.inspector.ws.db.schema.tables.TabSolContenedor.TAB_SOL_CONTENEDOR;
import static com.inspector.ws.db.schema.tables.TabSolSelloLlegada.TAB_SOL_SELLO_LLEGADA;
import static com.inspector.ws.db.schema.tables.TabSolSelloInstalado.TAB_SOL_SELLO_INSTALADO;
import static com.inspector.ws.db.schema.tables.TabSolTransportista.TAB_SOL_TRANSPORTISTA;
import static com.inspector.ws.db.schema.tables.TabSolProceso.TAB_SOL_PROCESO;
import static com.inspector.ws.db.schema.tables.TabSolControlPeso.TAB_SOL_CONTROL_PESO;
import static com.inspector.ws.db.schema.tables.TabSolFinca.TAB_SOL_FINCA;
import static com.inspector.ws.db.schema.tables.TabSolCalidad.TAB_SOL_CALIDAD;
import static com.inspector.ws.db.schema.tables.TabSolConsolidadoGancho.TAB_SOL_CONSOLIDADO_GANCHO;
import static com.inspector.ws.db.schema.tables.TabSolCalDefectoSeleccion.TAB_SOL_CAL_DEFECTO_SELECCION;
import static com.inspector.ws.db.schema.tables.TabSolCalPesoCluster.TAB_SOL_CAL_PESO_CLUSTER;
import static com.inspector.ws.db.schema.tables.TabSolCalPackingList.TAB_SOL_CAL_PACKING_LIST;
import static com.inspector.ws.db.schema.tables.TabSolCalCalibre.TAB_SOL_CAL_CALIBRE;
import static com.inspector.ws.db.schema.tables.TabSolConCalibracionFruta.TAB_SOL_CON_CALIBRACION_FRUTA;
import static com.inspector.ws.db.schema.tables.TabSolImagen.TAB_SOL_IMAGEN;

@Repository
public class SolicitudDao implements ISolicitudDao {

    @Autowired
    private DSLContext create;
    private ISolicitudDao iSolicitudDao;

    /**
     * Consulta todos los Solicituds por estado activo
     *
     * @return Listado SolicitudDto
     */
    @Override
    public List<TabSolicitudDto> getAll() {
        return create.selectFrom(TAB_SOLICITUD)
                //.where(TAB_SOLICITUD.ESTADO.eq(EstadoEnum.A.name()))
                .fetchInto(TabSolicitudDto.class);
    }

    /**
     * Consulta Solicitud por identificador
     *
     * @return SolicitudDto
     */
    @Override
    public TabSolicitudDto getSolicitudById(Long idSolicitud) {
        return create.selectFrom(TAB_SOLICITUD)
                .where(TAB_SOLICITUD.ID_SOLICITUD.eq(idSolicitud))
                .fetchOneInto(TabSolicitudDto.class);
    }

    @Override
    public List<SolicitudCompletaDto> getSolicitudesCompletaByEstado(String estado) {

        var S = TAB_SOLICITUD.as("S");
        var C = TAB_SOL_CONTENEDOR.as("C");
        var SL = TAB_SOL_SELLO_LLEGADA.as("SL");
        var SI = TAB_SOL_SELLO_INSTALADO.as("SI");
        var T = TAB_SOL_TRANSPORTISTA.as("T");
        var P = TAB_SOL_PROCESO.as("P");
        var CP = TAB_SOL_CONTROL_PESO.as("CP");
        var F = TAB_SOL_FINCA.as("F");
        var CA = TAB_SOL_CALIDAD.as("CA");
        var CG = TAB_SOL_CONSOLIDADO_GANCHO.as("CG");

        return create.select(S.ID_SOLICITUD,S.CLIENTE, S.EXPORTADOR)
                .from(S)
                .leftJoin(C).on(S.ID_SOLICITUD.eq(C.ID_SOLICITUD))
                .leftJoin(SL).on(S.ID_SOLICITUD.eq(SL.ID_SOLICITUD))
                .leftJoin(SI).on(S.ID_SOLICITUD.eq(SI.ID_SOLICITUD))
                .leftJoin(T).on(S.ID_SOLICITUD.eq(T.ID_SOLICITUD))
                .leftJoin(P).on(S.ID_SOLICITUD.eq(P.ID_SOLICITUD))
                .leftJoin(CP).on(S.ID_SOLICITUD.eq(CP.ID_SOLICITUD))
                .leftJoin(F).on(S.ID_SOLICITUD.eq(F.ID_SOLICITUD))
                .leftJoin(CA).on(S.ID_SOLICITUD.eq(CA.ID_SOLICITUD))
                .leftJoin(CG).on(S.ID_SOLICITUD.eq(CA.ID_SOLICITUD))
                .where (S.ESTADO.eq(estado))
                .orderBy(S.ID_SOLICITUD.desc())
                .fetchInto(SolicitudCompletaDto.class);
    }

    @Override
    public List<TabSolicitudDto> getSolicitudesByEstado(String estado) {

        var S = TAB_SOLICITUD.as("S");
        return create.selectFrom(S)
                .where (S.ESTADO.eq(estado))
                .orderBy(S.ID_SOLICITUD.desc())
                .fetchInto(TabSolicitudDto.class);
    }

    @Override
    public Long save(TabSolicitudDto solicitud, String estRegSol) {
        if (estRegSol.equals("NUE")) {
            return insert(solicitud);
        } else {
            return update(solicitud);
        }
    }

    private Long insert(TabSolicitudDto solicitud) {
        create.transaction(x -> {
            //solicitud.setIdSolicitud(DSL.using(x).nextval(SEC_SOLICITUD));
            DSL.using(x).newRecord(TAB_SOLICITUD, solicitud).insert();
        });
        return solicitud.getIdSolicitud();
    }

    public Long update(TabSolicitudDto solicitud) {
        create.transaction(x -> {
            DSL.using(x).newRecord(TAB_SOLICITUD, solicitud).update();
        });
        return solicitud.getIdSolicitud();
    }

    @Override
    public void delete(Long solicitudId) {

        var clb = TAB_SOL_CAL_CALIBRE.as("clb");
        create.delete(clb).where(clb.ID_SOL_CALIDAD.in(
                        select(TAB_SOL_CALIDAD.ID_SOL_CALIDAD)
                                .from(TAB_SOL_CALIDAD)
                                .where(TAB_SOL_CALIDAD.ID_SOLICITUD.eq(solicitudId)))).execute();

        var ds = TAB_SOL_CAL_DEFECTO_SELECCION.as("ds");
        create.delete(ds).where(ds.ID_SOL_CALIDAD.in(
                select(TAB_SOL_CALIDAD.ID_SOL_CALIDAD)
                        .from(TAB_SOL_CALIDAD)
                        .where(TAB_SOL_CALIDAD.ID_SOLICITUD.eq(solicitudId)))).execute();

        var pl = TAB_SOL_CAL_PACKING_LIST.as("pl");
        create.delete(pl).where(pl.ID_SOL_CALIDAD.in(
                select(TAB_SOL_CALIDAD.ID_SOL_CALIDAD)
                        .from(TAB_SOL_CALIDAD)
                        .where(TAB_SOL_CALIDAD.ID_SOLICITUD.eq(solicitudId)))).execute();

        var pc = TAB_SOL_CAL_PESO_CLUSTER.as("pc");
        create.delete(pc).where(pc.ID_SOL_CALIDAD.in(
                select(TAB_SOL_CALIDAD.ID_SOL_CALIDAD)
                        .from(TAB_SOL_CALIDAD)
                        .where(TAB_SOL_CALIDAD.ID_SOLICITUD.eq(solicitudId)))).execute();

        var cf = TAB_SOL_CON_CALIBRACION_FRUTA.as("cf");
        create.delete(cf).where(cf.ID_SOL_CONSOLIDADO_GANCHO.in(
                select(TAB_SOL_CONSOLIDADO_GANCHO.ID_SOL_CONSOLIDADO_GANCHO)
                        .from(TAB_SOL_CONSOLIDADO_GANCHO)
                        .where(TAB_SOL_CONSOLIDADO_GANCHO.ID_SOLICITUD.eq(solicitudId)))).execute();

        var con = TAB_SOL_CONTENEDOR.as("con");
        create.delete(con).where(con.ID_SOLICITUD.equal(solicitudId)).execute();

        var ctl = TAB_SOL_CONTROL_PESO.as("ctl");
        create.delete(ctl).where(ctl.ID_SOLICITUD.equal(solicitudId)).execute();

        var fin = TAB_SOL_FINCA.as("fin");
        create.delete(fin).where(fin.ID_SOLICITUD.equal(solicitudId)).execute();

        var pro = TAB_SOL_PROCESO.as("pro");
        create.delete(pro).where(pro.ID_SOLICITUD.equal(solicitudId)).execute();

        var sa = TAB_SOL_SELLO_LLEGADA.as("sa");
        create.delete(sa).where(sa.ID_SOLICITUD.equal(solicitudId)).execute();

        var si = TAB_SOL_SELLO_INSTALADO.as("si");
        create.delete(si).where(si.ID_SOLICITUD.equal(solicitudId)).execute();

        var tra = TAB_SOL_TRANSPORTISTA.as("tra");
        create.delete(tra).where(tra.ID_SOLICITUD.equal(solicitudId)).execute();

        var cal = TAB_SOL_CALIDAD.as("cal");
        create.delete(cal).where(cal.ID_SOLICITUD.equal(solicitudId)).execute();

        var cg = TAB_SOL_CONSOLIDADO_GANCHO.as("cg");
        create.delete(cg).where(cg.ID_SOLICITUD.equal(solicitudId)).execute();

        var ima = TAB_SOL_IMAGEN.as("cg");
        create.delete(cg).where(cg.ID_SOLICITUD.equal(solicitudId)).execute();

        var s = TAB_SOLICITUD.as("s");
        create.delete(s).where(s.ID_SOLICITUD.equal(solicitudId)).execute();
    }
    @Override
    public void updateEstado(Long solicitudId, String estado) {

        var p = TAB_SOLICITUD.as("p");
        create.update(p)
                .set(p.ESTADO , estado)
                .set(p.FECHA_MODIFICA, LocalDateTime.now())
                //.set(p.USUARIO_MODIFICA, userId)
                .where(p.ID_SOLICITUD.equal(solicitudId)).execute();
    }

}
