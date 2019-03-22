package com.hl.dubbo.spi.impl;

import com.hl.dubbo.spi.api.CarInterface;

public class CarWarapper implements CarInterface {

    private CarInterface carInterface;

    public CarWarapper(CarInterface carInterface){
        this.carInterface = carInterface;
    }
    @Override
    public void getColor() {
        System.out.println("befor");
        carInterface.getColor();
        System.out.println("after");

    }
}
