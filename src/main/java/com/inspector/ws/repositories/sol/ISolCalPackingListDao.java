package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.TabSolCalPackingListDto;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolCalPackingListDao {

    public TabSolCalPackingListDto save(TabSolCalPackingListDto solCalPackingList, String estReg);
}
