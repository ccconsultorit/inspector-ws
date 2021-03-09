package com.inspector.ws.repositories.impl.sol;

import com.inspector.dto.sol.SolFincaDto;
import com.inspector.ws.repositories.sol.ISolFincaDao;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.inspector.ws.db.schema.Sequences.SEC_SOL_FINCA;
import static com.inspector.ws.db.schema.tables.TabSolFinca.TAB_SOL_FINCA;

@Repository
public class SolFincaDao implements ISolFincaDao {

    @Autowired
    private DSLContext create;
    private ISolFincaDao iSolFincaDao;

    @Override
    public SolFincaDto save(SolFincaDto solFinca) {
        if (solFinca.getIdSolFinca() == 0) {
            return insert(solFinca);
        } else {
            return update(solFinca);
        }
    }

    private SolFincaDto insert(SolFincaDto solFinca) {
        create.transaction(x -> {
            solFinca.setIdSolFinca(DSL.using(x).nextval(SEC_SOL_FINCA));
            DSL.using(x).newRecord(TAB_SOL_FINCA, solFinca).insert();
        });
        return solFinca;
    }

    public SolFincaDto update(SolFincaDto solFinca) {
        create.transaction(x -> {
            DSL.using(x).newRecord(TAB_SOL_FINCA, solFinca).update();
        });
        return solFinca;
    }


}
