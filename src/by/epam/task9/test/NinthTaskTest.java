package by.epam.task9.test;

import by.epam.task9.NinthTask;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class NinthTaskTest {

    @Test
    void getCircumference() {
        ArrayList<Double> expected = new ArrayList<>();
        ArrayList<Double> actual = new ArrayList<>();

        expected.add(6.911503837920001);
        expected.add(31.415926536);

        actual.add(NinthTask.getCircumference(1.1));
        actual.add(NinthTask.getCircumference(5));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getAreaCircle() {
        ArrayList<Double> expected = new ArrayList<>();
        ArrayList<Double> actual = new ArrayList<>();

        expected.add(22.902210444744007);
        expected.add(50.2654824576);

        actual.add(NinthTask.getAreaCircle(2.7));
        actual.add(NinthTask.getAreaCircle(4));

        Assertions.assertEquals(expected, actual);
    }
}