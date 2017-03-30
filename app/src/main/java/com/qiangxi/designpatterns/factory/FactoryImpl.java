package com.qiangxi.designpatterns.factory;

/**
 * Created by qiang_xi on 2017/3/27 22:01.
 */

public class FactoryImpl extends Factory {
    @Override
    public Product createProduct() {
        return new ProductImpl01();
    }
}
