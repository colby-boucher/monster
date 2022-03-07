package com.teksystems;

public class Main {

    public static void main(String[] args) {

        // Declare monsters
        Monster m1 = new FireMonster("Charizard");
        Monster m2 = new WaterMonster("Squirtle");
        Monster m3 = new StoneMonster("Cranidos");

        //Invoke methods
        System.out.println(m1.attack());
        System.out.println(m2.attack());
        System.out.println(m3.attack());

        //Monster m4= new Monster(); Monster is an abstract class
    }
}
