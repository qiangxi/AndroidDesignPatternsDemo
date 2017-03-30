package com.qiangxi.designpatterns.Prototype;

/**
 * Created by qiang_xi on 2017/3/26 20:33.
 */

public class Address implements Cloneable{
    public String city;
    public String district;
    public String street;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Address address = (Address) super.clone();
        address.city = this.city;
        address.district = this.district;
        address.street = this.street;
        return address;
    }
}
