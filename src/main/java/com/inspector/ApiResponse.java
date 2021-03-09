/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inspector;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.inspector.enumaraciones.ResponseCodeEnum;
import lombok.Data;

/**
 * @author Rafael
 */
@Data
public class ApiResponse<T> {

    @JsonProperty("code")
    private ResponseCodeEnum code;

    @JsonProperty("msg")
    private String message;

    @JsonProperty("content")
    private T content;

    private Long transaction;

    public ApiResponse() {

    }

    public ApiResponse(ResponseCodeEnum success, String message, T content) {
        this.code = success;
        this.message = message;
        this.content = content;
    }

    public ApiResponse(ResponseCodeEnum success, String message, T content, Long transaction) {
        this.code = success;
        this.message = message;
        this.content = content;
        this.transaction = transaction;
    }


}
