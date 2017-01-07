package com.fdm.observer;

import java.util.Observable;

/**
 * Created by Bruce on 2017/1/7.
 */
public class News extends Observable {

    public void postNewPublication(String content) {
        setChanged();
        notifyObservers(content);
    }
}
