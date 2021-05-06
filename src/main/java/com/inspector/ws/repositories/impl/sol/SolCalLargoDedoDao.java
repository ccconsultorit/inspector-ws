package com.inspector.ws.repositories.impl.sol;

import com.inspector.dto.sol.TabSolCalCalibreDto;
import com.inspector.dto.sol.TabSolCalLargoDedoDto;
import com.inspector.dto.sol.TabSolFincaDto;
import com.inspector.ws.repositories.sol.ISolCalLargoDedoDao;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.inspector.ws.db.schema.Sequences.SEC_SOL_CAL_LARGO_DEDO;
import static com.inspector.ws.db.schema.tables.TabSolCalCalibre.TAB_SOL_CAL_CALIBRE;
import static com.inspector.ws.db.schema.tables.TabSolCalLargoDedo.TAB_SOL_CAL_LARGO_DEDO;

@Repository
public class SolCalLargoDedoDao implements ISolCalLargoDedoDao {

    @Autowired
    private DSLContext create;

    @Override
    public TabSolCalLargoDedoDto getSolCalLargoDedoXIdSolCalidad(Long idSolCalidad) {
        return create.selectFrom(TAB_SOL_CAL_LARGO_DEDO)
                .where(TAB_SOL_CAL_LARGO_DEDO.ID_SOL_CALIDAD.eq(idSolCalidad))
                .fetchOneInto(TabSolCalLargoDedoDto.class);
    }

    @Override
    public TabSolCalLargoDedoDto save(TabSolCalLargoDedoDto objeto, String estReg) {
        if (estReg.equals("NUE")) {
            return insert(objeto);
        } else if (estReg.equals("MOD")){
            return update(objeto);
        } else
            return null;
    }

    private TabSolCalLargoDedoDto insert(TabSolCalLargoDedoDto solCalLargoDedo) {
        create.transaction(x -> {
            solCalLargoDedo.setIdSolCalLargoDedo(DSL.using(x).nextval(SEC_SOL_CAL_LARGO_DEDO));
            DSL.using(x).newRecord(TAB_SOL_CAL_LARGO_DEDO, solCalLargoDedo).insert();
        });
        return solCalLargoDedo;
    }

    public TabSolCalLargoDedoDto update(TabSolCalLargoDedoDto solCalLargoDedo) {
        create.transaction(x -> {
            DSL.using(x).newRecord(TAB_SOL_CAL_LARGO_DEDO, solCalLargoDedo).update();
        });
        return solCalLargoDedo;
    }


}
