package by.epam.task2.test;

import by.epam.task2.SecondTask;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SecondTaskTest {

    @Test
    void getAmountDays() {
        byte[] expected = new byte[] {31, 30, 28, 28, 29, 29, -1};
        byte[] actual = new byte[7];

        actual[0] = SecondTask.getAmountDays(100, (byte) 1);
        actual[1] = SecondTask.getAmountDays(100, (byte) 4);
        actual[2] = SecondTask.getAmountDays(200, (byte) 2);
        actual[3] = SecondTask.getAmountDays(305, (byte) 2);
        actual[4] = SecondTask.getAmountDays(8, (byte) 2);
        actual[5] = SecondTask.getAmountDays(800, (byte) 2);
        actual[6] = SecondTask.getAmountDays(10, (byte) -5);

        Assertions.assertArrayEquals(expected, actual);
    }
}