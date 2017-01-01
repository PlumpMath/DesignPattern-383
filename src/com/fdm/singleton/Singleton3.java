package com.fdm.singleton;

/**
 * 懒汉式单例
 * <p>
 * 懒汉式单例的优点是单例只有在使用时才会被实例化，在一定程度上节约了资源，
 * 缺点是第一次加载时需要及时进行实例化，反应稍慢，最大的问题是每次调用getInstance()方法都会进行同步，
 * 造成不必要的同步开销。这种模式一般不建议使用。
 * <p>
 * Created by Bruce on 2016/12/31.
 */

public class Singleton3 {

    private static Singleton3 singleton3;

    private Singleton3() {
    }

    public static synchronized Singleton3 getInstance() {
        if (singleton3 == null) {
            singleton3 = new Singleton3();
        }
        return singleton3;
    }
}
