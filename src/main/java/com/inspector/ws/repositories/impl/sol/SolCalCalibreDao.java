package com.inspector.ws.repositories.impl.sol;

import com.inspector.dto.sol.TabSolCalCalibreDto;
import com.inspector.dto.sol.TabSolCalDefectoSeleccionDto;
import com.inspector.dto.sol.TabSolCalidadDto;
import com.inspector.ws.repositories.sol.ISolCalCalibreDao;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.inspector.ws.db.schema.Sequences.SEC_SOL_CAL_CALIBRE;
import static com.inspector.ws.db.schema.tables.TabSolCalCalibre.TAB_SOL_CAL_CALIBRE;
import static com.inspector.ws.db.schema.tables.TabSolCalidad.TAB_SOL_CALIDAD;

@Repository
public class SolCalCalibreDao implements ISolCalCalibreDao {

    @Autowired
    private DSLContext create;

    @Override
    public TabSolCalCalibreDto getSolCalCalibreXIdSolCalidad(Long idSolCalidad) {
        return create.selectFrom(TAB_SOL_CAL_CALIBRE)
                .where(TAB_SOL_CAL_CALIBRE.ID_SOL_CALIDAD.eq(idSolCalidad))
                .fetchOneInto(TabSolCalCalibreDto.class);
    }

    @Override
    public TabSolCalCalibreDto save(TabSolCalCalibreDto objeto, String estReg) {
        if (estReg.equals("NUE")) {
            return insert(objeto);
        } else if (estReg.equals("MOD")){
            return update(objeto);
        } else
            return null;
    }

    private TabSolCalCalibreDto insert(TabSolCalCalibreDto solCalCalibre) {
        create.transaction(x -> {
            solCalCalibre.setIdSolCalCalibre(DSL.using(x).nextval(SEC_SOL_CAL_CALIBRE));
            DSL.using(x).newRecord(TAB_SOL_CAL_CALIBRE, solCalCalibre).insert();
        });
        return solCalCalibre;
    }

    public TabSolCalCalibreDto update(TabSolCalCalibreDto solCalCalibre) {
        create.transaction(x -> {
            DSL.using(x).newRecord(TAB_SOL_CAL_CALIBRE, solCalCalibre).update();
        });
        return solCalCalibre;
    }


}
