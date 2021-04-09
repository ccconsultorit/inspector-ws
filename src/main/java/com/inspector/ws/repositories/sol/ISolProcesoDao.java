package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.TabSolProcesoDto;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolProcesoDao {

    public TabSolProcesoDto save(TabSolProcesoDto solProceso, String estReg);

}
