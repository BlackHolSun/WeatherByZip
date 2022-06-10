package com.carysoft.weather;

import java.math.BigDecimal;
import java.util.Objects;

public class CurrentWeather {

    private String description;
    private BigDecimal temperature;
    private BigDecimal feelsLike;
    private BigDecimal windSpeed;
    private String city;

    public CurrentWeather(String description, BigDecimal temperature, BigDecimal feelsLike, BigDecimal windSpeed, String city) {
        this.description = description;
        this.temperature = temperature;
        this.feelsLike = feelsLike;
        this.windSpeed = windSpeed;
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getTemperature() {
        return temperature;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrentWeather that = (CurrentWeather) o;
        return description.equals(that.description) && temperature.equals(that.temperature) && feelsLike.equals(that.feelsLike) && windSpeed.equals(that.windSpeed) && city.equals(that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, temperature, feelsLike, windSpeed);
    }

    public BigDecimal getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(BigDecimal feelsLike) {
        this.feelsLike = feelsLike;
    }

    public BigDecimal getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(BigDecimal windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
