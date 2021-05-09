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

    List<TabSolImagenDto> getAll();
    TabSolImagenDto getSolImagenById(Long id);

    List<TabSolImagenDto> getSolImagenesByIdSolicitud(Long idSolicitud, String seccion);

    public TabSolImagenDto save(TabSolImagenDto solImagen, String estReg);

    void delete(Long idSolicitud);

    void updateEstado(Long TabSolImagenDto, String estado);

    public void eliminarSolImagen(Long idSolImagen);

    }
