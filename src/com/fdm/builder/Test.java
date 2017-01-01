package com.fdm.builder;

/**
 * Created by Bruce on 2016/12/31.
 */
public class Test {
    public static void main(String[] args) {

        Builder builder = new MacBookBuilder();
        Director director = new Director(builder);
        director.construct("英特尔主板", "Retina显示屏");

        System.out.println("Computer Info:" + builder.create().toString());
    }
}
