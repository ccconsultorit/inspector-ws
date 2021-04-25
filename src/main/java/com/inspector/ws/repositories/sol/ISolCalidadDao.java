package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.TabSolCalidadDto;

import java.util.List;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolCalidadDao {

    public List<TabSolCalidadDto> getSolCalidadXIdSolicitud(Long idSolicitud);
    public TabSolCalidadDto getSolCalidadXId(Long idSolCalidad);

    public TabSolCalidadDto save(TabSolCalidadDto solCalidad, String estReg);
    public void eliminarSolCalidad(Long idSolCalidad);

    }
