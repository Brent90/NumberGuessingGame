/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberguessinggame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author slinger
 */
public class NumberGuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        //get a random integer from drawNumber() method
        int numberDrawn = drawNumber();
        //set guesses made to start at 0
        int counter = 0;

        while (true) {
            System.out.print("Guess a number: ");

            try {
                int number = Integer.parseInt(reader.nextLine());

                if (number < numberDrawn) {
                    counter++;
                    System.out.println("The number is greater, guesses made " + counter + ".");
                } else if (number > numberDrawn) {
                    counter++;
                    System.out.println("The number is lesser, guesses made " + counter + ".");
                } else {
                    System.out.println("Your guess is correct!");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Not an integer.");
            }

        }

    }

    private static int drawNumber() {
        //random number between 0 and 100
        return new Random().nextInt(101);
    }
}


