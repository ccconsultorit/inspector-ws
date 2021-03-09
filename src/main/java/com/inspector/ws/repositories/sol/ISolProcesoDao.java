package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.SolProcesoDto;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolProcesoDao {

    SolProcesoDto save(SolProcesoDto solProceso);

}
