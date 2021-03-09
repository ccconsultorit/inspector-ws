package com.inspector.ws.controller.seg;

import com.inspector.ApiResponse;
import com.inspector.dto.seg.UsuarioDto;
import com.inspector.enumaraciones.ResponseCodeEnum;
import com.inspector.util.Mensajes;
import com.inspector.ws.repositories.seg.IUsuarioDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Clase de metodos de administracion de Usuarios
 *
 * @author ccuenca
 */
@RestController
@RequestMapping("usuarioWs")
public class UsuarioWs {

    @Autowired
    private IUsuarioDao iUsuarioDao;
    private final static Logger LOG = LoggerFactory.getLogger(UsuarioWs.class);

    /**
     * Obterner todos los Usuarios de la aplicacion
     *
     * @return Listado de Usuarios
     */
    @RequestMapping(value = "getUsuarios", method = RequestMethod.GET)
    public ApiResponse<List<UsuarioDto>> consultarUsuarios() {
        try {
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.PROCESO_OK, iUsuarioDao.getAll());
        } catch (Exception e) {
            LOG.info(e.getMessage());
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.PROCESO_ERR, null);
        }
    }

    @RequestMapping(value = "getUsuarioById", method = RequestMethod.GET)
    public ApiResponse<UsuarioDto> getUsuarioById(@RequestParam(name = "idUsuario") Integer idUsuario) {
        try {
            var result = iUsuarioDao.getUsuarioById(idUsuario);
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.PROCESO_OK, result);
        } catch (Exception e) {
            LOG.info(e.getMessage());
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.PROCESO_ERR, null);
        }
    }

    @RequestMapping(value = "getUsuarioByCorreo", method = RequestMethod.GET)
    public ApiResponse<UsuarioDto> getUsuarioById(@RequestParam(name = "correo") String correo,
                                                  @RequestParam(name = "clave") String clave) {
        try {
            var result = iUsuarioDao.getUsuarioByCorreo(correo, clave);
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.PROCESO_OK, result);
        } catch (Exception e) {
            LOG.info(e.getMessage());
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.PROCESO_ERR, null);
        }
    }
}
