package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.SolFincaDto;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolFincaDao {

    SolFincaDto save(SolFincaDto solFinca);

}
