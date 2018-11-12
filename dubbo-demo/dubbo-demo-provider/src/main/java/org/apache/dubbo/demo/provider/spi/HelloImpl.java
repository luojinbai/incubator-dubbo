package org.apache.dubbo.demo.provider.spi;

/**
 * Created by yibai on 2018-11-13.
 */
public class HelloImpl implements IHello{
    @Override
    public void sayHello(String name) {
        System.out.println("hello" + name);
    }
}
