package edu.eci.arsw.model;

public class Region {
    private int numDeaths;
    private int numInfected;
    private int numCured;

    public Region(){
    }

    public void setNumInfected(int numInfected) {
        this.numInfected = numInfected;
    }

    public void setNumDeaths(int numDeaths) {
        this.numDeaths = numDeaths;
    }

    public void setNumCured(int numCured) {
        this.numCured = numCured;
    }

    public int getNumInfected() {
        return numInfected;
    }

    public int getNumDeaths() {
        return numDeaths;
    }

    public int getNumCured() {
        return numCured;
    }
}