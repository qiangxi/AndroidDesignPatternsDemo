package com.qiangxi.designpatterns.builder;

/**
 * Created by qiang_xi on 2017/3/26 13:32.
 */

public class Director {
    private Builder mBuilder;

    public Director(Builder mBuilder) {
        this.mBuilder = mBuilder;
    }

    public void construst(String animalName, String food, int legCount) {
        mBuilder.LegCount(legCount).eat(food).animalName(animalName);
    }
}
