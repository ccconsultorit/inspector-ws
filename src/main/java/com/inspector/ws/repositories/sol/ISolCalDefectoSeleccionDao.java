package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.TabSolCalDefectoSeleccionDto;

import java.util.List;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolCalDefectoSeleccionDao {

    public TabSolCalDefectoSeleccionDto getSolCalDefectosXId(Long idSolCalDefectoSeleccion);
    public List<TabSolCalDefectoSeleccionDto> getSolCalDefectosXIdSolCalidad(Long idSolCalidad);
    public TabSolCalDefectoSeleccionDto save(TabSolCalDefectoSeleccionDto solCalDefectoSeleccion, String estReg);

}
