package by.epam.task6.test;

import by.epam.task6.SixthTask;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SixthTaskTest {

    @Test
    void getTime() {
        int[] expected;
        int[] actual;

        expected = new int[] {1,23,20};
        actual = SixthTask.getTime(5000);
        Assertions.assertArrayEquals(expected, actual);

        expected = new int[] {3,5,11};
        actual = SixthTask.getTime(11111);
        Assertions.assertArrayEquals(expected, actual);

        expected = new int[] {0,1,18};
        actual = SixthTask.getTime(78);
        Assertions.assertArrayEquals(expected, actual);
    }
}