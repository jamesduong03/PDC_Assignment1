/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pdc2;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author jamesduong
 */
public class PetApp {
    
    static int menuInput;
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        GameManager newGame = new GameManager();
        int welcomeInput = 0;

        try {
            welcomeInput = newGame.startMenu(input);
        } catch (InputMismatchException e) {
            System.out.println("Not an option! Please try again");
            input.next();
            welcomeInput = newGame.startMenu(input);

        }

        if (welcomeInput == 1 || welcomeInput == 2) {
            do {
                menuInput = newGame.menuInput();

            } while (menuInput != 8);
        }
    }
}
