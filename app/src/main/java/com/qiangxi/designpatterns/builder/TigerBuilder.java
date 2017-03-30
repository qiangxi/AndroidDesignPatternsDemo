package com.qiangxi.designpatterns.builder;

/**
 * Created by qiang_xi on 2017/3/26 13:16.
 */

public class TigerBuilder extends Builder {
    private Animal tiger = new Tiger();

    @Override
    public Builder eat(String food) {
        tiger.setEat(food);
        return this;
    }

    @Override
    public Builder animalName(String animalName) {
        tiger.setAnimalName(animalName);
        return this;
    }

    @Override
    public Builder LegCount(int legCount) {
        tiger.setLegCount(legCount);
        return this;
    }

    @Override
    public Animal build() {
        return tiger;
    }
}
