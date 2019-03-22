package com.hl.java.spi.impl;

import com.hl.java.spi.api.CarInterface;

public class RedCar implements CarInterface {
    @Override
    public void getColor() {
        System.out.println("red");
    }
}
