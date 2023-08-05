package ru.netology.radio;

public class Radio {

    private int currentStation;      //текущая станция
    private int currentVolume;      //текущая громкость
    private int numberStation = 10;
    private int minStation = 0;
    private int maxStation = numberStation - 1;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int numberStation) {
        this.numberStation = numberStation;
        this.maxStation = numberStation - 1;
    }

    public Radio() {
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {      //установка станции
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {         //следующая станция
        if (currentStation == maxStation) {
            currentStation = minStation;

        } else {
            currentStation++;
        }
    }

    public void prevStation() {         //предыдущая станция
        if (currentStation == minStation) {
            currentStation = maxStation;

        } else {
            currentStation--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    void setCurrentVolume(int newCurrentVolume) {       //установка громкости

        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {          //увеличение громкости
        if (currentVolume < maxVolume) {
            currentVolume++;

        } else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {      //уменьшение громкости
        if (currentVolume > minVolume) {
            currentVolume--;

        } else {
            currentVolume = minVolume;
        }
    }

}
