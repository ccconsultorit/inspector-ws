package com.inspector.ws.repositories.impl.sol;

import com.inspector.dto.sol.TabSolControlPesoDto;
import com.inspector.dto.sol.TabSolProcesoDto;
import com.inspector.ws.repositories.sol.ISolControlPesoDao;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.inspector.ws.db.schema.Sequences.SEC_SOL_CONTROL_PESO;
import static com.inspector.ws.db.schema.tables.TabSolControlPeso.TAB_SOL_CONTROL_PESO;

@Repository
public class SolControlPesoDao implements ISolControlPesoDao {

    @Autowired
    private DSLContext create;
    private ISolControlPesoDao iSolControlPesoDao;

    @Override
    public TabSolControlPesoDto save(TabSolControlPesoDto solControlPeso, String estReg) {
        if (estReg.equals("NUE")) {
            return insert(solControlPeso);
        } else {
            return update(solControlPeso);
        }
    }

    private TabSolControlPesoDto insert(TabSolControlPesoDto solControlPeso) {
        create.transaction(x -> {
            solControlPeso.setIdSolControlPeso(DSL.using(x).nextval(SEC_SOL_CONTROL_PESO));
            DSL.using(x).newRecord(TAB_SOL_CONTROL_PESO, solControlPeso).insert();
        });
        return solControlPeso;
    }

    public TabSolControlPesoDto update(TabSolControlPesoDto solControlPeso) {
        create.transaction(x -> {
            DSL.using(x).newRecord(TAB_SOL_CONTROL_PESO, solControlPeso).update();
        });
        return solControlPeso;
    }


}
