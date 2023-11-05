package ru.netology.javaqa;

public class Radio {
    private int currentStation;
    private int maxStation;
    private int volume;

    public Radio() {
        this.maxStation = 10;
    }

    public Radio(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation >= 0 && currentStation < maxStation) {
            this.currentStation = currentStation;
        }
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        }
    }

    public void nextStation() {
        if (currentStation == maxStation - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = maxStation - 1;
        } else {
            currentStation--;
        }
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void setMaxStations(int maxStations) {
        this.maxStation = maxStations;
    }
}


