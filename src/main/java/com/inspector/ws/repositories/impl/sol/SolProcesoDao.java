package com.inspector.ws.repositories.impl.sol;

import com.inspector.dto.sol.TabSolProcesoDto;
import com.inspector.dto.sol.TabSolTransportistaDto;
import com.inspector.ws.repositories.sol.ISolProcesoDao;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.inspector.ws.db.schema.Sequences.SEC_SOL_PROCESO;
import static com.inspector.ws.db.schema.tables.TabSolProceso.TAB_SOL_PROCESO;

@Repository
public class SolProcesoDao implements ISolProcesoDao {

    @Autowired
    private DSLContext create;
    private ISolProcesoDao iSolProcesoDao;

    @Override
    public TabSolProcesoDto getSolProcesoById(Long idSolicitud) {
        return create.selectFrom(TAB_SOL_PROCESO)
                .where(TAB_SOL_PROCESO.ID_SOLICITUD.eq(idSolicitud))
                .fetchOneInto(TabSolProcesoDto.class);
    }

    @Override
    public TabSolProcesoDto save(TabSolProcesoDto objeto, String estReg) {
        if (estReg.equals("NUE")) {
            return insert(objeto);
        } else if (estReg.equals("MOD")){
            return update(objeto);
        } else
            return null;
    }

    private TabSolProcesoDto insert(TabSolProcesoDto solProceso) {
        create.transaction(x -> {
            solProceso.setIdSolProceso(DSL.using(x).nextval(SEC_SOL_PROCESO));
            DSL.using(x).newRecord(TAB_SOL_PROCESO, solProceso).insert();
        });
        return solProceso;
    }

    public TabSolProcesoDto update(TabSolProcesoDto solProceso) {
        create.transaction(x -> {
            DSL.using(x).newRecord(TAB_SOL_PROCESO, solProceso).update();
        });
        return solProceso;
    }


}
