package aaa.microfinance.server.common;
/**
 * @Description: 默认返回的ajax信息
 * @Date: 2019/7/16 23:09
 */
public class DefaultMsg {
    private Integer success=1;
    private String error;

    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
