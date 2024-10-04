package Chapter3.List3_9.Practice.Q3_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("[メニュー] 1:検索 2:登録 3:削除 4:変更>");

        Scanner scanner = new Scanner(System.in);
        int selected = scanner.nextInt();

        switch (selected) {
            case 1:
                System.out.println("検索します");
                break;
            case 2:
                System.out.println("登録します");
                break;
            case 3:
                System.out.println("削除します");
                break;
            case 4:
                System.out.println("変更します");
                break;
        }

        if (selected == 0 || selected >= 5) {
            System.out.println("範囲外の数値が入力されました。");
        }
    }
}
