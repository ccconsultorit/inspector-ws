package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.TabSolCalCalibreDto;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolCalCalibreDao {

    public TabSolCalCalibreDto getSolCalCalibreXIdSolCalidad(Long idSolCalidad);
    public TabSolCalCalibreDto save(TabSolCalCalibreDto solCalCalibre, String estReg);
}
