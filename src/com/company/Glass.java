package com.company;

/**
 * Created by Koljan on 2016.04.06..
 */
public class Glass {

    private String glasss;

    private double weight;
    private String material;
    private double length;
    private String usefulness;

    public Glass() {
    }

    public Glass(double weight, String material, double length, String usefulness) {

        this.weight = weight;
        this.material = material;
        this.length = length;
        this.usefulness = usefulness;
    }



    public String getGlasss() {
        return glasss;
    }

    public void setGlasss(String glasss) {
        this.glasss = glasss;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getUsefulness() {
        return usefulness;
    }

    public void setUsefulness(String usefulness) {
        this.usefulness = usefulness;
    }
}
