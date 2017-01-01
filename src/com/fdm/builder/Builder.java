package com.fdm.builder;

/**
 * Created by Bruce on 2016/12/31.
 */
public abstract class Builder {

    public abstract void buildBoard(String board);

    public abstract void buildDisplay(String display);

    public abstract void buildOS();

    public abstract Computer create();

}
