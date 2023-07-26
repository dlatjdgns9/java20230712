package pkg07Time;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Ex04SimpleDate {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E hh:mm:ss");
        // 시간 표기 방법, hh:am/pm(0-11), HH:0-23, kk:1-24, KK:am/pm(1-12)
        Date d = new Date();
        System.out.println(sdf.format(d));

        // java.util.Date => LocalDate
        LocalDate ld = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println(ld);

        // java.util.Date => LocalDate
        LocalDateTime ldt = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println(ldt);

        //LocalDate => java.util.Date
        Date d1 = java.sql.Date.valueOf(ld);
        System.out.println(d1);

        //LocalDateTime => java.util.Date
        Date d2 = java.sql.Timestamp.valueOf(ldt);

        //java.sql.Date => java.util.Date
        Date d3 = new java.sql.Date(new Date().getTime());

        //java.util.Date => java.sql.Date
        java.sql.Date sqlDate = (java.sql.Date) new Date();
    }
}
