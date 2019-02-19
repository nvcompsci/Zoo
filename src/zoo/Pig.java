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
    
    @Override
    public void speak() {
        System.out.println("oink");
    }

    @Override
    public void foodIsCalled() {
        System.out.println("You ate pork."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getCalories() {
        return calories; //To change body of generated methods, choose Tools | Templates.
    }
}
