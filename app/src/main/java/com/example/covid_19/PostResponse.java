package com.example.covid_19;

public class PostResponse {
    private String country;
    private int cases;
    private int deaths;

    private int recovered;
    private int critical;


    public PostResponse(String country, int cases, int deaths, int recovered, int critical) {
        this.country = country;
        this.cases = cases;
        this.deaths = deaths;
        this.recovered = recovered;
        this.critical = critical;
    }

    public String getCountry() {
        return country;
    }

    public int getCases() {
        return cases;
    }

    public int getDeaths() {
        return deaths;
    }

    public int getRecovered() {
        return recovered;
    }

    public int getCritical() {
        return critical;
    }
}
