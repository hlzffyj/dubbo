package com.hl.dubbo.spi;

import com.hl.dubbo.spi.api.CarInterface;
import org.apache.dubbo.common.extension.ExtensionLoader;


public class CarMain {

    public static void main(String[] args) {
        ExtensionLoader<CarInterface> extensionLoader = ExtensionLoader.getExtensionLoader(CarInterface.class);

        CarInterface carInterface = extensionLoader.getExtension("red");

        carInterface.getColor();
     }
}
