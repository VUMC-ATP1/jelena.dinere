package classroom;

public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println(a == b);//true

        //Not equal to !=
        System.out.println(a != b);//false

        //Less than
        int x = 30;
        int y = 50;
        System.out.println(x < y);//true

        //Greater than
        x = 100;
        y = 101;
        System.out.println(x > y);//false

        boolean isGreater = 20 > 10;
        System.out.println(isGreater);//true

        //Less than or equal to
        a = 100;
        b = 100;
        System.out.println(a <= b);//true

        //Greater or equal to
        a = 200;
        b = 100;
        System.out.println(a >= 100);//true

        String name = "Jelena";
        String name2 = "Jelena";
        System.out.println(name == name2);//true

        String name3 = "Jelena";
        String name4 = "jelena";
        System.out.println(name3.equals(name4));//false

        String name5 = new String("Jelena");
        String name6 = "Jelena";
        System.out.println(name5.equals(name6));
        System.out.println(name5 == name6);//=== object

        //Logical operators
        x = 10;
        boolean result = x < 5 && x < 10;// false
        System.out.println(result);

        result = 3 < 5 && 4 > 5;
        System.out.println(result);//false
        result = 3 < 5 || 4 > 5;
        System.out.println(result);//true

    }
}
