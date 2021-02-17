package by.epam.task7.test;

import by.epam.task7.SeventhTask;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SeventhTaskTest {

    @Test
    void isFirstDotCloserToOrigin() {
        ArrayList<Boolean> expected = new ArrayList<>();
        ArrayList<Boolean> actual = new ArrayList<>();

        expected.add(true);
        expected.add(true);
        expected.add(false);
        expected.add(false);

        actual.add(SeventhTask.isFirstDotCloserToOrigin(1,2,3,4));
        actual.add(SeventhTask.isFirstDotCloserToOrigin(501,685,743,456));
        actual.add(SeventhTask.isFirstDotCloserToOrigin(3,2,3,1));
        actual.add(SeventhTask.isFirstDotCloserToOrigin(500,350,100,400));

        Assertions.assertEquals(expected, actual);
    }
}