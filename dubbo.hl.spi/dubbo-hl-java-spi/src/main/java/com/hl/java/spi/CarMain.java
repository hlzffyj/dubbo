package com.hl.java.spi;

import com.hl.java.spi.api.CarInterface;

import java.util.Iterator;
import java.util.ServiceLoader;

public class CarMain {

    public static void main(String[] args) {
        ServiceLoader<CarInterface> serviceLoader =  ServiceLoader.load(CarInterface.class);
         Iterator<CarInterface>  iterator = serviceLoader.iterator();
        System.out.println("classPath:"+System.getProperty("java.class.path"));
         while (iterator.hasNext()){

             CarInterface carInterface = iterator.next();
             carInterface.getColor();
         }

     }
}
