package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {        //установка номера станции
        Radio rad = new Radio();

        rad.setCurrentStation(1);

        int expected = 1;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationLessMin() {         //установка номера станиции меньше минимальной
        Radio rad = new Radio();

        rad.setCurrentStation(-1);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationMoreMax() {         //установка номера станции больше максимальной
        Radio rad = new Radio();

        rad.setCurrentStation(10);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {                 //переключиние на следующую станцию
        Radio rad = new Radio();

        rad.setCurrentStation(0);
        rad.nextStation();

        int expected = 1;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationMoreMax() {   //переключение на следующую станцию после максимальной
        Radio rad = new Radio();

        rad.setCurrentStation(9);
        rad.nextStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {         //переключение на предыдущую станцию
        Radio rad = new Radio();

        rad.setCurrentStation(3);
        rad.prevStation();

        int expected = 2;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationLessMin() {        //переключение на предыдущую станцию до минимальной
        Radio rad = new Radio();

        rad.setCurrentStation(0);
        rad.prevStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void increaseVolume() {      //увеличение громкости
        Radio vol = new Radio();

        vol.setCurrentVolume(9);
        vol.increaseVolume();

        int expected = 10;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseVolumeMoreMax() {       //увеличение громкости выше максимальной
        Radio vol = new Radio();

        vol.setCurrentVolume(100);
        vol.increaseVolume();

        int expected = 100;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {          //уменьшение громкости
        Radio vol = new Radio();

        vol.setCurrentVolume(5);
        vol.decreaseVolume();

        int expected = 4;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeLessMin() {       //уменьшение громкости ниже минимальной
        Radio vol = new Radio();

        vol.setCurrentVolume(0);
        vol.decreaseVolume();

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}