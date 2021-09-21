import java.util.Arrays;

public class NextDayCalculator {
    public static String NextDay(int day, int month, int year) {
        int[] ints = new int[3];
        if (day < 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)) {
            day++;
            GanGiaTri(day, month, year, ints);
        } else if (day < 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
            day++;
            GanGiaTri(day, month, year, ints);
        } else if (day == 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)) {
            if (month == 12) {
                day = 1;
                month = 1;
                year++;
                GanGiaTri(day, month, year, ints);
            } else {
                day = 1;
                month++;
                GanGiaTri(day, month, year, ints);
            }
        } else if (day == 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
                day = 1;
                month++;
                GanGiaTri(day, month, year, ints);
        }
        else if(month == 2){
            if(checkNamNhuan(year)){
                if(day < 29){
                    day++;
                    month = 2;
                    GanGiaTri(day, month, year, ints);
                }
                else {
                    day = 1;
                    month++;
                    GanGiaTri(day, month, year, ints);
                }
            }
            else {
                if(day < 28){
                    day++;
                    GanGiaTri(day, month, year, ints);
                }
                else {
                    day = 1;
                    month++;
                    GanGiaTri(day, month, year, ints);
                }
            }

        }
        return ints[0] + "-" + ints[1] + "-" + ints[2];
    }

    private static void GanGiaTri(int day, int month, int year, int[] ints) {
        ints[0] = day;
        ints[1] = month;
        ints[2] = year;
    }

    public static boolean checkNamNhuan(int year){
        boolean isLeap = false;
        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }
        return isLeap;
    }
}

