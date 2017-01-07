package com.fdm.observer;

/**
 * Created by Bruce on 2017/1/7.
 */
public class Test {

    public static void main(String[] args) {

        News news = new News();

        Reader bruce = new Reader("bruce");
        Reader bruce1 = new Reader("bruce1");
        Reader bruce2 = new Reader("bruce2");
        Reader bruce3 = new Reader("bruce3");
        Reader bruce4 = new Reader("bruce4");

        news.addObserver(bruce);
        news.addObserver(bruce1);
        news.addObserver(bruce2);
        news.addObserver(bruce3);
        news.addObserver(bruce4);

        news.postNewPublication("ahahhahhhahha");
    }
}
