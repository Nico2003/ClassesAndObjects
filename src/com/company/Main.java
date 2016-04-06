package com.company;

public class Main {

    public static void main(String[] args) {

        Glass glass = new Glass();
        glass.setGlasss("Glaze");

        System.out.println("We have a Object: " + glass.getGlasss());

        System.out.println("______________________________________________________________");

        Glass glass1 =  new Glass(55.5, "glass", 15.5, "Can be used for many drinks");


        System.out.println("This Object is made from: " + glass1.getMaterial());
        System.out.println("Glass weight is: " + glass1.getWeight() + "g");
        System.out.println("Glass length is: " + glass1.getLength() + "cm");
        System.out.println("Glass usefulness: " + glass1.getUsefulness());

        GlassUsefulness glassUsefulness = new GlassUsefulness();
        glassUsefulness.setDrink("drinks");

        GlassUsefulness glassUsefulness1 = new GlassUsefulness("Tea, ", "Juice, ", "Coffee, ", "Lemonade. ");

        System.out.println("Sort of the " + glassUsefulness.getDrink() + ":");
        System.out.print(glassUsefulness1.getTea());
        System.out.print(glassUsefulness1.getCoffe());
        System.out.print(glassUsefulness1.getJuice());
        System.out.println(glassUsefulness1.getLimonade());

        System.out.println("______________________________________________________________");
        System.out.println();


        glass.setGlasss("Big Glass");
        System.out.println("We have a Object: " + glass.getGlasss());

        System.out.println("______________________________________________________________");
        glass1.setMaterial("Plastic");
        glass1.setWeight(102.6);
        glass1.setLength(25);
        glass1.setUsefulness("Can be used to store big things in it");

        System.out.println("This Object is made from: " + glass1.getMaterial());
        System.out.println("Glass weight is: " + glass1.getWeight() + "g");
        System.out.println("Glass length is: " + glass1.getLength() + "cm");
        System.out.println("Glass usefulness: " + glass1.getUsefulness());

        GlassStorage glassStorage = new GlassStorage("Store ");

        System.out.println(glassStorage.getStore() + "example:");

        GlassStorage glassStorage1 = new GlassStorage("Flowers", "Money", "Small things");

        System.out.println("1. " + glassStorage1.getFlower());
        System.out.println("1. " + glassStorage1.getMoney());
        System.out.println("1. " + glassStorage1.getSmallThings());

    }
}
