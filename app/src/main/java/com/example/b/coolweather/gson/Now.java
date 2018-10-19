package com.example.b.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by B on 2018/10/18.
 */
public class Now {
    @SerializedName("tmp")
    public String teperatrue;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
