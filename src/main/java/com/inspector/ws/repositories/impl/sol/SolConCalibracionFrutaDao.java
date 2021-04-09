package com.inspector.ws.repositories.impl.sol;

import com.inspector.dto.sol.TabSolConCalibracionFrutaDto;
import com.inspector.dto.sol.TabSolFincaDto;
import com.inspector.ws.repositories.sol.ISolConCalibracionFrutaDao;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.inspector.ws.db.schema.Sequences.SEC_SOL_CON_CALIBRACION_FRUTA;
import static com.inspector.ws.db.schema.tables.TabSolConCalibracionFruta.TAB_SOL_CON_CALIBRACION_FRUTA;

@Repository
public class SolConCalibracionFrutaDao implements ISolConCalibracionFrutaDao {

    @Autowired
    private DSLContext create;

    @Override
    public TabSolConCalibracionFrutaDto save(TabSolConCalibracionFrutaDto solConCalibracionFruta, String estReg) {
        if (estReg.equals("NUE")) {
            return insert(solConCalibracionFruta);
        } else {
            return update(solConCalibracionFruta);
        }
    }

    private TabSolConCalibracionFrutaDto insert(TabSolConCalibracionFrutaDto solConCalibracionFruta) {
        create.transaction(x -> {
            solConCalibracionFruta.setIdSolConCalibracionFruta(DSL.using(x).nextval(SEC_SOL_CON_CALIBRACION_FRUTA));
            DSL.using(x).newRecord(TAB_SOL_CON_CALIBRACION_FRUTA, solConCalibracionFruta).insert();
        });
        return solConCalibracionFruta;
    }

    public TabSolConCalibracionFrutaDto update(TabSolConCalibracionFrutaDto solConCalibracionFruta) {
        create.transaction(x -> {
            DSL.using(x).newRecord(TAB_SOL_CON_CALIBRACION_FRUTA, solConCalibracionFruta).update();
        });
        return solConCalibracionFruta;
    }


}
