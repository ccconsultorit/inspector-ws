package com.inspector.ws.repositories.impl.sol;

import com.inspector.dto.sol.SolSelloInstaladoDto;
import com.inspector.ws.repositories.sol.ISolSelloInstaladoDao;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.inspector.ws.db.schema.Sequences.SEC_SOL_SELLO_INSTALADO;
import static com.inspector.ws.db.schema.tables.TabSolSelloInstalado.TAB_SOL_SELLO_INSTALADO;

@Repository
public class SolSelloInstaladoDao implements ISolSelloInstaladoDao {

    @Autowired
    private DSLContext create;
    private ISolSelloInstaladoDao iSolSelloInstaladoDao;

    @Override
    public SolSelloInstaladoDto save(SolSelloInstaladoDto solSelloInstalado) {
        if (solSelloInstalado.getIdSolSelloInstalado() == 0) {
            return insert(solSelloInstalado);
        } else {
            return update(solSelloInstalado);
        }
    }

    private SolSelloInstaladoDto insert(SolSelloInstaladoDto solSelloInstalado) {
        create.transaction(x -> {
            solSelloInstalado.setIdSolSelloInstalado(DSL.using(x).nextval(SEC_SOL_SELLO_INSTALADO));
            DSL.using(x).newRecord(TAB_SOL_SELLO_INSTALADO, solSelloInstalado).insert();
        });
        return solSelloInstalado;
    }

    public SolSelloInstaladoDto update(SolSelloInstaladoDto solSelloInstalado) {
        create.transaction(x -> {
            DSL.using(x).newRecord(TAB_SOL_SELLO_INSTALADO, solSelloInstalado).update();
        });
        return solSelloInstalado;
    }


}
