package by.epam.task1.test;

import by.epam.task1.FirstTask;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;

class FirstTaskTest {
    @Test
    public void getSquareLastNumeral() {
        byte[] expected = new byte[] {0, 1, 4, 9, 6, 5, 6, 9, 4, 1};
        byte[] actual = new byte[10];

        for (int i = 0; i < actual.length; i++) {
            actual[(byte)i] = FirstTask.getSquareLastNumeral(i);
        }
        Assertions.assertArrayEquals(expected, actual);
    }
}