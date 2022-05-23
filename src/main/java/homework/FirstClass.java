package homework;

public class FirstClass {
    public static void main(String[] args) {
        /* Main metodē jānodefinē mainīgos ( ar atbilstosu data tipu)
        Valstij (brīva izvēle)
         */

        //Nosaukums
        String countryName = "Latvia";
        System.out.println(countryName);

        //Iedzīvotaju skaits
        int countryPopulation = 1850000;
        System.out.println(countryPopulation);

        //Platība
        int countryArea = 64589;
        System.out.println(countryArea);

        //Galvaspilsēta
        String countryCapital = "Riga";
        System.out.println(countryCapital);

        //Valoda
        String countryLanguage = "Latvian";

        // Vai ir ES dalibvalsts?
        boolean isCountryInEu = true;
        System.out.println(isCountryInEu);

        //Valuta
        char countryCurrency = 'E';
        System.out.println(countryCurrency);

        /* Jāuzraksta dažus teikumus uz brīvu tēmu
        izmantojot konkatenāciju un formātu.*/

        //1.teikums (ar konkatenāciju)
        System.out.println("My country is " + countryName + "\nThe capital is " + countryCapital);

        //1.teikums (ar formātu)
        System.out.printf("My country is %s \nThe capital is %s\n", countryName, countryCapital);

        //2.teikums (ar konkatenāciju)
        System.out.println("The population of " + countryName + " is " + countryPopulation + " people.");

        //2.teikums (ar formātu)
        System.out.printf("The population of %s is %d people.\n", countryName, countryPopulation);

        /* Jāuzraksta pa trīs piemēriem
        uz katru aritmētisko operatoru.
        */
        // multiplication

        //1.1 piemērs
        double exchangeRateEurUsd = 1.04d;

        // Cik būs 50 eur in usd?
        float price = 50.00f;
        System.out.println("Cik būs 50.00 EUR in USD? " + exchangeRateEurUsd * price + "USD");

        //1.2 piemērs
        int a = 4;
        int b = 6;
        int c = a * b;
        System.out.println(c);

        //1.3 piemērs
        int d = 2;
        int e = 9;
        System.out.printf("Number 2 multiplied by 9 is equal %d\n", d * e);

        // division

        //1.1 piemērs
        float f = 53.01f;
        int g = 9;
        float k = f / g;
        System.out.println(k);

        //1.2 piemērs
        int n = 25;
        int m = 5;
        System.out.printf("Number 25 divided by 5 is equal %d\n", n / m);

        //1.3 piemērs
        int euroForWeek = 500;
        int days = 7;

        // Cik daudz naudas var izterét diená lait pietiktu visai nedelai
        System.out.println("One day limit in euro :" + euroForWeek/days + " euro.");

        // plus

        //1.1 piemērs
        int x =1;
        System.out.println("10"+x);

        //1.2 piemērs
        int balance = 1200;
        int salary = 1000;
        String money = "Euro";

        //Káda summa bús péc gada.
        System.out.printf("Income in a year %d %s\n",salary*12+balance,money);

        //1.3 piemērs
        float priceMilk =2.20f;
        float priceBread =1.65f;
        float priceTotal= priceMilk+priceBread;
        System.out.println(priceTotal);

        //minus
        //1.1 piemērs
        int balanceInEurBeforePurchase = 880;
        float priceForKgApples = 1.20f;
        int kgApples = 4;
        float balanceInEur= (balanceInEurBeforePurchase-(priceForKgApples*kgApples));
        System.out.println(balanceInEur);

        //1.2 piemērs
        int j = 30;
        int z =10;
        int v = j-z;
        System.out.println(v);

        //1.3 piemērs
        System.out.println("Twenty minus 10 is equal "+ (20-10));
    }
}
