package homework.classHomeWork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /*
        Izveidojiet trijstūri ar no-arg konstruktoru.
        Piešķiriet šim objektam malu vērtības un izsauciet visas metodes no šī objekta un izvadiet rezultātu uz ekrāna.
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("----Task 1-----\n");
        Triangle triangle = new Triangle();
        System.out.print("Enter length of the first side: \n");
        triangle.firstSide = scan.nextInt();
        System.out.print("Enter length of the second side: \n");
        triangle.secondSide = scan.nextInt();
        System.out.print("Enter length of the third side: \n");
        triangle.thirdSide = scan.nextInt();

        System.out.println("The triangle area is " + triangle.calculateArea() + " cm2");
        if (triangle.isEqual()) {
            System.out.println("This triangle is equal");
        } else if (triangle.isTwoSideEqual()) {
            System.out.println("This triangle is only two side equal");
        } else {
            System.out.println("This triangle is not equal or two side equal");
        }
/*
2.	Izveidojiet jaunu trijstūri ar konstruktoru, kur visas malas tiek padotas jau konstruktorā.
    Izsauciet visas metodes no šī objekta un izvadiet rezultātus uz ekrāna.
 */
        Triangle triangle1 = new Triangle(2, 5, 6);
        System.out.println("This triangle area is equal to " + triangle1.calculateArea() + "cm2");
        if (triangle1.isEqual()) {
            System.out.println("This triangle is equal");
        } else if (triangle1.isTwoSideEqual()) {
            System.out.println("This triangle is only two side equal");
        } else {
            System.out.println("This triangle is not equal or two side equal");
        }
    }
}
