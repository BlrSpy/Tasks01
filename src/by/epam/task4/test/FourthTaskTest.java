package by.epam.task4.test;

import by.epam.task4.FourthTask;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


class FourthTaskTest {

    @Test
    void isTwoEvenNumbers() {
        ArrayList <Boolean> expected = new ArrayList<>(3);
        ArrayList <Boolean> actual = new ArrayList<>(3);

        expected.add(true);
        expected.add(true);
        expected.add(false);
        expected.add(false);

        actual.add(FourthTask.isTwoEvenNumbers(1,2,3,4));
        actual.add(FourthTask.isTwoEvenNumbers(4,1000,5002,22));
        actual.add(FourthTask.isTwoEvenNumbers(3,55,113,22));
        actual.add(FourthTask.isTwoEvenNumbers(-57,9999,29,33));

        Assertions.assertEquals(expected, actual);
    }
}