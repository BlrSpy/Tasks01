package by.epam.task10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> arrayList;
        arrayList = TenthTask.getFunctionTable(0,3, 0.2);

        System.out.print("x         ");
        System.out.println("tan(x)");

        for (int i = 0; i < arrayList.size(); i++) {

            double argumentValue = arrayList.get(i);
            double tanValue = arrayList.get(++i);

            System.out.printf("%.2f", argumentValue);
            System.out.print("     ");
            System.out.printf("%.7f", tanValue);
            System.out.println();
        }
    }
}
