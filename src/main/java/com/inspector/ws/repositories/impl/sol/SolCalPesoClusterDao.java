package com.inspector.ws.repositories.impl.sol;

import com.inspector.dto.sol.SolCalPesoClusterDto;
import com.inspector.ws.repositories.sol.ISolCalPesoClusterDao;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.inspector.ws.db.schema.Sequences.SEC_SOL_CAL_PESO_CLUSTER;
import static com.inspector.ws.db.schema.tables.TabSolCalPesoCluster.TAB_SOL_CAL_PESO_CLUSTER;

@Repository
public class SolCalPesoClusterDao implements ISolCalPesoClusterDao {

    @Autowired
    private DSLContext create;

    @Override
    public SolCalPesoClusterDto save(SolCalPesoClusterDto solCalPesoCluster) {
        if (solCalPesoCluster.getIdSolCalPesoCluster() == 0) {
            return insert(solCalPesoCluster);
        } else {
            return update(solCalPesoCluster);
        }
    }

    private SolCalPesoClusterDto insert(SolCalPesoClusterDto solCalPesoCluster) {
        create.transaction(x -> {
            solCalPesoCluster.setIdSolCalPesoCluster(DSL.using(x).nextval(SEC_SOL_CAL_PESO_CLUSTER));
            DSL.using(x).newRecord(TAB_SOL_CAL_PESO_CLUSTER, solCalPesoCluster).insert();
        });
        return solCalPesoCluster;
    }

    public SolCalPesoClusterDto update(SolCalPesoClusterDto solCalPesoCluster) {
        create.transaction(x -> {
            DSL.using(x).newRecord(TAB_SOL_CAL_PESO_CLUSTER, solCalPesoCluster).update();
        });
        return solCalPesoCluster;
    }


}
