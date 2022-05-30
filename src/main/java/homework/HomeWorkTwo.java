package homework;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        //1.uzdevums
        //a.
        int x = 10;
        System.out.println(x >= 10);//true
        //b.
        x = -3;
        System.out.println(x > -2);//false
        //c.
        x = 10;
        boolean result = x > 5 && x <= 10;
        System.out.println(result);

        //d.
        x = 6;
        result = x > 5 && x < 10;// te var savadakt ar izsaukuma zimi,bet kur to likt x!<= 5 && x<10?
        System.out.println(result);//true

        //e.
        x = 5;
        result = x == 0 || x == 10;
        System.out.println(result);

        //f.
        x = 10;
        int y = x * x;
        result = y > 10;
        System.out.println(result);

        //2.uzdevums
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a month number");
        int monthNumber = scanner.nextInt();
        switch (monthNumber) {
            case 1:
                System.out.printf("January\n");
                break;
            case 2:
                System.out.printf("February\n");
                break;
            case 3:
                System.out.printf("March\n");
                break;
            case 4:
                System.out.printf("April\n");
                break;
            case 5:
                System.out.printf("May\n");
                break;
            case 6:
                System.out.printf("June\n");
                break;
            case 7:
                System.out.printf("July\n");
                break;
            case 8:
                System.out.printf("August\n");
                break;
            case 9:
                System.out.printf("September\n");
                break;
            case 10:
                System.out.printf("October\n");
                break;
            case 11:
                System.out.printf("November\n");
                break;
            case 12:
                System.out.printf("December\n");
                break;
            default:
                System.out.printf("Can not recognize the provided month\n");
        }
        //3.uzdevums

        System.out.println("Ievadi 1.skaitli ");
        int number1 = scanner.nextInt();
        System.out.println("Ievadi 2.skaitli ");
        int number2 = scanner.nextInt();
        System.out.println("Ievadi 3.skaitli ");
        int number3 = scanner.nextInt();
        System.out.println(Math.max(Math.max(number1, number2), number3));

        // 4.uzdevums
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Write the colour of the traffic light");
        String colour = scanner2.nextLine().toLowerCase();
        switch (colour) {
            case "red":
                System.out.println("Stop!!!");
                break;
            case "yellow":
                System.out.println("Attention!!!");
                break;
            case "green":
                System.out.println("You can go!!!");
                break;
            default:
                System.out.println("Something went wrong!!");
        }

        //5.uzdevums
        printBusinessCard();
        printBusinessCard();
        printBusinessCard();

        //6.uzdevums
        printBusinessCardTwo("Liga", "Kalnina", "+371 12312313", 1965);
        printBusinessCardTwo("Juris", "Vītols", "+371 5142431", 1930);

        //7.uzdevums
        int summa = sum(4, 10);
        System.out.println(summa);

        //8.uzdevums

        System.out.println(average(5.89, 6.77, 9.88));
    }

    //5.uzdevums
    public static void printBusinessCard() {
        System.out.println("Business card");
        System.out.println("###########");
        System.out.println("Name: Jelena");
        System.out.println("Surname: Dinere");
        System.out.println("Phone number: +371 29398564");
        System.out.println("Year of birth: 1985");
        System.out.println("############");
    }

    //6.uzdevums
    public static void printBusinessCardTwo(String name, String surname, String phoneNumber, int yearOfBirth) {
        System.out.println("Business card");
        System.out.println("###########");
        System.out.printf("Name: %s\n", name);
        System.out.printf("Surname: %s\n", surname);
        System.out.printf("Phone number: %s\n", phoneNumber);
        System.out.printf("Year of birth: %d\n", yearOfBirth);
        System.out.println("#############");
    }

    //7.uzdevums
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    //8.uzdevums

    public static double average(double num3, double num4, double num5) {
        return (num3 + num4 + num5) / 3;
    }

}
