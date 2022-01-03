package cn.myt.demo.common.enums;

/**
 * @author: mayating
 * @date: 2022/1/3
 */
public enum ErrorCode {
    NOT_FOUND(401, "401", "未找到");
    private Integer code;
    private String errorCode;
    private String msg;

    ErrorCode() {
    }

    ErrorCode(Integer code, String errorCode, String msg) {
        this.code = code;
        this.errorCode = errorCode;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
