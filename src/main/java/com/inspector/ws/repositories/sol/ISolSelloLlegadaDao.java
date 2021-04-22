package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.*;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolSelloLlegadaDao {

    TabSolSelloLlegadaDto getSolSelloLlegadaById(Long idSolicitud);

    TabSolSelloLlegadaDto save(TabSolSelloLlegadaDto solSelloLlegada, String estReg);

}
