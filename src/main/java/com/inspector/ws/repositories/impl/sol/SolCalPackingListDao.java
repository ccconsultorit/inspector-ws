package com.inspector.ws.repositories.impl.sol;

import com.inspector.dto.sol.TabSolCalPackingListDto;
import com.inspector.dto.sol.TabSolCalPesoClusterDto;
import com.inspector.ws.repositories.sol.ISolCalPackingListDao;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.inspector.ws.db.schema.Sequences.SEC_SOL_CAL_PACKING_LIST;
import static com.inspector.ws.db.schema.tables.TabSolCalPackingList.TAB_SOL_CAL_PACKING_LIST;

@Repository
public class SolCalPackingListDao implements ISolCalPackingListDao {

    @Autowired
    private DSLContext create;

    @Override
    public TabSolCalPackingListDto save(TabSolCalPackingListDto solCalPackingList, String estReg) {
        if (estReg.equals("NUE")) {
            return insert(solCalPackingList);
        } else {
            return update(solCalPackingList);
        }
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
