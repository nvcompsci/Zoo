/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import java.awt.Color;

/**
 *
 * @author jword
 */
public class Pig extends Animal implements Edible{
    private final int calories = 300;
    private static int numPigs = 0;
    
    public Pig() {
        super();
        super.setIsEdible(true);
        Pig.numPigs++;
        System.out.println("There now "+Pig.numPigs+" pigs");
    }
    
    @Override
    public void speak() {
        System.out.println("oink I have "+(Pig.numPigs - 1)+" brothers and sisters.");
    }

    @Override
    public void foodIsCalled() {
        System.out.println("You ate pork.");
        Pig.killPig();
    }

    @Override
    public int getCalories() {
        return calories;
    }

    public static int getNumPigs() {
        return numPigs;
    }

    public static void setNumPigs(int numPigs) {
        Pig.numPigs = numPigs;
    }

    public static void killPig() {
        Pig.numPigs--;
    }
    
}
