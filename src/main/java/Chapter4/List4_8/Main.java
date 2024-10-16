package Chapter4.List4_8;

public class Main {
    public static void main(String[] args) {
        int[] score = { 20, 30, 40, 50, 80 };

        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }

        int ave = sum / score.length;

        System.out.println("合計点:" + sum);
        System.out.println("平均点:" + ave);
    }
}
