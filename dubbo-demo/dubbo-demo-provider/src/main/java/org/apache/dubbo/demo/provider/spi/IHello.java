package org.apache.dubbo.demo.provider.spi;

import org.apache.dubbo.common.extension.SPI;

/**
 * Created by yibai on 2018-11-13.
 */
@SPI
public interface IHello {
    public void sayHello(String name);
}
