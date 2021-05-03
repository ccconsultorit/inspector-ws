package com.inspector.ws.repositories.impl.sol;

import com.inspector.dto.sol.TabSolCalPackingListDto;
import com.inspector.dto.sol.TabSolConCalibracionFrutaDto;
import com.inspector.dto.sol.TabSolFincaDto;
import com.inspector.ws.db.schema.tables.TabSolConCalibracionFruta;
import com.inspector.ws.repositories.sol.ISolConCalibracionFrutaDao;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

import static com.inspector.ws.db.schema.Sequences.SEC_SOL_CON_CALIBRACION_FRUTA;
import static com.inspector.ws.db.schema.tables.TabSolCalPackingList.TAB_SOL_CAL_PACKING_LIST;
import static com.inspector.ws.db.schema.tables.TabSolConCalibracionFruta.TAB_SOL_CON_CALIBRACION_FRUTA;

@Repository
public class SolConCalibracionFrutaDao implements ISolConCalibracionFrutaDao {

    @Autowired
    private DSLContext create;

    @Override
    public List<TabSolConCalibracionFrutaDto> getSolConCalibracionFrutaXIdSolCon(Long idSolConsolidadoGancho) {
        return create.selectFrom(TAB_SOL_CON_CALIBRACION_FRUTA)
                .where(TAB_SOL_CON_CALIBRACION_FRUTA.ID_SOL_CONSOLIDADO_GANCHO.eq(idSolConsolidadoGancho))
                .and(TAB_SOL_CON_CALIBRACION_FRUTA.ESTADO.eq("A"))
                .fetchInto(TabSolConCalibracionFrutaDto.class);
    }

    @Override
    public TabSolConCalibracionFrutaDto getSolConCalibracionFrutaXId(Long idSonConCalibracionFruta) {
        return create.selectFrom(TAB_SOL_CON_CALIBRACION_FRUTA)
                .where(TAB_SOL_CON_CALIBRACION_FRUTA.ID_SOL_CON_CALIBRACION_FRUTA.eq(idSonConCalibracionFruta))
                .fetchOneInto(TabSolConCalibracionFrutaDto.class);
    }

    @Override
    public TabSolConCalibracionFrutaDto save(TabSolConCalibracionFrutaDto objeto, String estReg) {
        if (estReg.equals("NUE")) {
            return insert(objeto);
        } else if (estReg.equals("MOD")){
            return update(objeto);
        } else
            return null;
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

    @Override
    public void eliminarSolConCalibracionFruta(Long idSolConCalibracionFruta) {

        var p = TAB_SOL_CON_CALIBRACION_FRUTA.as("p");
        create.update(p)
                .set(p.ESTADO , "I")
                .set(p.FECHA_MODIFICA, LocalDateTime.now())
                .where(p.ID_SOL_CON_CALIBRACION_FRUTA.equal(idSolConCalibracionFruta)).execute();
    }
}
