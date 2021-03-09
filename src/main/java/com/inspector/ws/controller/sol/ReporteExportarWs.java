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

	private static final Logger LOG = LoggerFactory.getLogger(com.inspector.ws.controller.sol.ReporteExportarWs.class.getName());

	@RequestMapping(value = "exportarReporteSolicitud", method = RequestMethod.GET)
	public ResponseEntity<Resource> exportarReporteSolicitud(@RequestParam(name = "idSolicitud") Long idSolicitud,
															 @RequestParam(name = "tipo") String tipo) {


		byte[] result = null;
		TipoReporteEnum tipoReporte = ReportExportUtil.getTipoReporte(tipo);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("idSolicitud", idSolicitud);
		parameters.put("logoOrion",	"/inspector/reportes/imagenes/logo_qsercon.jpg");

		try (FileInputStream fisRep = new FileInputStream("/inspector/reportes/ReporteSolicitud.jasper")) {
			ByteArrayOutputStream os = ReportExportUtil.getReport(tipoReporte, parameters, fisRep);
			result = os.toByteArray();
			os.close();
			ByteArrayResource resource = new ByteArrayResource(result);

			HttpHeaders headers = new HttpHeaders();
			headers.add("Content-disposition", "inline; filename=" + "ReporteSolicitud" + "." + tipoReporte.name().toLowerCase());

			result = os.toByteArray();
			return ResponseEntity.ok().headers(headers).contentLength(result.length)
					.contentType(MediaType.parseMediaType("application/octet-stream")).body(resource);
		} catch (Exception e) {
			LOG.debug("Error generando reporte " + e.getMessage());
		}
		return null;
	}

}
