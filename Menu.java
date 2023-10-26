/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pdc2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jamesduong
 */
public class Menu {
    
    public void startMenu() {
        System.out.println("PET GAME!\n"
                + "Please choose an option:\n"
                + "1. New Game\n"
                + "2. Save Game\n"
                + "3. Quit");
    }
    
    public int petActions() {
        Scanner input = new Scanner(System.in);
        int input2 = 0;
        
        System.out.println("Please choose an activity:\n"
                + "1. Eat\n"
                + "2. Drink\n"
                + "3. Play\n"
                + "4. Sleep\n"
                + "5. Quit(Save Game)");
        
        try{
            input2 = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Not an option. Try again.");
            input.next();
            input2 = input.nextInt();
        }
        return input2;
    }
    
    public void displayStats(Pet pet) {
        System.out.println("Hunger: " + pet.stats.getHunger() +
                "   Hydration: " + pet.stats.getHydration() +
                "   Happiness: " + pet.stats.getHappiness() +
                "   Energy: " + pet.stats.getEnergy());
    }
}
