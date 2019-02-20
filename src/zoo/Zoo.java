/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import java.util.ArrayList;

/**
 *
 * @author jword
 */
public class Zoo {

    private static Pig porky;
    private static Cow bessy;
    private static Dog  spot;
    private static Zookeeper zack;
    private static ArrayList<Animal> animals;
    private static ArrayList<Coconut> coconuts;
    private static final int animalTypes = 5;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        porky = new Pig();
        //porky.speak();
        //System.out.println(porky.getWeight());
        bessy = new Cow();
        //bessy.speak();
        spot = new Dog();
        //spot.speak();
        zack = new Zookeeper();
        coconuts = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            coconuts.add( new Coconut() );
        }
        
        animals = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            /*Polymorphism
            Even though the ArrayList is of type Animal
            pigs, cows and dogs can be added to it.
            */
            if (i % animalTypes == 0)
                animals.add( new Pig() );
            if (i % animalTypes == 1)
                animals.add( new Cow() );
            if (i % animalTypes == 2)
                animals.add( new Dog() );
            if (i % animalTypes == 3) 
                animals.add( new Cat() );
            if (i % animalTypes == 4) 
                animals.add( new Sheep() );
        }
        
        for (Animal a : animals) {
            /*More polymorphism
            It is first considered an animal, but then
            considered a pig (etc.) when the compiler
            figures out Animal.speak() is abstract and
            cannot be run.
            */
            a.speak();
            if (a.isIsEdible()) 
                zack.eat( (Edible) a);
        }
        
        for (Coconut coconut : coconuts) {
            zack.eat(coconut);
        }
       
    }
    
}
