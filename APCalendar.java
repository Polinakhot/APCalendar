public class APCalendar {

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int numberOfLeapYears(int year1, int year2) {
        int count = 0;
        for (int year = year1; year <= year2; year++) {
            if (isLeapYear(year)) {
                count++;
            }
        }
        return count;
    }

    // Mock known values from College Board:
    private static int firstDayOfYear(int year) {
        switch (year) {
            case 2016: return 5; 
            case 2017: return 0; 
            case 2019: return 2; 
            default: return 0; 
        }
    }

    private static int dayOfYear(int month, int day, int year) {
        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        if (isLeapYear(year)) {
            daysInMonth[1] = 29; 
        }

        int dayOfYear = 0;
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysInMonth[i];
        }
        dayOfYear += day;

        return dayOfYear;
    }

    public static int dayOfWeek(int month, int day, int year) {
        int startDay = firstDayOfYear(year); 
        int nthDay = dayOfYear(month, day, year); 
        return (startDay + nthDay - 1) % 7;
    }
}
