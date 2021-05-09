package com.inspector.ws.repositories.impl.sol;

import com.inspector.dto.sol.SolImagenDto;
import com.inspector.dto.sol.TabSolImagenDto;
import com.inspector.enumaraciones.EstadoEnum;
import com.inspector.ws.repositories.sol.ISolImagenDao;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;


import static com.inspector.ws.db.schema.Sequences.SEC_SOL_IMAGEN;
import static com.inspector.ws.db.schema.tables.TabSolConCalibracionFruta.TAB_SOL_CON_CALIBRACION_FRUTA;
import static com.inspector.ws.db.schema.tables.TabSolImagen.TAB_SOL_IMAGEN;
import static com.inspector.ws.db.schema.tables.TabSolicitud.TAB_SOLICITUD;


@Repository
public class SolImagenDao implements ISolImagenDao {

    @Autowired
    private DSLContext create;

    @Override
    public List<TabSolImagenDto> getAll() {
        return create.select().from(TAB_SOL_IMAGEN)
                .where(TAB_SOL_IMAGEN.ESTADO.eq(EstadoEnum.A.name()))
                .fetchInto(TabSolImagenDto.class);
    };

    @Override
    public TabSolImagenDto getSolImagenById(Long id) {
        var a = TAB_SOL_IMAGEN.as("a");
        return create.select().from(a)
                .where(a.ESTADO.eq(EstadoEnum.A.name()))
                .and(a.ID_SOL_IMAGEN.eq(id))
                .fetchOneInto(TabSolImagenDto.class);
    }

    @Override
    public List<TabSolImagenDto> getSolImagenesByIdSolicitud(Long idSolicitud, String seccion) {
        var a = TAB_SOL_IMAGEN.as("a");

        if (seccion.equals("Solicitud")) {
            return create.select().from(a)
                    .where(a.ESTADO.eq(EstadoEnum.A.name()))
                    .and(a.ID_SOLICITUD.eq(idSolicitud))
                    .and(a.ID_SOL_CAL_PACKING_LIST.eq(0l))
                    .and(a.ID_SOL_CALIDAD.eq(0l))
                    .and(a.ID_SOL_CONSOLIDADO_GANCHO.eq(0l))
                    .and(a.ID_SOL_CONTENEDOR.eq(0l))
                    .and(a.ID_SOL_CONTROL_PESO.eq(0l))
                    .and(a.ID_SOL_FINCA.eq(0l))
                    .and(a.ID_SOL_PROCESO.eq(0l))
                    .and(a.ID_SOL_SELLO_INSTALADO.eq(0l))
                    .and(a.ID_SOL_SELLO_LLEGADA.eq(0l))
                    .and(a.ID_SOL_TRANSPORTISTA.eq(0l))
                    .fetchInto(TabSolImagenDto.class);
        }else if(seccion.equals("SolCalPackingList")){
            return create.select().from(a)
                    .where(a.ESTADO.eq(EstadoEnum.A.name()))
                    .and(a.ID_SOLICITUD.eq(idSolicitud))
                    .and(a.ID_SOL_CAL_PACKING_LIST.notEqual(0l))
                    .fetchInto(TabSolImagenDto.class);
        }else if(seccion.equals("Calidad")){
            return create.select().from(a)
                    .where(a.ESTADO.eq(EstadoEnum.A.name()))
                    .and(a.ID_SOLICITUD.eq(idSolicitud))
                    .and(a.ID_SOL_CALIDAD.notEqual(0l))
                    .fetchInto(TabSolImagenDto.class);
        }else if(seccion.equals("SolConsolidadoGancho")){
            return create.select().from(a)
                    .where(a.ESTADO.eq(EstadoEnum.A.name()))
                    .and(a.ID_SOLICITUD.eq(idSolicitud))
                    .and(a.ID_SOL_CONSOLIDADO_GANCHO.notEqual(0l))
                    .fetchInto(TabSolImagenDto.class);
        }else if(seccion.equals("SolContenedor")){
            return create.select().from(a)
                    .where(a.ESTADO.eq(EstadoEnum.A.name()))
                    .and(a.ID_SOLICITUD.eq(idSolicitud))
                    .and(a.ID_SOL_CONTENEDOR.notEqual(0l))
                    .fetchInto(TabSolImagenDto.class);
        }else if(seccion.equals("SolControlPeso")){
            return create.select().from(a)
                    .where(a.ESTADO.eq(EstadoEnum.A.name()))
                    .and(a.ID_SOLICITUD.eq(idSolicitud))
                    .and(a.ID_SOL_CONTROL_PESO.notEqual(0l))
                    .fetchInto(TabSolImagenDto.class);
        }else if(seccion.equals("SolFinca")){
            return create.select().from(a)
                    .where(a.ESTADO.eq(EstadoEnum.A.name()))
                    .and(a.ID_SOLICITUD.eq(idSolicitud))
                    .and(a.ID_SOL_FINCA.notEqual(0l))
                    .fetchInto(TabSolImagenDto.class);
        }else if(seccion.equals("SolProceso")){
            return create.select().from(a)
                    .where(a.ESTADO.eq(EstadoEnum.A.name()))
                    .and(a.ID_SOLICITUD.eq(idSolicitud))
                    .and(a.ID_SOL_PROCESO.notEqual(0l))
                    .fetchInto(TabSolImagenDto.class);
        }else if(seccion.equals("SolSelloInstalado")){
            return create.select().from(a)
                    .where(a.ESTADO.eq(EstadoEnum.A.name()))
                    .and(a.ID_SOLICITUD.eq(idSolicitud))
                    .and(a.ID_SOL_SELLO_INSTALADO.notEqual(0l))
                    .fetchInto(TabSolImagenDto.class);
        }else if(seccion.equals("SolSelloLlegada")){
            return create.select().from(a)
                    .where(a.ESTADO.eq(EstadoEnum.A.name()))
                    .and(a.ID_SOLICITUD.eq(idSolicitud))
                    .and(a.ID_SOL_SELLO_LLEGADA.notEqual(0l))
                    .fetchInto(TabSolImagenDto.class);
        }else if(seccion.equals("SolTransportista")){
            return create.select().from(a)
                    .where(a.ESTADO.eq(EstadoEnum.A.name()))
                    .and(a.ID_SOLICITUD.eq(idSolicitud))
                    .and(a.ID_SOL_TRANSPORTISTA.notEqual(0l))
                    .fetchInto(TabSolImagenDto.class);
        }
        return null;
    }

    @Override
    public void delete(Long idSolicitud) {

        var p = TAB_SOL_IMAGEN.as("p");
        create.update(p)
                .set(p.ESTADO , EstadoEnum.I.name())
                .set(p.FECHA_MODIFICA, LocalDateTime.now())
                //.set(p.USUARIO_MODIFICA, userId)
                .where(p.ID_SOLICITUD.equal(idSolicitud)).execute();
    }

    @Override
    public void updateEstado(Long idSolImagen, String estado) {

        var p = TAB_SOL_IMAGEN.as("p");
        create.update(p)
                .set(p.ESTADO , estado)
                .set(p.FECHA_MODIFICA, LocalDateTime.now())
                //.set(p.USUARIO_MODIFICA, userId)
                .where(p.ID_SOL_IMAGEN.equal(idSolImagen)).execute();
    }

    @Override
    public TabSolImagenDto save(TabSolImagenDto solImagen, String estReg) {
        if (estReg.equals("NUE")) {
            return insert(solImagen);
        } else if (estReg.equals("MOD")){
            return update(solImagen);
        } else
            return null;
    }
    private TabSolImagenDto insert(TabSolImagenDto solImagen) {
        create.transaction(x -> {
            solImagen.setIdSolImagen(DSL.using(x).nextval(SEC_SOL_IMAGEN));
            DSL.using(x).newRecord(TAB_SOL_IMAGEN, solImagen).insert();
        });
        return solImagen;
    }

    public TabSolImagenDto update(TabSolImagenDto solImagen) {
        //create.transaction(x -> {
        //    DSL.using(x).newRecord(TAB_SOL_IMAGEN, solImagen).update();
        //});
        updateEstado(solImagen.getIdSolImagen(), "A");
        return solImagen;
    }

    @Override
    public void eliminarSolImagen(Long idSolImagen) {

        var p = TAB_SOL_IMAGEN.as("p");
        create.delete(p)
                .where(p.ID_SOL_IMAGEN.equal(idSolImagen)).execute();
    }}
