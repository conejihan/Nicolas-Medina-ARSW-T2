package edu.eci.arsw.model;

public class CountryResults {
    private String name;
    private int numDeaths;
    private int numInfected;
    private int numCured;
    private Region region;

    public CountryResults(){
    }

    public String getName() {
        return name;
    }

    public int getNumCured() {
        return numCured;
    }

    public int getNumDeaths() {
        return numDeaths;
    }

    public int getNumInfected() {
        return numInfected;
    }

    public Region getRegion() {
        return region;
    }

    public void setNumCured(int numCured) {
        this.numCured = numCured;
    }

    public void setNumDeaths(int numDeaths) {
        this.numDeaths = numDeaths;
    }

    public void setNumInfected(int numInfected) {
        this.numInfected = numInfected;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public void setName(String nameCountry) {
        this.nameCountry = name;
    }
}
