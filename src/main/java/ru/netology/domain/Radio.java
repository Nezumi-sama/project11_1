package ru.netology.domain;

public class Radio {
    private int number;
    private int volume;

    public int getNumber() {
        return number;
    }

    public void setNumber(int newNumber) {
        if (newNumber >= 0 && newNumber <= 9) {
            number = newNumber;
        } else {
            number = 5;
        }
    }

    public void setNumberNext() {
        if (number == 9) {
            number = 0;
        } else {
            number += 1;
        }
    }

    public void setNumberPrev() {
        if (number == 0) {
            number = 9;
        } else {
            number -= 1;
        }
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume >= 0 && newVolume <= 10) {
            volume = newVolume;
        } else {
            volume = 0;
        }

    }

    public void setVolumeIncrease() {
        if (volume == 10) {
            return;
        } else {
            volume += 1;
        }
    }

    public void setVolumeReduce() {
        if (volume == 0) {
            return;
        } else {
            volume -= 1;
        }
    }


}
