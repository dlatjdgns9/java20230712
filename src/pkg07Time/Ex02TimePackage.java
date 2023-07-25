package pkg07Time;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Ex02TimePackage {
    public static void main(String[] args) {
        //java8 부터 time 패키지 추가
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        System.out.println(ld.of(2100,7,25));
        System.out.println(ld); //immutable
        System.out.println("Day of week: "+ld.with(ChronoField.DAY_OF_WEEK,7));
//        System.out.println(ld.get(ChronoField.DAY_OF_WEEK.getDisplayName(TextStyle.SHORT, Locale.KOREA)));
        System.out.println();


        LocalDate ld2 = ld.of(2023, 7, 24);
        System.out.println(ld2);
        System.out.println(ld2.getDayOfWeek());
        System.out.println(ld2.plusDays(1));
        System.out.println(ld2.plus(1, ChronoUnit.YEARS));
        System.out.println(ld2);
        System.out.println(ld2.minusDays(1));
        System.out.println(ld2.minus(1,ChronoUnit.YEARS));


    }
}
