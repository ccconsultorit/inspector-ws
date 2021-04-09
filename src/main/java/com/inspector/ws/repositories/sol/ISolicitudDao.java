package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.SolicitudCompletaDto;
import com.inspector.dto.sol.TabSolicitudDto;

import java.util.List;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolicitudDao {

    List<TabSolicitudDto> getAll();

    TabSolicitudDto getSolicitudById(Long solicitudId);

    List<SolicitudCompletaDto> getSolicitudesByEstado(String estado);

    Long save(TabSolicitudDto solicitud, String estRegSol);

    void delete(Long idSolicitud);

    void updateEstado(Long idSolicitud, String estado);




}
