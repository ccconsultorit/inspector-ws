package com.inspector.ws.repositories.seg;

import com.inspector.dto.seg.UsuarioDto;
import java.util.List;

/**
 * Interface de metodos de consulta de datos de la tabla RolTab
 *
 * @author ccuenca
 */
public interface IUsuarioDao {

    List<UsuarioDto> getAll();
    UsuarioDto getUsuarioById(Integer id);
    UsuarioDto getUsuarioByCorreo(String correo, String clave);


    }
