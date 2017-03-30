package com.qiangxi.designpatterns.builder;

/**
 * Created by qiang_xi on 2017/3/26 13:10.
 */

public abstract class Builder {
    public abstract Builder eat(String food);

    public abstract Builder animalName(String animalName);

    public abstract Builder LegCount(int legCount);

    public abstract Animal build();
}
