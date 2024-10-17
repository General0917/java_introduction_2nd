package Chapter4.List4_12;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        int[] b;

        b = a;
        b[0] = 100;

        System.out.println(a[0]);

        System.out.println("配列a:" + Arrays.toString(a));
        System.out.println("配列b:" + Arrays.toString(b));
    }
}
