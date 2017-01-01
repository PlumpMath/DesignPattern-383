package com.fdm.builder;

/**
 * Created by Bruce on 2016/12/31.
 */
public class Director {
    Builder builder = null;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(String board, String display) {
        this.builder.buildBoard(board);
        this.builder.buildDisplay(display);
        this.builder.buildOS();
    }
}
