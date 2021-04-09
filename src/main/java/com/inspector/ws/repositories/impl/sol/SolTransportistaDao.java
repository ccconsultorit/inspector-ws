package com.inspector.ws.repositories.impl.sol;

import com.inspector.dto.sol.TabSolSelloInstaladoDto;
import com.inspector.dto.sol.TabSolTransportistaDto;
import com.inspector.ws.repositories.sol.ISolTransportistaDao;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.inspector.ws.db.schema.Sequences.SEC_SOL_TRANSPORTISTA;
import static com.inspector.ws.db.schema.tables.TabSolTransportista.TAB_SOL_TRANSPORTISTA;

@Repository
public class SolTransportistaDao implements ISolTransportistaDao {

    @Autowired
    private DSLContext create;
    private ISolTransportistaDao iSolTransportistaDao;

    @Override
    public TabSolTransportistaDto save(TabSolTransportistaDto solTransportista, String estReg) {
        if (estReg.equals("NUE")) {
            return insert(solTransportista);
        } else {
            return update(solTransportista);
        }
    }

    private TabSolTransportistaDto insert(TabSolTransportistaDto solTransportista) {
        create.transaction(x -> {
            solTransportista.setIdSolTransportista(DSL.using(x).nextval(SEC_SOL_TRANSPORTISTA));
            DSL.using(x).newRecord(TAB_SOL_TRANSPORTISTA, solTransportista).insert();
        });
        return solTransportista;
    }

    public TabSolTransportistaDto update(TabSolTransportistaDto solTransportista) {
        create.transaction(x -> {
            DSL.using(x).newRecord(TAB_SOL_TRANSPORTISTA, solTransportista).update();
        });
        return solTransportista;
    }


}
