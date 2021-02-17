package by.epam.task5.test;

import by.epam.task5.FifthTask;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FifthTaskTest {

    @Test
    void isNumberPerfect() {
        ArrayList<Boolean> expected = new ArrayList<>(4);
        ArrayList<Boolean> actual = new ArrayList<>(4);

        expected.add(true);
        expected.add(true);
        expected.add(false);
        expected.add(false);

        actual.add(FifthTask.isNumberPerfect(33550336));
        actual.add(FifthTask.isNumberPerfect(6));
        actual.add(FifthTask.isNumberPerfect(15));
        actual.add(FifthTask.isNumberPerfect(10000));

        Assertions.assertEquals(expected, actual);
    }
}