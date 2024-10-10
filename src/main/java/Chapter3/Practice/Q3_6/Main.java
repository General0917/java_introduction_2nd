package Chapter3.List3_9.Practice.Q3_6;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("【数あてゲーム】");

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int ans = rand.nextInt(10);

        for (int i = 1; i <= 5; i++) {
            System.out.println("0~9の数字を入力してください");
            int num = scanner.nextInt();

            if (num == ans) {
                System.out.println("アタリ！");
                break;
            } else {
                System.out.println("違います。");
            }
        }
        System.out.println("ゲームを終了します");
    }
}
