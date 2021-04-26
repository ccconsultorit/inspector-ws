package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.TabSolCalPackingListDto;

import java.util.List;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolCalPackingListDao {

    public List<TabSolCalPackingListDto> getSolCalPackingListXIdSolCalidad(Long idSolCalidad);
    public TabSolCalPackingListDto getSolCalPackingListXId(Long idSolCalPackingList) ;
        public TabSolCalPackingListDto save(TabSolCalPackingListDto solCalPackingList, String estReg);
}
