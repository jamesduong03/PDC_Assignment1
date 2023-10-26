/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pdc2;

/**
 *
 * @author jamesduong
 */
public class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        this.stats.increaseHunger(2);
    }

    @Override
    public void play() {
        this.stats.decreaseEnergy(2);
        this.stats.decreaseHunger(2);
        this.stats.decreasehydration(2);
        this.stats.increaseHappiness(4);
    }

    @Override
    public void sleep() {
        this.stats.increaseEnergy(6);
    }

    @Override
    public void drink() {
        this.stats.increasehydration(2);
    }
}
