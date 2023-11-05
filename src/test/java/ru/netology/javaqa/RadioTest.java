package ru.netology.javaqa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void testNext() {
        Radio radio = new Radio();

        radio.setStation(0);
        radio.next();
        assertEquals(1, radio.getCurrentStation());

        radio.setStation(9);
        radio.next();
        assertEquals(0, radio.getCurrentStation());

        radio.setStation(5);
        radio.next();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void testPrev() {
        Radio radio = new Radio();

        radio.setStation(9);
        radio.prev();
        assertEquals(8, radio.getCurrentStation());

        radio.setStation(0);
        radio.prev();
        assertEquals(9, radio.getCurrentStation());

        radio.setStation(5);
        radio.prev();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void testSetStation() {
        Radio radio = new Radio();

        radio.setStation(7);
        assertEquals(7, radio.getCurrentStation());

        radio.setStation(12);
        assertEquals(7, radio.getCurrentStation());

        radio.setStation(-4);
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio();

        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());

        radio.setStation(50);
        radio.increaseVolume();
        assertEquals(2, radio.getCurrentVolume());

        for (int i = 0; i < 100; i++) {
            radio.increaseVolume();
        }
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void testDecreaseVolume() {
        Radio radio = new Radio();

        radio.setStation(50);
        radio.increaseVolume();
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());

        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}