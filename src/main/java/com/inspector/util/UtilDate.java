/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inspector.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author ebailon
 */
public class UtilDate {

	public static final String FORMATO_HORA_LARGO = "HH:mm:ssZ";
	public static final String FORMATO_HORA_MEDIO = "HH:mm:ss";
	public static final String FORMATO_HORA_CORTO = "HH:mm";
	public static final String FORMATO_TIMESTAMP = "dd-MM-yyyy HH:mm:ss";
	public static final String FORMATO_JS = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
	public static final String FORMATO_JS_CORTO = "yyyy-MM-dd";
	public static final String FORMATO_CORTO = "dd-MM-yyyy";
	public static final String FORMATO_LARGO = "dd 'de' MMM 'de' yyyy";

	public static String getString(String formato, Date fecha) {
		if (fecha != null)
			return new SimpleDateFormat(formato).format(fecha);
		return "";
	}

	public static Date getDate(String formato, String fecha) {
		try {
			return new SimpleDateFormat(formato).parse(fecha);
		} catch (ParseException ex) {
		}
		return null;
	}

	public static Calendar dateToCalendar(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal;
	}
}
