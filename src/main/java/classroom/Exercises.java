package classroom;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

//        int number;
//        number = scanner.nextInt();
//        if (number > 0) {
//            System.out.println("Jusu skaitlis ir " + number + "ir lielaks par 0");
//        } else {
//            System.out.println("Jusu skaitlis ir " + number + "ir mazaks par 0");
//        }
        // Uzraksti programmu kura pienem 3 ciparus un izvadis videjo sverto;
//        System.out.println("Ievadi 1.skaitli ");
//        int number1 = scanner.nextInt();
//        System.out.println("Ievadi 2.skaitli ");
//        int number2 = scanner.nextInt();
//        System.out.println("Ievadi 3.skaitli ");
//        int number3 = scanner.nextInt();
//
//        if(number1<number2 && number1<number3){
//            System.out.println("Vismazakais skaitlis ir :"+number1);
//        } else if (number2<number3) {
//            System.out.println("Vismazakais skaitlis ir :"+number2);
//        }else {
//            System.out.println("Vismazakais skaitlis ir :"+number3);
//        }
//
//        System.out.println(Math.min(Math.min(number1,number2),number3));

        //Uzrakstit programmu kura atgriez vai skaitlis ir nepara vai para
//        int num = 5 % 2;
//        boolean isEvenNumber = 5 % 2 == 0;//false
//        System.out.println(isEvenNumber);
//
//        System.out.println("Please enter number");
//        int num1 = scanner.nextInt();
//        if (num1 % 2 == 0){
//            System.out.println("Tas ir para skaitlis" + num1);
//        }else {
//            System.out.println("Tas ir nepara skaitlis" + num1);
//        }

        System.out.println("Enter number between 1-7");
        int number = scanner.nextInt();
        switch (number) {
            case 1, 2, 3, 4, 5:
                System.out.println("It is working day");
                break;
            default:
                System.out.println("It is holiday today");
        }

        //Parbaudiet menesi
//        System.out.println("Please enter the month");
//        String month = scanner.nextLine().toLowerCase();
//        switch (month) {
//            case "january":
//                System.out.printf("January is the %d month", 1);
//                break;
//            case "february":
//                System.out.printf("February is the %d month", 2);
//                break;
//            default:
//                System.out.printf("Can not recognize the provided month" + month);
//        }
        //switch case:

        System.out.println("Ievadiet ciparu");
        int num1 = scanner.nextInt();
        System.out.println("Ievadiet operatoru");
        String operator = scanner.next();
        System.out.println("Ievadiet ciparu");
        int num2 = scanner.nextInt();
        switch (operator) {
            case "+":
                System.out.println("Summa:" + (num1 + num2));
                break;
            case "-":
                System.out.println("Atnemt:" + (num1 - num2));
                break;
            case "*":
                System.out.println("Reizinat:" + (num1 * num2));
                break;
            case "/":
                System.out.println("Dalisana:" + (num1 / num2));
                break;
            default:
                System.out.println("Incorrect");
        }
    }
}
