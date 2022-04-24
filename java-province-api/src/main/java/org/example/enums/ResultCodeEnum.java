package org.example.enums;

/**
 * @author fdrama
 * @date 2022/04/02
 **/
public enum ResultCodeEnum {

    /**
     * 返回码
     */
    SUCCESS("0", "成功"),

    FAIL("500", "系统错误"),
    ;

    private final String code;

    private final String message;

    private ResultCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
