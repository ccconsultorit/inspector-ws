package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.SolicitudCompletaDto;
import com.inspector.dto.sol.SolicitudDto;

import java.util.List;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolicitudDao {

    List<SolicitudDto> getAll();

    SolicitudDto getSolicitudById(Long solicitudId);

    List<SolicitudCompletaDto> getSolicitudesByEstado(String estado);

    Long save(SolicitudDto solicitud);

    void delete(Long idSolicitud);

    void updateEstado(Long idSolicitud, String estado);




}
