package com.qiangxi.designpatterns.builder;

/**
 * Created by qiang_xi on 2017/3/26 13:14.
 */

public class Tiger extends Animal {
    public Tiger() {
    }

    @Override
    public void setLegCount(int legCount) {
        mLegCount = legCount;
    }

    @Override
    public void setEat(String food) {
        mFood = food;
    }
}
