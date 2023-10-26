/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pdc2;

/**
 *
 * @author jamesduong
 */
public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        this.stats.increaseHunger(3);
    }

    @Override
    public void play() {
        this.stats.decreaseEnergy(3);
        this.stats.decreaseHunger(3);
        this.stats.decreasehydration(3);
        this.stats.increaseHappiness(5);
    }

    @Override
    public void sleep() {
        this.stats.increaseEnergy(8);
    }

    @Override
    public void drink() {
        this.stats.increasehydration(4);
    }
}
