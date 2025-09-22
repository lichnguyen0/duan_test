public class NextDayCalculator {
    public static int[] findNextDay(int day, int month, int year) {
        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

        if(isLeapYear(year)) daysInMonth[1] = 29;

        if(day < daysInMonth[month-1]) day++;
        else {
            day = 1;
            if(month < 12) month++;
            else { month = 1; year++; }
        }
        return new int[]{day, month, year};
    }

    private static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
