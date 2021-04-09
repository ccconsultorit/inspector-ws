package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.TabSolCalidadDto;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolCalidadDao {

    public TabSolCalidadDto save(TabSolCalidadDto solCalidad, String estReg);

}
