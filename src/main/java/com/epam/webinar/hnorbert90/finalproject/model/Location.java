package com.epam.webinar.hnorbert90.finalproject.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Location {

    private String country;
    private String county;
    private String city;
    private int postalCode;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Location(@NotNull String country, @NotNull String county, @NotNull String city,
            @NotNull @Min(value = 0) int postalCode) {
        super();
        this.country = country;
        this.county = county;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getCounty() {
        return county;
    }

    @NotNull
    public void setCounty(String county) {
        this.county = county;
    }

    public String getCity() {
        return city;
    }

    @NotNull
    public void setCity(String city) {
        this.city = city;
    }

    public int getPostalCode() {
        return postalCode;
    }

    @NotNull
    @Min(value = 0)
    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }
}
