package com.company;

public class Warrior extends BaseCharacter {
    private int shieldStrength = 100;

    public Warrior(String name){
        super(name,75,100,100,50,10);
    }
    public void decreaseShieldStrength(){
        this.shieldStrength -= 5;
    }
}
