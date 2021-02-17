package by.epam.task8.test;

import by.epam.task8.EighthTask;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EighthTaskTest {

    @Test
    void getValueFunc() {
        ArrayList<Double> expected = new ArrayList<>();
        ArrayList<Double> actual = new ArrayList<>();

        expected.add(9d);
        expected.add(-4.75);
        expected.add(-0.2);

        actual.add(EighthTask.getValueFunc(3d));
        actual.add(EighthTask.getValueFunc(5.5));
        actual.add(EighthTask.getValueFunc(1d));

        Assertions.assertEquals(expected, actual);
    }
}