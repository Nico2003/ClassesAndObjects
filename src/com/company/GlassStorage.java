package com.company;

/**
 * Created by Koljan on 2016.04.06..
 */
public class GlassStorage {

    private String store;

    private String flower;
    private String money;
    private String smallThings;


    public GlassStorage(String store) {
        this.store = store;
    }

    public GlassStorage(String flower, String money, String smallThings) {
        this.flower = flower;
        this.money = money;
        this.smallThings = smallThings;
    }

    public String getStore() {
        return store;
    }


    public String getFlower() {
        return flower;
    }


    public String getMoney() {
        return money;
    }


    public String getSmallThings() {
        return smallThings;
    }
}
