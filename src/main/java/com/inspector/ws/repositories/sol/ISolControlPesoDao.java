package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.*;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolControlPesoDao {

    TabSolControlPesoDto getSolControlPesoById(Long idSolicitud);

    public TabSolControlPesoDto save(TabSolControlPesoDto solControlPeso, String estReg);

}
