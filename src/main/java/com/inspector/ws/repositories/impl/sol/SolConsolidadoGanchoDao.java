package com.inspector.ws.repositories.impl.sol;

import com.inspector.dto.sol.TabSolConsolidadoGanchoDto;
import com.inspector.dto.sol.TabSolFincaDto;
import com.inspector.ws.repositories.sol.ISolConsolidadoGanchoDao;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.inspector.ws.db.schema.Sequences.SEC_SOL_CONSOLIDADO_GANCHO;
import static com.inspector.ws.db.schema.tables.TabSolConsolidadoGancho.TAB_SOL_CONSOLIDADO_GANCHO;

@Repository
public class SolConsolidadoGanchoDao implements ISolConsolidadoGanchoDao {

    @Autowired
    private DSLContext create;
    private ISolConsolidadoGanchoDao iSolConsolidadoGanchoDao;

    @Override
    public TabSolConsolidadoGanchoDto save(TabSolConsolidadoGanchoDto solConsolidadoGancho, String estReg) {
        if (estReg.equals("NUE")) {
            return insert(solConsolidadoGancho);
        } else {
            return update(solConsolidadoGancho);
        }
    }

    private TabSolConsolidadoGanchoDto insert(TabSolConsolidadoGanchoDto solConsolidadoGancho) {
        create.transaction(x -> {
            solConsolidadoGancho.setIdSolConsolidadoGancho(DSL.using(x).nextval(SEC_SOL_CONSOLIDADO_GANCHO));
            DSL.using(x).newRecord(TAB_SOL_CONSOLIDADO_GANCHO, solConsolidadoGancho).insert();
        });
        return solConsolidadoGancho;
    }

    public TabSolConsolidadoGanchoDto update(TabSolConsolidadoGanchoDto solConsolidadoGancho) {
        create.transaction(x -> {
            DSL.using(x).newRecord(TAB_SOL_CONSOLIDADO_GANCHO, solConsolidadoGancho).update();
        });
        return solConsolidadoGancho;
    }


}
