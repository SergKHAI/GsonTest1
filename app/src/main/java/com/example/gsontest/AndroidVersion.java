package com.example.gsontest;

import com.google.gson.annotations.SerializedName;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Сергей on 20.09.2017.
 */
class main
{
    String temp_min;
    String temp_max;
}
class wind
{
    String speed;
}
class City
{

    String name;
    String getCityTitle() {return name; }
}
public class AndroidVersion {
    private main main;
    private wind wind;


    public String WindSpeed() {
        return wind.speed;
    }

    public String MaxTemp() {return main.temp_max;}

    public String MinTemp() {return main.temp_min; }


}
