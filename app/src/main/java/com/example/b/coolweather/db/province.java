package com.example.b.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by B on 2018/10/13.
 */
public class province extends DataSupport{
    private int id;
    private  String provinceName;
    private int proivinCecode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProivinCecode() {
        return proivinCecode;
    }

    public void setProivinCecode(int proivinCecode) {
        this.proivinCecode = proivinCecode;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getProvinceName() {
        return provinceName;
    }
}
