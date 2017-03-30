package com.qiangxi.designpatterns.builder;

/**
 * Created by qiang_xi on 2017/3/26 14:40.
 * 简化后的builder模式
 */

public class User {
    private int age;
    private String name;
    private String sex;
    private int height;

    public static class Builder {
        private User user = new User();

        public Builder(int height) {
            user.height = height;
        }

        public Builder age(int age) {
            user.age = age;
            return this;
        }

        public Builder name(String name) {
            user.name = name;
            return this;
        }

        public Builder sex(String sex) {
            user.sex = sex;
            return this;
        }

        public User build() {
            return user;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", height=" + height +
                '}';
    }
}
