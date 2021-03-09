package com.inspector.enumaraciones;

/**
 * Clase de enumeradores con codigo de respuesta
 *
 * @author ebailon
 */
public enum ResponseCodeEnum {

    OK("00"),
    ERR("01"),
    VAL("11");

    private String label;

    ResponseCodeEnum(String label) {
        this.label = label;
    }

    /**
     * Obtiene el codigo de error
     *
     * @return codigo de error
     */
    public String getLabel() {
        return label;
    }

}