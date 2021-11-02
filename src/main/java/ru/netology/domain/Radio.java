package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxRadioStation = 10;
    private int minRadioStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {

    }

    public Radio(int currentRadioStation, int maxRadioStation, int minRadioStation) {
        this.currentRadioStation = currentRadioStation;
        this.maxRadioStation = maxRadioStation;
        this.minRadioStation = minRadioStation;
    }

    public int getCurrentRadioStation()
    {
        return currentRadioStation;
    }



    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int setNextStation() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = minRadioStation;

        }
        return currentRadioStation;

    }

    public int setEarlyStation() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxRadioStation;
        }
        return currentRadioStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }







    public int setNextVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = this.currentVolume + 1;
        } else {
            currentVolume = currentVolume;

        }
        return currentVolume;

    }

    public int setEarlyVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = currentVolume;
        }
        return currentVolume;


    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }
}