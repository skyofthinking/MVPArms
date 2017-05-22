package io.github.skyofthinking.busline.entity.station;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Station {

    @SerializedName("reason")
    @Expose
    private String reason;
    @SerializedName("result")
    @Expose
    private List<Result> result = null;
    @SerializedName("error_code")
    @Expose
    private Integer errorCode;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

}
