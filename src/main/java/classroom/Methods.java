package classroom;

public class Methods {
    public static void main(String[] args) {
        //String myName = "";
        //int age = 22;
        //printMyNameAndAge(myName,Age)

        printMyNameAndAge("Jelena", 36);
        checkMyAge(33);

        System.out.println(sumOfNumbers(33, 44, 77));
        int summa = sumOfNumbers(33, 50, 70);//153
        System.out.println(summa);

        System.out.printf("Is adult? Answer:%b\n ", isAdult(20));

        System.out.println("The result is : " + calculator(4, 8, "+"));
    }

    public static void printMyNameAndAge(String name, int age) {
        System.out.printf("Your name is %s. And your age %d\n", name, age);
    }

    // Jaizveido metodi checkMyAge;
    public static void checkMyAge(int age) {
        if (age < 0) {
            System.out.println("Are you alive?");
        } else if (age >= 14 && age <= 16) {
            System.out.println("Pagaidi");
        } else if (age == 17) {
            System.out.println("Aug barda");
        } else if (age >= 18) {
            System.out.println("Skrien");
        }
    }

    public static int sumOfNumbers(int x, int y, int z) {
        return x + y + z;
    }

    public static boolean isAdult(int age) {
        return age >= 18;
    }

    // metodes kalkulatoram
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int minus(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int calculator(int num1, int num2, String operator) {
        switch (operator) {
            case "+":
                return add(num1, num2);
            case "-":
                return divide(num1, num2);
            case "*":
                return multiply(num1, num2);
            case "/":
                return divide(num1, num2);
            default:
                return 0;
        }
    }


}

