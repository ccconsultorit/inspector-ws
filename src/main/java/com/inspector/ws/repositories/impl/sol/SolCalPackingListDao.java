package com.inspector.ws.repositories.impl.sol;

import com.inspector.dto.sol.TabSolCalDefectoSeleccionDto;
import com.inspector.dto.sol.TabSolCalPackingListDto;
import com.inspector.dto.sol.TabSolCalPesoClusterDto;
import com.inspector.ws.repositories.sol.ISolCalPackingListDao;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.inspector.ws.db.schema.Sequences.SEC_SOL_CAL_PACKING_LIST;
import static com.inspector.ws.db.schema.tables.TabSolCalDefectoSeleccion.TAB_SOL_CAL_DEFECTO_SELECCION;
import static com.inspector.ws.db.schema.tables.TabSolCalPackingList.TAB_SOL_CAL_PACKING_LIST;
import static com.inspector.ws.db.schema.tables.TabSolCalPesoCluster.TAB_SOL_CAL_PESO_CLUSTER;

@Repository
public class SolCalPackingListDao implements ISolCalPackingListDao {

    @Autowired
    private DSLContext create;

    @Override
    public List<TabSolCalPackingListDto> getSolCalPackingListXIdSolCalidad(Long idSolCalidad) {
        return create.selectFrom(TAB_SOL_CAL_PACKING_LIST)
                .where(TAB_SOL_CAL_PACKING_LIST.ID_SOL_CALIDAD.eq(idSolCalidad))
                .fetchInto(TabSolCalPackingListDto.class);
    }

    @Override
    public TabSolCalPackingListDto getSolCalPackingListXId(Long idSolCalPackingList) {
        return create.selectFrom(TAB_SOL_CAL_PACKING_LIST)
                .where(TAB_SOL_CAL_PACKING_LIST.ID_SOL_CAL_PACKING_LIST.eq(idSolCalPackingList))
                .fetchOneInto(TabSolCalPackingListDto.class);
    }

    @Override
    public TabSolCalPackingListDto save(TabSolCalPackingListDto objeto, String estReg) {
        if (estReg.equals("NUE")) {
            return insert(objeto);
        } else if (estReg.equals("MOD")){
            return update(objeto);
        } else
            return null;
    }

    private TabSolCalPackingListDto insert(TabSolCalPackingListDto solCalPackingList) {
        create.transaction(x -> {
            solCalPackingList.setIdSolCalPackingList(DSL.using(x).nextval(SEC_SOL_CAL_PACKING_LIST));
            DSL.using(x).newRecord(TAB_SOL_CAL_PACKING_LIST, solCalPackingList).insert();
        });
        return solCalPackingList;
    }

    public TabSolCalPackingListDto update(TabSolCalPackingListDto solCalPackingList) {
        create.transaction(x -> {
            DSL.using(x).newRecord(TAB_SOL_CAL_PACKING_LIST, solCalPackingList).update();
        });
        return solCalPackingList;
    }


}
