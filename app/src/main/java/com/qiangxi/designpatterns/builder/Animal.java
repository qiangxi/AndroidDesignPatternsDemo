package com.qiangxi.designpatterns.builder;

/**
 * Created by qiang_xi on 2017/3/26 13:08.
 */
public abstract class Animal {
    protected String mAnimalName;//动物名称
    protected String mFood;//失误
    protected int mLegCount;//腿的数量

    protected Animal() {
    }

    protected void setAnimalName(String animalName) {
        mAnimalName = animalName;
    }

    protected abstract void setLegCount(int legCount);

    protected abstract void setEat(String food);

    @Override
    public String toString() {
        return "Animal{" +
                "mAnimalName='" + mAnimalName + '\'' +
                ", mFood='" + mFood + '\'' +
                ", mLegCount=" + mLegCount +
                '}';
    }
}
