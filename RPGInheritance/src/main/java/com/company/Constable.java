package com.company;

public class Constable extends BaseCharacter{
    private String jurisdiction;

    public Constable(String name,String jurisdictionIn){
        super(name,60,100,60,20,5);
        this.jurisdiction = jurisdictionIn;
    }
    public void arrest(){
        System.out.println("Arresting....");
    }
}
