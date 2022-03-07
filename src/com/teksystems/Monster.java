package com.teksystems;

public abstract class Monster {
    private final String name;
    abstract String attack();

    public Monster(String name){
        this.name= name;
    }

    public String getName(){
        return this.name;
    }
}

