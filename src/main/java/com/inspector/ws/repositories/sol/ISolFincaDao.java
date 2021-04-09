package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.TabSolFincaDto;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolFincaDao {

    public TabSolFincaDto save(TabSolFincaDto solFinca, String estReg);

    }
