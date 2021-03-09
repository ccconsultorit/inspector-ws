package com.inspector.util;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.export.*;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporter;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.export.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class ReportExportUtil {

	public enum TipoReporteEnum {
		XLSX(1), DOCX(2), CSV(3), HTML(4), RTF(5), TXT(6), PNG(7), XLS(8), XML(9), PDF(10);

		int code;

		TipoReporteEnum(int code) {
			this.code = code;
		}

		public int getCode() {
			return code;
		}

	}

	public static TipoReporteEnum getTipoReporte(String tipo) {

		switch (tipo) {
		case "XML":
			return TipoReporteEnum.XML;
		case "DOCX":
			return TipoReporteEnum.DOCX;
		case "XLSX":
			return TipoReporteEnum.XLSX;
		case "XLS":
			return TipoReporteEnum.XLS;
		case "CSV":
			return TipoReporteEnum.CSV;
		case "HTML":
			return TipoReporteEnum.HTML;
		case "RTF":
			return TipoReporteEnum.RTF;
		case "TXT":
			return TipoReporteEnum.TXT;
		case "PNG":
			return TipoReporteEnum.PNG;
		case "PDF":
			return TipoReporteEnum.PDF;
		}
		return TipoReporteEnum.PDF;
	}

	public static ByteArrayOutputStream getReport(TipoReporteEnum tipo, Map<String, Object> parametros, InputStream report) {
		Conexion conn = null;
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			conn = new Conexion();
			JasperPrint print = JasperFillManager.fillReport(report, parametros, conn.getConexion());

			switch (tipo) {
			case XML: {
				Exporter<ExporterInput, ReportExportConfiguration, ExporterConfiguration, XmlExporterOutput> exporter = new JRXmlExporter();
				exporter.setExporterInput(new SimpleExporterInput(print));
				exporter.setExporterOutput(new SimpleXmlExporterOutput(baos, "UTF-8"));
				exporter.exportReport();
				return baos;
			}
			case DOCX: {
				Exporter<ExporterInput, DocxReportConfiguration, DocxExporterConfiguration, OutputStreamExporterOutput> exporter = new JRDocxExporter();
				exporter.setExporterInput(new SimpleExporterInput(print));
				exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(baos));
				exporter.exportReport();
				return baos;
			}
			case XLSX: {
				Exporter<ExporterInput, XlsxReportConfiguration, XlsxExporterConfiguration, OutputStreamExporterOutput> exporter = new JRXlsxExporter();
				exporter.setExporterInput(new SimpleExporterInput(print));
				exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(baos));
				exporter.exportReport();
				return baos;
			}
			case XLS: {
				Exporter<ExporterInput, XlsReportConfiguration, XlsExporterConfiguration, OutputStreamExporterOutput> exporter = new JRXlsExporter();
				exporter.setExporterInput(new SimpleExporterInput(print));
				exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(baos));
				exporter.exportReport();
				return baos;
			}

			case CSV: {
				Exporter<ExporterInput, CsvReportConfiguration, CsvExporterConfiguration, WriterExporterOutput> exporter = new JRCsvExporter();
				exporter.setExporterInput(new SimpleExporterInput(print));
				exporter.setExporterOutput(new SimpleWriterExporterOutput(baos, "UTF-8"));
				exporter.exportReport();
				return baos;
			}
			case HTML: {
				Exporter<ExporterInput, HtmlReportConfiguration, HtmlExporterConfiguration, HtmlExporterOutput> exporter = new HtmlExporter();
				exporter.setExporterInput(new SimpleExporterInput(print));
				exporter.setExporterOutput(new SimpleHtmlExporterOutput(baos));
				exporter.exportReport();
				return baos;
			}
			case RTF: {
				Exporter<ExporterInput, RtfReportConfiguration, RtfExporterConfiguration, WriterExporterOutput> exporter = new JRRtfExporter();
				exporter.setExporterInput(new SimpleExporterInput(print));
				exporter.setExporterOutput(new SimpleWriterExporterOutput(baos));
				exporter.exportReport();
				return baos;
			}
			case TXT: {
				Exporter<ExporterInput, TextReportConfiguration, TextExporterConfiguration, WriterExporterOutput> exporter = new JRTextExporter();

				SimpleTextReportConfiguration textReportConfiguration = new SimpleTextReportConfiguration();
				textReportConfiguration.setCharHeight(new Float(15f));
				textReportConfiguration.setCharWidth(new Float(5f));
				exporter.setConfiguration(textReportConfiguration);

				exporter.setExporterInput(new SimpleExporterInput(print));
				exporter.setExporterOutput(new SimpleWriterExporterOutput(baos));
				exporter.exportReport();
				return baos;
			}
			case PNG: {
				try {
					BufferedImage imgBuff = (BufferedImage) JasperPrintManager.printPageToImage(print, 0, 2f);
					ImageIO.write(imgBuff, "png", baos);
				} catch (IOException e) {
					System.out.println("Error al mostrar imagen");
				}
				return baos;
			}
			case PDF: {
				Exporter<ExporterInput, PdfReportConfiguration, PdfExporterConfiguration, OutputStreamExporterOutput> exporter = new JRPdfExporter();
				exporter.setExporterInput(new SimpleExporterInput(print));
				exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(baos));
				exporter.exportReport();
				return baos;
			}

			}
			conn.cerrar();
		} catch (JRException e) {
			e.printStackTrace();
			conn.cerrar();
		}

		return null;
	}

}
