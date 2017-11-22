package com.zyl.web.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author zyl
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RESTfulResult<T> {
    private Boolean success;
    private Integer code;
    private String message;
    private T data;

    public RESTfulResult() {
        this.success = true;
        this.code = 200;
    }

    public RESTfulResult(T data) {
        this.success = true;
        this.data = data;
        this.code = 200;
    }

    public RESTfulResult(Boolean success, String message) {
        this.success = success;
        this.message = message;
        this.code = 200;
    }

    public RESTfulResult(Boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.code = 200;
        this.data = data;
    }

    public RESTfulResult(Boolean success, String message, Integer code, T data) {
        this.success = success;
        this.message = message;
        this.code = code;
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
