package com.fdm.singleton;

/**
 * 饿汉式单例
 * <p>
 * Created by Bruce on 2016/12/31.
 */

public class Singleton2 {

    private static Singleton2 singleton2 = new Singleton2();

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return singleton2;
    }

}