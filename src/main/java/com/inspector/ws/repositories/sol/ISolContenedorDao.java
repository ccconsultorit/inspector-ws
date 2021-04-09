package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.TabSolContenedorDto;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolContenedorDao {

    TabSolContenedorDto save(TabSolContenedorDto solContenedor, String estRegCon);

}
