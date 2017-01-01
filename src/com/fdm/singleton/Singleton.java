package com.fdm.singleton;

/**
 * 静态内部类单例模式
 * <p>
 * 当第一次加载Singleton类时并不会初始化sInstance,
 * 只有在第一次调用Singleton的getInstance()方法时才会导致sInstance被初始化。
 * 因此第一次调用第一次调用getInstance()方法会导致虚拟机加载SingletonHolder类，
 * 这种方式确保了线程安全，也保证了单例对象的唯一性，同时延迟了单例的实例化，这是推荐使用的单例模式实现方法。
 * <p>
 * Created by Bruce on 2016/12/31.
 */
public class Singleton {
    // 私有的构造方法
    private Singleton() {
    }

    // 以自身实例为返回值的静态的公有的方法
    public static Singleton getInstance() {

        return SingletonHolder.sInstance;
    }

    // 静态内部类延迟单例的实例化
    private static class SingletonHolder {

        private static final Singleton sInstance = new Singleton();
    }
}
