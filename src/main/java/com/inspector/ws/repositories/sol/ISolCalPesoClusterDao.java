package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.TabSolCalPesoClusterDto;

import java.util.List;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolCalPesoClusterDao {

    public List<TabSolCalPesoClusterDto> getSolCalPesoClusterXIdSolCalidad(Long idSolCalidad);
    public TabSolCalPesoClusterDto getSolCalPesoClusterXId(Long idSolCalPesoCluster);
    public TabSolCalPesoClusterDto save(TabSolCalPesoClusterDto solCalPesoCluster, String estReg);
}
