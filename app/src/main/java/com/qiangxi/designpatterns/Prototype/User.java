package com.qiangxi.designpatterns.Prototype;


/**
 * Created by qiang_xi on 2017/3/26 20.:10
 * 原型模式示例
 */

public class User implements Cloneable {
    public int age;
    public String name;
    public String sex;
    public int height;
    public Address address;

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", height=" + height +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        User user = (User) super.clone();
        user.age = this.age;
        user.name = this.name;
        user.sex = this.sex;
        user.height = this.height;
        user.address = (Address) this.address.clone();
        return user;
    }
}
