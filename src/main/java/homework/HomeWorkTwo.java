package homework;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        //1.uzdevums
        //a.
//        int x = 10;
//        System.out.println(x>=10);//true
        //b.
//        int x = -3;
//        System.out.println(x>-2);//false
        //c.
//        int x =10;
//        boolean result = x>5 && x<=10;
//        System.out.println(result);
//
        //d.
//        int x = 6;
//        boolean result = x>5 && x<10;// te var savadakt ar izsaukuma zimi,bet kur to likt x!<= 5 && x<10?
//        System.out.println(result);//true
//
        //e.
//        int x = 5;
//        boolean result = x==0 || x==10;
//        System.out.println(result);
//
        //f.
//       int x =10;
//       int y = x*x;
//       boolean result=y>10;
//        System.out.println(result);

        //2.uzdevums
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a month number");
//        int monthNumber = scanner.nextInt();
//        switch (monthNumber) {
//            case 1:
//                System.out.printf("January");
//                break;
//            case 2:
//                System.out.printf("February");
//                break;
//            case 3:
//                System.out.printf("March");
//                break;
//            case 4:
//                System.out.printf("April");
//                break;
//            case 5:
//                System.out.printf("May");
//                break;
//            case 6:
//                System.out.printf("June");
//                break;
//            case 7:
//                System.out.printf("July");
//                break;
//            case 8:
//                System.out.printf("August");
//                break;
//            case 9:
//                System.out.printf("September");
//                break;
//            case 10:
//                System.out.printf("October");
//                break;
//            case 11:
//                System.out.printf("November");
//                break;
//            case 12:
//                System.out.printf("December");
//                break;
//            default:
//                System.out.printf("Can not recognize the provided month");

        //3.uzdevums

//        System.out.println("Ievadi 1.skaitli ");
//        int number1 = scanner.nextInt();
//        System.out.println("Ievadi 2.skaitli ");
//        int number2 = scanner.nextInt();
//        System.out.println("Ievadi 3.skaitli ");
//        int number3 = scanner.nextInt();
//        System.out.println(Math.max(Math.max(number1,number2),number3));

        // 4.uzdevums
//Viss strada!!!
        System.out.println("Write the colour of the traffic light");
        String colour = scanner.nextLine().toLowerCase();
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
    }
}
