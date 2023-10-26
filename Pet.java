/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pdc2;

/**
 *
 * @author jamesduong
 */
public abstract class Pet {

    private String name;
    Actions stats;
    public abstract void eat();
    public abstract void play();
    public abstract void sleep();
    public abstract void drink();

    public Pet(String name) {
        this.name = name;
        stats = new Actions();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
