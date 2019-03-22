package com.hl.dubbo.spi.impl;

import com.hl.dubbo.spi.api.CarInterface;

public class RedCar implements CarInterface {
    @Override
    public void getColor() {
        System.out.println("red");
    }
}
