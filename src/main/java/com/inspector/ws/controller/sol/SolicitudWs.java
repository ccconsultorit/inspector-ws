package com.inspector.ws.controller.sol;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.inspector.ApiResponse;
import com.inspector.dto.sol.*;
import com.inspector.enumaraciones.ResponseCodeEnum;
import com.inspector.util.Mensajes;
import com.inspector.ws.repositories.impl.sol.SolCalLargoDedoDao;
import com.inspector.ws.repositories.impl.sol.SolCalPesoClusterDao;
import com.inspector.ws.repositories.sol.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.time.LocalDateTime;
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
    @RequestMapping(value = "getSolicitudes", method = RequestMethod.GET)
    public ApiResponse<List<SolicitudDto>> getSolicitudes() {
        try {
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.PROCESO_OK, iSolicitudDao.getAll());
        } catch (Exception e) {
            LOG.info(e.getMessage());
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.PROCESO_ERR, null);
        }
    }

    @RequestMapping(value = "getSolicitudesByEstado", method = RequestMethod.GET)
    public ApiResponse<List<SolicitudCompletaDto>> getSolicitudesByEstado(@RequestParam("estado") String estado) {
        try {
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.PROCESO_OK, iSolicitudDao.getSolicitudesByEstado(estado));
        } catch (Exception e) {
            LOG.info(e.getMessage());
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.PROCESO_ERR, null);
        }
    }

    @RequestMapping(value = "getSolicitudById", method = RequestMethod.GET)
    public ApiResponse<SolicitudDto> getSolicitudById(@RequestParam("idSolicitud") Long idSolicitud) {
        try {
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.PROCESO_OK, iSolicitudDao.getSolicitudById(idSolicitud));
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

    @RequestMapping(value = "guardarSolicitud", method = RequestMethod.POST)
    public ApiResponse<String> guardarSolicitud(@RequestBody SolicitudCompletaDto solicitudCompleto) {
        try {
            final Long idSolicitud;
            SolicitudDto solicitud = new SolicitudDto();
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

            SolContenedorDto solContenedor = new SolContenedorDto();
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
            /*
            SolSelloLlegadaDto solSelloLlegada = new SolSelloLlegadaDto();
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

            SolSelloInstaladoDto solSelloInstalado = new SolSelloInstaladoDto();
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
                SolTransportistaDto solTransportista = new SolTransportistaDto();
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

                SolProcesoDto solProceso = new SolProcesoDto();
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

                SolControlPesoDto solControlPeso = new SolControlPesoDto();
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

                SolFincaDto solFinca = new SolFincaDto();
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

                productor.getListSolCalidadDto().forEach(calidad ->{

                    SolCalidadDto solCalidad = new SolCalidadDto();
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

                    calidad.getListSolCalDefectoSeleccionDto().forEach(defecto ->{
                        SolCalDefectoSeleccionDto solDefectoSeleccion = new SolCalDefectoSeleccionDto();
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


                    SolCalCalibreDto solCalCalibreDto = new SolCalCalibreDto();
                    solCalCalibreDto.setIdSolCalCalibre(solCalCalibreDto.getIdSolCalCalibre());
                    solCalCalibreDto.setIdSolicitud(idSolicitud);
                    solCalCalibreDto.setCalUg(calidad.getSolCalCalibreDto().getCalUg());
                    solCalCalibreDto.setCalOg(calidad.getSolCalCalibreDto().getCalOg());
                    solCalCalibreDto.setCal37(calidad.getSolCalCalibreDto().getCal37());
                    solCalCalibreDto.setCal38(calidad.getSolCalCalibreDto().getCal38());
                    solCalCalibreDto.setCal39(calidad.getSolCalCalibreDto().getCal39());
                    solCalCalibreDto.setCal40(calidad.getSolCalCalibreDto().getCal40());
                    solCalCalibreDto.setCal41(calidad.getSolCalCalibreDto().getCal41());
                    solCalCalibreDto.setCal42(calidad.getSolCalCalibreDto().getCal42());
                    solCalCalibreDto.setCal43(calidad.getSolCalCalibreDto().getCal43());
                    solCalCalibreDto.setCal44(calidad.getSolCalCalibreDto().getCal44());
                    solCalCalibreDto.setCal45(calidad.getSolCalCalibreDto().getCal45());
                    solCalCalibreDto.setCal46(calidad.getSolCalCalibreDto().getCal46());
                    solCalCalibreDto.setCal47(calidad.getSolCalCalibreDto().getCal47());
                    solCalCalibreDto.setCal48(calidad.getSolCalCalibreDto().getCal48());
                    solCalCalibreDto.setCal49(calidad.getSolCalCalibreDto().getCal49());
                    solCalCalibreDto.setCal50(calidad.getSolCalCalibreDto().getCal50());
                    solCalCalibreDto.setCal51(calidad.getSolCalCalibreDto().getCal51());
                    solCalCalibreDto.setCal52(calidad.getSolCalCalibreDto().getCal52());
                    solCalCalibreDto.setCal53(calidad.getSolCalCalibreDto().getCal53());
                    solCalCalibreDto.setCal54(calidad.getSolCalCalibreDto().getCal54());
                    solCalCalibreDto = iSolCalCalibreDao.save(solCalCalibreDto);
                    //solicitudCompleto.setIdSolPackingList(solPackingList.getIdSolPackingList());
                    //ids = ids + "," + solCalCalibreDto.getIdSolCalCalibre().toString();

                    SolCalLargoDedoDto solCalLargoDedoDto = new SolCalLargoDedoDto();
                    solCalLargoDedoDto.setIdSolCalLargoDedo(solCalLargoDedoDto.getIdSolCalLargoDedo());
                    solCalLargoDedoDto.setIdSolicitud(idSolicitud);
                    solCalLargoDedoDto.setLar8(calidad.getSolCalLargoDedoDto().getLar8());
                    solCalLargoDedoDto.setLar8_2(calidad.getSolCalLargoDedoDto().getLar8_2());
                    solCalLargoDedoDto.setLar8_4(calidad.getSolCalLargoDedoDto().getLar8_4());
                    solCalLargoDedoDto.setLar8_6(calidad.getSolCalLargoDedoDto().getLar8_6());
                    solCalLargoDedoDto.setLar8_8(calidad.getSolCalLargoDedoDto().getLar8_8());
                    solCalLargoDedoDto.setLar9(calidad.getSolCalLargoDedoDto().getLar9());
                    solCalLargoDedoDto.setLar9_2(calidad.getSolCalLargoDedoDto().getLar9_2());
                    solCalLargoDedoDto.setLar9_4(calidad.getSolCalLargoDedoDto().getLar9_4());
                    solCalLargoDedoDto.setLar9_6(calidad.getSolCalLargoDedoDto().getLar9_6());
                    solCalLargoDedoDto.setLar9_8(calidad.getSolCalLargoDedoDto().getLar9_8());
                    solCalLargoDedoDto.setLar10(calidad.getSolCalLargoDedoDto().getLar10());
                    solCalLargoDedoDto.setLar10_2(calidad.getSolCalLargoDedoDto().getLar10_2());
                    solCalLargoDedoDto.setLar10_4(calidad.getSolCalLargoDedoDto().getLar10_4());
                    solCalLargoDedoDto.setLar10_6(calidad.getSolCalLargoDedoDto().getLar10_6());
                    solCalLargoDedoDto.setLar10_8(calidad.getSolCalLargoDedoDto().getLar10_8());
                    solCalLargoDedoDto.setLar11(calidad.getSolCalLargoDedoDto().getLar11());
                    solCalLargoDedoDto.setLar11_2(calidad.getSolCalLargoDedoDto().getLar11_2());
                    solCalLargoDedoDto.setLar11_4(calidad.getSolCalLargoDedoDto().getLar11_4());
                    solCalLargoDedoDto.setLar11_6(calidad.getSolCalLargoDedoDto().getLar11_6());
                    solCalLargoDedoDto.setLar11_8(calidad.getSolCalLargoDedoDto().getLar11_8());
                    solCalLargoDedoDto = iSolCalLargoDedoDao.save(solCalLargoDedoDto);
                    //solicitudCompleto.setIdSolPackingList(solPackingList.getIdSolPackingList());
                    //ids = ids + "," + solCalLargoDedoDto.getIdSolCalLargoDedo().toString();

                    calidad.getListSolCalPesoClusterDto().forEach(peso ->{
                        SolCalPesoClusterDto solCalPesoClusterDto = new SolCalPesoClusterDto();
                        solCalPesoClusterDto.setIdSolCalPesoCluster(peso.getIdSolCalPesoCluster());
                        solCalPesoClusterDto.setIdSolicitud(idSolicitud);

                        solCalPesoClusterDto.setNumero(peso.getNumero());
                        solCalPesoClusterDto.setPeso(peso.getPeso());
                        solCalPesoClusterDto = iSolCalPesoClusterDao.save(solCalPesoClusterDto);
                        //solicitudCompleto.setIdSolDefectoSeleccion(solDefectoSeleccion.getIdSolDefectoSeleccion());
                        ////ids = ids + "," + solCalPesoClusterDto.getIdSolCalPesoCluster().toString();
                    });

                    calidad.getListSolCalPackingListDto().forEach(packing ->{
                        SolCalPackingListDto solCalPackingListDto = new SolCalPackingListDto();
                        solCalPackingListDto.setIdSolCalPackingList(packing.getIdSolCalPackingList());
                        solCalPackingListDto.setIdSolicitud(idSolicitud);

                        solCalPackingListDto.setNumeracion(packing.getNumeracion());
                        solCalPackingListDto.setSticker(packing.getSticker());
                        solCalPackingListDto = iSolCalPackingListDao.save(solCalPackingListDto);
                        //solicitudCompleto.setIdSolDefectoSeleccion(solDefectoSeleccion.getIdSolDefectoSeleccion());
                        ////ids = ids + "," + solCalPackingListDto.getIdSolCalPackingList().toString();
                    });
                });

                SolConsolidadoGanchoDto solConsolidadoGancho = new SolConsolidadoGanchoDto();
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

                solConsolidadoGancho.getListSolConCalibracionFrutaDto().forEach(fruta ->{
                    SolConCalibracionFrutaDto solConCalibracionFrutaDto = new SolConCalibracionFrutaDto();
                    solConCalibracionFrutaDto.setIdSolConCalibracionFruta(fruta.getIdSolConCalibracionFruta());
                    solConCalibracionFrutaDto.setIdSolicitud(idSolicitud);

                    solConCalibracionFrutaDto.setNumSemana(fruta.getNumSemana());
                    solConCalibracionFrutaDto.setColor(fruta.getColor());
                    solConCalibracionFrutaDto.setNumRacimo(fruta.getNumRacimo());
                    solConCalibracionFrutaDto = iSolConCalibracionFrutaDao.save(solConCalibracionFrutaDto);
                    //solicitudCompleto.setIdSolDefectoSeleccion(solDefectoSeleccion.getIdSolDefectoSeleccion());
                    //ids = ids + "," + solConCalibracionFrutaDto.getIdSolConCalibracionFruta().toString();
                });
            });
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
            return new ApiResponse<>(ResponseCodeEnum.OK, Mensajes.GUARDA_OK, ids);
        } catch (Exception e) {
            return new ApiResponse<>(ResponseCodeEnum.ERR, Mensajes.GUARDA_ERR, null);
        }
    }

}
