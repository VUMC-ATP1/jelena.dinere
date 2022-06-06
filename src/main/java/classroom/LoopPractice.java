package classroom;

import java.util.Arrays;
import java.util.List;

public class LoopPractice {
    public static void main(String[] args) {
        //do
        //print 0-4
        System.out.println("Start");
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("End");

        i = 10;
        while (i > 0) {
            System.out.println(i);
            i--;
        }
// Print numbers
        int[] arr = {2, 4, 6, 10, 15};
        int num = 0;
        while (num < arr.length) {
            System.out.println(arr[num]);
            num++;
        }

        // Print out even numbers from 0 lidz 10;
        num = 0;
        while (num <= 10) {
            if (num % 2 == 0) {
                System.out.printf(num + ",\n");
            }
            num++;
        }

        num = 0;
        do {
            System.out.printf(num + ",");
            num++;
        } while (num < 10);
        System.out.println();

        //Print odd number
        num = 0;
        do {
            if (num % 2 != 0) {
                System.out.println("This is odd number: " + num + ",");
            }
            num++;
        } while (num < 10);

        String[] countries = new String[]{"LV", "USA", "UK", "CZ", "PL", "RO", "ES", "LV", "PL"};
        // Print all countries
        // if country = lv print latvia
        // if country = cz print czech
        //do while
        num = 0;
        do {
            if (countries[num].equals("LV")) {
                System.out.println("Latvia");
            } else if (countries[num].equals("CZ")) {
                System.out.println("Czech");
            } else {
                System.out.println(countries[num]);
            }
            num++;
        } while (num < countries.length);

        for (int j = 0; j < countries.length; j++) {
            if (j == countries.length - 1) {
                System.out.print(countries[j]);
            } else {
                System.out.print(countries[j] + ",");
            }
            System.out.println();
        }
        //Print from 0 to 100;
        for (int j = 0; j <= 100; j++) {
            if (j > 50) {
                System.out.println(j + ",");
            }
        }
        System.out.println();

        // Create int [] with from 0 to 100;
        //Print only even number;
        int[] numbers = new int[100];
        for (int j = 0; j < numbers.length; j++) {
            numbers[j] = j;
        }
        for (int k = 0; k <= numbers.length; k++) {
            if (k % 2 == 0) {
                System.out.println("Even number:" + k);
            }
        }
        for (String country : countries) {
            if (country.equals("LV")) {
                System.out.println("Latvia");
            } else {
                System.out.println(country);
            }
        }
// majas ar numuriem 1 lidz 50
        //numuri kuri nedalas ar 3 un 5 neder

        int houseCount = 0;
        for (int k = 1; k <= 50; k++) {
            if (k % 3 == 0 || k % 5 == 0) {
                System.out.println("Numuri neder:" + k);
            } else {
                System.out.println("Numuri der: " + k);
                houseCount++;
            }
        }
        System.out.println("Numuru skaits atbilst prasibam :" + houseCount);
// skaita i burtus;
        String sentence = "Hello, my name is Nikita";
        int count = 0;
        for (int c = 0; c < sentence.length(); c++) {
            if (sentence.charAt(c) == 'i') {
                count = count + 1;
            }
        }
        System.out.println("i skaits" + count);
//"LV", "USA", "UK", "CZ", "PL", "RO", "ES","LV", "PL"
        for (String country : countries) {
            if (country.equals("RO")) {
                System.out.println("I found RO!!! Will stop this loop");
                break;
            }
        }

        //For loop 1-10;
        //if value of i is between 4 un 9 continue
        for (int j = 1; j <= 10; j++) {
            if (j > 4 && j < 9) {
                continue;
            }
            System.out.println(j + ",");
        }
    }
}
