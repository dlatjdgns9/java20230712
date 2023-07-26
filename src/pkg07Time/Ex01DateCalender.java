package pkg07Time;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Ex01DateCalender {
    public static void main(String[] args) {
        char[] str = new char[0]; //char c = ' ';
        String s = "";
        String[] weeks = ",일,월,화,수,목,금,토".split(",");
        //Calendar와 Date객체는 요일을 일요일~토요일까지 1~7 숫자값을 가짐.
        //Calendar와 Date객체는 달을 0~11까지 가진다. => 헷갈려서 문제가 됨.
        //불변객체가 아님. setter가 존재 Calendar나 Date가 공유되면 다른 곳에 영향을 미칠 수 있음.
        //요일 상수값 사용시 주의 등 많은 문제가 있음.

        System.out.println(Arrays.toString(weeks));
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDate());
        System.out.println(date.getHours());

        Calendar c = Calendar.getInstance();
//    c.set(Calendar.YEAR, 2100);
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DATE));
        System.out.println(weeks[c.get(Calendar.DAY_OF_WEEK)]);
        System.out.println(c.get(Calendar.HOUR)); //12시간제
        System.out.println(c.get(Calendar.HOUR_OF_DAY));//24시간제

        // Date와 Calendar의 변환
        Date d = new Date();
        Calendar cal = Calendar.getInstance();
        //Date => Calendar
        cal.setTime(d);
        //Calendar => Date
        Date d2 = new Date(cal.getTimeInMillis());
    }
}
