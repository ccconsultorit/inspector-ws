package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.*;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolContenedorDao {

    TabSolContenedorDto getSolContenedorById(Long idSolicitud);

    TabSolContenedorDto save(TabSolContenedorDto solContenedor, String estRegCon);

}
