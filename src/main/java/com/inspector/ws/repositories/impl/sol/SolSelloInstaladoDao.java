package com.inspector.ws.repositories.impl.sol;

import com.inspector.dto.sol.TabSolSelloInstaladoDto;
import com.inspector.dto.sol.TabSolSelloLlegadaDto;
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
    public TabSolSelloInstaladoDto save(TabSolSelloInstaladoDto solSelloInstalado, String estReg) {
        if (estReg.equals("NUE")) {
            return insert(solSelloInstalado);
        } else {
            return update(solSelloInstalado);
        }
    }

    private TabSolSelloInstaladoDto insert(TabSolSelloInstaladoDto solSelloInstalado) {
        create.transaction(x -> {
            solSelloInstalado.setIdSolSelloInstalado(DSL.using(x).nextval(SEC_SOL_SELLO_INSTALADO));
            DSL.using(x).newRecord(TAB_SOL_SELLO_INSTALADO, solSelloInstalado).insert();
        });
        return solSelloInstalado;
    }

    public TabSolSelloInstaladoDto update(TabSolSelloInstaladoDto solSelloInstalado) {
        create.transaction(x -> {
            DSL.using(x).newRecord(TAB_SOL_SELLO_INSTALADO, solSelloInstalado).update();
        });
        return solSelloInstalado;
    }


}
