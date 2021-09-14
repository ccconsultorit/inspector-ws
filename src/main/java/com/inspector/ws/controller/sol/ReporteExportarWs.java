package com.inspector.ws.controller.sol;

import com.inspector.util.ReportExportUtil;
import com.inspector.util.ReportExportUtil.TipoReporteEnum;
import com.inspector.util.UtilDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("reporteExportarWs")
public class ReporteExportarWs {

	private static final Logger LOG = LoggerFactory.getLogger(ReporteExportarWs.class);

	@RequestMapping(value = "exportarReporteSolicitud", method = RequestMethod.GET)
	public ResponseEntity<Resource> exportarReporteSolicitud(@RequestParam(name = "idSolicitud") Long idSolicitud,
															 @RequestParam(name = "tipo") String tipo) {

		System.out.println("idSol :" +idSolicitud + "tipo : "+ tipo);
		byte[] result = null;
		TipoReporteEnum tipoReporte = ReportExportUtil.getTipoReporte(tipo);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("idSolicitud", idSolicitud);
		//parameters.put("logoEmpresa",	"C:\\inspector\\reportes\\imagenes\\logo_qsercon.jpg");
        parameters.put("logoEmpresa",	"/inspector/reportes/imagenes/logo_qsercon.jpg");

		//try (FileInputStream fisRep = new FileInputStream("C:\\inspector\\reportes\\reporteSolicitud.jasper")) {
		try (FileInputStream fisRep = new FileInputStream("/inspector/reportes/reporteSolicitud.jasper")) {
			ByteArrayOutputStream os = ReportExportUtil.getReport(tipoReporte, parameters, fisRep);
            System.out.println("Inicio Reporte Solicitud");
            result = os.toByteArray();
			os.close();
			ByteArrayResource resource = new ByteArrayResource(result);
			HttpHeaders headers = new HttpHeaders();

			headers.add("Content-disposition", "inline; filename=" + "reporteSolicitud" + "." + tipoReporte.name().toLowerCase());
			result = os.toByteArray();

            System.out.println("Fin Reporte Solicitud");
			return ResponseEntity.ok().headers(headers).contentLength(result.length)
					.contentType(MediaType.parseMediaType("application/octet-stream")).body(resource);
		} catch (Exception e) {
			System.out.println("Error Reporte Solicitud: " + e.getMessage());
		}
        System.out.println("Fin Reporte Solicitud Null");
		return null;
	}

	@RequestMapping(value = "exportarReporteSolSeleccionEmpaque", method = RequestMethod.GET)
	public ResponseEntity<Resource> exportarReporteSolSeleccionEmpaque(@RequestParam(name = "idSolicitud") Long idSolicitud,
																	   @RequestParam(name = "tipo") String tipo) {

		System.out.println("Reporte: Seleccion y Empaque idSol :" +idSolicitud + "tipo : "+ tipo);
		byte[] result = null;
		TipoReporteEnum tipoReporte = ReportExportUtil.getTipoReporte(tipo);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("idSolicitud", idSolicitud);
        parameters.put("logoEmpresa",	"C:\\inspector\\reportes\\imagenes\\logo_qsercon.jpg");
        parameters.put("logoEmpresa",	"/inspector/reportes/imagenes/logo_qsercon.jpg");

		//try (FileInputStream fisRep = new FileInputStream("C:\\inspector\\reportes\\repSeleccionEmpaque.jasper")) {
		try (FileInputStream fisRep = new FileInputStream("/inspector/reportes/repSeleccionEmpaque.jasper")) {
			ByteArrayOutputStream os = ReportExportUtil.getReport(tipoReporte, parameters, fisRep);
            System.out.println("Inicio Reporte Seleccion y Empaque");
            result = os.toByteArray();
			os.close();
			ByteArrayResource resource = new ByteArrayResource(result);
			HttpHeaders headers = new HttpHeaders();

			headers.add("Content-disposition", "inline; filename=" + "reporteSeleccionEmpaque" + "." + tipoReporte.name().toLowerCase());
			result = os.toByteArray();

            System.out.println("Fin Reporte Seleccion y Empaque");
			return ResponseEntity.ok().headers(headers).contentLength(result.length)
					.contentType(MediaType.parseMediaType("application/octet-stream")).body(resource);
		} catch (Exception e) {
			System.out.println("Error Seleccion y Empaque: " + e.getMessage());
		}
        System.out.println("Fin Reporte Seleccion y Empaque Null");
		return null;
	}

    @RequestMapping(value = "exportarReporteSolImagenes", method = RequestMethod.GET)
    public ResponseEntity<Resource> exportarReporteSolImagenes(@RequestParam(name = "idSolicitud") Long idSolicitud,
                                                               @RequestParam(name = "tipo") String tipo) {

        System.out.println("Reporte: Imagenes idSol :" +idSolicitud + "tipo : "+ tipo);
        byte[] result = null;
        TipoReporteEnum tipoReporte = ReportExportUtil.getTipoReporte(tipo);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("idSolicitud", idSolicitud);
        parameters.put("logoEmpresa",	"/inspector/reportes/imagenes/logo_qsercon.jpg");

        //try (FileInputStream fisRep = new FileInputStream("C:\\inspector\\reportes\\repSeleccionEmpaque.jasper")) {
        try (FileInputStream fisRep = new FileInputStream("/inspector/reportes/repImagenes.jasper")) {
            ByteArrayOutputStream os = ReportExportUtil.getReport(tipoReporte, parameters, fisRep);
            System.out.println("Inicio Reporte Imagenes");
            result = os.toByteArray();
            os.close();
            ByteArrayResource resource = new ByteArrayResource(result);
            HttpHeaders headers = new HttpHeaders();

            headers.add("Content-disposition", "inline; filename=" + "reporteImagenes" + "." + tipoReporte.name().toLowerCase());
            result = os.toByteArray();

            return ResponseEntity.ok().headers(headers).contentLength(result.length)
                    .contentType(MediaType.parseMediaType("application/octet-stream")).body(resource);
        } catch (Exception e) {
            System.out.println("Error Reporte Imagenes: " + e.getMessage());
        }
        System.out.println("Fin Reporte Imagenes Null");
        return null;
    }
    @RequestMapping(value = "exportarReporteSolCertificacion", method = RequestMethod.GET)
    public ResponseEntity<Resource> exportarReporteSolCertificacion(@RequestParam(name = "idSolicitud") Long idSolicitud,
                                                                    @RequestParam(name = "tipo") String tipo) {

        System.out.println("Reporte: Imagenes idSol :" +idSolicitud + "tipo : "+ tipo);
        byte[] result = null;
        TipoReporteEnum tipoReporte = ReportExportUtil.getTipoReporte(tipo);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("idSolicitud", idSolicitud);
        parameters.put("logoEmpresa",	"/inspector/reportes/imagenes/logo_qsercon.jpg");

        //try (FileInputStream fisRep = new FileInputStream("C:\\inspector\\reportes\\repSeleccionEmpaque.jasper")) {
        try (FileInputStream fisRep = new FileInputStream("/inspector/reportes/repCalidad.jasper")) {
            ByteArrayOutputStream os = ReportExportUtil.getReport(tipoReporte, parameters, fisRep);
            System.out.println("Inicio Reporte Imagenes");
            result = os.toByteArray();
            os.close();
            ByteArrayResource resource = new ByteArrayResource(result);
            HttpHeaders headers = new HttpHeaders();

            headers.add("Content-disposition", "inline; filename=" + "reporteImagenes" + "." + tipoReporte.name().toLowerCase());
            result = os.toByteArray();

            return ResponseEntity.ok().headers(headers).contentLength(result.length)
                    .contentType(MediaType.parseMediaType("application/octet-stream")).body(resource);
        } catch (Exception e) {
            System.out.println("Error Reporte Imagenes: " + e.getMessage());
        }
        System.out.println("Fin Reporte Imagenes Null");
        return null;
    }
}
