package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.SolCalCalibreDto;
import com.inspector.dto.sol.SolCalPesoClusterDto;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolCalPesoClusterDao {

    SolCalPesoClusterDto save(SolCalPesoClusterDto solCalPesoClusterDto);

}
