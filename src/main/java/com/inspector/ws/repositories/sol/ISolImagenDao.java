package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.SolImagenDto;
import com.inspector.dto.sol.TabSolImagenDto;

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

    public TabSolImagenDto save(TabSolImagenDto solImagen, String estReg);

    void delete(Long idSolicitud);

    void updateEstado(Long idSolImagen, String estado);

}
