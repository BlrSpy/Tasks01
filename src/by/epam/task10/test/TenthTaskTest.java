package by.epam.task10.test;

import by.epam.task10.TenthTask;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TenthTaskTest {

    @Test
    void getFunctionTable() {
        ArrayList<Double> expected = new ArrayList<>();
        ArrayList<Double> actual;
        List<Double> actualShort;

        expected.add(0.00);
        expected.add(0.00);
        expected.add(0.20);
        expected.add(0.2027100355086725);

        actual = TenthTask.getFunctionTable(0,3, 0.2);
        actualShort = actual.subList(0, 4);

        Assertions.assertEquals(expected, actualShort);
    }
}