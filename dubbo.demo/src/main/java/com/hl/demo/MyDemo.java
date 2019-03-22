package com.hl.demo;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Protocol;

import java.io.IOException;

public class MyDemo {

    public static void main(String[] args) throws IOException {
        ExtensionLoader<Protocol> extensionLoader = ExtensionLoader.getExtensionLoader(Protocol.class);
        Protocol protocol =   extensionLoader.getAdaptiveExtension();
        System.in.read();

    }
}
