package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.SolCalCalibreDto;
import com.inspector.dto.sol.SolCalLargoDedoDto;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolCalLargoDedoDao {

    SolCalLargoDedoDto save(SolCalLargoDedoDto solCalLargoDedoDto);

}
