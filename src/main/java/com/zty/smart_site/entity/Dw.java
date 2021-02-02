package com.zty.smart_site.entity;

import java.util.List;

public class Dw {
    private int id,speed,dir;
    private String carId,lonc,latc,uptime,carNO;

    public Dw(){
        super();
    }

    public Dw(int id, int speed, int dir, String carId, String lonc, String latc, String uptime, String carNO) {
        this.id = id;
        this.speed = speed;
        this.dir = dir;
        this.carId = carId;
        this.lonc = lonc;
        this.latc = latc;
        this.uptime = uptime;
        this.carNO = carNO;
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

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDir() {
        return dir;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

    public String getCarNO() {
        return carNO;
    }

    public void setCarNO(String carNO) {
        this.carNO = carNO;
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
