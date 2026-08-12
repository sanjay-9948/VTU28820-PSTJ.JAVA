class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(totalDays(date1) - totalDays(date2));
    }

    public int totalDays(String date) {
        String[] parts = date.split("-");

        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        int total = 0;

        for (int y = 1; y < year; y++) {
            total += isLeap(y) ? 366 : 365;
        }

        int[] days = {31, 28, 31, 30, 31, 30,
                      31, 31, 30, 31, 30, 31};

        for (int m = 0; m < month - 1; m++) {
            total += days[m];
        }

        if (isLeap(year) && month > 2) {
            total++;
        }

        total += day - 1;

        return total;
    }

    public boolean isLeap(int year) {
        return (year % 400 == 0) ||
               (year % 4 == 0 && year % 100 != 0);
    }
}
