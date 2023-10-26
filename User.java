/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pdc2;

import java.util.Scanner;

/**
 *
 * @author jamesduong
 */
import java.util.Scanner;

public class User {

    private String name;
    private Pet pet;
    
    Scanner scanner = new Scanner(System.in);

    public User() {
        System.out.println("Enter your name:");
        this.name = scanner.nextLine();
        this.pet = choosePet();
    }

    private Pet choosePet() {
        System.out.println("Choose a pet: dog or cat");
        String pet = scanner.nextLine();
        if (pet.equals("dog")) {
            return new Dog(name);
        } else if (pet.equals("cat")) {
            return new Cat(name);
        } else {
            System.out.println("Invalid pet type. Please choose dog or cat.");
            return choosePet();
        }
    }

    public String getName() {
        return name;
    }

    public Pet getPet() {
        return pet;
    }
}
