package com.inspector.ws.repositories.impl.sol;

import com.inspector.dto.sol.TabSolControlPesoDto;
import com.inspector.dto.sol.TabSolFincaDto;
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
    public TabSolFincaDto getSolFincaById(Long idSolicitud) {
        return create.selectFrom(TAB_SOL_FINCA)
                .where(TAB_SOL_FINCA.ID_SOLICITUD.eq(idSolicitud))
                .fetchOneInto(TabSolFincaDto.class);
    }

    @Override
    public TabSolFincaDto save(TabSolFincaDto objeto, String estReg) {
        if (estReg.equals("NUE")) {
            return insert(objeto);
        } else if (estReg.equals("MOD")){
            return update(objeto);
        } else
            return null;
    }

    private TabSolFincaDto insert(TabSolFincaDto solFinca) {
        create.transaction(x -> {
            solFinca.setIdSolFinca(DSL.using(x).nextval(SEC_SOL_FINCA));
            DSL.using(x).newRecord(TAB_SOL_FINCA, solFinca).insert();
        });
        return solFinca;
    }

    public TabSolFincaDto update(TabSolFincaDto solFinca) {
        create.transaction(x -> {
            DSL.using(x).newRecord(TAB_SOL_FINCA, solFinca).update();
        });
        return solFinca;
    }


}
