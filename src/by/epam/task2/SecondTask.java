package by.epam.task2;

public class SecondTask {

    public static byte getAmountDays (int year, byte month) {

        boolean isLeapYear = false;
        byte days;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) isLeapYear = true;
            }
            else
                isLeapYear = true;
        }

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> days = 31;
            case 4, 6, 9, 11 -> days = 30;
            case 2 -> {
                if (!isLeapYear)
                    days = 28;
                else
                    days = 29;
            }
            default -> days = -1;
        }
        return days;
    }
}
