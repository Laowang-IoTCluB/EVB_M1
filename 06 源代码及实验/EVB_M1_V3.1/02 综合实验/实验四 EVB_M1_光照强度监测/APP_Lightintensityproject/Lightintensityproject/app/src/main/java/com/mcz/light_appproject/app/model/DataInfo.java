package com.mcz.light_appproject.app.model;

import java.io.Serializable;

/**
 * Created by mcz on 2018/1/10.
 */

public class DataInfo implements Serializable{
    private String DeviceId ;
    private String DeviceName;
    private String DeviceStatus;
    private String DeviceType;
    private String Devicelight;
    private String error_code;
    ////////////////////////////////
    private String lasttime;
    private String Devicetimestamp;

    public DataInfo(){

    }
    public void setDevicelight(String dv_light) {
        Devicelight = dv_light;
    }

    public String getDevicelight() {
        return Devicelight;
    }

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }



    public String getLasttime() {
        return lasttime;
    }

    public void setLasttime(String lasttime) {
        this.lasttime = lasttime;
    }

    public String getDeviceName() {
        return DeviceName;
    }

    public void setDeviceName(String deviceName) {
        DeviceName = deviceName;
    }


    public String getDeviceStatus() {
        return DeviceStatus;
    }

    public void setDevicetimestamp(String timestamp) {
        Devicetimestamp = timestamp;
    }



    public String getDevicetimestamp() {
        return Devicetimestamp;
    }

    public void setDeviceStatus(String deviceStatus) {
        DeviceStatus = deviceStatus;
    }

    public String getDeviceType() {
        return DeviceType;
    }

    public void setDeviceType(String deviceType) {
        DeviceType = deviceType;
    }

    public String getDeviceId() {
        return DeviceId;
    }

    public void setDeviceId(String deviceId) {
        this.DeviceId = deviceId;
    }
    public String getGatewayId() {
        return DeviceId;
    }

    public void setGatewayId(String deviceId) {
        this.DeviceId = deviceId;
    }
}
