package com.inspector.ws.repositories.impl.sol;

import com.inspector.dto.sol.SolImagenDto;
import com.inspector.enumaraciones.EstadoEnum;
import com.inspector.ws.repositories.sol.ISolImagenDao;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;


import static com.inspector.ws.db.schema.Sequences.SEC_SOL_IMAGEN;
import static com.inspector.ws.db.schema.tables.TabSolImagen.TAB_SOL_IMAGEN;
import static com.inspector.ws.db.schema.tables.TabSolicitud.TAB_SOLICITUD;


@Repository
public class SolImagenDao implements ISolImagenDao {

    @Autowired
    private DSLContext create;

    @Override
    public List<SolImagenDto> getAll() {
        return create.select().from(TAB_SOL_IMAGEN)
                .where(TAB_SOL_IMAGEN.ESTADO.eq(EstadoEnum.A.name()))
                .fetchInto(SolImagenDto.class);
    };

    @Override
    public SolImagenDto getSolImagenById(Long id) {
        var a = TAB_SOL_IMAGEN.as("a");
        return create.select().from(a)
                .where(a.ESTADO.eq(EstadoEnum.A.name()))
                .and(a.ID_SOL_IMAGEN.eq(id))
                .fetchOneInto(SolImagenDto.class);
    }

    @Override
    public List<SolImagenDto> getSolImagenesByIdSolicitud(Long idSolicitud) {
        var a = TAB_SOL_IMAGEN.as("a");
        return create.select().from(a)
                .where(a.ESTADO.eq(EstadoEnum.A.name()))
                .and(a.ID_SOLICITUD.eq(idSolicitud))
                .fetchInto(SolImagenDto.class);
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
    public SolImagenDto save(SolImagenDto solImagen) {
        if (solImagen.getIdSolImagen() == 0) {
            return insert(solImagen);
        } else {
            return update(solImagen);
        }
    }

    private SolImagenDto insert(SolImagenDto solImagen) {
        create.transaction(x -> {
            solImagen.setIdSolImagen(DSL.using(x).nextval(SEC_SOL_IMAGEN));
            DSL.using(x).newRecord(TAB_SOL_IMAGEN, solImagen).insert();
        });
        return solImagen;
    }

    public SolImagenDto update(SolImagenDto solImagen) {
        //create.transaction(x -> {
        //    DSL.using(x).newRecord(TAB_SOL_IMAGEN, solImagen).update();
        //});
        updateEstado(solImagen.getIdSolImagen(), "A");
        return solImagen;
    }

}
