package com.dev.generators.weatherApp.domain;

import lombok.Data;

import java.util.List;

@Data
public class WeatherResponse {
    private String name;
    private Sys sys;
    private List<Weather> weather;
    private Main main;
    private Wind wind;


@Data
    public static class Sys {
        private String country;
    }
@Data
    public static class Weather{
        private int id;
        private String description;
    }

@Data
    public static class Main {
        private double temp;
        private int humidity;
    }
@Data
    public static class Wind{
        private double speed;
    }
}
