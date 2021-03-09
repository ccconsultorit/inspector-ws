package com.inspector.ws.repositories.impl.sol;

import com.inspector.dto.sol.SolContenedorDto;
import com.inspector.ws.repositories.sol.ISolContenedorDao;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.inspector.ws.db.schema.Sequences.SEC_SOL_CONTENEDOR;
import static com.inspector.ws.db.schema.tables.TabSolContenedor.TAB_SOL_CONTENEDOR;

@Repository
public class SolContenedorDao implements ISolContenedorDao {

    @Autowired
    private DSLContext create;
    private ISolContenedorDao iSolContenedorDao;

    @Override
    public SolContenedorDto save(SolContenedorDto solContenedor) {
        if (solContenedor.getIdSolContenedor() == 0) {
            return insert(solContenedor);
        } else {
            return update(solContenedor);
        }
    }

    private SolContenedorDto insert(SolContenedorDto solContenedor) {
        create.transaction(x -> {
            solContenedor.setIdSolContenedor(DSL.using(x).nextval(SEC_SOL_CONTENEDOR));
            DSL.using(x).newRecord(TAB_SOL_CONTENEDOR, solContenedor).insert();
        });
        return solContenedor;
    }

    public SolContenedorDto update(SolContenedorDto solContenedor) {
        create.transaction(x -> {
            DSL.using(x).newRecord(TAB_SOL_CONTENEDOR, solContenedor).update();
        });
        return solContenedor;
    }


}
