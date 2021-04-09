package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.TabSolCalLargoDedoDto;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolCalLargoDedoDao {

    public TabSolCalLargoDedoDto save(TabSolCalLargoDedoDto solCalLargoDedo, String estReg);
}
