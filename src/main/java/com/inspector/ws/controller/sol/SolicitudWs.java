package com.inspector.ws.controller.sol;

import com.inspector.ApiResponse;
import com.inspector.dto.sol.*;
import com.inspector.enumaraciones.ResponseCodeEnum;
import com.inspector.util.Mensajes;
import com.inspector.ws.repositories.impl.sol.SolCalLargoDedoDao;
import com.inspector.ws.repositories.sol.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Clase de metodos de administracion de Solicituds
 *
 * @author ebailon
 */
@RestController
@RequestMapping("solicitudWs")
public class SolicitudWs  {

    @Autowired
    private ISolicitudDao iSolicitudDao;
    @Autowired
    private ISolContenedorDao iSolContenedorDao;
    @Autowired
    private ISolSelloLlegadaDao iSolSelloLlegadaDao;
    @Autowired
    private ISolSelloInstaladoDao iSolSelloInstaladoDao;
    @Autowired
    private ISolTransportistaDao iSolTransportistaDao;
    @Autowired
    private ISolProcesoDao iSolProcesoDao;
    @Autowired
    private ISolControlPesoDao iSolControlPesoDao;
    @Autowired
    private ISolFincaDao iSolFincaDao;
    @Autowired
    private ISolCalidadDao iSolCalidadDao;
    @Autowired
    private ISolCalCalibreDao iSolCalCalibreDao;
    @Autowired
    private SolCalLargoDedoDao iSolCalLargoDedoDao;
    @Autowired
    private ISolCalDefectoSeleccionDao iSolCalDefectoSeleccionDao;
    @Autowired
    private ISolConsolidadoGanchoDao iSolConsolidadoGanchoDao;
    @Autowired
    private ISolCalibracionFrutaDao iSolCalibracionFruta;
    @Autowired
    private ISolImagenDao iSolImagenDao;
    @Autowired
    private ISolCalPesoClusterDao iSolCalPesoClusterDao;
    @Autowired
    private ISolCalPackingListDao iSolCalPackingListDao;
    @Autowired
    private ISolConCalibracionFrutaDao iSolConCalibracionFrutaDao;

    private final static Logger LOG = LoggerFactory.getLogger(SolicitudWs.class);

    /**
     * Obterner todos los Solicituds de la aplicacion
     *
     * @return Listado de Solicituds
     */
    @RequestMapping(value = "conSolicitudes", method = RequestMethod.GET)
    public ApiResponse<List<TabSolicitudDto>> conSolicitudes() {
        try {
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.PROCESO_OK, iSolicitudDao.getAll());
        } catch (Exception e) {
            LOG.info(e.getMessage());
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.PROCESO_ERR, null);
        }
    }

    @RequestMapping(value = "conSolCalidadXIdSolicitud", method = RequestMethod.GET)
    public ApiResponse<List<TabSolCalidadDto>> conSolCalidadXIdSolicitud(@RequestParam("idSolicitud") Long idSolicitud) {
        try {
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.PROCESO_OK, iSolCalidadDao.getSolCalidadXIdSolicitud(idSolicitud));
        } catch (Exception e) {
            LOG.info(e.getMessage());
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.PROCESO_ERR, null);
        }
    }

    @RequestMapping(value = "conSolCalidadXId", method = RequestMethod.GET)
    public ApiResponse<TabSolCalidadDto> conSolCalidadXId(@RequestParam("idSolCalidad") Long idSolCalidad) {
        try {
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.PROCESO_OK, iSolCalidadDao.getSolCalidadXId(idSolCalidad));
        } catch (Exception e) {
            LOG.info(e.getMessage());
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.PROCESO_ERR, null);
        }
    }

    @RequestMapping(value = "conSolCalCalibreXIdSolCalidad", method = RequestMethod.GET)
    public ApiResponse<TabSolCalCalibreDto> conSolCalCalibreXIdSolCalidad(@RequestParam("idSolCalidad") Long idSolCalidad) {
        try {
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.PROCESO_OK, iSolCalCalibreDao.getSolCalCalibreXIdSolCalidad(idSolCalidad));
        } catch (Exception e) {
            LOG.info(e.getMessage());
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.PROCESO_ERR, null);
        }
    }

    @RequestMapping(value = "conSolCalLargoDedoXIdSolCalidad", method = RequestMethod.GET)
    public ApiResponse<TabSolCalLargoDedoDto> conSolCalLargoDedoXIdSolCalidad(@RequestParam("idSolCalidad") Long idSolCalidad) {
        try {
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.PROCESO_OK, iSolCalLargoDedoDao.getSolCalLargoDedoXIdSolCalidad(idSolCalidad));
        } catch (Exception e) {
            LOG.info(e.getMessage());
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.PROCESO_ERR, null);
        }
    }

    @RequestMapping(value = "conSolCalDefectoSeleccionXIdSolCalidad", method = RequestMethod.GET)
    public ApiResponse<List<TabSolCalDefectoSeleccionDto>> conSolCalDefectoSeleccionXIdSolCalidad(@RequestParam("idSolCalidad") Long idSolCalidad) {
        try {
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.PROCESO_OK, iSolCalDefectoSeleccionDao.getSolCalDefectosXIdSolCalidad(idSolCalidad));
        } catch (Exception e) {
            LOG.info(e.getMessage());
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.PROCESO_ERR, null);
        }
    }

    @RequestMapping(value = "conSolCalDefectoSeleccionXId", method = RequestMethod.GET)
    public ApiResponse<TabSolCalDefectoSeleccionDto> conSolCalDefectoSeleccionXId(@RequestParam("idSolCalDefectoSeleccion") Long idSolCalDefectoSeleccion) {
        try {
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.PROCESO_OK, iSolCalDefectoSeleccionDao.getSolCalDefectosXId(idSolCalDefectoSeleccion));
        } catch (Exception e) {
            LOG.info(e.getMessage());
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.PROCESO_ERR, null);
        }
    }

    @RequestMapping(value = "conSolCalPesoClusterXIdSolCalidad", method = RequestMethod.GET)
    public ApiResponse<List<TabSolCalPesoClusterDto>> conSolCalPesoClusterXIdSolCalidad(@RequestParam("idSolCalidad") Long idSolCalidad) {
        try {
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.PROCESO_OK, iSolCalPesoClusterDao.getSolCalPesoClusterXIdSolCalidad(idSolCalidad));
        } catch (Exception e) {
            LOG.info(e.getMessage());
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.PROCESO_ERR, null);
        }
    }

    @RequestMapping(value = "conSolCalPesoClusterXId", method = RequestMethod.GET)
    public ApiResponse<TabSolCalPesoClusterDto> conSolCalPesoClusterXId(@RequestParam("idSolCalPesoCluster") Long idSolCalPesoCluster) {
        try {
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.PROCESO_OK, iSolCalPesoClusterDao.getSolCalPesoClusterXId(idSolCalPesoCluster));
        } catch (Exception e) {
            LOG.info(e.getMessage());
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.PROCESO_ERR, null);
        }
    }

    @RequestMapping(value = "conSolCalPackingListXIdSolCalidad", method = RequestMethod.GET)
    public ApiResponse<List<TabSolCalPackingListDto>> conSolCalPackingListXIdSolCalidad(@RequestParam("idSolCalidad") Long idSolCalidad) {
        try {
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.PROCESO_OK, iSolCalPackingListDao.getSolCalPackingListXIdSolCalidad(idSolCalidad));
        } catch (Exception e) {
            LOG.info(e.getMessage());
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.PROCESO_ERR, null);
        }
    }

    @RequestMapping(value = "conSolCalPackingListXId", method = RequestMethod.GET)
    public ApiResponse<TabSolCalPackingListDto> conSolCalPackingListXId(@RequestParam("idSolCalPackingList") Long idSolCalPackingList) {
        try {
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.PROCESO_OK, iSolCalPackingListDao.getSolCalPackingListXId(idSolCalPackingList));
        } catch (Exception e) {
            LOG.info(e.getMessage());
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.PROCESO_ERR, null);
        }
    }

    @RequestMapping(value = "conSolicitudesXEstado", method = RequestMethod.GET)
    public ApiResponse<List<TabSolicitudDto>> conSolicitudesXEstado(@RequestParam("estado") String estado) {
        try {
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.PROCESO_OK, iSolicitudDao.getSolicitudesByEstado(estado));
        } catch (Exception e) {
            LOG.info(e.getMessage());
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.PROCESO_ERR, null);
        }
    }

    @RequestMapping(value = "conSolicitudXId", method = RequestMethod.GET)
    public ApiResponse<TabSolicitudDto> conSolicitudesXId(@RequestParam("idSolicitud") Long idSolicitud) {
        try {
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.PROCESO_OK, iSolicitudDao.getSolicitudById(idSolicitud));
        } catch (Exception e) {
            LOG.info(e.getMessage());
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.PROCESO_ERR, null);
        }
    }

    @RequestMapping(value = "conSolContenedorXId", method = RequestMethod.GET)
    public ApiResponse<TabSolContenedorDto> conSolContenedorXId(@RequestParam("idSolicitud") Long idSolicitud) {
        try {
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.PROCESO_OK, iSolContenedorDao.getSolContenedorById(idSolicitud));
        } catch (Exception e) {
            LOG.info(e.getMessage());
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.PROCESO_ERR, null);
        }
    }

    @RequestMapping(value = "conSolSelloLlegadaXId", method = RequestMethod.GET)
    public ApiResponse<TabSolSelloLlegadaDto> conSolSelloLlegadaXId(@RequestParam("idSolicitud") Long idSolicitud) {
        try {
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.PROCESO_OK, iSolSelloLlegadaDao.getSolSelloLlegadaById(idSolicitud));
        } catch (Exception e) {
            LOG.info(e.getMessage());
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.PROCESO_ERR, null);
        }
    }

    @RequestMapping(value = "conSolSelloInstaladoXId", method = RequestMethod.GET)
    public ApiResponse<TabSolSelloInstaladoDto> conSolSelloInstaladoXId(@RequestParam("idSolicitud") Long idSolicitud) {
        try {
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.PROCESO_OK, iSolSelloInstaladoDao.getSolSelloInstaladoById(idSolicitud));
        } catch (Exception e) {
            LOG.info(e.getMessage());
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.PROCESO_ERR, null);
        }
    }

    @RequestMapping(value = "conSolTransporteXId", method = RequestMethod.GET)
    public ApiResponse<TabSolTransportistaDto> conSolTransporteXId(@RequestParam("idSolicitud") Long idSolicitud) {
        try {
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.PROCESO_OK, iSolTransportistaDao.getSolTransporteById(idSolicitud));
        } catch (Exception e) {
            LOG.info(e.getMessage());
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.PROCESO_ERR, null);
        }
    }

    @RequestMapping(value = "conSolProcesoXId", method = RequestMethod.GET)
    public ApiResponse<TabSolProcesoDto> conSolProcesoXId(@RequestParam("idSolicitud") Long idSolicitud) {
        try {
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.PROCESO_OK, iSolProcesoDao.getSolProcesoById(idSolicitud));
        } catch (Exception e) {
            LOG.info(e.getMessage());
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.PROCESO_ERR, null);
        }
    }

    @RequestMapping(value = "conSolControlPesoXId", method = RequestMethod.GET)
    public ApiResponse<TabSolControlPesoDto> conSolControlPesoXId(@RequestParam("idSolicitud") Long idSolicitud) {
        try {
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.PROCESO_OK, iSolControlPesoDao.getSolControlPesoById(idSolicitud));
        } catch (Exception e) {
            LOG.info(e.getMessage());
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.PROCESO_ERR, null);
        }
    }

    @RequestMapping(value = "conSolFincaXId", method = RequestMethod.GET)
    public ApiResponse<TabSolFincaDto> conSolFincaXId(@RequestParam("idSolicitud") Long idSolicitud) {
        try {
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.PROCESO_OK, iSolFincaDao.getSolFincaById(idSolicitud));
        } catch (Exception e) {
            LOG.info(e.getMessage());
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.PROCESO_ERR, null);
        }
    }

    @RequestMapping(value = "conSolConsolidadoGanchoXId", method = RequestMethod.GET)
    public ApiResponse<TabSolConsolidadoGanchoDto> conSolConsolidadoGanchoXId(@RequestParam("idSolicitud") Long idSolicitud) {
        try {
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.PROCESO_OK, iSolConsolidadoGanchoDao.getSolConsolidadoGanchoById(idSolicitud));
        } catch (Exception e) {
            LOG.info(e.getMessage());
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.PROCESO_ERR, null);
        }
    }

    @RequestMapping(value = "conSolConCalibracionFrutaXIdSolCon", method = RequestMethod.GET)
    public ApiResponse<List<TabSolConCalibracionFrutaDto>> conSolConCalibracionFrutaXIdSolCon(@RequestParam("idSolConsolidadoGancho") Long idSolConsolidadoGancho) {
        try {
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.PROCESO_OK, iSolConCalibracionFrutaDao.getSolConCalibracionFrutaXIdSolCon(idSolConsolidadoGancho));
        } catch (Exception e) {
            LOG.info(e.getMessage());
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.PROCESO_ERR, null);
        }
    }

    @RequestMapping(value = "conSolConCalibracionFrutaXId", method = RequestMethod.GET)
    public ApiResponse<TabSolConCalibracionFrutaDto> conSolConCalibracionFrutaXId(@RequestParam("idSonConCalibracionFruta") Long idSonConCalibracionFruta) {
        try {
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.PROCESO_OK, iSolConCalibracionFrutaDao.getSolConCalibracionFrutaXId(idSonConCalibracionFruta));
        } catch (Exception e) {
            LOG.info(e.getMessage());
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.PROCESO_ERR, null);
        }
    }

    /**
     * Elimina el solicitud de forma logica
     *
     * @param idSolicitud Exceptions = {Collections$EmptyList@7948}  size = 0olicitud identificador del solicitud a ser eliminado
     * @return true si el solicitud ha sido actualizado con exito
     */
    @RequestMapping(value = "delete", method = RequestMethod.GET)
    public ApiResponse<Boolean> delete(@RequestParam("idSolicitud") Long idSolicitud) {
        try {
            if (idSolicitud != null) {
                iSolicitudDao.delete(idSolicitud);
                return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.ELIMINA_OK, true);
            }
        } catch (Exception e) {
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.ELIMINA_ERR, false);
        }
        return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.NOT_FOUND, false);
    }

    @RequestMapping(value = "modificarEstado", method = RequestMethod.GET)
    public ApiResponse<Boolean> modificarEstado(@RequestParam("idSolicitud") Long idSolicitud,
                                                @RequestParam("estado") String estado) {
        try {
            if (idSolicitud != null) {
                iSolicitudDao.updateEstado(idSolicitud, estado);
                return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.GUARDA_OK, true);
            }
        } catch (Exception e) {
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.GUARDA_ERR, false);
        }
        return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.NOT_FOUND, false);
    }

    @RequestMapping(value = "eliminarSolCalidad", method = RequestMethod.GET)
    public ApiResponse<Boolean> eliminarSolCalidad(@RequestParam("idSolCalidad") Long idSolCalidad) {
        try {
            if (idSolCalidad != null) {
                iSolCalidadDao.eliminarSolCalidad(idSolCalidad);
                return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.GUARDA_OK, true);
            }
        } catch (Exception e) {
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.GUARDA_ERR, false);
        }
        return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.NOT_FOUND, false);
    }


    @RequestMapping(value = "guardarSolCalidad", method = RequestMethod.POST)
    public ApiResponse<String> guardarSolCalidad(@RequestBody SolCalidadDto solCalidad) {
        try {
            if (solCalidad.getAreaAGuardar().equals("Calidad")) {
                TabSolCalidadDto tabSolCalidad = new TabSolCalidadDto();
                tabSolCalidad.setIdSolCalidad(solCalidad.getIdSolCalidad());
                tabSolCalidad.setIdSolicitud(solCalidad.getIdSolicitud());
                tabSolCalidad.setNomMarca(solCalidad.getNomMarca());
                tabSolCalidad.setNroQs(solCalidad.getNroQs());
                tabSolCalidad.setGuiaTransporte(solCalidad.getGuiaTransporte());
                tabSolCalidad.setGuiaRemision(solCalidad.getGuiaRemision());
                tabSolCalidad.setDefectuoso(solCalidad.getDefectuoso());
                tabSolCalidad.setTarjetaEmbarque(solCalidad.getTarjetaEmbarque());
                tabSolCalidad.setTotalEmbarcado(solCalidad.getTotalEmbarcado());
                tabSolCalidad.setTotalCluster(solCalidad.getTotalCluster());
                tabSolCalidad.setTotalDefecto(solCalidad.getTotalDefecto());
                tabSolCalidad.setCalidad(solCalidad.getCalidad());
                tabSolCalidad.setCalibracion(solCalidad.getCalibracion());
                tabSolCalidad.setLargoDedo(solCalidad.getLargoDedo());
                tabSolCalidad.setTotalPeso(solCalidad.getTotalPeso());
                tabSolCalidad.setPesoPromedio(solCalidad.getPesoPromedio());
                tabSolCalidad.setMayorDefectoSeleccion(solCalidad.getMayorDefectoSeleccion());
                tabSolCalidad.setMayorDefectoEmpaque(solCalidad.getMayorDefectoEmpaque());
                iSolCalidadDao.save(tabSolCalidad, solCalidad.getEstRegCal());
            }

            if (solCalidad.getAreaAGuardar().equals("Calibre")) {
                TabSolCalCalibreDto tabSolCalCalibreDto = new TabSolCalCalibreDto();
                tabSolCalCalibreDto.setIdSolCalCalibre(solCalidad.getIdSolCalCalibre());
                //tabSolCalCalibreDto.setIdSolicitud(solCalidad.getIdSolicitud());
                tabSolCalCalibreDto.setIdSolCalidad(solCalidad.getIdSolCalidad());
                tabSolCalCalibreDto.setCalUg(solCalidad.getCalUg());
                tabSolCalCalibreDto.setCalOg(solCalidad.getCalOg());
                tabSolCalCalibreDto.setCal37(solCalidad.getCal37());
                tabSolCalCalibreDto.setCal38(solCalidad.getCal38());
                tabSolCalCalibreDto.setCal39(solCalidad.getCal39());
                tabSolCalCalibreDto.setCal40(solCalidad.getCal40());
                tabSolCalCalibreDto.setCal41(solCalidad.getCal41());
                tabSolCalCalibreDto.setCal42(solCalidad.getCal42());
                tabSolCalCalibreDto.setCal43(solCalidad.getCal43());
                tabSolCalCalibreDto.setCal44(solCalidad.getCal44());
                tabSolCalCalibreDto.setCal45(solCalidad.getCal45());
                tabSolCalCalibreDto.setCal46(solCalidad.getCal46());
                tabSolCalCalibreDto.setCal47(solCalidad.getCal47());
                tabSolCalCalibreDto.setCal48(solCalidad.getCal48());
                tabSolCalCalibreDto.setCal49(solCalidad.getCal49());
                tabSolCalCalibreDto.setCal50(solCalidad.getCal50());
                tabSolCalCalibreDto.setCal51(solCalidad.getCal51());
                tabSolCalCalibreDto.setCal52(solCalidad.getCal52());
                tabSolCalCalibreDto.setCal53(solCalidad.getCal53());
                tabSolCalCalibreDto.setCal54(solCalidad.getCal54());
                iSolCalCalibreDao.save(tabSolCalCalibreDto, solCalidad.getEstRegClb());
            }

            if (solCalidad.getAreaAGuardar().equals("LargoDedo")) {
                TabSolCalLargoDedoDto tabSolCalLargoDedoDto = new TabSolCalLargoDedoDto();
                tabSolCalLargoDedoDto.setIdSolCalLargoDedo(solCalidad.getIdSolCalLargoDedo());
                tabSolCalLargoDedoDto.setIdSolicitud(solCalidad.getIdSolicitud());
                tabSolCalLargoDedoDto.setIdSolCalidad(solCalidad.getIdSolCalidad());
                tabSolCalLargoDedoDto.setLar80(solCalidad.getLar80());
                tabSolCalLargoDedoDto.setLar82(solCalidad.getLar82());
                tabSolCalLargoDedoDto.setLar84(solCalidad.getLar84());
                tabSolCalLargoDedoDto.setLar86(solCalidad.getLar86());
                tabSolCalLargoDedoDto.setLar88(solCalidad.getLar88());
                tabSolCalLargoDedoDto.setLar90(solCalidad.getLar90());
                tabSolCalLargoDedoDto.setLar92(solCalidad.getLar92());
                tabSolCalLargoDedoDto.setLar94(solCalidad.getLar94());
                tabSolCalLargoDedoDto.setLar96(solCalidad.getLar96());
                tabSolCalLargoDedoDto.setLar98(solCalidad.getLar98());
                tabSolCalLargoDedoDto.setLar100(solCalidad.getLar100());
                tabSolCalLargoDedoDto.setLar102(solCalidad.getLar102());
                tabSolCalLargoDedoDto.setLar104(solCalidad.getLar104());
                tabSolCalLargoDedoDto.setLar106(solCalidad.getLar106());
                tabSolCalLargoDedoDto.setLar108(solCalidad.getLar108());
                tabSolCalLargoDedoDto.setLar110(solCalidad.getLar110());
                tabSolCalLargoDedoDto.setLar112(solCalidad.getLar112());
                tabSolCalLargoDedoDto.setLar114(solCalidad.getLar114());
                tabSolCalLargoDedoDto.setLar116(solCalidad.getLar116());
                tabSolCalLargoDedoDto.setLar118(solCalidad.getLar118());
                iSolCalLargoDedoDao.save(tabSolCalLargoDedoDto, solCalidad.getEstRegLD());
            }
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.GUARDA_OK, "OK");
        } catch (Exception e) {
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.GUARDA_ERR, "Error");
        }
    }

    @RequestMapping(value = "guardarSolCalDefecto", method = RequestMethod.POST)
    public ApiResponse<String> guardarSolCalDefecto(@RequestBody SolCalDefectoSeleccionDto defecto) {
        try {
            TabSolCalDefectoSeleccionDto solDefectoSeleccion = new TabSolCalDefectoSeleccionDto();
            solDefectoSeleccion.setIdSolCalDefectoSeleccion(defecto.getIdSolCalDefectoSeleccion());
            solDefectoSeleccion.setIdSolCalidad(defecto.getIdSolCalidad());
            solDefectoSeleccion.setPeso(defecto.getPeso());
            solDefectoSeleccion.setNumGanchoInspeccionado(defecto.getNumGanchoInspeccionado());
            solDefectoSeleccion.setPh(defecto.getPh());
            solDefectoSeleccion.setSr(defecto.getSr());
            solDefectoSeleccion.setBr(defecto.getBr());
            solDefectoSeleccion.setNi(defecto.getNi());
            solDefectoSeleccion.setMf(defecto.getMf());
            solDefectoSeleccion.setCt(defecto.getCt());
            solDefectoSeleccion.setFl(defecto.getFl());
            solDefectoSeleccion.setDp(defecto.getDp());
            solDefectoSeleccion.setUg(defecto.getUg());
            solDefectoSeleccion.setOg(defecto.getOg());
            solDefectoSeleccion.setLs(defecto.getLs());
            solDefectoSeleccion.setLg(defecto.getLg());
            solDefectoSeleccion.setBm(defecto.getBm());
            solDefectoSeleccion.setTs(defecto.getTs());
            solDefectoSeleccion.setCs(defecto.getCs());
            solDefectoSeleccion.setWi(defecto.getWi());
            solDefectoSeleccion.setSk(defecto.getSk());
            solDefectoSeleccion.setYb(defecto.getYb());
            solDefectoSeleccion.setRr(defecto.getRr());
            solDefectoSeleccion.setTc(defecto.getTc());
            solDefectoSeleccion.setSp(defecto.getSp());
            solDefectoSeleccion.setSm(defecto.getSm());
            solDefectoSeleccion.setTr(defecto.getTr());
            solDefectoSeleccion.setAb(defecto.getAb());
            solDefectoSeleccion.setCh(defecto.getCh());
            solDefectoSeleccion.setTf(defecto.getTf());
            solDefectoSeleccion.setUd(defecto.getUd());
            solDefectoSeleccion.setPd(defecto.getPd());
            solDefectoSeleccion.setFf(defecto.getFf());
            solDefectoSeleccion.setBs(defecto.getBs());
            solDefectoSeleccion.setDt(defecto.getDt());
            solDefectoSeleccion.setSre(defecto.getSre());
            solDefectoSeleccion.setBre(defecto.getBre());
            solDefectoSeleccion.setNie(defecto.getNie());
            solDefectoSeleccion.setFre(defecto.getFre());
            solDefectoSeleccion.setSc(defecto.getSc());
            solDefectoSeleccion.setMl(defecto.getMl());
            solDefectoSeleccion.setMd(defecto.getMd());
            solDefectoSeleccion.setEc(defecto.getEc());
            solDefectoSeleccion.setV(defecto.getV());
            solDefectoSeleccion.setF(defecto.getF());
            solDefectoSeleccion.setEa(defecto.getEa());
            solDefectoSeleccion.setPs(defecto.getPs());
            iSolCalDefectoSeleccionDao.save(solDefectoSeleccion, defecto.getEstRegDS());

            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.GUARDA_OK, "OK");
        } catch (Exception e) {
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.GUARDA_ERR, "Error");
        }
    }

    @RequestMapping(value = "eliminarSolCalDefecto", method = RequestMethod.GET)
    public ApiResponse<Boolean> eliminarSolCalDefecto(@RequestParam("idSolCalDefectoSeleccion") Long idSolCalDefectoSeleccion) {
        try {
            if (idSolCalDefectoSeleccion != null) {
                iSolCalDefectoSeleccionDao.eliminarSolCalDefecto(idSolCalDefectoSeleccion);
                return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.GUARDA_OK, true);
            }
        } catch (Exception e) {
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.GUARDA_ERR, false);
        }
        return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.NOT_FOUND, false);
    }

    @RequestMapping(value = "guardarSolCalPesoCluster", method = RequestMethod.POST)
    public ApiResponse<String> guardarSolCalPesoCluster(@RequestBody SolCalPesoClusterDto peso) {
        try {
            TabSolCalPesoClusterDto tabSolCalPesoClusterDto = new TabSolCalPesoClusterDto();
            tabSolCalPesoClusterDto.setIdSolCalPesoCluster(peso.getIdSolCalPesoCluster());
            tabSolCalPesoClusterDto.setIdSolCalidad(peso.getIdSolCalidad());
            tabSolCalPesoClusterDto.setNumero(peso.getNumero());
            tabSolCalPesoClusterDto.setPeso(peso.getPeso());
            iSolCalPesoClusterDao.save(tabSolCalPesoClusterDto, peso.getEstRegPC());

            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.GUARDA_OK, "OK");
        } catch (Exception e) {
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.GUARDA_ERR, "Error");
        }
    }

    @RequestMapping(value = "eliminarSolCalPesoCluster", method = RequestMethod.GET)
    public ApiResponse<Boolean> eliminarSolCalPesoCluster(@RequestParam("idSolCalPesoCluster") Long idSolCalPesoCluster) {
        try {
            if (idSolCalPesoCluster != null) {
                iSolCalPesoClusterDao.eliminarSolCalPesoCluster(idSolCalPesoCluster);
                return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.GUARDA_OK, true);
            }
        } catch (Exception e) {
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.GUARDA_ERR, false);
        }
        return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.NOT_FOUND, false);
    }

    @RequestMapping(value = "guardarSolCalPackingList", method = RequestMethod.POST)
    public ApiResponse<String> guardarSolCalPackingList(@RequestBody SolCalPackingListDto packing) {
        try {
            TabSolCalPackingListDto tabSolCalPackingListDto = new TabSolCalPackingListDto();
            tabSolCalPackingListDto.setIdSolCalPackingList(packing.getIdSolCalPackingList());
            tabSolCalPackingListDto.setIdSolCalidad(packing.getIdSolCalidad());

            tabSolCalPackingListDto.setNumeracion(packing.getNumeracion());
            tabSolCalPackingListDto.setSticker(packing.getSticker());
            iSolCalPackingListDao.save(tabSolCalPackingListDto, packing.getEstRegPL());

            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.GUARDA_OK, "OK");
        } catch (Exception e) {
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.GUARDA_ERR, "Error");
        }
    }

    @RequestMapping(value = "eliminarSolCalPackingList", method = RequestMethod.GET)
    public ApiResponse<Boolean> eliminarSolCalPackingList(@RequestParam("idSolCalPackingList") Long idSolCalPackingList) {
        try {
            if (idSolCalPackingList != null) {
                iSolCalPackingListDao.eliminarSolCalPackingList(idSolCalPackingList);
                return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.GUARDA_OK, true);
            }
        } catch (Exception e) {
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.GUARDA_ERR, false);
        }
        return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.NOT_FOUND, false);
    }

    @RequestMapping(value = "guardarSolConCalibracionFruta", method = RequestMethod.POST)
    public ApiResponse<String> guardarSolConCalibracionFruta(@RequestBody SolConCalibracionFrutaDto calibracion) {
        try {
            TabSolConCalibracionFrutaDto tabSolConCalibracionFruta = new TabSolConCalibracionFrutaDto();
            tabSolConCalibracionFruta.setIdSolConCalibracionFruta(calibracion.getIdSolConCalibracionFruta());
            tabSolConCalibracionFruta.setIdSolConsolidadoGancho(calibracion.getIdSolConsolidadoGancho());

            tabSolConCalibracionFruta.setColor(calibracion.getColor());
            tabSolConCalibracionFruta.setNumRacimo(calibracion.getNumRacimo());
            tabSolConCalibracionFruta.setNumSemana(calibracion.getNumSemana());
            iSolConCalibracionFrutaDao.save(tabSolConCalibracionFruta, calibracion.getEstRegCF());

            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.GUARDA_OK, "OK");
        } catch (Exception e) {
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.GUARDA_ERR, "Error");
        }
    }

    @RequestMapping(value = "eliminarSolConCalibracionFruta", method = RequestMethod.GET)
    public ApiResponse<Boolean> eliminarSolConCalibracionFruta(@RequestParam("idSolConCalibracionFruta") Long idSolConCalibracionFruta) {
        try {
            if (idSolConCalibracionFruta != null) {
                iSolConCalibracionFrutaDao.eliminarSolConCalibracionFruta(idSolConCalibracionFruta);
                return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.GUARDA_OK, true);
            }
        } catch (Exception e) {
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.GUARDA_ERR, false);
        }
        return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.NOT_FOUND, false);
    }

    @RequestMapping(value = "guardarSolicitud", method = RequestMethod.POST)
    public ApiResponse<String> guardarSolicitud(@RequestBody SolicitudCompletaDto solicitudCompleto) {
        try {
            TabSolicitudDto solicitud = new TabSolicitudDto();
            TabSolContenedorDto solContenedor = new TabSolContenedorDto();
            TabSolSelloLlegadaDto solSelloLlegada = new TabSolSelloLlegadaDto();
            TabSolSelloInstaladoDto solSelloInstalado = new TabSolSelloInstaladoDto();
            TabSolTransportistaDto solTransportista = new TabSolTransportistaDto();
            TabSolProcesoDto solProceso = new TabSolProcesoDto();
            TabSolControlPesoDto solControlPeso = new TabSolControlPesoDto();
            TabSolFincaDto solFinca = new TabSolFincaDto();

            DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

            if (solicitudCompleto.getAreaAGuardar().equals("Todos") || solicitudCompleto.getAreaAGuardar().equals("DatoGeneral") ){
                solicitud.setIdSolicitud(solicitudCompleto.getIdSolicitud());
                solicitud.setNroSemana(solicitudCompleto.getNroSemana());
                solicitud.setExportador(solicitudCompleto.getExportador());
                solicitud.setCliente(solicitudCompleto.getCliente());
                solicitud.setTipoSolicitud(solicitudCompleto.getTipoSolicitud());
                solicitud.setProductor(solicitudCompleto.getProductor());
                solicitud.setCodProductor(solicitudCompleto.getCodProductor());
                solicitud.setCodMagap(solicitudCompleto.getCodMagap());
                solicitud.setPuertoEmbarque(solicitudCompleto.getPuertoEmbarque());
                solicitud.setZona(solicitudCompleto.getZona());
                if (solicitudCompleto.getFechaInicio() != null && !solicitudCompleto.getFechaInicio().equals(" "))
                    solicitud.setFechaInicio(LocalDateTime.parse(solicitudCompleto.getFechaInicio(), inputFormat));
                if (solicitudCompleto.getFechaFin() != null && !solicitudCompleto.getFechaFin().equals(" "))
                    solicitud.setFechaTermino(LocalDateTime.parse(solicitudCompleto.getFechaFin(), inputFormat));
                solicitud.setContenedor(solicitudCompleto.getContenedor());
                solicitud.setNomEvaluador1(solicitudCompleto.getNomEvaluador1());
                solicitud.setCiEvaluador1(solicitudCompleto.getCiEvaluador1());
                solicitud.setNomEvaluador2(solicitudCompleto.getNomEvaluador2());
                solicitud.setCiEvaluador2(solicitudCompleto.getCiEvaluador2());
                solicitud.setObservacion(solicitudCompleto.getObservacion());
                iSolicitudDao.save(solicitud, solicitudCompleto.getEstRegSol());
            }

            if (solicitudCompleto.getAreaAGuardar().equals("Todos") || solicitudCompleto.getAreaAGuardar().equals("Contenedor") ) {
                if (!solicitudCompleto.getEstRegCon().equals("")) {
                    solContenedor.setIdSolContenedor(solicitudCompleto.getIdSolContenedor());
                    solContenedor.setIdSolicitud(solicitudCompleto.getIdSolicitud());
                    solContenedor.setNroContenedor(solicitudCompleto.getNroContenedor());
                    solContenedor.setVapor(solicitudCompleto.getVapor());
                    solContenedor.setBooking(solicitudCompleto.getBooking());
                    solContenedor.setTipoContenedor(solicitudCompleto.getTipoContenedor());
                    solContenedor.setAgenciaNaviera(solicitudCompleto.getAgenciaNaviera());
                    solContenedor.setTare(solicitudCompleto.getTare());
                    solContenedor.setMaxGross(solicitudCompleto.getMaxGross());
                    solContenedor.setPuertoSalida(solicitudCompleto.getPuertoSalida());
                    if (solicitudCompleto.getFechaLlegada() != null && !solicitudCompleto.getFechaLlegada().equals(" "))
                        solContenedor.setFechaLlegada(LocalDateTime.parse(solicitudCompleto.getFechaLlegada(), inputFormat));
                    if (solicitudCompleto.getFechaApertura() != null && !solicitudCompleto.getFechaApertura().equals(" "))
                        solContenedor.setFechaApertura(LocalDateTime.parse(solicitudCompleto.getFechaApertura(), inputFormat));
                    if (solicitudCompleto.getFechaCierre() != null && !solicitudCompleto.getFechaCierre().equals(" "))
                        solContenedor.setFechaCierre(LocalDateTime.parse(solicitudCompleto.getFechaCierre(), inputFormat));
                    if (solicitudCompleto.getFechaSalida() != null && !solicitudCompleto.getFechaSalida().equals(" "))
                        solContenedor.setFechaSalida(LocalDateTime.parse(solicitudCompleto.getFechaSalida(), inputFormat));
                    solContenedor.setObservacion(solicitudCompleto.getObservacionCon());
                    solContenedor = iSolContenedorDao.save(solContenedor, solicitudCompleto.getEstRegCon());
                }
            }

            if (solicitudCompleto.getAreaAGuardar().equals("Todos") || solicitudCompleto.getAreaAGuardar().equals("SelloLlegada") ) {
                if (!solicitudCompleto.getEstRegSA().equals("")) {
                    solSelloLlegada.setIdSolSelloLlegada(solicitudCompleto.getIdSolSelloLlegada());
                    solSelloLlegada.setIdSolicitud(solicitudCompleto.getIdSolicitud());
                    solSelloLlegada.setCandadoPlastico(solicitudCompleto.getCandadoPlastico());
                    solSelloLlegada.setCandadoBotella(solicitudCompleto.getCandadoBotella());
                    solSelloLlegada.setStickerLlegada(solicitudCompleto.getStickerLlegada());
                    solSelloLlegada.setRastreoSatelital(solicitudCompleto.getRastreoSatelital());
                    solSelloLlegada.setSelloCadena(solicitudCompleto.getSelloCadena());
                    solSelloLlegada.setStickerNaviera(solicitudCompleto.getStickerNaviera());
                    solSelloLlegada.setSelloLlegada1(solicitudCompleto.getSelloLlegada1());
                    solSelloLlegada.setSelloLlegada2(solicitudCompleto.getSelloLlegada2());
                    solSelloLlegada.setStickerPatioVentolera1(solicitudCompleto.getStickerPatioVentolera1());
                    solSelloLlegada.setStickerPatioVentolera2(solicitudCompleto.getStickerPatioVentolera2());
                    solSelloLlegada.setNroSerie(solicitudCompleto.getNroSerie());
                    solSelloLlegada.setCandadoExportador(solicitudCompleto.getCandadoExportador());
                    solSelloLlegada.setObservacion(solicitudCompleto.getObservacionSA());
                    solSelloLlegada = iSolSelloLlegadaDao.save(solSelloLlegada, solicitudCompleto.getEstRegSA());
                }
            }

            if (solicitudCompleto.getAreaAGuardar().equals("Todos") || solicitudCompleto.getAreaAGuardar().equals("SelloInstalado") ) {
                if (!solicitudCompleto.getEstRegSI().equals("")) {
                    solSelloInstalado.setIdSolSelloInstalado(solicitudCompleto.getIdSolSelloInstalado());
                    solSelloInstalado.setIdSolicitud(solicitudCompleto.getIdSolicitud());
                    solSelloInstalado.setCandadoNaviera(solicitudCompleto.getCandadoNaviera());
                    solSelloInstalado.setSelloVerificadora(solicitudCompleto.getSelloVerificadora());
                    solSelloInstalado.setCableNaviera(solicitudCompleto.getCableNaviera());
                    solSelloInstalado.setCableExportadora(solicitudCompleto.getCableExportadora());
                    //solSelloInstalado.setStickerNaviera(solicitudCompleto.getStickerNaviera());
                    solSelloInstalado.setStickerExportadora(solicitudCompleto.getStickerExportadora());
                    solSelloInstalado.setRastreo(solicitudCompleto.getRastreo());
                    solSelloInstalado.setTermografo1(solicitudCompleto.getTermografo1());
                    solSelloInstalado.setUbicacion1(solicitudCompleto.getUbicacion1());
                    solSelloInstalado.setTermografo2(solicitudCompleto.getTermografo2());
                    solSelloInstalado.setUbicacion2(solicitudCompleto.getUbicacion2());
                    solSelloInstalado.setFiltroProporcionado(solicitudCompleto.getFiltroProporcionado());
                    solSelloInstalado.setTermoking(solicitudCompleto.getTermoking());
                    solSelloInstalado = iSolSelloInstaladoDao.save(solSelloInstalado, solicitudCompleto.getEstRegSI());
                }
            }

            if (solicitudCompleto.getAreaAGuardar().equals("Todos") || solicitudCompleto.getAreaAGuardar().equals("Transportista") ) {
                if (!solicitudCompleto.getEstRegTra().equals("")) {
                    solTransportista.setIdSolTransportista(solicitudCompleto.getIdSolTransportista());
                    solTransportista.setIdSolicitud(solicitudCompleto.getIdSolicitud());
                    solTransportista.setCompania(solicitudCompleto.getCompania());
                    solTransportista.setChofer(solicitudCompleto.getChofer());
                    solTransportista.setCedula(solicitudCompleto.getCedula());
                    solTransportista.setCelular(solicitudCompleto.getCelular());
                    solTransportista.setPlaca(solicitudCompleto.getPlaca());
                    solTransportista.setColorCabezal(solicitudCompleto.getColorCabezal());
                    solTransportista.setMarcaCabezal(solicitudCompleto.getMarcaCabezal());
                    solTransportista.setObservacion(solicitudCompleto.getObservacionTra());
                    solTransportista = iSolTransportistaDao.save(solTransportista, solicitudCompleto.getEstRegTra());
                }
            }

            if (solicitudCompleto.getAreaAGuardar().equals("Todos") || solicitudCompleto.getAreaAGuardar().equals("Proceso") ) {
                if (!solicitudCompleto.getEstRegPro().equals("")) {
                    solProceso.setIdSolProceso(solicitudCompleto.getIdSolProceso());
                    solProceso.setIdSolicitud(solicitudCompleto.getIdSolicitud());
                    //solProceso.setIdSolProductor(solicitudCompleto.getIdSolProductor());
                    solProceso.setCajaProcesada(solicitudCompleto.getCajaProcesada());
                    solProceso.setTipoFruta(solicitudCompleto.getTipoFruta());
                    solProceso.setTipoFunda(solicitudCompleto.getTipoFunda());
                    solProceso.setDensidadFunda(solicitudCompleto.getDensidadFunda());
                    solProceso.setTipoCaja(solicitudCompleto.getTipoCaja());
                    solProceso.setTipoPresentacion(solicitudCompleto.getTipoPresentacion());
                    solProceso.setTipoEstiba(solicitudCompleto.getTipoEstiba());
                    solProceso.setTiempoDescarga(solicitudCompleto.getTiempoDescarga());
                    solProceso.setTipoCantulina(solicitudCompleto.getTipoCantulina());
                    solProceso = iSolProcesoDao.save(solProceso, solicitudCompleto.getEstRegPro());
                }
            }

            if (solicitudCompleto.getAreaAGuardar().equals("Todos") || solicitudCompleto.getAreaAGuardar().equals("ControlPeso") ) {
                if (!solicitudCompleto.getEstRegCtr().equals("")) {
                    solControlPeso.setIdSolControlPeso(solicitudCompleto.getIdSolControlPeso());
                    solControlPeso.setIdSolicitud(solicitudCompleto.getIdSolicitud());
                    //solControlPeso.setIdSolProductor(solicitudCompleto.getIdSolProductor());
                    solControlPeso.setBalanzaRepesa(solicitudCompleto.getBalanzaRepesa());
                    solControlPeso.setCondicionBalanza(solicitudCompleto.getCondicionBalanza());
                    solControlPeso.setTipoBalanza(solicitudCompleto.getTipoBalanza());
                    solControlPeso.setPesoNetoFruta(solicitudCompleto.getPesoNetoFruta());
                    solControlPeso.setObservacion(solicitudCompleto.getObservacionCtr());
                    solControlPeso = iSolControlPesoDao.save(solControlPeso, solicitudCompleto.getEstRegCtr());
                }
            }

            if (solicitudCompleto.getAreaAGuardar().equals("Todos") || solicitudCompleto.getAreaAGuardar().equals("Finca") ) {
                if (!solicitudCompleto.getEstRegFin().equals("")) {
                    solFinca.setIdSolFinca(solicitudCompleto.getIdSolFinca());
                    solFinca.setIdSolicitud(solicitudCompleto.getIdSolicitud());
                    //solFinca.setIdSolProductor(solicitudCompleto.getIdSolProductor());
                    solFinca.setNombre(solicitudCompleto.getNombre());
                    solFinca.setFuenteAgua(solicitudCompleto.getFuenteAgua());
                    solFinca.setAguaCorrida(solicitudCompleto.getAguaCorrida());
                    solFinca.setEstadoPiso(solicitudCompleto.getEstadoPiso());
                    solFinca.setCableVia(solicitudCompleto.getCableVia());
                    solFinca.setEstadoTecho(solicitudCompleto.getEstadoTecho());
                    solFinca.setEstadoTina(solicitudCompleto.getEstadoTina());
                    solFinca.setFumigacion(solicitudCompleto.getFumigacion());
                    solFinca.setLavadoRacimo(solicitudCompleto.getLavadoRacimo());
                    solFinca.setEmbudo(solicitudCompleto.getEmbudo());
                    solFinca.setDivisionTina(solicitudCompleto.getDivisionTina());
                    solFinca = iSolFincaDao.save(solFinca, solicitudCompleto.getEstRegFin());
                }
            }

            if (solicitudCompleto.getListSolCalidad() != null) {
                solicitudCompleto.getListSolCalidad().forEach(calidad -> {
                    Long idSolCalidad = 0L;
                    TabSolCalidadDto solCalidad = new TabSolCalidadDto();
                    //solCalidad.setIdSolCalidad(calidad.getIdSolCalidad());
                    solCalidad.setIdSolicitud(solicitudCompleto.getIdSolicitud());

                    solCalidad.setNomMarca(calidad.getNomMarca());
                    solCalidad.setNroQs(calidad.getNroQs());
                    solCalidad.setGuiaTransporte(calidad.getGuiaTransporte());
                    solCalidad.setGuiaRemision(calidad.getGuiaRemision());
                    solCalidad.setDefectuoso(calidad.getDefectuoso());
                    solCalidad.setTarjetaEmbarque(calidad.getTarjetaEmbarque());
                    solCalidad.setTotalEmbarcado(calidad.getTotalEmbarcado());
                    solCalidad.setTotalCluster(calidad.getTotalCluster());
                    solCalidad.setTotalDefecto(calidad.getTotalDefecto());
                    solCalidad.setCalidad(calidad.getCalidad());
                    solCalidad.setCalibracion(calidad.getCalibracion());
                    solCalidad.setLargoDedo(calidad.getLargoDedo());
                    solCalidad.setTotalPeso(calidad.getTotalPeso());
                    solCalidad.setPesoPromedio(calidad.getPesoPromedio());
                    solCalidad.setMayorDefectoSeleccion(calidad.getMayorDefectoSeleccion());
                    solCalidad.setMayorDefectoEmpaque(calidad.getMayorDefectoEmpaque());
                    solCalidad = iSolCalidadDao.save(solCalidad, calidad.getEstRegCal());
                    idSolCalidad = solCalidad.getIdSolCalidad();

                    Long finalIdSolCalidad = idSolCalidad;
                    if (calidad.getListSolCalDefectoSeleccion() != null) {
                        calidad.getListSolCalDefectoSeleccion().forEach(defecto -> {
                            TabSolCalDefectoSeleccionDto solDefectoSeleccion = new TabSolCalDefectoSeleccionDto();
                            //solDefectoSeleccion.setIdSolCalDefectoSeleccion(defecto.getIdSolCalDefectoSeleccion());
                            solDefectoSeleccion.setIdSolCalidad(finalIdSolCalidad);
                            solDefectoSeleccion.setPeso(defecto.getPeso());
                            solDefectoSeleccion.setNumGanchoInspeccionado(defecto.getNumGanchoInspeccionado());
                            solDefectoSeleccion.setPh(defecto.getPh());
                            solDefectoSeleccion.setSr(defecto.getSr());
                            solDefectoSeleccion.setBr(defecto.getBr());
                            solDefectoSeleccion.setNi(defecto.getNi());
                            solDefectoSeleccion.setMf(defecto.getMf());
                            solDefectoSeleccion.setCt(defecto.getCt());
                            solDefectoSeleccion.setFl(defecto.getFl());
                            solDefectoSeleccion.setDp(defecto.getDp());
                            solDefectoSeleccion.setUg(defecto.getUg());
                            solDefectoSeleccion.setOg(defecto.getOg());
                            solDefectoSeleccion.setLs(defecto.getLs());
                            solDefectoSeleccion.setLg(defecto.getLg());
                            solDefectoSeleccion.setBm(defecto.getBm());
                            solDefectoSeleccion.setTs(defecto.getTs());
                            solDefectoSeleccion.setCs(defecto.getCs());
                            solDefectoSeleccion.setWi(defecto.getWi());
                            solDefectoSeleccion.setSk(defecto.getSk());
                            solDefectoSeleccion.setYb(defecto.getYb());
                            solDefectoSeleccion.setRr(defecto.getRr());
                            solDefectoSeleccion.setTc(defecto.getTc());
                            solDefectoSeleccion.setSp(defecto.getSp());
                            solDefectoSeleccion.setSm(defecto.getSm());
                            solDefectoSeleccion.setTr(defecto.getTr());
                            solDefectoSeleccion.setAb(defecto.getAb());
                            solDefectoSeleccion.setCh(defecto.getCh());
                            solDefectoSeleccion.setTf(defecto.getTf());
                            solDefectoSeleccion.setUd(defecto.getUd());
                            solDefectoSeleccion.setPd(defecto.getPd());
                            solDefectoSeleccion.setFf(defecto.getFf());
                            solDefectoSeleccion.setBs(defecto.getBs());
                            solDefectoSeleccion.setDt(defecto.getDt());
                            solDefectoSeleccion.setSre(defecto.getSre());
                            solDefectoSeleccion.setBre(defecto.getBre());
                            solDefectoSeleccion.setNie(defecto.getNie());
                            solDefectoSeleccion.setFre(defecto.getFre());
                            solDefectoSeleccion.setSc(defecto.getSc());
                            solDefectoSeleccion.setMl(defecto.getMl());
                            solDefectoSeleccion.setMd(defecto.getMd());
                            solDefectoSeleccion.setEc(defecto.getEc());
                            solDefectoSeleccion.setV(defecto.getV());
                            solDefectoSeleccion.setF(defecto.getF());
                            solDefectoSeleccion.setEa(defecto.getEa());
                            solDefectoSeleccion.setPs(defecto.getPs());
                            solDefectoSeleccion = iSolCalDefectoSeleccionDao.save(solDefectoSeleccion, defecto.getEstRegDS());
                        });
                    }

                    if (calidad.getEstRegClb().equals("NUE")) {
                        TabSolCalCalibreDto tabSolCalCalibreDto = new TabSolCalCalibreDto();
                        tabSolCalCalibreDto.setIdSolCalCalibre(tabSolCalCalibreDto.getIdSolCalCalibre());
                        //tabSolCalCalibreDto.setIdSolicitud(solicitudCompleto.getIdSolicitud());
                        tabSolCalCalibreDto.setIdSolCalidad(finalIdSolCalidad);
                        tabSolCalCalibreDto.setCalUg(calidad.getCalUg());
                        tabSolCalCalibreDto.setCalOg(calidad.getCalOg());
                        tabSolCalCalibreDto.setCal37(calidad.getCal37());
                        tabSolCalCalibreDto.setCal38(calidad.getCal38());
                        tabSolCalCalibreDto.setCal39(calidad.getCal39());
                        tabSolCalCalibreDto.setCal40(calidad.getCal40());
                        tabSolCalCalibreDto.setCal41(calidad.getCal41());
                        tabSolCalCalibreDto.setCal42(calidad.getCal42());
                        tabSolCalCalibreDto.setCal43(calidad.getCal43());
                        tabSolCalCalibreDto.setCal44(calidad.getCal44());
                        tabSolCalCalibreDto.setCal45(calidad.getCal45());
                        tabSolCalCalibreDto.setCal46(calidad.getCal46());
                        tabSolCalCalibreDto.setCal47(calidad.getCal47());
                        tabSolCalCalibreDto.setCal48(calidad.getCal48());
                        tabSolCalCalibreDto.setCal49(calidad.getCal49());
                        tabSolCalCalibreDto.setCal50(calidad.getCal50());
                        tabSolCalCalibreDto.setCal51(calidad.getCal51());
                        tabSolCalCalibreDto.setCal52(calidad.getCal52());
                        tabSolCalCalibreDto.setCal53(calidad.getCal53());
                        tabSolCalCalibreDto.setCal54(calidad.getCal54());
                        tabSolCalCalibreDto = iSolCalCalibreDao.save(tabSolCalCalibreDto, calidad.getEstRegClb());
                    }

                    if (calidad.getEstRegLD().equals("NUE")) {
                        TabSolCalLargoDedoDto tabSolCalLargoDedoDto = new TabSolCalLargoDedoDto();
                        tabSolCalLargoDedoDto.setIdSolCalLargoDedo(tabSolCalLargoDedoDto.getIdSolCalLargoDedo());
                        tabSolCalLargoDedoDto.setIdSolicitud(solicitudCompleto.getIdSolicitud());
                        tabSolCalLargoDedoDto.setIdSolCalidad(finalIdSolCalidad);
                        tabSolCalLargoDedoDto.setLar80(calidad.getLar80());
                        tabSolCalLargoDedoDto.setLar82(calidad.getLar82());
                        tabSolCalLargoDedoDto.setLar84(calidad.getLar84());
                        tabSolCalLargoDedoDto.setLar86(calidad.getLar86());
                        tabSolCalLargoDedoDto.setLar88(calidad.getLar88());
                        tabSolCalLargoDedoDto.setLar90(calidad.getLar90());
                        tabSolCalLargoDedoDto.setLar92(calidad.getLar92());
                        tabSolCalLargoDedoDto.setLar94(calidad.getLar94());
                        tabSolCalLargoDedoDto.setLar96(calidad.getLar96());
                        tabSolCalLargoDedoDto.setLar98(calidad.getLar98());
                        tabSolCalLargoDedoDto.setLar100(calidad.getLar100());
                        tabSolCalLargoDedoDto.setLar102(calidad.getLar102());
                        tabSolCalLargoDedoDto.setLar104(calidad.getLar104());
                        tabSolCalLargoDedoDto.setLar106(calidad.getLar106());
                        tabSolCalLargoDedoDto.setLar108(calidad.getLar108());
                        tabSolCalLargoDedoDto.setLar110(calidad.getLar110());
                        tabSolCalLargoDedoDto.setLar112(calidad.getLar112());
                        tabSolCalLargoDedoDto.setLar114(calidad.getLar114());
                        tabSolCalLargoDedoDto.setLar116(calidad.getLar116());
                        tabSolCalLargoDedoDto.setLar118(calidad.getLar118());
                        tabSolCalLargoDedoDto = iSolCalLargoDedoDao.save(tabSolCalLargoDedoDto, calidad.getEstRegLD());
                    }

                    if (calidad.getListSolCalPesoCluster() != null) {
                        calidad.getListSolCalPesoCluster().forEach(peso -> {
                            TabSolCalPesoClusterDto tabSolCalPesoClusterDto = new TabSolCalPesoClusterDto();
                            tabSolCalPesoClusterDto.setIdSolCalPesoCluster(peso.getIdSolCalPesoCluster());
                            tabSolCalPesoClusterDto.setIdSolCalidad(finalIdSolCalidad);

                            tabSolCalPesoClusterDto.setNumero(peso.getNumero());
                            tabSolCalPesoClusterDto.setPeso(peso.getPeso());
                            tabSolCalPesoClusterDto = iSolCalPesoClusterDao.save(tabSolCalPesoClusterDto, peso.getEstRegPC());
                        });
                    }
                    if (calidad.getListSolCalPackingList() != null) {
                        calidad.getListSolCalPackingList().forEach(packing -> {
                            TabSolCalPackingListDto tabSolCalPackingListDto = new TabSolCalPackingListDto();
                            tabSolCalPackingListDto.setIdSolCalPackingList(packing.getIdSolCalPackingList());
                            tabSolCalPackingListDto.setIdSolCalidad(finalIdSolCalidad);

                            tabSolCalPackingListDto.setNumeracion(packing.getNumeracion());
                            tabSolCalPackingListDto.setSticker(packing.getSticker());
                            tabSolCalPackingListDto = iSolCalPackingListDao.save(tabSolCalPackingListDto, packing.getEstRegPL());
                        });
                    }
                });
            }

            Long idSolConsolidadoGancho = 0L;
            if (solicitudCompleto.getAreaAGuardar().equals("Todos") || solicitudCompleto.getAreaAGuardar().equals("ConsolidadoGancho") ) {
                if (!solicitudCompleto.getEstRegCG().equals("")) {
                    TabSolConsolidadoGanchoDto solConsolidadoGancho = new TabSolConsolidadoGanchoDto();
                    solConsolidadoGancho.setIdSolConsolidadoGancho(solicitudCompleto.getIdSolConsolidadoGancho());
                    solConsolidadoGancho.setIdSolicitud(solicitudCompleto.getIdSolicitud());

                    solConsolidadoGancho.setEnFunde(solicitudCompleto.getEnFunde());
                    solConsolidadoGancho.setRacimoCosechado(solicitudCompleto.getRacimoCosechado());
                    solConsolidadoGancho.setRacimoRechazado(solicitudCompleto.getRacimoRechazado());
                    solConsolidadoGancho.setRacimoProcesado(solicitudCompleto.getRacimoProcesado());
                    solConsolidadoGancho.setMutante(solicitudCompleto.getMutante());
                    solConsolidadoGancho.setSpacklin(solicitudCompleto.getSpacklin());
                    solConsolidadoGancho.setPuntaAmarilla(solicitudCompleto.getPuntaAmarilla());
                    solConsolidadoGancho.setCrema(solicitudCompleto.getCrema());
                    solConsolidadoGancho.setManchaRoja(solicitudCompleto.getManchaRoja());
                    solConsolidadoGancho.setAlterado(solicitudCompleto.getAlterado());
                    solConsolidadoGancho.setPobre(solicitudCompleto.getPobre());
                    solConsolidadoGancho.setCaido(solicitudCompleto.getCaido());
                    solConsolidadoGancho.setSobreGrado(solicitudCompleto.getSobreGrado());
                    solConsolidadoGancho.setBajoGrado(solicitudCompleto.getBajoGrado());
                    solConsolidadoGancho.setMosaico(solicitudCompleto.getMosaico());
                    solConsolidadoGancho.setRasgunoAnimal(solicitudCompleto.getRasgunoAnimal());
                    solConsolidadoGancho.setExplosivo(solicitudCompleto.getExplosivo());
                    solConsolidadoGancho.setHerwinea(solicitudCompleto.getHerwinea());
                    solConsolidadoGancho.setSinCinta(solicitudCompleto.getSinCinta());
                    solConsolidadoGancho.setCochinilla(solicitudCompleto.getCochinilla());
                    solConsolidadoGancho.setEscama(solicitudCompleto.getEscama());
                    solConsolidadoGancho.setFumagina(solicitudCompleto.getFumagina());
                    solConsolidadoGancho.setPesonudo(solicitudCompleto.getPesonudo());
                    solConsolidadoGancho.setObservacion(solicitudCompleto.getObservacionCG());

                    solConsolidadoGancho = iSolConsolidadoGanchoDao.save(solConsolidadoGancho, solicitudCompleto.getEstRegCG());
                    idSolConsolidadoGancho = solConsolidadoGancho.getIdSolConsolidadoGancho();
                }
            }

            Long finalIdSolConsolidadoGancho = idSolConsolidadoGancho;
            if (solicitudCompleto.getListSolCalibracion() != null) {
                solicitudCompleto.getListSolCalibracion().forEach(fruta -> {
                    TabSolConCalibracionFrutaDto tabSolConCalibracionFrutaDto = new TabSolConCalibracionFrutaDto();
                    tabSolConCalibracionFrutaDto.setIdSolConCalibracionFruta(fruta.getIdSolConCalibracionFruta());
                    tabSolConCalibracionFrutaDto.setIdSolConsolidadoGancho(finalIdSolConsolidadoGancho);

                    tabSolConCalibracionFrutaDto.setNumSemana(fruta.getNumSemana());
                    tabSolConCalibracionFrutaDto.setColor(fruta.getColor());
                    tabSolConCalibracionFrutaDto.setNumRacimo(fruta.getNumRacimo());
                    tabSolConCalibracionFrutaDto = iSolConCalibracionFrutaDao.save(tabSolConCalibracionFrutaDto, fruta.getEstRegCF());
                });
            }

            if (solicitudCompleto.getListSolImagen() != null) {
                TabSolContenedorDto finalSolContenedor = solContenedor;
                TabSolSelloLlegadaDto finalSolSelloLlegada = solSelloLlegada;
                TabSolSelloInstaladoDto finalSolSelloInstalado = solSelloInstalado;
                TabSolTransportistaDto finalSolTransportista = solTransportista;
                TabSolProcesoDto finalSolProceso = solProceso;
                TabSolControlPesoDto finalSolControlPeso = solControlPeso;
                TabSolFincaDto finalSolFinca = solFinca;

                solicitudCompleto.getListSolImagen().forEach(ima -> {
                    TabSolImagenDto tabSolImagenDto = new TabSolImagenDto();

                    tabSolImagenDto.setIdSolicitud(ima.getIdSolicitud());
                    if (ima.getIdDatoGeneral() > 0)
                        tabSolImagenDto.setIdSolicitud(ima.getIdSolicitud());

                    if (ima.getIdSolContenedor() > 0)
                        tabSolImagenDto.setIdSolContenedor(finalSolContenedor.getIdSolContenedor());

                    if (ima.getIdSolSelloLlegada() > 0)
                        tabSolImagenDto.setIdSolSelloLlegada(finalSolSelloLlegada.getIdSolSelloLlegada());

                    if (ima.getIdSolSelloInstalado() > 0)
                        tabSolImagenDto.setIdSolSelloInstalado(finalSolSelloInstalado.getIdSolSelloInstalado());

                    if (ima.getIdSolTransportista() > 0)
                        tabSolImagenDto.setIdSolTransportista(finalSolTransportista.getIdSolTransportista());

                    if (ima.getIdSolProceso() > 0)
                        tabSolImagenDto.setIdSolProceso(finalSolProceso.getIdSolProceso());

                    if (ima.getIdSolControlPeso() > 0)
                        tabSolImagenDto.setIdSolControlPeso(finalSolControlPeso.getIdSolControlPeso());

                    if (ima.getIdSolFinca() > 0)
                        tabSolImagenDto.setIdSolFinca(finalSolFinca.getIdSolFinca());

                    if (ima.getIdSolConsolidadoGancho() > 0)
                        tabSolImagenDto.setIdSolConsolidadoGancho(finalIdSolConsolidadoGancho);

                    /*
                    if (ima.getIdSolCalidad() > 0)
                        tabSolImagenDto.setIdSolCalidad(idSolCalidad);

                    if (ima.getIdSolCalPackingList() > 0)
                        tabSolImagenDto.setIdSolCalPackingList(idSolCalPackingList);
                    */

                    tabSolImagenDto.setNombre(ima.getNombre());
                    tabSolImagenDto.setDescripcion(ima.getDescripcion());
                    tabSolImagenDto.setSeccion(ima.getSeccion());
                    tabSolImagenDto.setCargar(ima.getCargar());
                    tabSolImagenDto.setImagen(ima.getImagen());
                    tabSolImagenDto = iSolImagenDao.save(tabSolImagenDto, ima.getEstRegIma());
                });
            }

            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.GUARDA_OK, "OK");

        } catch (Exception e) {
            if (solicitudCompleto.getAreaAGuardar().equals("Todos")) {
                iSolicitudDao.delete(solicitudCompleto.getIdSolicitud());
            }
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.GUARDA_ERR, "Error");
        }
    }
}



    /*

    @RequestMapping(value = "guardarSolicitudProducto", method = RequestMethod.POST)
    public ApiResponse<String> guardarSolicitudProducto(@RequestBody SolicitudCompletaDto solicitudCompleto) {
        try {
            final Long idSolicitud;
            TabSolicitudDto solicitud = new TabSolicitudDto();
            solicitud.setIdSolicitud(solicitudCompleto.getIdSolicitud());
            solicitud.setSemana(solicitudCompleto.getNroSemana());
            solicitud.setExportador(solicitudCompleto.getExportador());
            solicitud.setCliente(solicitudCompleto.getCliente());
            solicitud.setTipoSolicitud(solicitudCompleto.getTipoSolicitud());
            solicitud.setProductor(solicitudCompleto.getProductor());
            solicitud.setCodigoProductor(solicitudCompleto.getCodigoProductor());
            solicitud.setCodigoMagap(solicitudCompleto.getCodigoMagap());
            solicitud.setPuertoEmbarque(solicitudCompleto.getPuertoEmbarque());
            solicitud.setZona(solicitudCompleto.getZona());
            solicitud.setFechaInicio(solicitudCompleto.getFechaInicio());
            solicitud.setFechaTermino(solicitudCompleto.getFechaTermino());
            solicitud.setContenedor(solicitudCompleto.getContenedor());
            solicitud.setNomEvaluador01(solicitudCompleto.getNomEvaluador01());
            solicitud.setCiEvaluador01(solicitudCompleto.getCiEvaluador01());
            solicitud.setNomEvaluador02(solicitudCompleto.getNomEvaluador02());
            solicitud.setCiEvaluador02(solicitudCompleto.getCiEvaluador02());
            solicitud.setObservacion(solicitudCompleto.getObservacion());
            idSolicitud = iSolicitudDao.save(solicitud, solicitudCompleto.getEstRegSol());
            String ids = idSolicitud.toString();

            TabSolContenedorDto solContenedor = new TabSolContenedorDto();
            solContenedor.setIdSolContenedor(solicitudCompleto.getIdSolContenedor());
            solContenedor.setIdSolicitud(idSolicitud);
            solContenedor.setNumeroContenedor(solicitudCompleto.getNumeroContenedor());
            solContenedor.setVapor(solicitudCompleto.getVapor());
            solContenedor.setBooking(solicitudCompleto.getBooking());
            solContenedor.setTipoContenedor(solicitudCompleto.getTipoContenedor());
            solContenedor.setAgenciaNaviera(solicitudCompleto.getAgenciaNaviera());
            solContenedor.setTare(solicitudCompleto.getTare());
            solContenedor.setMaxGross(solicitudCompleto.getMaxGross());
            solContenedor.setPuertoSalida(solicitudCompleto.getPuertoSalida());
            solContenedor.setFechaLlegada(solicitudCompleto.getFechaLlegada());
            solContenedor.setFechaApertura(solicitudCompleto.getFechaApertura());
            solContenedor.setFechaCierre(solicitudCompleto.getFechaCierre());
            solContenedor.setFechaSalida(solicitudCompleto.getFechaSalida());
            solContenedor.setObservacion(solicitudCompleto.getObservacion());
            solContenedor = iSolContenedorDao.save(solContenedor, solicitudCompleto.getEstRegCon());
            solicitudCompleto.setIdSolContenedor(solContenedor.getIdSolContenedor());
            //ids = ids + "," + solContenedor.getIdSolContenedor().toString();

            TabSolSelloLlegadaDto solSelloLlegada = new TabSolSelloLlegadaDto();
            solSelloLlegada.setIdSolSelloLlegada(solicitudCompleto.getIdSolSelloLlegada());
            solSelloLlegada.setIdSolicitud(idSolicitud);
            solSelloLlegada.setCandadoPlastico(solicitudCompleto.getCandadoPlastico());
            solSelloLlegada.setCandadoBotella(solicitudCompleto.getCandadoBotella());
            solSelloLlegada.setStickerLlegada(solicitudCompleto.getStickerLlegada());
            solSelloLlegada.setRastreoSatelital(solicitudCompleto.getRastreoSatelital());
            solSelloLlegada.setSelloCadena(solicitudCompleto.getSelloCadena());
            solSelloLlegada.setStickerNavieraVentilador(solicitudCompleto.getStickerNavieraVentilador());
            solSelloLlegada.setSelloLlegadaInterno01(solicitudCompleto.getSelloLlegadaInterno01());
            solSelloLlegada.setSelloLlegadaInterno02(solicitudCompleto.getSelloLlegadaInterno02());
            solSelloLlegada.setStickerPatioVentoleraExterna01(solicitudCompleto.getStickerPatioVentoleraExterna01());
            solSelloLlegada.setStickerPatioVentoleraExterna02(solicitudCompleto.getStickerPatioVentoleraExterna02());
            solSelloLlegada.setNroSerieFunda(solicitudCompleto.getNroSerieFunda());
            solSelloLlegada.setCandadoExportador(solicitudCompleto.getCandadoExportador());
            solSelloLlegada.setObservacion(solicitudCompleto.getObservacionSL());
            solSelloLlegada = iSolSelloLlegadaDao.save(solSelloLlegada);
            solicitudCompleto.setIdSolSelloLlegada(solSelloLlegada.getIdSolSelloLlegada());
            //ids = ids + "," + solSelloLlegada.getIdSolSelloLlegada().toString();

            TabSolSelloInstaladoDto solSelloInstalado = new TabSolSelloInstaladoDto();
            solSelloInstalado.setIdSolSelloInstalado(solicitudCompleto.getIdSolSelloInstalado());
            solSelloInstalado.setIdSolicitud(idSolicitud);
            solSelloInstalado.setCandadoNaviera(solicitudCompleto.getCandadoNaviera());
            solSelloInstalado.setSelloVerificador(solicitudCompleto.getSelloVerificador());
            solSelloInstalado.setCableNaviera(solicitudCompleto.getCableNaviera());
            solSelloInstalado.setCableExportadora(solicitudCompleto.getCableExportadora());
            solSelloInstalado.setStickerNaviera(solicitudCompleto.getStickerNaviera());
            solSelloInstalado.setStickerExportadora(solicitudCompleto.getStickerExportadora());
            solSelloInstalado.setRastreo(solicitudCompleto.getRastreo());
            solSelloInstalado.setTermografo01(solicitudCompleto.getTermografo01());
            solSelloInstalado.setUbicacionTermografo01(solicitudCompleto.getUbicacionTermografo01());
            solSelloInstalado.setTermografo02(solicitudCompleto.getTermografo02());
            solSelloInstalado.setUbicacionTermografo02(solicitudCompleto.getUbicacionTermografo02());
            solSelloInstalado.setFiltroProporcionado(solicitudCompleto.getFiltroProporcionado());
            solSelloInstalado.setTermoking(solicitudCompleto.getTermoking());
            solSelloInstalado = iSolSelloInstaladoDao.save(solSelloInstalado);
            solicitudCompleto.setIdSolSelloInstalado(solSelloInstalado.getIdSolSelloInstalado());
            //ids = ids + "," + solSelloInstalado.getIdSolSelloInstalado().toString();

            solicitudCompleto.getListSolProductorDto().forEach(productor ->{
                TabSolTransportistaDto solTransportista = new TabSolTransportistaDto();
                solTransportista.setIdSolTransportista(productor.getSolTransportistaDto().getIdSolTransportista());
                solTransportista.setIdSolProductor(productor.getSolTransportistaDto().getIdSolProductor());
                solTransportista.setIdSolicitud(idSolicitud);
                solTransportista.setEmpresaTransporte(productor.getSolTransportistaDto().getEmpresaTransporte());
                solTransportista.setChofer(productor.getSolTransportistaDto().getChofer());
                solTransportista.setCedula(productor.getSolTransportistaDto().getCedula());
                solTransportista.setCelular(productor.getSolTransportistaDto().getCelular());
                solTransportista.setPlaca(productor.getSolTransportistaDto().getPlaca());
                solTransportista.setColorCabezal(productor.getSolTransportistaDto().getColorCabezal());
                solTransportista.setMarcaCabezal(productor.getSolTransportistaDto().getMarcaCabezal());
                solTransportista.setObservacion(productor.getSolTransportistaDto().getObservacion());
                solTransportista = iSolTransportistaDao.save(solTransportista);
                //solicitudCompleto.setIdSolTransportista(solTransportista.getIdSolTransportista());
                //ids = ids + "," + solTransportista.getIdSolTransportista().toString();

                TabSolProcesoDto solProceso = new TabSolProcesoDto();
                solProceso.setIdSolProceso(productor.getSolProcesoDto().getIdSolProceso());
                solProceso.setIdSolicitud(idSolicitud);
                solProceso.setIdSolProductor(productor.getSolProcesoDto().getIdSolProductor());
                solProceso.setCajaProcesadaDespachada(productor.getSolProcesoDto().getCajaProcesadaDespachada());
                solProceso.setTipoFruta(productor.getSolProcesoDto().getTipoFruta());
                solProceso.setTipoFunda(productor.getSolProcesoDto().getTipoFunda());
                solProceso.setDensidadFunda(productor.getSolProcesoDto().getDensidadFunda());
                solProceso.setTipoCaja(productor.getSolProcesoDto().getTipoCaja());
                solProceso.setTipoPresentacion(productor.getSolProcesoDto().getTipoPresentacion());
                solProceso.setTipoEstiba(productor.getSolProcesoDto().getTipoEstiba());
                solProceso.setTiempoDescargaFumigacion(productor.getSolProcesoDto().getTiempoDescargaFumigacion());
                solProceso.setTipoCantulina(productor.getSolProcesoDto().getTipoCantulina());
                solProceso = iSolProcesoDao.save(solProceso);
                //solicitudCompleto.setIdSolProceso(solProceso.getIdSolProceso());
                //ids = ids + "," + solProceso.getIdSolProceso().toString();

                TabSolControlPesoDto solControlPeso = new TabSolControlPesoDto();
                solControlPeso.setIdSolControlPeso(productor.getSolControlPesoDto().getIdSolControlPeso());
                solControlPeso.setIdSolicitud(idSolicitud);
                solControlPeso.setIdSolProductor(productor.getSolControlPesoDto().getIdSolProductor());
                solControlPeso.setBalanzaRepesa(productor.getSolControlPesoDto().getBalanzaRepesa());
                solControlPeso.setCondicionBalanza(productor.getSolControlPesoDto().getCondicionBalanza());
                solControlPeso.setTipoBalanza(productor.getSolControlPesoDto().getTipoBalanza());
                solControlPeso.setPesoNetoFruta(productor.getSolControlPesoDto().getPesoNetoFruta());
                solControlPeso.setObservacion(productor.getSolControlPesoDto().getObservacion());
                solControlPeso = iSolControlPesoDao.save(solControlPeso);
                //solicitudCompleto.setIdSolControlPeso(solControlPeso.getIdSolControlPeso());
                //ids = ids + "," + solControlPeso.getIdSolControlPeso().toString();

                TabSolFincaDto solFinca = new TabSolFincaDto();
                solFinca.setIdSolFinca(productor.getSolFincaDto().getIdSolFinca());
                solFinca.setIdSolicitud(idSolicitud);
                solFinca.setIdSolProductor(productor.getSolFincaDto().getIdSolProductor());
                solFinca.setNombre(productor.getSolFincaDto().getNombre());
                solFinca.setFuenteAgua(productor.getSolFincaDto().getFuenteAgua());
                solFinca.setAguaCorrida(productor.getSolFincaDto().getAguaCorrida());
                solFinca.setEstadoPiso(productor.getSolFincaDto().getEstadoPiso());
                solFinca.setCableVia(productor.getSolFincaDto().getCableVia());
                solFinca.setEstadoTecho(productor.getSolFincaDto().getEstadoTecho());
                solFinca.setEstadoTina(productor.getSolFincaDto().getEstadoTina());
                solFinca.setFumigacion(productor.getSolFincaDto().getFumigacion());
                solFinca.setLavadoRacimo(productor.getSolFincaDto().getLavadoRacimo());
                solFinca.setEmbudo(productor.getSolFincaDto().getEmbudo());
                solFinca.setDivisionTina(productor.getSolFincaDto().getDivisionTina());
                solFinca = iSolFincaDao.save(solFinca);
                //solicitudCompleto.setIdSolFinca(solFinca.getIdSolFinca());
                //ids = ids + "," + solFinca.getIdSolFinca().toString();

                productor.getListTabSolCalidadDto().forEach(calidad ->{

                    TabSolCalidadDto solCalidad = new TabSolCalidadDto();
                    solCalidad.setIdSolCalidad(calidad.getIdSolCalidad());
                    solCalidad.setIdSolicitud(idSolicitud);

                    solCalidad.setNombreMarca(calidad.getNombreMarca());
                    solCalidad.setNroQs(calidad.getNroQs());
                    solCalidad.setGuiaTransporte(calidad.getGuiaTransporte());
                    solCalidad.setGuiaRemision(calidad.getGuiaRemision());
                    solCalidad.setDefectuoso(calidad.getDefectuoso());
                    solCalidad.setTarjetaEmbarque(calidad.getTarjetaEmbarque());
                    solCalidad.setTotalCluster(calidad.getTotalCluster());
                    solCalidad.setTotalDefecto(calidad.getTotalDefecto());
                    solCalidad.setCalidad(calidad.getCalidad());
                    solCalidad.setLargoDedo(calidad.getLargoDedo());
                    solCalidad.setTotalPeso(calidad.getTotalPeso());
                    solCalidad.setPesoPromedio(calidad.getPesoPromedio());
                    solCalidad.setMayorDefectoSeleccion(calidad.getMayorDefectoSeleccion());
                    solCalidad.setMayorDefectoEmpaque(calidad.getMayorDefectoEmpaque());
                    solCalidad = iSolCalidadDao.save(solCalidad);
                    //solicitudCompleto.setIdSolCalidad(solCalidad.getIdSolCalidad());
                    //ids = ids + "," + solCalidad.getIdSolCalidad().toString();

                    calidad.getListTabSolCalDefectoSeleccionDto().forEach(defecto ->{
                        TabSolCalDefectoSeleccionDto solDefectoSeleccion = new TabSolCalDefectoSeleccionDto();
                        solDefectoSeleccion.setIdSolCalDefectoSeleccion(defecto.getIdSolCalDefectoSeleccion());
                        solDefectoSeleccion.setIdSolicitud(idSolicitud);

                        solDefectoSeleccion.setPeso(defecto.getPeso());
                        solDefectoSeleccion.setNumeroGanchoInspeccionado(defecto.getNumeroGanchoInspeccionado());
                        solDefectoSeleccion.setPh(defecto.getPh());
                        solDefectoSeleccion.setSr(defecto.getSr());
                        solDefectoSeleccion.setBr(defecto.getBr());
                        solDefectoSeleccion.setNi(defecto.getNi());
                        solDefectoSeleccion.setMf(defecto.getMf());
                        solDefectoSeleccion.setCt(defecto.getCt());
                        solDefectoSeleccion.setFl(defecto.getFl());
                        solDefectoSeleccion.setDp(defecto.getDp());
                        solDefectoSeleccion.setUg(defecto.getUg());
                        solDefectoSeleccion.setOg(defecto.getOg());
                        solDefectoSeleccion.setLs(defecto.getLs());
                        solDefectoSeleccion.setLg(defecto.getLg());
                        solDefectoSeleccion.setBm(defecto.getBm());
                        solDefectoSeleccion.setTs(defecto.getTs());
                        solDefectoSeleccion.setCs(defecto.getCs());
                        solDefectoSeleccion.setWi(defecto.getWi());
                        solDefectoSeleccion.setSk(defecto.getSk());
                        solDefectoSeleccion.setYb(defecto.getYb());
                        solDefectoSeleccion.setRr(defecto.getRr());
                        solDefectoSeleccion.setTc(defecto.getTc());
                        solDefectoSeleccion.setSp(defecto.getSp());
                        solDefectoSeleccion.setSm(defecto.getSm());
                        solDefectoSeleccion.setTr(defecto.getTr());
                        solDefectoSeleccion.setAb(defecto.getAb());
                        solDefectoSeleccion.setCh(defecto.getCh());
                        solDefectoSeleccion.setTf(defecto.getTf());
                        solDefectoSeleccion.setUd(defecto.getUd());
                        solDefectoSeleccion.setPd(defecto.getPd());
                        solDefectoSeleccion.setFf(defecto.getFf());
                        solDefectoSeleccion.setBs(defecto.getBs());
                        solDefectoSeleccion.setDt(defecto.getDt());
                        solDefectoSeleccion.setSre(defecto.getSre());
                        solDefectoSeleccion.setBre(defecto.getBre());
                        solDefectoSeleccion.setNie(defecto.getNie());
                        solDefectoSeleccion.setFre(defecto.getFre());
                        solDefectoSeleccion.setSc(defecto.getSc());
                        solDefectoSeleccion.setMl(defecto.getMl());
                        solDefectoSeleccion.setMd(defecto.getMd());
                        solDefectoSeleccion.setEc(defecto.getEc());
                        solDefectoSeleccion.setV(defecto.getV());
                        solDefectoSeleccion.setF(defecto.getF());
                        solDefectoSeleccion.setEa(defecto.getEa());
                        solDefectoSeleccion.setPs(defecto.getPs());

                        solDefectoSeleccion = iSolCalDefectoSeleccionDao.save(solDefectoSeleccion);
                        //solicitudCompleto.setIdSolDefectoSeleccion(solDefectoSeleccion.getIdSolDefectoSeleccion());
                        //ids = ids + "," + solDefectoSeleccion.getIdSolCalDefectoSeleccion().toString();
                    });


                    TabSolCalCalibreDto tabSolCalCalibreDto = new TabSolCalCalibreDto();
                    tabSolCalCalibreDto.setIdSolCalCalibre(tabSolCalCalibreDto.getIdSolCalCalibre());
                    tabSolCalCalibreDto.setIdSolicitud(idSolicitud);
                    tabSolCalCalibreDto.setCalUg(calidad.getTabSolCalCalibreDto().getCalUg());
                    tabSolCalCalibreDto.setCalOg(calidad.getTabSolCalCalibreDto().getCalOg());
                    tabSolCalCalibreDto.setCal37(calidad.getTabSolCalCalibreDto().getCal37());
                    tabSolCalCalibreDto.setCal38(calidad.getTabSolCalCalibreDto().getCal38());
                    tabSolCalCalibreDto.setCal39(calidad.getTabSolCalCalibreDto().getCal39());
                    tabSolCalCalibreDto.setCal40(calidad.getTabSolCalCalibreDto().getCal40());
                    tabSolCalCalibreDto.setCal41(calidad.getTabSolCalCalibreDto().getCal41());
                    tabSolCalCalibreDto.setCal42(calidad.getTabSolCalCalibreDto().getCal42());
                    tabSolCalCalibreDto.setCal43(calidad.getTabSolCalCalibreDto().getCal43());
                    tabSolCalCalibreDto.setCal44(calidad.getTabSolCalCalibreDto().getCal44());
                    tabSolCalCalibreDto.setCal45(calidad.getTabSolCalCalibreDto().getCal45());
                    tabSolCalCalibreDto.setCal46(calidad.getTabSolCalCalibreDto().getCal46());
                    tabSolCalCalibreDto.setCal47(calidad.getTabSolCalCalibreDto().getCal47());
                    tabSolCalCalibreDto.setCal48(calidad.getTabSolCalCalibreDto().getCal48());
                    tabSolCalCalibreDto.setCal49(calidad.getTabSolCalCalibreDto().getCal49());
                    tabSolCalCalibreDto.setCal50(calidad.getTabSolCalCalibreDto().getCal50());
                    tabSolCalCalibreDto.setCal51(calidad.getTabSolCalCalibreDto().getCal51());
                    tabSolCalCalibreDto.setCal52(calidad.getTabSolCalCalibreDto().getCal52());
                    tabSolCalCalibreDto.setCal53(calidad.getTabSolCalCalibreDto().getCal53());
                    tabSolCalCalibreDto.setCal54(calidad.getTabSolCalCalibreDto().getCal54());
                    tabSolCalCalibreDto = iSolCalCalibreDao.save(tabSolCalCalibreDto);
                    //solicitudCompleto.setIdSolPackingList(solPackingList.getIdSolPackingList());
                    //ids = ids + "," + solCalCalibreDto.getIdSolCalCalibre().toString();

                    TabSolCalLargoDedoDto tabSolCalLargoDedoDto = new TabSolCalLargoDedoDto();
                    tabSolCalLargoDedoDto.setIdSolCalLargoDedo(tabSolCalLargoDedoDto.getIdSolCalLargoDedo());
                    tabSolCalLargoDedoDto.setIdSolicitud(idSolicitud);
                    tabSolCalLargoDedoDto.setLar8(calidad.getTabSolCalLargoDedoDto().getLar8());
                    tabSolCalLargoDedoDto.setLar8_2(calidad.getTabSolCalLargoDedoDto().getLar8_2());
                    tabSolCalLargoDedoDto.setLar8_4(calidad.getTabSolCalLargoDedoDto().getLar8_4());
                    tabSolCalLargoDedoDto.setLar8_6(calidad.getTabSolCalLargoDedoDto().getLar8_6());
                    tabSolCalLargoDedoDto.setLar8_8(calidad.getTabSolCalLargoDedoDto().getLar8_8());
                    tabSolCalLargoDedoDto.setLar9(calidad.getTabSolCalLargoDedoDto().getLar9());
                    tabSolCalLargoDedoDto.setLar9_2(calidad.getTabSolCalLargoDedoDto().getLar9_2());
                    tabSolCalLargoDedoDto.setLar9_4(calidad.getTabSolCalLargoDedoDto().getLar9_4());
                    tabSolCalLargoDedoDto.setLar9_6(calidad.getTabSolCalLargoDedoDto().getLar9_6());
                    tabSolCalLargoDedoDto.setLar9_8(calidad.getTabSolCalLargoDedoDto().getLar9_8());
                    tabSolCalLargoDedoDto.setLar10(calidad.getTabSolCalLargoDedoDto().getLar10());
                    tabSolCalLargoDedoDto.setLar10_2(calidad.getTabSolCalLargoDedoDto().getLar10_2());
                    tabSolCalLargoDedoDto.setLar10_4(calidad.getTabSolCalLargoDedoDto().getLar10_4());
                    tabSolCalLargoDedoDto.setLar10_6(calidad.getTabSolCalLargoDedoDto().getLar10_6());
                    tabSolCalLargoDedoDto.setLar10_8(calidad.getTabSolCalLargoDedoDto().getLar10_8());
                    tabSolCalLargoDedoDto.setLar11(calidad.getTabSolCalLargoDedoDto().getLar11());
                    tabSolCalLargoDedoDto.setLar11_2(calidad.getTabSolCalLargoDedoDto().getLar11_2());
                    tabSolCalLargoDedoDto.setLar11_4(calidad.getTabSolCalLargoDedoDto().getLar11_4());
                    tabSolCalLargoDedoDto.setLar11_6(calidad.getTabSolCalLargoDedoDto().getLar11_6());
                    tabSolCalLargoDedoDto.setLar11_8(calidad.getTabSolCalLargoDedoDto().getLar11_8());
                    tabSolCalLargoDedoDto = iSolCalLargoDedoDao.save(tabSolCalLargoDedoDto);
                    //solicitudCompleto.setIdSolPackingList(solPackingList.getIdSolPackingList());
                    //ids = ids + "," + solCalLargoDedoDto.getIdSolCalLargoDedo().toString();

                    calidad.getListTabSolCalPesoClusterDto().forEach(peso ->{
                        TabSolCalPesoClusterDto tabSolCalPesoClusterDto = new TabSolCalPesoClusterDto();
                        tabSolCalPesoClusterDto.setIdSolCalPesoCluster(peso.getIdSolCalPesoCluster());
                        tabSolCalPesoClusterDto.setIdSolicitud(idSolicitud);

                        tabSolCalPesoClusterDto.setNumero(peso.getNumero());
                        tabSolCalPesoClusterDto.setPeso(peso.getPeso());
                        tabSolCalPesoClusterDto = iSolCalPesoClusterDao.save(tabSolCalPesoClusterDto);
                        //solicitudCompleto.setIdSolDefectoSeleccion(solDefectoSeleccion.getIdSolDefectoSeleccion());
                        ////ids = ids + "," + solCalPesoClusterDto.getIdSolCalPesoCluster().toString();
                    });

                    calidad.getListTabSolCalPackingListDto().forEach(packing ->{
                        TabSolCalPackingListDto tabSolCalPackingListDto = new TabSolCalPackingListDto();
                        tabSolCalPackingListDto.setIdSolCalPackingList(packing.getIdSolCalPackingList());
                        tabSolCalPackingListDto.setIdSolicitud(idSolicitud);

                        tabSolCalPackingListDto.setNumeracion(packing.getNumeracion());
                        tabSolCalPackingListDto.setSticker(packing.getSticker());
                        tabSolCalPackingListDto = iSolCalPackingListDao.save(tabSolCalPackingListDto);
                        //solicitudCompleto.setIdSolDefectoSeleccion(solDefectoSeleccion.getIdSolDefectoSeleccion());
                        ////ids = ids + "," + solCalPackingListDto.getIdSolCalPackingList().toString();
                    });
                });

                TabSolConsolidadoGanchoDto solConsolidadoGancho = new TabSolConsolidadoGanchoDto();
                solConsolidadoGancho.setIdSolConsolidadoGancho(productor.getSolConsolidadoGanchoDto().getIdSolConsolidadoGancho());
                solConsolidadoGancho.setIdSolicitud(idSolicitud);

                solConsolidadoGancho.setEnFunde(productor.getSolConsolidadoGanchoDto().getEnFunde());
                solConsolidadoGancho.setRacimoCosechado(productor.getSolConsolidadoGanchoDto().getRacimoCosechado());
                solConsolidadoGancho.setRacimoRechazado(productor.getSolConsolidadoGanchoDto().getRacimoRechazado());
                solConsolidadoGancho.setRacimoProcesado(productor.getSolConsolidadoGanchoDto().getRacimoProcesado());
                solConsolidadoGancho.setMutante(productor.getSolConsolidadoGanchoDto().getMutante());
                solConsolidadoGancho.setSpecklin(productor.getSolConsolidadoGanchoDto().getSpecklin());
                solConsolidadoGancho.setPuntaAmarilla(productor.getSolConsolidadoGanchoDto().getPuntaAmarilla());
                solConsolidadoGancho.setCrema(productor.getSolConsolidadoGanchoDto().getCrema());
                solConsolidadoGancho.setManchaRoja(productor.getSolConsolidadoGanchoDto().getManchaRoja());
                solConsolidadoGancho.setAlterado(productor.getSolConsolidadoGanchoDto().getAlterado());
                solConsolidadoGancho.setPobre(productor.getSolConsolidadoGanchoDto().getPobre());
                solConsolidadoGancho.setCaido(productor.getSolConsolidadoGanchoDto().getCaido());
                solConsolidadoGancho.setSobreGrado(productor.getSolConsolidadoGanchoDto().getSobreGrado());
                solConsolidadoGancho.setBajoGrado(productor.getSolConsolidadoGanchoDto().getBajoGrado());
                solConsolidadoGancho.setMosaico(productor.getSolConsolidadoGanchoDto().getMosaico());
                solConsolidadoGancho.setRasgunoAnimal(productor.getSolConsolidadoGanchoDto().getRasgunoAnimal());
                solConsolidadoGancho.setExplosivo(productor.getSolConsolidadoGanchoDto().getExplosivo());
                solConsolidadoGancho.setHerwinea(productor.getSolConsolidadoGanchoDto().getHerwinea());
                solConsolidadoGancho.setSinCinta(productor.getSolConsolidadoGanchoDto().getSinCinta());
                solConsolidadoGancho.setCochinilla(productor.getSolConsolidadoGanchoDto().getCochinilla());
                solConsolidadoGancho.setEscama(productor.getSolConsolidadoGanchoDto().getEscama());
                solConsolidadoGancho.setFumagina(productor.getSolConsolidadoGanchoDto().getFumagina());
                solConsolidadoGancho.setPesonudo(productor.getSolConsolidadoGanchoDto().getPesonudo());
                solConsolidadoGancho.setObservacion(productor.getSolConsolidadoGanchoDto().getObservacion());

                solConsolidadoGancho = iSolConsolidadoGanchoDao.save(solConsolidadoGancho);
                //solicitudCompleto.setIdSolConsolidadoGancho(solConsolidadoGancho.getIdSolConsolidadoGancho());
                //ids = ids + "," + solConsolidadoGancho.getIdSolConsolidadoGancho().toString();

                solConsolidadoGancho.getListTabSolConCalibracionFrutaDto().forEach(fruta ->{
                    TabSolConCalibracionFrutaDto tabSolConCalibracionFrutaDto = new TabSolConCalibracionFrutaDto();
                    tabSolConCalibracionFrutaDto.setIdSolConCalibracionFruta(fruta.getIdSolConCalibracionFruta());
                    tabSolConCalibracionFrutaDto.setIdSolicitud(idSolicitud);

                    tabSolConCalibracionFrutaDto.setNumSemana(fruta.getNumSemana());
                    tabSolConCalibracionFrutaDto.setColor(fruta.getColor());
                    tabSolConCalibracionFrutaDto.setNumRacimo(fruta.getNumRacimo());
                    tabSolConCalibracionFrutaDto = iSolConCalibracionFrutaDao.save(tabSolConCalibracionFrutaDto);
                    //solicitudCompleto.setIdSolDefectoSeleccion(solDefectoSeleccion.getIdSolDefectoSeleccion());
                    //ids = ids + "," + solConCalibracionFrutaDto.getIdSolConCalibracionFruta().toString();
                });
            });

            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.GUARDA_OK, ids);
        } catch (Exception e) {
        return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.GUARDA_ERR, null);
        }
    }
    */

            /*
            iSolImagenDao.delete(idSolicitud);
            solicitudCompleto.getSolImagenes().forEach(ima ->{
                SolImagenDto imagenDto = new SolImagenDto();
                imagenDto.setIdSolicitud(idSolicitud);

                Object o1 = JSONValue.parse(ima);
                JSONObject jsonObj = (JSONObject) o1;
                String idSolImagen = (String) jsonObj.get("idSolImagen");
                String nombre = (String) jsonObj.get("nombre");
                String descripcion = (String) jsonObj.get("descripcion");
                String seccion = (String) jsonObj.get("seccion");
                String imagen = (String) jsonObj.get("imagen");
                imagenDto.setIdSolImagen(Long.parseLong(idSolImagen));
                imagenDto.setNombre(nombre);
                imagenDto.setDescripcion(descripcion);
                imagenDto.setSeccion(seccion);
                imagenDto.setImagen(imagen);

                iSolImagenDao.save(imagenDto);
            });
            */
