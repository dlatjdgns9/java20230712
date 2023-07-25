package pkg07Time;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Ex01DateCalender {
    public static void main(String[] args) {
        String[] weeks = ",일,월,화,수,목,금,토".split(",");
        System.out.println(Arrays.toString(weeks));
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getDate());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        System.out.println(date.getHours());
        System.out.println();


        Calendar c = Calendar.getInstance();
//        c.set(Calendar.YEAR, 2100);
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(weeks[c.get(Calendar.DAY_OF_WEEK)] + "요일");
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
    }
}
