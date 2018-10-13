package com.example.b.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by B on 2018/10/13.
 */
public class County extends DataSupport{
private int id;
    private int cityId;
    private String countyname;
    private String weather;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyname(String countyname) {
        this.countyname = countyname;
    }

    public String getCountyname() {
        return countyname;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getWeather() {
        return weather;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}

