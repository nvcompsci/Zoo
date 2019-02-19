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
public class Coconut implements Edible {
    private final int calories = 150;
    
    @Override
    public void foodIsCalled() {
        System.out.println("You ate coconut."); 
    }

    @Override
    public int getCalories() {
        return calories; 
    }
}
