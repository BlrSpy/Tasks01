package by.epam.task7;


public class Main {
    public static void main(String[] args) {

        int x1 = 5, y1 = 6, x2 = 4, y2 = 7;

        if (SeventhTask.isFirstDotCloserToOrigin(x1,y1,x2,y2))
            System.out.println("Dot with coordinates x1 = " + x1 + ", y1 = " + y1
                    + " is closer to the origin.");
        else System.out.println("Dot with coordinates x2 = " + x2 + ", y2 = " + y2
                + " is closer to the origin.");
    }
}
