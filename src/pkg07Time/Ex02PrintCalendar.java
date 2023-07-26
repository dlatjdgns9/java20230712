package pkg07Time;

import java.util.Calendar;
import java.util.Scanner;

public class Ex02PrintCalendar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(":::달력 출력 프로그램(종료:q,Q):::");
        do {
            System.out.print("연도와 월을 입력하시오(ex 2023 01) \n");
            String input = s.nextLine();
            if(input.equalsIgnoreCase("q")) {
                System.out.println("프로그램을 종료합니다.");
                System.exit(-1);
            }
            String[] inputArr = input.split(" ");
            if(inputArr.length != 2) {
                System.out.println("입력양식을 확인하세요(2023 01");
                continue;
            }
            int year = 0; int month = 0;
            try {
                year = Integer.parseInt(inputArr[0]);
                month = Integer.parseInt(inputArr[1]); //month는 입력값에 +1 로 지정됨
            } catch (NumberFormatException e) {
                System.out.println("입력양식을 확인하세요(2023 01)");
                continue;
            }

            Calendar start = Calendar.getInstance();
            Calendar end = Calendar.getInstance(); //2023 12 입력가정
            start.set(year,  month-1, 1); //시작 일자  start = 12월 1일
            end.set(year,  month, 1); //1월 1일
            end.add(Calendar.DATE, -1); //종료 일자 1월1일 -1 하면 end = 12월 31일
            final int WDAY = start.get(Calendar.DAY_OF_WEEK); //요일 1~7까지의 값 월~일
            int cnt = 0; // 7 될 때마다 다음줄로 내려쓰기위한 변수

            System.out.println("=====" + year + "-" + month + "=====");
            System.out.println(" SU MO TU WE TH FR SA"); // 7 1 2 3 4 5 6
            for (int i = 0; i < WDAY-1; i++) {
                System.out.printf("%s", "   ");
                cnt++;
            }
            for (int i = 0; i < end.get(Calendar.DATE); i++) {
                if(cnt++ % 7 == 0) {
                    if(WDAY != 1) {
                        System.out.println();
                    } else {
                        if(cnt > 7) System.out.println();
                    }
                }
                System.out.printf("%3d", i+1);
            }
            System.out.println();
        } while (true);
    }
}
