package com.zyl.core.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Map;

/**
 * @author zyl
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RestfulResponse<T> {
    private Boolean success;
    private String message;
    private Integer code;
    private Map<String, String> errors;
    private T data;

    public RestfulResponse() {
        this.success = true;
        this.code = 200;
    }

    public RestfulResponse(T data) {
        this.success = true;
        this.code = 200;
        this.data = data;
    }

    public RestfulResponse(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public RestfulResponse(Boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public RestfulResponse(Boolean success, String message, Integer code, T date) {
        this.success = success;
        this.message = message;
        this.code = code;
        this.data = date;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Map<String, String> getErrors() {
        return errors;
    }

    public void setErrors(Map<String, String> errors) {
        this.errors = errors;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
}
