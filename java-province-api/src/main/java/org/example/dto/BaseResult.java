package org.example.dto;

import java.io.Serializable;

/**
 * @author fdrama
 * @date 2022/04/02
 **/
public class BaseResult implements Serializable {

    private String code;

    private String message;

    private Boolean success;

    private static final long serialVersionUID = 2206206576559733455L;

    public BaseResult() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
