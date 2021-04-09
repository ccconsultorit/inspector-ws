package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.TabSolTransportistaDto;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolTransportistaDao {

    public TabSolTransportistaDto save(TabSolTransportistaDto solTransportista, String estReg);

    }
