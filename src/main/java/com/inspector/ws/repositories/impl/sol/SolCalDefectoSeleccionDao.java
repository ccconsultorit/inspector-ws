package com.inspector.ws.repositories.impl.sol;

import com.inspector.dto.sol.TabSolCalDefectoSeleccionDto;
import com.inspector.dto.sol.TabSolCalPackingListDto;
import com.inspector.dto.sol.TabSolCalidadDto;
import com.inspector.ws.repositories.sol.ISolCalDefectoSeleccionDao;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.inspector.ws.db.schema.Sequences.SEC_SOL_DEFECTO_SELECCION;
import static com.inspector.ws.db.schema.tables.TabSolCalDefectoSeleccion.TAB_SOL_CAL_DEFECTO_SELECCION;
import static com.inspector.ws.db.schema.tables.TabSolCalPackingList.TAB_SOL_CAL_PACKING_LIST;
import static com.inspector.ws.db.schema.tables.TabSolCalidad.TAB_SOL_CALIDAD;

@Repository
public class SolCalDefectoSeleccionDao implements ISolCalDefectoSeleccionDao {

    @Autowired
    private DSLContext create;
    private ISolCalDefectoSeleccionDao iSolDefectoSeleccionDao;

    @Override
    public TabSolCalDefectoSeleccionDto getSolCalDefectosXId(Long idSolCalDefectoSeleccion) {
        return create.selectFrom(TAB_SOL_CAL_DEFECTO_SELECCION)
                .where(TAB_SOL_CAL_DEFECTO_SELECCION.ID_SOL_CAL_DEFECTO_SELECCION.eq(idSolCalDefectoSeleccion))
                .fetchOneInto(TabSolCalDefectoSeleccionDto.class);
    }

    @Override
    public List<TabSolCalDefectoSeleccionDto> getSolCalDefectosXIdSolCalidad(Long idSolCalidad) {
        return create.selectFrom(TAB_SOL_CAL_DEFECTO_SELECCION)
                .where(TAB_SOL_CAL_DEFECTO_SELECCION.ID_SOL_CALIDAD.eq(idSolCalidad))
                .fetchInto(TabSolCalDefectoSeleccionDto.class);
    }

    @Override
    public TabSolCalDefectoSeleccionDto save(TabSolCalDefectoSeleccionDto objeto, String estReg) {
        if (estReg.equals("NUE")) {
            return insert(objeto);
        } else if (estReg.equals("MOD")){
            return update(objeto);
        } else
            return null;
    }

    private TabSolCalDefectoSeleccionDto insert(TabSolCalDefectoSeleccionDto solDefectoSeleccion) {
        create.transaction(x -> {
            solDefectoSeleccion.setIdSolCalDefectoSeleccion(DSL.using(x).nextval(SEC_SOL_DEFECTO_SELECCION));
            DSL.using(x).newRecord(TAB_SOL_CAL_DEFECTO_SELECCION, solDefectoSeleccion).insert();
        });
        return solDefectoSeleccion;
    }

    public TabSolCalDefectoSeleccionDto update(TabSolCalDefectoSeleccionDto solDefectoSeleccion) {
        create.transaction(x -> {
            DSL.using(x).newRecord(TAB_SOL_CAL_DEFECTO_SELECCION, solDefectoSeleccion).update();
        });
        return solDefectoSeleccion;
    }


}
