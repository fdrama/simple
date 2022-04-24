package org.example.dto;

import org.example.enums.ResultCodeEnum;

/**
 * @author fdrama
 * @date 2022/04/02
 **/
public class Result<T> extends BaseResult {


    private T data;

    private static final long serialVersionUID = -3636997973382682827L;

    public Result() {
    }


    public Result<T> success() {
        this.setSuccess(true);
        this.setCode(ResultCodeEnum.SUCCESS.getCode());
        this.setMessage(ResultCodeEnum.SUCCESS.getMessage());
        return this;
    }


    public Result<T> success(T data) {
        this.setSuccess(true);
        this.setData(data);
        this.setCode(ResultCodeEnum.SUCCESS.getCode());
        this.setMessage(ResultCodeEnum.SUCCESS.getMessage());
        return this;
    }


    public Result<T> fail() {
        this.setSuccess(false);
        this.setCode(ResultCodeEnum.FAIL.getCode());
        this.setMessage(ResultCodeEnum.FAIL.getMessage());
        return this;
    }

    public Result<T> fail(String code, String message) {
        this.setSuccess(false);
        this.setCode(code);
        this.setMessage(message);
        return this;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public boolean isSuccess() {
        return this.getSuccess();
    }

    public boolean isFail() {
        return !this.getSuccess();
    }
}
