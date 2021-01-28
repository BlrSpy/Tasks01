package by.epam.task10;

import java.util.ArrayList;

import static java.lang.StrictMath.tan;

public class TenthTask {
    public static ArrayList<Double> getFunctionTable(double min, double max, double step) {

        ArrayList<Double> arrayList = new ArrayList<>();

        for (double argument = min; argument < max + step; argument += step) {

            arrayList.add(argument);
            arrayList.add(tan(argument));

        }
        return arrayList;
    }
}
