package by.epam.task1;

public class FirstTask {

    public static byte getSquareLastNumeral (int number) {

        int numeral = number;

        numeral %= 10;

        if (numeral > 3) {
            return (byte) (numeral*numeral % 10);
        } else {
            return (byte) (numeral*numeral);
        }
    }

}
