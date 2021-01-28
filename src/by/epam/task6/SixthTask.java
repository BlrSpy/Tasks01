package by.epam.task6;

public class SixthTask {
    public static int[] getTime(int seconds) {

        int[] time = new int[3];

        time[0] = seconds/3600;
        time[1] = seconds/60 - time[0]*60;
        time[2] = seconds - time[1]*60 - time[0]*3600;

        return time;
    }
}
