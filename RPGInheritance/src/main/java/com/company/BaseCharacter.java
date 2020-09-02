package com.company;

public abstract class BaseCharacter {
    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;

    public BaseCharacter(String nameIn,int strengthIn,int healthIn,int staminaIn,int speedIn,int attackPowerIn){
        this.name = nameIn;
        this.strength = strengthIn;
        this.health = healthIn;
        this.stamina = staminaIn;
        this.speed = speedIn;
        this.attackPower = attackPowerIn;
    }

    public void run(){
        this.stamina -= 5;
    };
    public void attack(){
        this.strength -= 5;
    };
    public void heal(){
        this.health += 5;
    };
    public void decreaseHealth(){
        this.health -= 5;
    };
    public void increaseStamina(){
        this.stamina += 5;
    };
    public void decreaseStamina(){
        this.stamina -= 5;
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}
