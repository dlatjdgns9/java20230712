package pkg07Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.JapaneseDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class Ex03TimePackage {
    public static void main(String[] args) {
        //java 8부터 time 패키지 추가, immutable
        //요일은 월요일~일요일까지 1~7의 값을 가진다.
        //월은 1~12까지의 값을 가진다.
        System.out.println("\n\n1. 객체 생성 now(), of() ===");
        LocalDate ld = LocalDate.now(); //현재 날짜로 객체 생성
        LocalTime lt = LocalTime.now(); //현재 시간으로 객체 생성
        System.out.println(ld);
        System.out.println(ld.of(2100,7,25));//지정된 시간으로 객체 생성
        System.out.println(ld); //immutable
        System.out.println(lt.of(10,7,25)); //지정된 시간으로 객체 생성
        System.out.println(ld);


        System.out.println("\n\n2. 특정 필드 값 가져오기 get(), getXXX() ===");
        ld = ld.of(2023, 7, 24);
        System.out.println(ld);
        System.out.println(ld.getYear());
        System.out.println(ld.getMonth()); // JULY
        System.out.println(ld.getMonthValue()); //7
        System.out.println(ld.getDayOfMonth()); //24
        System.out.println(ld.getDayOfYear()); //205
        System.out.println(ld.lengthOfMonth()); // 31
        System.out.println(ld.lengthOfYear()); // 365
        System.out.println(ld.isLeapYear()); //윤년인지 확인
        System.out.println(ld.getDayOfWeek()); //MONDAY
        System.out.println(ld.get(ChronoField.DAY_OF_WEEK));//1 월요일~일요일까지 1~7까지의 값
        System.out.println(ld.get(ChronoField.YEAR_OF_ERA));//2023
        System.out.println(lt);
        System.out.println(lt.get(ChronoField.AMPM_OF_DAY)); //오전:0, 오후:1
        System.out.println(lt.get(ChronoField.HOUR_OF_DAY)); //24
        System.out.println(lt.get(ChronoField.HOUR_OF_AMPM)); //0~11
        System.out.println(lt.get(ChronoField.CLOCK_HOUR_OF_AMPM)); //1~12
        System.out.println(lt.getHour()+":"+lt.getMinute()+":"+lt.getSecond());
        System.out.println(ld.getDayOfWeek().getValue());
        System.out.println(ld.get(ChronoField.DAY_OF_YEAR));


        LocalDateTime ldt = LocalDateTime.now(); //현재 날짜 시간으로 객체 생성
        System.out.println(ldt);
        System.out.println(ldt);
        ldt = ldt.of(LocalDate.now(), lt);
        System.out.println(ldt);



        System.out.println("\n\n3. 특정 필드 값 변경하기 with(), plus(), minus() ===");
        System.out.println("지정 날짜: "+ld);
        System.out.println("DAY_OF_WEEK: " + ld.with(ChronoField.DAY_OF_WEEK,2));
        // ALIGNED_WEEK_OF_MONTH 지정 요일이 월요일이고 5번쨰
        System.out.println(ld.with(ChronoField.ALIGNED_WEEK_OF_MONTH, 5));
        ld = ld.with(ChronoField.ALIGNED_WEEK_OF_MONTH, 5);  //정렬된 3번째 주 토요일 리턴
        System.out.println("ALIGNED_WEEK_OF_MONTH::"+ld);
        ld = ld.with(ChronoField.DAY_OF_WEEK, 7);
        System.out.println("DAY_OF_WEEK::"+ld);
        System.out.println(ld.plus(1, ChronoUnit.YEARS));
        System.out.println(ld.plusYears(1));
        System.out.println(ld.plusDays(1));
        System.out.println(ld.minusDays(1));
        //plusHours, plusMinutes, plusSeconds





        System.out.println("\n\n4. 날짜와 시간의 비교 isEqaul(), isAfter(), isBefore() ===");
        ld = ld.with(LocalDate.now());
        //with() 메서드는 현재 날짜를 기준으로 상대적인 날짜를 리턴
        System.out.println("현재 날짜: "+ld);
        LocalDate ld2 = LocalDate.of(2025, 7, 26);
        System.out.println(ld.equals(ld2)); //false
        System.out.println(ld.isEqual(ld2)); //false   단순 날짜비교
        System.out.println(ld.isBefore(ld2)); //true

        JapaneseDate jdt = JapaneseDate.from(LocalDate.now());
        System.out.println(jdt);
        System.out.println(ld.equals(jdt)); //false 연대가 다름
        System.out.println(ld.isEqual(jdt)); //true 오직 날짜만 비교


    }
}
