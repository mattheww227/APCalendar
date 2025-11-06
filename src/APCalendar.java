public class APCalendar
{
    private static boolean isLeapYear(int year)
    {
        boolean four = year % 4 == 0;
        boolean hundred = year % 100 == 0;
        boolean fourHundred = year % 400 == 0;
        return four && (!hundred || fourHundred);
    }

    public static int numberOfLeapYears(int year1, int year2)
    {
        int count = 0;
        for (int i = year1; i <= year2; i++)
        {
            if (isLeapYear(i)) count++;
        }
        return count;
    }

    private static int firstDayOfYear(int year)
    {
        int day = 1;
        for (int i = 1; i < year; i++)
        {
            day++;
            if (isLeapYear(i)) day++;
        }
        return day % 7;
    }

    private static int dayOfYear(int month, int day, int year)
    {
        int days = 0;

        return days;
    }

    public static int dayOfWeek(int month, int day, int year)
    {
        return 0;
    }
}
