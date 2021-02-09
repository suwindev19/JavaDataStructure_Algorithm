package randomNumberGenerator;
import java.util.Random;
import java.util.*;
public class RandomNumGenerator {
    public static void main(String[] args) {
        // Random number generator
        Random rand = new Random();
        int randomNum = rand.nextInt((20 - 0) -1) + 0;
        int guess = 0;
        int numberOfGuesses;

        System.out.println("===============This is a guess game.================\n");
        System.out.println("You need to choose between 0 and 20 inclusive and you must guess the number.\n");
        for(numberOfGuesses = 5; numberOfGuesses >0; numberOfGuesses--){
            System.out.print("You have " + numberOfGuesses + " try left.\n");

            System.out.println("Please enter a guess number : ");
            Scanner sc = new Scanner(System.in);
            guess = sc.nextInt();

            if(guess == randomNum){
                System.out.println("You have guessed it right! It is \n" + randomNum);
                return;
            }else if(guess < 0 || guess >20){
                System.out.println("Your guess is not a valid number. Enter between 0 to 20 inclusive: ");
            }else if(randomNum > guess){
                System.out.println("Sorry, " + guess + " is wrong. My number is greater than that.");
            }else if(randomNum < guess){
                System.out.println("Sorry, " + guess + " is wrong. My number is less than that.");
            }
        }
        System.out.println("Sorry. You have reached the maximum number of guesses. The number was " + randomNum);

    }
}
