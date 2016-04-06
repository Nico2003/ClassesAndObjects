package com.company;

/**
 * Created by Koljan on 2016.04.06..
 */
public class GlassUsefulness {

    private String drink;

    private String tea;
    private String coffe;
    private String juice;
    private String limonade;

    public GlassUsefulness() {
    }

    public GlassUsefulness(String drink) {
        this.drink = drink;
    }

    public GlassUsefulness(String tea, String juice, String coffe, String limonade) {
        this.tea = tea;
        this.juice = juice;
        this.coffe = coffe;
        this.limonade = limonade;
    }

    public String getTea() {
        return tea;
    }

    public String getCoffe() {
        return coffe;
    }

    public String getJuice() {
        return juice;
    }

    public String getLimonade() {
        return limonade;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getDrink() {
        return drink;
    }
}
