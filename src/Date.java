import java.time.LocalDate;

public class Date {
    private int day, month, year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void display() {
        System.out.println(day + "/" + month + "/" + year);
    }

    public int compareDate(Date d1, Date d2) {
        if (d1.year > d2.year) {
            return 1;
        }
        else if (d1.year < d2.year) {
            return -1;
        }
        else {
            if (d1.month > d2.month) {
                return 1;
            }
            else if (d1.month < d2.month) {
                return -1;
            }
            else {
                if (d1.day > d2.day) {
                    return 1;
                }
                else if (d1.day < d2.day) {
                    return -1;
                }
                else {
                    return 0;
                }
            }
        }
    }

    public static int compareDateStatic(Date d1, Date d2){
        if (d1.year > d2.year) {
            return 1;
        }
        else if (d1.year < d2.year) {
            return -1;
        }
        else {
            if (d1.month > d2.month) {
                return 1;
            }
            else if (d1.month < d2.month) {
                return -1;
            }
            else {
                if (d1.day > d2.day) {
                    return 1;
                }
                else if (d1.day < d2.day) {
                    return -1;
                }
                else {
                    return 0;
                }
            }
        }
    }

    public Date() {
        LocalDate today = LocalDate.now();
        this.day = today.getDayOfMonth();
        this.month = today.getMonthValue();
        this.year = today.getYear();
    }


    public static void todayOrNot(Date d){
        LocalDate today = LocalDate.now();
        if (d.day == today.getDayOfMonth() && d.month == today.getMonthValue() && d.year == today.getYear()) {
            System.out.println("Today is " + d.day + "/" + d.month + "/" + d.year);
        }
        else {
            System.out.println("Today is not " + d.day + "/" + d.month + "/" + d.year);
        }

    }
}
