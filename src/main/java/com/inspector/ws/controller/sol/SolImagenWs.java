package com.inspector.ws.controller.sol;

import com.inspector.ApiResponse;
import com.inspector.dto.sol.SolConCalibracionFrutaDto;
import com.inspector.dto.sol.SolImagenDto;
import com.inspector.dto.sol.TabSolConCalibracionFrutaDto;
import com.inspector.dto.sol.TabSolImagenDto;
import com.inspector.enumaraciones.ResponseCodeEnum;
import com.inspector.util.Mensajes;
import com.inspector.ws.repositories.sol.ISolImagenDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public ApiResponse<List<TabSolImagenDto>> consultarImagenes() {
        try {
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.PROCESO_OK, iSolImagenDao.getAll());
        } catch (Exception e) {
            LOG.info(e.getMessage());
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.PROCESO_ERR, null);
        }
    }

    @RequestMapping(value = "conSolImagenXId", method = RequestMethod.GET)
    public ApiResponse<TabSolImagenDto> conSolImagenXId(@RequestParam(name = "idSolImagen") Long idSolImagen) {
        try {
            var result = iSolImagenDao.getSolImagenById(idSolImagen);
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.PROCESO_OK, result);
        } catch (Exception e) {
            LOG.info(e.getMessage());
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.PROCESO_ERR, null);
        }
    }

    @RequestMapping(value = "conSolImagenesByIdSolicitud", method = RequestMethod.GET)
    public ApiResponse<List<TabSolImagenDto>> conSolImagenesByIdSolicitud(@RequestParam("idSolCalidad") Long idSolCalidad,
                                                                          @RequestParam("seccion") String seccion) {
        try {
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.PROCESO_OK, iSolImagenDao.getSolImagenesByIdSolicitud(idSolCalidad, seccion));
        } catch (Exception e) {
            LOG.info(e.getMessage());
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.PROCESO_ERR, null);
        }
    }

    @RequestMapping(value = "guardarSolImagen", method = RequestMethod.POST)
    public ApiResponse<String> guardarSolImagen(@RequestBody SolImagenDto solImagen) {
        try {
            TabSolImagenDto tabSolImagen = new TabSolImagenDto();
            tabSolImagen.setIdSolicitud(solImagen.getIdSolicitud());
            tabSolImagen.setIdSolCalidad(solImagen.getIdSolCalidad());
            tabSolImagen.setIdSolContenedor(solImagen.getIdSolContenedor());
            tabSolImagen.setIdSolControlPeso(solImagen.getIdSolControlPeso());
            tabSolImagen.setIdSolFinca(solImagen.getIdSolFinca());
            tabSolImagen.setIdSolConsolidadoGancho(solImagen.getIdSolConsolidadoGancho());
            tabSolImagen.setIdSolSelloLlegada(solImagen.getIdSolSelloLlegada());
            tabSolImagen.setIdSolSelloInstalado(solImagen.getIdSolSelloInstalado());
            tabSolImagen.setIdSolTransportista(solImagen.getIdSolTransportista());
            tabSolImagen.setIdSolProceso(solImagen.getIdSolProceso());
            tabSolImagen.setIdSolCalPackingList(solImagen.getIdSolCalPackingList());
            tabSolImagen.setImagen(solImagen.getImagen());
            tabSolImagen.setCargar(solImagen.getCargar());
            tabSolImagen.setDescripcion(solImagen.getDescripcion());
            tabSolImagen.setNombre(solImagen.getNombre());
            tabSolImagen.setSeccion(solImagen.getSeccion());
            tabSolImagen = iSolImagenDao.save(tabSolImagen, solImagen.getEstRegIma());

            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.GUARDA_OK, tabSolImagen.getIdSolImagen().toString());
        } catch (Exception e) {
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.GUARDA_ERR, "Error");
        }
    }


    @RequestMapping(value = "eliminarSolImagen", method = RequestMethod.GET)
    public ApiResponse<Boolean> eliminarSolImagen(@RequestParam("idSolImagen") Long idSolImagen) {
        try {
            if (idSolImagen != null) {
                iSolImagenDao.eliminarSolImagen(idSolImagen);
                return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.GUARDA_OK, true);
            }
        } catch (Exception e) {
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.GUARDA_ERR, false);
        }
        return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.NOT_FOUND, false);
    }
}
