package classroom;

public class FirstClassroom {
    public static void main(String[] args) {
        System.out.println("Hello World! My name is: Jelena");
        System.out.println("First argument is: " + args[0]);
        System.out.println("Second argument is " + args[1]);

        // String args = {"Hello, World"};
        String[] twoWords = {"Hello, World"};

        //Primitive data type(numbers)
        byte floorCount = 7;
        byte[]floors = {1,2,3,4,5,6,7};
        //Concatenation
        System.out.println("My house consists of " + floorCount + " floors!");

        System.out.printf("My house consists of %d floors!\n", floorCount);
        // %s = for String (text)
        // %d = for Numbers

        short juniorTesterSalaryInEur = 1000;
        short salaryInIt [] = {1000,2000,3000};
        short emptySalaryArray [] = new short[4];
        emptySalaryArray[0]=1000;
        emptySalaryArray[1]=2000;
        emptySalaryArray[2]=3000;
        emptySalaryArray[3]=4000;
        System.out.println(emptySalaryArray[2]);

        System.out.println(juniorTesterSalaryInEur);
        System.out.printf("Average salary for Junior QA Engineer is: %d\n", juniorTesterSalaryInEur);

        int chinaPopulation = 1449687399;
        System.out.printf("China population %d people", chinaPopulation);

        long currentWorldPopulation = 794609700;
        System.out.printf("Current World population %d", currentWorldPopulation);

        //Floating numbers
        float myCurrentWeight = 60.5f;
        System.out.println(myCurrentWeight);

        double gasPriceInEur = 1.84367d;
        System.out.println(gasPriceInEur);

        /*
        Logical boolean
        prefix: is,has
        example: isSummer, isWinter, hasItems,hasApples;
        Values true/false (default:false)
         */

        boolean isSummer = false;
        if (isSummer) {
            System.out.println("Now it is summer");
        } else {
            System.out.println("No, summer will be next");
        }

        boolean isWinter = true;
        if (isWinter) {
            System.out.printf("Now it is winter! And boolean value is: %b\n",isWinter);
        } else {
            System.out.printf("No, winter will be the next! And boolean value is: %b\n",isWinter);
        }
        //Primitive:Text
        char firstNameLetter = 'N';
        System.out.println(firstNameLetter);

        //Non-Prinitive String
        String myNameAndSurname = "Jelena Dinere";
        System.out.println(myNameAndSurname);

        //Arithmetic Operators
        System.out.println("7"+ 7);

        int a = 10;
        int b =5;
        System.out.println(a+b);

        int c = a+b;

        System.out.println(c);

        boolean isAGreaterThanB =a>b;//true
        System.out.printf("Is a greater that b: %b",isAGreaterThanB);
    }

}