package Chapter4.Practice.Q4_3;

public class Main {
    public static void main(String[] args) {
        int[] counts = null;
        float[] heights = { 171.3F, 175.0F };

        // NullPointerException例外が発生
        System.out.println(counts[1]);

        // ArrayIndexOutOfBoundsException例外が発生
        System.out.println(heights[2]);
    }
}
