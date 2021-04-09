package com.inspector.ws.repositories.impl.sol;

import com.inspector.dto.sol.TabSolConCalibracionFrutaDto;
import com.inspector.ws.repositories.sol.ISolCalibracionFrutaDao;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.inspector.ws.db.schema.Sequences.SEC_SOL_CALIBRACION_FRUTA;
import static com.inspector.ws.db.schema.tables.TabSolConCalibracionFruta.TAB_SOL_CON_CALIBRACION_FRUTA;

@Repository
public class SolCalibracionFrutaDao implements ISolCalibracionFrutaDao {

    @Autowired
    private DSLContext create;
    private ISolCalibracionFrutaDao iSolCalibracionFrutaDao;

    @Override
    public TabSolConCalibracionFrutaDto save(TabSolConCalibracionFrutaDto solCalibracionFruta) {
        if (solCalibracionFruta.getIdSolConCalibracionFruta() == 0) {
            return insert(solCalibracionFruta);
        } else {
            return update(solCalibracionFruta);
        }
    }

    private TabSolConCalibracionFrutaDto insert(TabSolConCalibracionFrutaDto solCalibracionFruta) {
        create.transaction(x -> {
            solCalibracionFruta.setIdSolConCalibracionFruta(DSL.using(x).nextval(SEC_SOL_CALIBRACION_FRUTA));
            DSL.using(x).newRecord(TAB_SOL_CON_CALIBRACION_FRUTA, solCalibracionFruta).insert();
        });
        return solCalibracionFruta;
    }

    public TabSolConCalibracionFrutaDto update(TabSolConCalibracionFrutaDto solCalibracionFruta) {
        create.transaction(x -> {
            DSL.using(x).newRecord(TAB_SOL_CON_CALIBRACION_FRUTA, solCalibracionFruta).update();
        });
        return solCalibracionFruta;
    }


}
