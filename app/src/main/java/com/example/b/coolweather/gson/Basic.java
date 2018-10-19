package com.example.b.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by B on 2018/10/16.
 */
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{
    @SerializedName("loc")
    public String updataTime;
}
}