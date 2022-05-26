package classroom;

public class Conditions {
    public static void main(String[] args) {
        System.out.println("Before condition");
        if (20 < 18) {
            System.out.println("Yes,20>10");
        }
        System.out.println("After condition check");

        int age = 18;

        if (age >= 18) {
            System.out.println("You can go vote");
        } else {
            System.out.println("You can not go vote");
        }
        System.out.println("Thank you");

        int currentTime = 10;
        if (currentTime <= 19) {
            System.out.println("Good day!");
        } else {
            System.out.println("Good evening!");
        }


        int a = 10;
        int b = 20;
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        System.out.println(max);

        max = (a > b ? a : b);
        System.out.println(max);

        System.out.println(Math.max(a, b));

        int number = 5;
        if (number <= 0) {
            System.out.println("Number is less or equal to zero");
        } else if (number > 3) {
            System.out.println("Number is greater than three");
        } else if (number >= 5) {
            System.out.println("Number is greater than five");
        } else {
            System.out.println("....");
        }

        int day = 7;
        switch (day) {
            case 1:
                System.out.println("Pirmdiena");
                break;
            case 2:
                System.out.println("Otrdiena");
                break;
            case 3:
                System.out.println("Tresdiena");
                break;
            case 4:
                System.out.println("Ceturdiena");
                break;
            case 5:
                System.out.println("Piektdiena");
                break;
            default:
                System.out.println("Nepareiza diena");
        }
    }


}
