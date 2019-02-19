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
public abstract class Animal {
    //Fields
    private float width;
    private float height;
    private Color color;
    private float weight;
    private int age;
    private final boolean isEdible;
    
    //Constructor
    public Animal(float width, float height, Color color, float weight, int age) {
       this.width = width;
       this.height = height;
       this.color = color;
       this.weight = weight;
       this.age = age;
       this.isEdible = false;
    }
    
    public Animal(float weight, int age) {
        this((float) 3.0, (float) 2.0, Color.PINK, weight, age);
    }

    //no-args
    public Animal() {
        this((float) 3.0, (float) 2.0, Color.PINK, (float) 600.0, 12);
    }    
    
    //Methods
    public void move() {
        
    }
    
    public void eat() {
        
    }
    
    //No implementation
    public abstract void speak();
    
    public void grow() {
        
    }
    
    public void die() {
        
    }
    
    //Getters and Setters

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
