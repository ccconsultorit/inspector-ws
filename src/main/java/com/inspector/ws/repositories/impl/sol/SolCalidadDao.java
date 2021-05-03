package com.inspector.ws.repositories.impl.sol;

import com.inspector.dto.sol.TabSolCalidadDto;
import com.inspector.dto.sol.TabSolFincaDto;
import com.inspector.dto.sol.TabSolicitudDto;
import com.inspector.enumaraciones.EstadoEnum;
import com.inspector.ws.repositories.sol.ISolCalidadDao;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

import static com.inspector.ws.db.schema.Sequences.SEC_SOL_CALIDAD;
import static com.inspector.ws.db.schema.tables.TabSolCalidad.TAB_SOL_CALIDAD;
import static com.inspector.ws.db.schema.tables.TabSolicitud.TAB_SOLICITUD;

@Repository
public class SolCalidadDao implements ISolCalidadDao {

    @Autowired
    private DSLContext create;
    private ISolCalidadDao iSolCalidadDao;

    @Override
    public List<TabSolCalidadDto> getSolCalidadXIdSolicitud(Long idSolicitud) {
        return create.selectFrom(TAB_SOL_CALIDAD)
                .where(TAB_SOL_CALIDAD.ID_SOLICITUD.eq(idSolicitud))
                .and(TAB_SOL_CALIDAD.ESTADO.eq("A"))
                .fetchInto(TabSolCalidadDto.class);
    }

    @Override
    public TabSolCalidadDto getSolCalidadXId(Long idSolCalidad) {
        return create.selectFrom(TAB_SOL_CALIDAD)
                .where(TAB_SOL_CALIDAD.ID_SOL_CALIDAD.eq(idSolCalidad))
                .fetchOneInto(TabSolCalidadDto.class);
    }

    @Override
    public void eliminarSolCalidad(Long idSolCalidad) {

        var p = TAB_SOL_CALIDAD.as("p");
        create.update(p)
                .set(p.ESTADO , "I")
                .set(p.FECHA_MODIFICA, LocalDateTime.now())
                .where(p.ID_SOL_CALIDAD.equal(idSolCalidad)).execute();
    }

    @Override
    public TabSolCalidadDto save(TabSolCalidadDto objeto, String estReg) {
        if (estReg.equals("NUE")) {
            return insert(objeto);
        } else if (estReg.equals("MOD")){
            return update(objeto);
        } else
            return null;
    }

    private TabSolCalidadDto insert(TabSolCalidadDto solCalidad) {
        create.transaction(x -> {
            solCalidad.setIdSolCalidad(DSL.using(x).nextval(SEC_SOL_CALIDAD));
            DSL.using(x).newRecord(TAB_SOL_CALIDAD, solCalidad).insert();
        });
        return solCalidad;
    }

    public TabSolCalidadDto update(TabSolCalidadDto solCalidad) {
        create.transaction(x -> {
            DSL.using(x).newRecord(TAB_SOL_CALIDAD, solCalidad).update();
        });
        return solCalidad;
    }


}
