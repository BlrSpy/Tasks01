package by.epam.task7;

public class SeventhTask {
    public static boolean isFirstDotCloserToOrigin(int x1, int y1, int x2, int y2) {
        return (x1 * x1 + y1 * y1) < (x2 * x2 + y2 * y2);
    }
}
