package com.example.weather;

import java.io.Serializable;

public class Parcel implements Serializable {
    public Boolean humidityVisibility;
    public Boolean windVisibility;

    public String city;
    public String weather;
    public String tempCurrent;
    public String tempRange;
    public String humidity;
    public String wind;
    public String wind_direction;
    public String updated;

    public String[] time;
    public String[] day;
    public String[] cities;
    public String[] tempCities;
    public String[] weather_collection;
    public int[] weather_image_collection;
    public int[] temperature_collection;
}
