package com.inspector.ws.repositories.impl.sol;

import com.inspector.dto.sol.TabSolCalDefectoSeleccionDto;
import com.inspector.dto.sol.TabSolCalPesoClusterDto;
import com.inspector.dto.sol.TabSolCalidadDto;
import com.inspector.dto.sol.TabSolFincaDto;
import com.inspector.ws.repositories.sol.ISolCalPesoClusterDao;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.inspector.ws.db.schema.Sequences.SEC_SOL_CAL_PESO_CLUSTER;
import static com.inspector.ws.db.schema.tables.TabSolCalDefectoSeleccion.TAB_SOL_CAL_DEFECTO_SELECCION;
import static com.inspector.ws.db.schema.tables.TabSolCalPesoCluster.TAB_SOL_CAL_PESO_CLUSTER;
import static com.inspector.ws.db.schema.tables.TabSolCalidad.TAB_SOL_CALIDAD;

@Repository
public class SolCalPesoClusterDao implements ISolCalPesoClusterDao {

    @Autowired
    private DSLContext create;

    @Override
    public List<TabSolCalPesoClusterDto> getSolCalPesoClusterXIdSolCalidad(Long idSolCalidad) {
        return create.selectFrom(TAB_SOL_CAL_PESO_CLUSTER)
                .where(TAB_SOL_CAL_PESO_CLUSTER.ID_SOL_CALIDAD.eq(idSolCalidad))
                .fetchInto(TabSolCalPesoClusterDto.class);
    }

    @Override
    public TabSolCalPesoClusterDto getSolCalPesoClusterXId(Long idSolCalPesoCluster) {
        return create.selectFrom(TAB_SOL_CAL_PESO_CLUSTER)
                .where(TAB_SOL_CAL_PESO_CLUSTER.ID_SOL_CAL_PESO_CLUSTER.eq(idSolCalPesoCluster))
                .fetchOneInto(TabSolCalPesoClusterDto.class);
    }

    @Override
    public TabSolCalPesoClusterDto save(TabSolCalPesoClusterDto objeto, String estReg) {
        if (estReg.equals("NUE")) {
            return insert(objeto);
        } else if (estReg.equals("MOD")){
            return update(objeto);
        } else
            return null;
    }

    private TabSolCalPesoClusterDto insert(TabSolCalPesoClusterDto solCalPesoCluster) {
        create.transaction(x -> {
            solCalPesoCluster.setIdSolCalPesoCluster(DSL.using(x).nextval(SEC_SOL_CAL_PESO_CLUSTER));
            DSL.using(x).newRecord(TAB_SOL_CAL_PESO_CLUSTER, solCalPesoCluster).insert();
        });
        return solCalPesoCluster;
    }

    public TabSolCalPesoClusterDto update(TabSolCalPesoClusterDto solCalPesoCluster) {
        create.transaction(x -> {
            DSL.using(x).newRecord(TAB_SOL_CAL_PESO_CLUSTER, solCalPesoCluster).update();
        });
        return solCalPesoCluster;
    }


}
