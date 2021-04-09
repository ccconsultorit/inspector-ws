package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.TabSolCalDefectoSeleccionDto;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolCalDefectoSeleccionDao {

    public TabSolCalDefectoSeleccionDto save(TabSolCalDefectoSeleccionDto solCalDefectoSeleccion, String estReg);

}
