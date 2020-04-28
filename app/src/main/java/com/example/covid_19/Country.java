package com.example.covid_19;

public class Country {
    private String country;
    private int cases;
    private int recovered;
    private int critical;
    private int deaths;

    public Country(String country, int cases, int recovered, int critical, int deaths) {
        this.country = country;
        this.cases = cases;
        this.recovered = recovered;
        this.critical = critical;
        this.deaths = deaths;
    }

    public String getCountry() {
        return country;
    }

    public int getCases() {
        return cases;
    }

    public int getRecovered() {
        return recovered;
    }

    public int getCritical() {
        return critical;
    }

    public int getDeaths() {
        return deaths;
    }
}