package com.inspector.ws.repositories.impl.sol;

import com.inspector.dto.sol.TabSolContenedorDto;
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
    public TabSolContenedorDto getSolContenedorById(Long idSolicitud) {
        return create.selectFrom(TAB_SOL_CONTENEDOR)
                .where(TAB_SOL_CONTENEDOR.ID_SOLICITUD.eq(idSolicitud))
                .fetchOneInto(TabSolContenedorDto.class);
    }

    @Override
    public TabSolContenedorDto save(TabSolContenedorDto objeto, String estReg) {
        if (estReg.equals("NUE")) {
            return insert(objeto);
        } else if (estReg.equals("MOD")){
            return update(objeto);
        } else
            return null;
    }

    private TabSolContenedorDto insert(TabSolContenedorDto solContenedor) {
        create.transaction(x -> {
            solContenedor.setIdSolContenedor(DSL.using(x).nextval(SEC_SOL_CONTENEDOR));
            DSL.using(x).newRecord(TAB_SOL_CONTENEDOR, solContenedor).insert();
        });
        return solContenedor;
    }

    public TabSolContenedorDto update(TabSolContenedorDto solContenedor) {
        create.transaction(x -> {
            DSL.using(x).newRecord(TAB_SOL_CONTENEDOR, solContenedor).update();
        });
        return solContenedor;
    }


}
