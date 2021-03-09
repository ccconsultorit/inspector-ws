package com.inspector.ws.controller.sol;

import com.inspector.ApiResponse;
import com.inspector.dto.sol.SolImagenDto;
import com.inspector.enumaraciones.ResponseCodeEnum;
import com.inspector.util.Mensajes;
import com.inspector.ws.repositories.sol.ISolImagenDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Clase de metodos de administracion de Imagens
 *
 * @author ccuenca
 */
@RestController
@RequestMapping("solImagenWs")
public class SolImagenWs {

    @Autowired
    private ISolImagenDao iSolImagenDao;
    private final static Logger LOG = LoggerFactory.getLogger(SolImagenWs.class);

    /**
     * Obterner todos los Imagens de la aplicacion
     *
     * @return Listado de Imagens
     */
    @RequestMapping(value = "getSolImagenes", method = RequestMethod.GET)
    public ApiResponse<List<SolImagenDto>> consultarImagenes() {
        try {
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.PROCESO_OK, iSolImagenDao.getAll());
        } catch (Exception e) {
            LOG.info(e.getMessage());
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.PROCESO_ERR, null);
        }
    }

    @RequestMapping(value = "getSolImagenById", method = RequestMethod.GET)
    public ApiResponse<SolImagenDto> getSolImagenById(@RequestParam(name = "idSolImagen") Long idSolImagen) {
        try {
            var result = iSolImagenDao.getSolImagenById(idSolImagen);
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.PROCESO_OK, result);
        } catch (Exception e) {
            LOG.info(e.getMessage());
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.PROCESO_ERR, null);
        }
    }
    @RequestMapping(value = "getSolImagenesByIdSolicitud", method = RequestMethod.GET)
    public ApiResponse<List<SolImagenDto>> getSolImagenesByIdSolicitud(@RequestParam(name = "idSolicitud") Long idSolicitud) {
        try {
            var result = iSolImagenDao.getSolImagenesByIdSolicitud(idSolicitud);
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.PROCESO_OK, result);
        } catch (Exception e) {
            LOG.info(e.getMessage());
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.PROCESO_ERR, null);
        }
    }

}
