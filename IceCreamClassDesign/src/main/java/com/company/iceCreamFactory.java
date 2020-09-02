package com.company;

public class iceCreamFactory {
    private String brand;
    private String flavor;
    private int containerWidth;
    private int containerLength;
    private int containerVolume;
    private boolean promotionalLabel;

    public void createContainer(){
        System.out.println("You created a container of "+brand+" with the flavor of "+flavor);
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

    public int getContainerWidth() {
        return containerWidth;
    }

    public void setContainerWidth(int containerWidth) {
        this.containerWidth = containerWidth;
    }

    public int getContainerLength() {
        return containerLength;
    }

    public void setContainerLength(int containerLength) {
        this.containerLength = containerLength;
    }

    public int getContainerVolume() {
        return containerVolume;
    }

    public void setContainerVolume(int containerVolume) {
        this.containerVolume = containerVolume;
    }

    public boolean isPromotionalLabel() {
        return promotionalLabel;
    }

    public void setPromotionalLabel(boolean promotionalLabel) {
        this.promotionalLabel = promotionalLabel;
    }
}
