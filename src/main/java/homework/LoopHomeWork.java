package homework;

import java.util.Random;
import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {
        //1.uzdevums
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int number;
        int sum = 0;
        while (sum < 100) {
            System.out.println("Ierakstiet,lúdzu veselu skaitli: ");
            number = scanner.nextInt();
            sum = sum + number;
        }
        System.out.println("Gatavs");

        //2.uzdevums
        int userNumber;
        System.out.println("Ierakstiet veselu skaitli");
        userNumber = scanner.nextInt();
        if (userNumber <= 1) {
            System.out.println("Tas nav pirmskaitlis :" + userNumber);
        } else if (!(userNumber % 2 == 0) && !(userNumber % 3 == 0) && userNumber % userNumber == 0 || userNumber == 2) {
            System.out.println("Tas ir pirmskaitlis :" + userNumber);
        } else {
            System.out.println("Tas nav pirmskaitlis :" + userNumber);
        }


        //3.uzdevums
        int[] numbers = {2, 3, 66, 55, 70, 88, 22};
        String[] names = {"Jelena", "Martins", "Nikita", "Armands", "Laura"};
        char[] letters = {'a', 'b', 'c', 'd', 'f'};
        //a. while;
        System.out.println("While method");
        int n = 0;
        while (n < numbers.length) {
            System.out.println(numbers[n]);
            n++;
        }
        n = 0;
        while (n < names.length) {
            System.out.println(names[n]);
            n++;
        }
        n = 0;
        while (n < letters.length) {
            System.out.println(letters[n]);
            n++;
        }
        //b. do while
        System.out.println("Do while method");
        n = 0;
        do {
            System.out.println(numbers[n]);
            n++;
        } while (n < numbers.length);
        System.out.println();
        n = 0;
        do {
            System.out.println(names[n]);
            n++;
        } while (n < names.length);
        System.out.println();
        n = 0;
        do {
            System.out.println(letters[n]);
            n++;
        } while (n < letters.length);
        //c. for loop
        System.out.println("For loop");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println();
        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }
        //d.for each
        System.out.println();
        for (int number2 : numbers) {
            System.out.println(number2);
        }
        System.out.println();
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
        for (char letter : letters) {
            System.out.println(letter);
        }
        System.out.println();
        //4.uzdevums
        int[] numbers3 = new int[100];
        for (int i = 0; i < numbers3.length; i++) {
            numbers3[i] = i * 2;
            System.out.printf("%d,%n", numbers3[i]);
        }
        //5.uzdevums
        System.out.println("Uzrakstiet veselu skaitli");
        int a = scanner.nextInt();
        System.out.println("Skaitla faktorials ir :" + factorial(a));

        // 6.uzdevums
        int guesses = 3;
        Random random = new Random();
        int pinCode = (int) (Math.random() * 5 + 200);

        System.out.println("Pincode : " + pinCode);
        boolean isGuessed = false;

        while (!isGuessed) {
            System.out.println("Ievadiet ludzu savu PIN kodu! Jums ir: " + guesses + " meginajumi");
            int answer = scanner.nextInt();
            if (answer == pinCode) {
                System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ");
                isGuessed = true;
            } else {
                guesses--;
                System.out.println("Nepareizs PIN, mēģiniet vēlreiz");
                if (guesses == 0) {
                    System.out.println("Atvainojiet, bet jūs esat bloķēts");
                    break;
                }
            }
        }
    }

    // 5. uzdevums (metode)
    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

