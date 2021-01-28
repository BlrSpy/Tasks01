package by.epam.task4;

public class FourthTask {
    public static boolean isTwoEvenNumbers(int a, int b, int c, int d) {

        int count = 0;
        int[] nums = new int[] { a, b, c, d };

        for (int i: nums) {
            if (i % 2 == 0) {
                count = count + 1;
            }
        }

        return count >= 2;
    }
}
