package classroom;

import java.util.*;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] dayOfTheWeek = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(dayOfTheWeek.length);
        System.out.println(dayOfTheWeek[0]);
        System.out.println(dayOfTheWeek[dayOfTheWeek.length - 1]);

        String[] nameOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("Today is :" + nameOfTheWeek[1]);

        String[] fruits = new String[6];
        fruits[0] = "apple";
        fruits[1] = "kiwi";
        fruits[2] = "banana";
        fruits[3] = "strawberry";
        fruits[4] = "cherry";
        fruits[5] = "pineapple";

        System.out.println(fruits[3]);

        fruits[2] = "grape";

        char[] myNameCharacters = {'J', 'E', 'L'};
        System.out.println(myNameCharacters[2]);

        Random random = new Random();
        int[] randomNumbers = {random.nextInt(100), random.nextInt(100), random.nextInt(100)};
        System.out.println(Arrays.toString(randomNumbers));
        //StringBuilder[x,x,x]

        // Collections (List, Map, Queue)

        List<String> listOfFruits = new ArrayList<>();
        listOfFruits.add("apple");
        listOfFruits.add("kiwi");
        listOfFruits.add("grape");
        System.out.println(listOfFruits.get(0));
        listOfFruits.remove(1);
        System.out.println(listOfFruits.get(1));


    }

    ;
}

