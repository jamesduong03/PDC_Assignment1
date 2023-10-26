/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pdc2;

/**
 *
 * @author jamesduong
 */
public class Actions {

    private int happiness;
    private int hunger;
    private int energy;
    private int hydration;
    
    public Actions() {
        this.setHappiness(8);
        this.setHunger(8);
        this.setEnergy(6);
        this.setHydration(6);
    }
    
    public int getHappiness() {
        return happiness;
    }

    public int getHunger() {
        return hunger;
    }

    public int getEnergy() {
        return energy;
    }

    public int getHydration() {
        return hydration;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void setHydration(int hydration) {
        this.hydration = hydration;
    }
    
    public void increaseHappiness(int x) {
        this.setHappiness(happiness + x);
    }

    public void increaseHunger(int x) {
        this.setHunger(hunger + x);
    }

    public void increaseEnergy(int x) {
        this.setEnergy(energy + x);
    }

    public void increasehydration(int x) {
        this.setHydration(hydration + x);
    }
    
    public void decreaseHappiness(int x) {
        this.setHappiness(happiness - x);
    }

    public void decreaseHunger(int x) {
        this.setHunger(hunger - x);
    }

    public void decreaseEnergy(int x) {
        this.setEnergy(energy - x);
    }

    public void decreasehydration(int x) {
        this.setHydration(hydration - x);
    }
}
