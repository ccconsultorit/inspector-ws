package com.inspector.ws.repositories.impl.sol;

import com.inspector.dto.sol.*;
import com.inspector.enumaraciones.EstadoEnum;
import com.inspector.ws.repositories.sol.ISolicitudDao;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
                .where(TAB_SOLICITUD.ESTADO.eq(EstadoEnum.A.name()))
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
    public List<SolicitudCompletaDto> getSolicitudesByEstado(String estado) {

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
        var DS = TAB_SOL_CAL_DEFECTO_SELECCION.as("DS");

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
                .where (S.ESTADO.eq(estado))
                .orderBy(S.ID_SOLICITUD.desc())
                .fetchInto(SolicitudCompletaDto.class);
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

        var p = TAB_SOLICITUD.as("p");
        create.update(p)
                .set(p.ESTADO , EstadoEnum.I.name())
                .set(p.FECHA_MODIFICA, LocalDateTime.now())
                //.set(p.USUARIO_MODIFICA, userId)
                .where(p.ID_SOLICITUD.equal(solicitudId)).execute();
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
