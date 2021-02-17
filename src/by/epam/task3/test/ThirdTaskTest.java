package by.epam.task3.test;

import by.epam.task3.ThirdTask;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ThirdTaskTest {
    @Test
    void getAreaSmallSquare() {
        double expected = 10.5;
        double actual = ThirdTask.getAreaSmallSquare(21);

        Assertions.assertEquals(expected, actual);
    }
}