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
public class Sheep extends Animal implements Edible {
    private final int calories = 200;
    
    @Override
    public void speak() {
        System.out.println("baa"); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void foodIsCalled() {
        System.out.println("You ate mutton."); 
    }

    @Override
    public int getCalories() {
        return calories; 
    }
}
