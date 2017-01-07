package com.fdm.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Bruce on 2017/1/7.
 */
public class Reader implements Observer {

    public String name;

    public Reader(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Hi," + name + ",新闻更新啦，内容：" + arg);
    }

    @Override
    public String toString() {
        return "读者：" + name;
    }
}
