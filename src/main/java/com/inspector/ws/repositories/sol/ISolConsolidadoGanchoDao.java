package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.*;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolConsolidadoGanchoDao {

    TabSolConsolidadoGanchoDto getSolConsolidadoGanchoById(Long idSolicitud);

    public TabSolConsolidadoGanchoDto save(TabSolConsolidadoGanchoDto solConsolidadoGancho, String estReg);
}
