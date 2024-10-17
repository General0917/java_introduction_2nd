package Chapter4.Practice.Q_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 3, 4, 9 };

        System.out.println("1桁の数字を入力してください");

        int input = new Scanner(System.in).nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == input) {
                System.out.println("アタリ!");
            }
        }

        // 以下の書き方でも同じ動作をする
        /*
        for (int number : numbers) {
            if (number == input) {
                System.out.println("アタリ!");
                break;
            }
        }
        */
    }
}
