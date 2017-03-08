package com.example.android.inclassassignment06_jingshanw;

import java.io.Serializable;

/**
 * Created by Jing on 3/6/17.
 */

public class Car implements Serializable
{
    private String brand;
    private int price;
    private boolean suv;

    public Car(String brand, boolean suv, int price)
    {
        this.brand = brand;
        this.suv = suv;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isSuv() {
        return suv;
    }

    public void setSuv(boolean suv) {
        this.suv = suv;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand: "+brand +"\n"+"Price: "+price+"\n"+"Is it SUV? "+ suv;
    }
}
