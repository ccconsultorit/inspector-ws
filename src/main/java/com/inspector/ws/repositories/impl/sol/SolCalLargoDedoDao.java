package com.inspector.ws.repositories.impl.sol;

import com.inspector.dto.sol.SolCalLargoDedoDto;
import com.inspector.ws.repositories.sol.ISolCalLargoDedoDao;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.inspector.ws.db.schema.Sequences.SEC_SOL_CAL_LARGO_DEDO;
import static com.inspector.ws.db.schema.tables.TabSolCalLargoDedo.TAB_SOL_CAL_LARGO_DEDO;

@Repository
public class SolCalLargoDedoDao implements ISolCalLargoDedoDao {

    @Autowired
    private DSLContext create;

    @Override
    public SolCalLargoDedoDto save(SolCalLargoDedoDto solCalLargoDedo) {
        if (solCalLargoDedo.getIdSolCalLargoDedo() == 0) {
            return insert(solCalLargoDedo);
        } else {
            return update(solCalLargoDedo);
        }
    }

    private SolCalLargoDedoDto insert(SolCalLargoDedoDto solCalLargoDedo) {
        create.transaction(x -> {
            solCalLargoDedo.setIdSolCalLargoDedo(DSL.using(x).nextval(SEC_SOL_CAL_LARGO_DEDO));
            DSL.using(x).newRecord(TAB_SOL_CAL_LARGO_DEDO, solCalLargoDedo).insert();
        });
        return solCalLargoDedo;
    }

    public SolCalLargoDedoDto update(SolCalLargoDedoDto solCalLargoDedo) {
        create.transaction(x -> {
            DSL.using(x).newRecord(TAB_SOL_CAL_LARGO_DEDO, solCalLargoDedo).update();
        });
        return solCalLargoDedo;
    }


}
