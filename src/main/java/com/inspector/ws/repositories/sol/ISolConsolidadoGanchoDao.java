package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.SolConsolidadoGanchoDto;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolConsolidadoGanchoDao {

    SolConsolidadoGanchoDto save(SolConsolidadoGanchoDto solConsolidadoGancho);

}
