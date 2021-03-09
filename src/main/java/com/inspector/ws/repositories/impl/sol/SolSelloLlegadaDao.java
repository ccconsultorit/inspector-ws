package com.inspector.ws.repositories.impl.sol;

import com.inspector.dto.sol.SolSelloLlegadaDto;
import com.inspector.ws.repositories.sol.ISolSelloLlegadaDao;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.inspector.ws.db.schema.Sequences.SEC_SOL_SELLO_LLEGADA;
import static com.inspector.ws.db.schema.tables.TabSolSelloLlegada.TAB_SOL_SELLO_LLEGADA;

@Repository
public class SolSelloLlegadaDao implements ISolSelloLlegadaDao {

    @Autowired
    private DSLContext create;
    private ISolSelloLlegadaDao iSolSelloLlegadaDao;

    @Override
    public SolSelloLlegadaDto save(SolSelloLlegadaDto solSelloLlegada) {
        if (solSelloLlegada.getIdSolSelloLlegada() == 0) {
            return insert(solSelloLlegada);
        } else {
            return update(solSelloLlegada);
        }
    }

    private SolSelloLlegadaDto insert(SolSelloLlegadaDto solSelloLlegada) {
        create.transaction(x -> {
            solSelloLlegada.setIdSolSelloLlegada(DSL.using(x).nextval(SEC_SOL_SELLO_LLEGADA));
            DSL.using(x).newRecord(TAB_SOL_SELLO_LLEGADA, solSelloLlegada).insert();
        });
        return solSelloLlegada;
    }

    public SolSelloLlegadaDto update(SolSelloLlegadaDto solSelloLlegada) {
        create.transaction(x -> {
            DSL.using(x).newRecord(TAB_SOL_SELLO_LLEGADA, solSelloLlegada).update();
        });
        return solSelloLlegada;
    }


}
