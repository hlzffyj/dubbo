package com.hl.dubbo.spi.impl;

import com.hl.dubbo.spi.api.CarInterface;

public class BlackCar implements CarInterface {
    @Override
    public void getColor() {
        System.out.println("black");
    }
}
