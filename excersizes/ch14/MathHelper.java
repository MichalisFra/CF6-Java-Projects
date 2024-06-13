package gr.aueb.cf.OOPProjects.excersizes.ch14;

public class MathHelper {

    private MathHelper() {

    }

    public static  void maxArr(int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(i, max);
        }
    }

    public static void minArr(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            min = Math.min(i, min);
        }
    }

    public static void avgArr(int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int sum = 0;
        int avg = 0;
        for (int i : arr) {
            sum+= i;

        }
        avg = sum/arr.length;

    }


}
