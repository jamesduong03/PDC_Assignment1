/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pdc2;

/**
 *
 * @author jamesduong
 */
public class Needs {
    private int hunger;
    private int happiness;
    private int energy;
    private static final int MAX_LEVEL = 10;

    public Needs() {
        this.hunger = MAX_LEVEL;
        this.happiness = MAX_LEVEL;
        this.energy = MAX_LEVEL;
    }

    public void increaseHunger() {
        this.hunger = Math.min(this.hunger + 1, MAX_LEVEL);
    }

    public void decreaseHunger() {
        this.hunger = Math.max(this.hunger - 1, 0);
    }

    public void increaseHappiness() {
        this.happiness = Math.min(this.happiness + 1, MAX_LEVEL);
    }

    public void decreaseHappiness() {
        this.happiness = Math.max(this.happiness - 1, 0);
    }

    public void increaseEnergy() {
        this.energy = Math.min(this.energy + 1, MAX_LEVEL);
    }

    public void decreaseEnergy() {
        this.energy = Math.max(this.energy - 1, 0);
    }

    public int getHunger() {
        return hunger;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getEnergy() {
        return energy;
    }
}
