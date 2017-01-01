package com.fdm.factoryMethod;

/**
 * Created by Bruce on 2017/1/1.
 */
public class ConcreateFactory extends Factory {

    @Override
    public Product createProduct() {
        return new ConcreateProductA();
    }

}
