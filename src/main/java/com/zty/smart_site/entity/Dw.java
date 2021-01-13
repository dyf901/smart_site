package com.zty.smart_site.entity;

import java.util.List;

public class Dw {
    private int id;
    private String carId,lonc,latc,speed,uptime;

    public Dw(){
        super();
    }

    public Dw(int id, String carId, String lonc, String latc, String speed, String uptime) {
        this.id = id;
        this.carId = carId;
        this.lonc = lonc;
        this.latc = latc;
        this.speed = speed;
        this.uptime = uptime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getLonc() {
        return lonc;
    }

    public void setLonc(String lonc) {
        this.lonc = lonc;
    }

    public String getLatc() {
        return latc;
    }

    public void setLatc(String latc) {
        this.latc = latc;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", carId='" + carId + '\'' +
                ", lonc='" + lonc + '\'' +
                ", latc='" + latc + '\'' +
                ", speed='" + speed + '\'' +
                ", uptime='" + uptime + '\'' +
                '}';
    }
}
