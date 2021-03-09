/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inspector.enumaraciones;

/**
 *
 * @author ebailon
 */
public enum EstadoEnum {

	A("ACTIVO"),
	I("INACTIVO");

	private final String label;

	EstadoEnum(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
