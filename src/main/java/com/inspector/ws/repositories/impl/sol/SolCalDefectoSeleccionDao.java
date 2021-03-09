package com.inspector.ws.repositories.impl.sol;

import com.inspector.dto.sol.SolCalDefectoSeleccionDto;
import com.inspector.ws.repositories.sol.ISolCalDefectoSeleccionDao;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.inspector.ws.db.schema.Sequences.SEC_SOL_DEFECTO_SELECCION;
import static com.inspector.ws.db.schema.tables.TabSolCalDefectoSeleccion.TAB_SOL_CAL_DEFECTO_SELECCION;

@Repository
public class SolCalDefectoSeleccionDao implements ISolCalDefectoSeleccionDao {

    @Autowired
    private DSLContext create;
    private ISolCalDefectoSeleccionDao iSolDefectoSeleccionDao;

    @Override
    public SolCalDefectoSeleccionDto save(SolCalDefectoSeleccionDto solCalDefectoSeleccion) {
        if (solCalDefectoSeleccion.getIdSolCalDefectoSeleccion() == 0) {
            return insert(solCalDefectoSeleccion);
        } else {
            return update(solCalDefectoSeleccion);
        }
    }

    private SolCalDefectoSeleccionDto insert(SolCalDefectoSeleccionDto solDefectoSeleccion) {
        create.transaction(x -> {
            solDefectoSeleccion.setIdSolCalDefectoSeleccion(DSL.using(x).nextval(SEC_SOL_DEFECTO_SELECCION));
            DSL.using(x).newRecord(TAB_SOL_CAL_DEFECTO_SELECCION, solDefectoSeleccion).insert();
        });
        return solDefectoSeleccion;
    }

    public SolCalDefectoSeleccionDto update(SolCalDefectoSeleccionDto solDefectoSeleccion) {
        create.transaction(x -> {
            DSL.using(x).newRecord(TAB_SOL_CAL_DEFECTO_SELECCION, solDefectoSeleccion).update();
        });
        return solDefectoSeleccion;
    }


}
