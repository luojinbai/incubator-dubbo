package org.apache.dubbo.demo.provider.spi;

import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * Created by yibai on 2018-11-13.
 */
public class MainClass {

    public static void main(String[] args) {
        IHello hello = ExtensionLoader.getExtensionLoader(IHello.class).getExtension("local");
        hello.sayHello("yibai");
    }
}
