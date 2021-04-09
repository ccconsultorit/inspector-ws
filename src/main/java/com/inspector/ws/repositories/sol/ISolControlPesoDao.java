package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.TabSolControlPesoDto;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolControlPesoDao {

    public TabSolControlPesoDto save(TabSolControlPesoDto solControlPeso, String estReg);

}
