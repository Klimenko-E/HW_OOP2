package ru.netology.radio;

public class Radio {
    private int currentStation;      //текущая станция
    private int currentVolume;      //текущая громкость

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {      //установка станции
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {         //следующая станция
        if (currentStation == 9) {
            currentStation = 0;

        } else {
            currentStation++;
        }
    }

    public void prevStation() {         //предыдущая станция
        if (currentStation == 0) {
            currentStation = 9;

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
        if (currentVolume < 100) {
            currentVolume++;

        } else {
            currentVolume = 100;
        }
    }

    public void decreaseVolume() {      //уменьшение громкости
        if (currentVolume > 0) {
            currentVolume--;

        } else {
            currentVolume = 0;
        }
    }

}
