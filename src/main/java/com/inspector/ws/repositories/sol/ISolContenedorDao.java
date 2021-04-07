package com.inspector.ws.repositories.sol;

import com.inspector.dto.sol.SolContenedorDto;

import java.util.List;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface ISolContenedorDao {

    SolContenedorDto save(SolContenedorDto solContenedor, String estRegCon);

}
