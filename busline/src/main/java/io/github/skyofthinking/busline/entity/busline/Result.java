
package io.github.skyofthinking.busline.entity.busline;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {

    @SerializedName("terminal_name")
    @Expose
    private String terminalName;
    @SerializedName("front_spell")
    @Expose
    private String frontSpell;
    @SerializedName("line_id")
    @Expose
    private String lineId;
    @SerializedName("key_name")
    @Expose
    private String keyName;
    @SerializedName("time_desc")
    @Expose
    private String timeDesc;
    @SerializedName("front_name")
    @Expose
    private String frontName;
    @SerializedName("stationdes")
    @Expose
    private List<Stationde> stationdes = null;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("start_time")
    @Expose
    private String startTime;
    @SerializedName("photo_folder")
    @Expose
    private String photoFolder;
    @SerializedName("interval5")
    @Expose
    private String interval5;
    @SerializedName("gpsfile_id")
    @Expose
    private String gpsfileId;
    @SerializedName("data_source")
    @Expose
    private String dataSource;
    @SerializedName("total_price")
    @Expose
    private String totalPrice;
    @SerializedName("company")
    @Expose
    private String company;
    @SerializedName("speed")
    @Expose
    private String speed;
    @SerializedName("length")
    @Expose
    private String length;
    @SerializedName("loop")
    @Expose
    private String loop;
    @SerializedName("auto")
    @Expose
    private String auto;
    @SerializedName("ic_card")
    @Expose
    private String icCard;
    @SerializedName("double_deck")
    @Expose
    private String doubleDeck;
    @SerializedName("express_way")
    @Expose
    private String expressWay;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("basic_price")
    @Expose
    private String basicPrice;
    @SerializedName("end_time")
    @Expose
    private String endTime;
    @SerializedName("air")
    @Expose
    private String air;
    @SerializedName("terminal_spell")
    @Expose
    private String terminalSpell;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("paper_table_id")
    @Expose
    private String paperTableId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("commutation_ticket")
    @Expose
    private String commutationTicket;
    @SerializedName("interval8")
    @Expose
    private String interval8;
    @SerializedName("time_interval6")
    @Expose
    private String timeInterval6;
    @SerializedName("time_interval4")
    @Expose
    private String timeInterval4;
    @SerializedName("interval3")
    @Expose
    private String interval3;
    @SerializedName("interval6")
    @Expose
    private String interval6;
    @SerializedName("time_interval8")
    @Expose
    private String timeInterval8;
    @SerializedName("interval4")
    @Expose
    private String interval4;
    @SerializedName("photo_id")
    @Expose
    private String photoId;
    @SerializedName("interval7")
    @Expose
    private String interval7;
    @SerializedName("time_interval3")
    @Expose
    private String timeInterval3;
    @SerializedName("interval1")
    @Expose
    private String interval1;
    @SerializedName("interval2")
    @Expose
    private String interval2;
    @SerializedName("time_interval7")
    @Expose
    private String timeInterval7;
    @SerializedName("time_interval1")
    @Expose
    private String timeInterval1;
    @SerializedName("time_interval2")
    @Expose
    private String timeInterval2;
    @SerializedName("service_period")
    @Expose
    private String servicePeriod;
    @SerializedName("time_interval5")
    @Expose
    private String timeInterval5;

    public String getTerminalName() {
        return terminalName;
    }

    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
    }

    public String getFrontSpell() {
        return frontSpell;
    }

    public void setFrontSpell(String frontSpell) {
        this.frontSpell = frontSpell;
    }

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public String getTimeDesc() {
        return timeDesc;
    }

    public void setTimeDesc(String timeDesc) {
        this.timeDesc = timeDesc;
    }

    public String getFrontName() {
        return frontName;
    }

    public void setFrontName(String frontName) {
        this.frontName = frontName;
    }

    public List<Stationde> getStationdes() {
        return stationdes;
    }

    public void setStationdes(List<Stationde> stationdes) {
        this.stationdes = stationdes;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getPhotoFolder() {
        return photoFolder;
    }

    public void setPhotoFolder(String photoFolder) {
        this.photoFolder = photoFolder;
    }

    public String getInterval5() {
        return interval5;
    }

    public void setInterval5(String interval5) {
        this.interval5 = interval5;
    }

    public String getGpsfileId() {
        return gpsfileId;
    }

    public void setGpsfileId(String gpsfileId) {
        this.gpsfileId = gpsfileId;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getLoop() {
        return loop;
    }

    public void setLoop(String loop) {
        this.loop = loop;
    }

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public String getIcCard() {
        return icCard;
    }

    public void setIcCard(String icCard) {
        this.icCard = icCard;
    }

    public String getDoubleDeck() {
        return doubleDeck;
    }

    public void setDoubleDeck(String doubleDeck) {
        this.doubleDeck = doubleDeck;
    }

    public String getExpressWay() {
        return expressWay;
    }

    public void setExpressWay(String expressWay) {
        this.expressWay = expressWay;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBasicPrice() {
        return basicPrice;
    }

    public void setBasicPrice(String basicPrice) {
        this.basicPrice = basicPrice;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getAir() {
        return air;
    }

    public void setAir(String air) {
        this.air = air;
    }

    public String getTerminalSpell() {
        return terminalSpell;
    }

    public void setTerminalSpell(String terminalSpell) {
        this.terminalSpell = terminalSpell;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPaperTableId() {
        return paperTableId;
    }

    public void setPaperTableId(String paperTableId) {
        this.paperTableId = paperTableId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCommutationTicket() {
        return commutationTicket;
    }

    public void setCommutationTicket(String commutationTicket) {
        this.commutationTicket = commutationTicket;
    }

    public String getInterval8() {
        return interval8;
    }

    public void setInterval8(String interval8) {
        this.interval8 = interval8;
    }

    public String getTimeInterval6() {
        return timeInterval6;
    }

    public void setTimeInterval6(String timeInterval6) {
        this.timeInterval6 = timeInterval6;
    }

    public String getTimeInterval4() {
        return timeInterval4;
    }

    public void setTimeInterval4(String timeInterval4) {
        this.timeInterval4 = timeInterval4;
    }

    public String getInterval3() {
        return interval3;
    }

    public void setInterval3(String interval3) {
        this.interval3 = interval3;
    }

    public String getInterval6() {
        return interval6;
    }

    public void setInterval6(String interval6) {
        this.interval6 = interval6;
    }

    public String getTimeInterval8() {
        return timeInterval8;
    }

    public void setTimeInterval8(String timeInterval8) {
        this.timeInterval8 = timeInterval8;
    }

    public String getInterval4() {
        return interval4;
    }

    public void setInterval4(String interval4) {
        this.interval4 = interval4;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    public String getInterval7() {
        return interval7;
    }

    public void setInterval7(String interval7) {
        this.interval7 = interval7;
    }

    public String getTimeInterval3() {
        return timeInterval3;
    }

    public void setTimeInterval3(String timeInterval3) {
        this.timeInterval3 = timeInterval3;
    }

    public String getInterval1() {
        return interval1;
    }

    public void setInterval1(String interval1) {
        this.interval1 = interval1;
    }

    public String getInterval2() {
        return interval2;
    }

    public void setInterval2(String interval2) {
        this.interval2 = interval2;
    }

    public String getTimeInterval7() {
        return timeInterval7;
    }

    public void setTimeInterval7(String timeInterval7) {
        this.timeInterval7 = timeInterval7;
    }

    public String getTimeInterval1() {
        return timeInterval1;
    }

    public void setTimeInterval1(String timeInterval1) {
        this.timeInterval1 = timeInterval1;
    }

    public String getTimeInterval2() {
        return timeInterval2;
    }

    public void setTimeInterval2(String timeInterval2) {
        this.timeInterval2 = timeInterval2;
    }

    public String getServicePeriod() {
        return servicePeriod;
    }

    public void setServicePeriod(String servicePeriod) {
        this.servicePeriod = servicePeriod;
    }

    public String getTimeInterval5() {
        return timeInterval5;
    }

    public void setTimeInterval5(String timeInterval5) {
        this.timeInterval5 = timeInterval5;
    }

}
