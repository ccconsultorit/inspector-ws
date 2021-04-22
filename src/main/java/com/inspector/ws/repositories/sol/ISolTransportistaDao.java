package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.*;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolTransportistaDao {

    TabSolTransportistaDto getSolTransporteById(Long idSolicitud);

    public TabSolTransportistaDto save(TabSolTransportistaDto solTransportista, String estReg);


    }
