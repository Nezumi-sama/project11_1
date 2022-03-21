package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    Radio radioStation = new Radio();

    @Test
    public void radioTestSetNumber() {
        radioStation.setNumber(7);

        int expected = 7;
        int numberActual = radioStation.getNumber();

        assertEquals(expected, numberActual);
    }

    @Test
    public void radioTestSetNumberOutsideMore() {
        radioStation.setNumber(15);

        int expected = 5;
        int numberActual = radioStation.getNumber();

        assertEquals(expected, numberActual);
    }

    @Test
    public void radioTestSetNumberOutsideLess() {
        radioStation.setNumber(-1);

        int expected = 5;
        int numberActual = radioStation.getNumber();

        assertEquals(expected, numberActual);
    }


    @Test
    public void radioTestNextNumber() {
        radioStation.setNumber(5);
        radioStation.setNumberNext();

        int expected = 6;
        int numberActual = radioStation.getNumber();

        assertEquals(expected, numberActual);
    }

    @Test
    public void radioTestNextNumberBorder() {
        radioStation.setNumber(9);
        radioStation.setNumberNext();

        int expected = 0;
        int numberActual = radioStation.getNumber();

        assertEquals(expected, numberActual);
    }

    @Test
    public void radioTestPrevNumber() {
        radioStation.setNumber(5);
        radioStation.setNumberPrev();

        int expected = 4;
        int numberActual = radioStation.getNumber();

        assertEquals(expected, numberActual);
    }

    @Test
    public void radioTestPrevNumberBorder() {
        radioStation.setNumber(0);
        radioStation.setNumberPrev();

        int expected = 9;
        int numberActual = radioStation.getNumber();

        assertEquals(expected, numberActual);
    }


    @Test
    public void radioTestSetVolume() {
        radioStation.setVolume(7);

        int expected = 7;
        int volumeActual = radioStation.getVolume();

        assertEquals(expected, volumeActual);
    }

    @Test
    public void radioTestSetVolumeOutsideMore() {
        radioStation.setVolume(11);

        int expected = 0;
        int volumeActual = radioStation.getVolume();

        assertEquals(expected, volumeActual);
    }

    @Test
    public void radioTestSetVolumeOutsideLess() {
        radioStation.setVolume(-1);

        int expected = 0;
        int volumeActual = radioStation.getVolume();

        assertEquals(expected, volumeActual);
    }


    @Test
    public void radioTestVolumeIncrease() {
        radioStation.setVolume(5);
        radioStation.setVolumeIncrease();

        int expected = 6;
        int volumeActual = radioStation.getVolume();

        assertEquals(expected, volumeActual);
    }

    @Test
    public void radioTestVolumeIncreaseBorder() {
        radioStation.setVolume(10);
        radioStation.setVolumeIncrease();

        int expected = 10;
        int volumeActual = radioStation.getVolume();

        assertEquals(expected, volumeActual);
    }

    @Test
    public void radioTestVolumeReduce() {
        radioStation.setVolume(5);
        radioStation.setVolumeReduce();

        int expected = 4;
        int volumeActual = radioStation.getVolume();

        assertEquals(expected, volumeActual);
    }

    @Test
    public void radioTestVolumeReduceBorder() {
        radioStation.setVolume(0);
        radioStation.setVolumeReduce();

        int expected = 0;
        int volumeActual = radioStation.getVolume();

        assertEquals(expected, volumeActual);
    }

}
