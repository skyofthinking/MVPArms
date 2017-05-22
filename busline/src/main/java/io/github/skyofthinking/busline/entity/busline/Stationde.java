
package io.github.skyofthinking.busline.entity.busline;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stationde {

    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("stationNum")
    @Expose
    private String stationNum;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("xy")
    @Expose
    private String xy;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStationNum() {
        return stationNum;
    }

    public void setStationNum(String stationNum) {
        this.stationNum = stationNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getXy() {
        return xy;
    }

    public void setXy(String xy) {
        this.xy = xy;
    }

}
