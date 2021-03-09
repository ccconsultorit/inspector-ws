package com.inspector.ws.repositories.impl.sol;

import com.inspector.dto.sol.SolProcesoDto;
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
    public SolProcesoDto save(SolProcesoDto solProceso) {
        if (solProceso.getIdSolProceso() == 0) {
            return insert(solProceso);
        } else {
            return update(solProceso);
        }
    }

    private SolProcesoDto insert(SolProcesoDto solProceso) {
        create.transaction(x -> {
            solProceso.setIdSolProceso(DSL.using(x).nextval(SEC_SOL_PROCESO));
            DSL.using(x).newRecord(TAB_SOL_PROCESO, solProceso).insert();
        });
        return solProceso;
    }

    public SolProcesoDto update(SolProcesoDto solProceso) {
        create.transaction(x -> {
            DSL.using(x).newRecord(TAB_SOL_PROCESO, solProceso).update();
        });
        return solProceso;
    }


}
