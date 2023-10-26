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
public class GameManager {
    
    private Menu menu = new Menu();
    private Pet pet;
    private String petName;
    
    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }
    
    public int startMenu(Scanner input) {
        menu.startMenu();
        int userInput = input.nextInt();
        
        switch(userInput) {
            case 1:
                System.out.println("Please choose a pet:\n"
                        + "1. Dog\n"
                        + "2. Cat");
                this.newPet(input);
                break;
                
            case 2:
                System.exit(0);
                break;
                
            case 3:
                System.exit(0);
                break;
                
            default:
                System.out.println("Not an option. Try again.");
                startMenu(input);
        }
        return userInput;
    }
    
    public int menuInput() {
        int input = menu.petActions();
        
        switch(input) {
            case 1:
                pet.eat();
                System.out.println(pet.getName() + "'s current stats:");
                menu.displayStats(pet);
                break;
            
            case 2:
                pet.drink();
                System.out.println(pet.getName() + "'s current stats:");
                menu.displayStats(pet);
                break;
                
            case 3:
                pet.play();
                System.out.println(pet.getName() + "'s current stats:");
                menu.displayStats(pet);
                break;
            
            case 4:
                pet.sleep();
                System.out.println(pet.getName() + "'s current stats:");
                menu.displayStats(pet);
                break;
                
            case 5:
                System.out.println("Thank you for playing!");
                System.exit(0);
                break;
                
        }
        return input;
    }
    
    public void newPet(Scanner input) {
        Scanner input2 = new Scanner(System.in);
        int newPet = input.nextInt();
        System.out.println("Pet name: ");
        this.setPetName(input2.nextLine());
        
        switch(newPet) {
            case 1:
                pet = new Dog(petName);
                break;
            case 2:
                pet = new Cat(petName);
        }
        System.out.println(pet.getName() + " has been adopted!\n");
    }
}
