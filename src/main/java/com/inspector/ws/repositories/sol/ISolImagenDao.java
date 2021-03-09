package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.SolImagenDto;

import java.util.List;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolImagenDao {

    List<SolImagenDto> getAll();
    SolImagenDto getSolImagenById(Long id);

    List<SolImagenDto> getSolImagenesByIdSolicitud(Long idSolicitud);

    SolImagenDto save(SolImagenDto solImagen);

    void delete(Long idSolicitud);

    void updateEstado(Long idSolImagen, String estado);

}
