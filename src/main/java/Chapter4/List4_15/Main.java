package Chapter4.List4_15;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] scores = new int[2][3];

        scores[0][0] = 40;
        scores[0][1] = 50;
        scores[0][2] = 60;
        scores[1][0] = 80;
        scores[1][1] = 60;
        scores[1][2] = 70;

        System.out.println(scores[1][1]);

        System.out.println("配列scores[0]:" + Arrays.toString(scores[0]));
        System.out.println("配列scores[1]:" + Arrays.toString(scores[1]));
    }
}
