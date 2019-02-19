/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 *
 * @author jword
 */
public class Cow extends Animal implements Edible {
    private final int calories = 500;
    
    public Cow() {
        super();
        super.setIsEdible(true);
    }
    
    @Override
    public void speak() {
        System.out.println("moo");
    }
    
    @Override
    public void foodIsCalled() {
        System.out.println("You ate beef."); 
    }

    @Override
    public int getCalories() {
        return calories; 
    }
}
