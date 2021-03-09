package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.SolCalDefectoSeleccionDto;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolCalDefectoSeleccionDao {

    SolCalDefectoSeleccionDto save(SolCalDefectoSeleccionDto solCalDefectoSeleccion);

}
