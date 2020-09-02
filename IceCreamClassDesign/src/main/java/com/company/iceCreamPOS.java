package com.company;

public class iceCreamPOS {
    private String brand;
    private String flavor;
    private boolean isCup;
    private boolean isWaffleCone;
    private boolean isSugarCone;
    private boolean isMilkShake;
    private int numberOfScoops;


    public void createCup(){
        if (isCup == true) {
            System.out.println("You have created a cup of "+ "Brand: "+brand+" Flavor: "+ flavor);
        }
    }
    public void createWaffleCone(){
        if (isWaffleCone == true) {
            System.out.println("You have created a waffle cone of "+ "Brand: "+brand+" Flavor: "+ flavor);
        }
    }
    public void createSugarCone(){
        if (isSugarCone == true) {
            System.out.println("You have created a sugar cone of " + "Brand: "+brand+" Flavor: "+ flavor);
        }
    }
    public void createMilkShake(){
        if (isMilkShake == true) {
            System.out.println("You have created a milk shake of "+ "Brand: "+brand+" Flavor: "+ flavor);
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public boolean isCup() {
        return isCup;
    }

    public void setCup(boolean cup) {
        isCup = cup;
    }

    public boolean isWaffleCone() {
        return isWaffleCone;
    }

    public void setWaffleCone(boolean waffleCone) {
        isWaffleCone = waffleCone;
    }

    public boolean isSugarCone() {
        return isSugarCone;
    }

    public void setSugarCone(boolean sugarCone) {
        isSugarCone = sugarCone;
    }

    public boolean isMilkShake() {
        return isMilkShake;
    }

    public void setMilkShake(boolean milkShake) {
        isMilkShake = milkShake;
    }

    public int getNumberOfScoops() {
        return numberOfScoops;
    }

    public void setNumberOfScoops(int numberOfScoops) {
        this.numberOfScoops = numberOfScoops;
    }
}
