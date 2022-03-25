package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Radio {
    private int number = 0;
    private int volume = 50;
    private int quantity = 10;


    public Radio(int quantity) {
        this.quantity = quantity;
    }

    public void setNumberNext() {
        if (number == this.quantity - 1) {
            number = 0;
        } else {
            number += 1;
        }
    }

    public void setNumberPrev() {
        if (number == 0) {
            number = this.quantity - 1;
        } else {
            number -= 1;
        }
    }

    public void setVolumeIncrease() {
        if (volume == 100) {
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
/*
   public Radio() {
    }



    public int getQuantityNumber() {
        return quantity;
    }*/

 /*   public void setQuantityNumber(int quantity) {
        this.quantity = quantity;
    }
*/

 /*   public int getNumber() {
        return number;
    }

    public void setNumber(int newNumber) {
        if (newNumber >= 0 && newNumber <= this.quantity - 1) {
            number = newNumber;
        } else {
            number = 0;
        }
    }

    public void setNumberNext() {
        if (number == this.quantity - 1) {
            number = 0;
        } else {
            number += 1;
        }
    }

    public void setNumberPrev() {
        if (number == 0) {
            number = this.quantity - 1;
        } else {
            number -= 1;
        }
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume >= 0 && newVolume <= 100) {
            volume = newVolume;
        } /*else {
            volume = 50;
        }*/

 /*   }

    public void setVolumeIncrease() {
        if (volume == 100) {
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
    }*/


}
