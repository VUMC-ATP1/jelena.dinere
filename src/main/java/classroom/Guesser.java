package classroom;

import java.util.Random;
import java.util.Scanner;

public class Guesser {
    public static void main(String[] args) {
        // Program generate number from 1 to 10
        //User enter no 1 to 10
        //if value is not in range , write error and start again;
        //if value is not same as generated, stop the programm;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println(randomNumber);
        boolean isAnswerValid = false;
        int answer = scanner.nextInt();
        System.out.println("Please enter number :");
        do {

            if (answer < 1 && answer > 10) {
                System.out.println("Number is not correct, try again!");
            }
        } while (isAnswerValid);
        {
            if (answer != randomNumber) {
                System.out.println("Wrong");

            } else if (answer == randomNumber) {
                System.out.println("Correct and you win");
            }

        }
    }
}
