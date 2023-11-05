package ru.netology.javaqa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void testGetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void testSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        assertEquals(7, radio.getCurrentStation());

        radio.setCurrentStation(10);
        assertEquals(7, radio.getCurrentStation());

        radio.setCurrentStation(-2);
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void testGetVolume() {
        Radio radio = new Radio();
        radio.setVolume(50);
        assertEquals(50, radio.getVolume());
    }

    @Test
    public void testSetVolume() {
        Radio radio = new Radio();
        radio.setVolume(75);
        assertEquals(75, radio.getVolume());

        radio.setVolume(150);
        assertEquals(75, radio.getVolume());

        radio.setVolume(-25);
        assertEquals(75, radio.getVolume());
    }

    @Test
    public void testNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.nextStation();
        assertEquals(6, radio.getCurrentStation());

        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.prevStation();
        assertEquals(4, radio.getCurrentStation());

        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(50);

        radio.increaseVolume();
        assertEquals(51, radio.getVolume());

        radio.setVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getVolume());
    }

    @Test
    public void testDecreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(50);

        radio.decreaseVolume();
        assertEquals(49, radio.getVolume());

        radio.setVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void testGetMaxStations() {
        Radio radio = new Radio(20);
        assertEquals(20, radio.getMaxStation());
    }
}

