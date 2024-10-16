package Chapter4.List4_14;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };

        a = null;
        a[0] = 10;

        System.out.println("配列a:" + Arrays.toString(a));
    }
}
