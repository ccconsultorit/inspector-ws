package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.*;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolFincaDao {

    TabSolFincaDto getSolFincaById(Long idSolicitud);

    public TabSolFincaDto save(TabSolFincaDto solFinca, String estReg);

    }
