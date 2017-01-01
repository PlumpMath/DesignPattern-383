package com.fdm.factoryMethod;

/**
 * Created by Bruce on 2017/1/1.
 */
public class Client {

    public static void main(String[] args){
        Factory factory = new ConcreateFactory();
        Product p = factory.createProduct();
        p.method();
    }
}
