package com.hl.java.spi.impl;

import com.hl.java.spi.api.CarInterface;

public class BlackCar implements CarInterface {
    @Override
    public void getColor() {
        System.out.println("black");
    }
}
