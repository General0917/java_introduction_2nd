package Chapter3.Practice.Q3_3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int seibetsu = rand.nextInt(2);

        int age = 30;

        System.out.println("こんにちは");

        if (seibetsu == 0) {
            System.out.println("私は男です。");
            System.out.println(age + "歳です。");
        } else {
            System.out.println("私は女です。");
        }

        System.out.println("よろしくおねがいします。");
    }
}
