package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    int maxRadioStation = 9;
    int minRadioStation = 0;
    int maxVolume = 10;
    int minVolume = 0;

    public Radio(int currentRadioStation, int currentVolume, int maxRadioStation, int minRadioStation, int maxVolume, int minVolume) {
        this.currentRadioStation = currentRadioStation;
        this.currentVolume = currentVolume;
        this.maxRadioStation = maxRadioStation;
        this.minRadioStation = minRadioStation;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
    }

    public Radio() {
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }
}