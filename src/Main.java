import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {


        System.out.println(" Задание 1");

        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }

        System.out.println(" Задание 2");

        for (int a = 10; a >= 1; a--) {
            System.out.println(a);
        }

        System.out.println(" Задание 3");

        for (int b = 0; b < 17; b += 2) {
            System.out.println("Четные числа " + b);
        }
        System.out.println(" Задание 4");

        for (int c = 10; c >= -10; c--) {
            System.out.println("Число " + c);
        }

        System.out.println(" Задание 4");

        for (int d = 1904; d <= 2096; d += 4) {
            System.out.println("Високосный год " + d);
        }

        System.out.println(" Задание 5");

        for (int d = 1904; d <= 2096; d += 4) {
            System.out.println("Високосный год " + d);
        }

        System.out.println(" Задание 6");

        for (int f = 7; f <= 98; f += 7) {
            System.out.println("Числа " + f);
        }

        System.out.println(" Задание 7");

        for (int g = 1; g <= 512; g *= 2) {
            System.out.println("Числа " + g);
        }

        System.out.println(" Задание 8");

        int sum = 29000;
        int total=0 ;
        for (int p = 0; p <= 12; p++) {
            total = total + sum;

            System.out.println("Месяц " + p + " сумма накоплений равна " + total+ " рублей. ");
        }

        System.out.println(" Задание 9");

        int sum1 = 29000;
        int total1=0 ;
        for (int r = 0; r <= 12; r++)
        {
            total1 = total1 + total1/100;
            total1= total1 + sum1;

            System.out.println("Месяц " + r + " сумма накоплений равна " + total1+ " рублей. ");
        }

        System.out.println(" Задание 10");


int two=2;
        for (int w = 1; w <= 10; w++) {

            System.out.println( two +" * " + w+"= "+ two*w);


        }


    }
}





