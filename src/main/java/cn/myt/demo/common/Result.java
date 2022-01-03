package cn.myt.demo.common;

/**
 * @description 统一结果封装
 * @className: Result
 * @author: mayating
 * @date: 2022/1/2
 */
public class Result {
    // 响应码
    private Integer code;
    // 信息
    private String message;
    // 返回数据
    private Object data;

    public Result() {
    }

    public Result(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 响应成功
     *
     * @param data
     * @return
     */
    public static Result success(Object data) {
        Result result = new Result();
        result.setCode(200);
        result.setMessage("success");
        result.setData(data);
        return result;
    }

    /**
     * 响应失败
     *
     * @param message
     * @return
     */
    public static Result fail(String message) {
        Result result = new Result();
        result.setCode(200);
        result.setMessage(message);
        result.setData(null);
        return result;
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
