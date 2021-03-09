package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.SolCalidadDto;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolCalidadDao {

    SolCalidadDto save(SolCalidadDto solCalidad);

}
