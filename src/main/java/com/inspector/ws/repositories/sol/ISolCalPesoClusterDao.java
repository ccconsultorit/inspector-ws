package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.TabSolCalPesoClusterDto;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolCalPesoClusterDao {

    public TabSolCalPesoClusterDto save(TabSolCalPesoClusterDto solCalPesoCluster, String estReg);
}
