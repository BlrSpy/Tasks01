package by.epam.task8;

public class EighthTask {
    public static double getValueFunc(double x) {

        if (x >= 3) {
            return ( -x * x + 3 * x + 9 );
        } else {
            if (x * x * x - 6 != 0) {
                return (1 / ( x * x * x - 6 ));
            }
            else {
                System.out.println("Error: denominator is zero.");

                return -1;
            }
        }
    }
}

