package com.fdm.factoryMethod;

/**
 * Created by Bruce on 2017/1/1.
 */
public abstract class Factory {

    /**
     * 抽象工厂方法，具体生产什么由子类去实现
     */
    public abstract Product createProduct();

}
