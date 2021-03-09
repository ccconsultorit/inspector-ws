package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.SolCalPackingListDto;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolCalPackingListDao {

    SolCalPackingListDto save(SolCalPackingListDto solCalPackingListDto);

}
