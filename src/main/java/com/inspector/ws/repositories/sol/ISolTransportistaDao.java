package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.SolTransportistaDto;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolTransportistaDao {

    SolTransportistaDto save(SolTransportistaDto solTransportista);

}
