package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.*;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolProcesoDao {

    TabSolProcesoDto getSolProcesoById(Long idSolicitud);

    public TabSolProcesoDto save(TabSolProcesoDto solProceso, String estReg);

}
