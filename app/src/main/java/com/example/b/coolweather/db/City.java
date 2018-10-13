package com.example.b.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by B on 2018/10/13.
 */
public class City extends DataSupport{
    private int id;
    private  String cityname;
    private String citycode;
private int provinceId;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    public String getCitycode() {
        return citycode;
    }

    public String getCityname() {
        return cityname;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getProvinceId() {
        return provinceId;
    }
}
