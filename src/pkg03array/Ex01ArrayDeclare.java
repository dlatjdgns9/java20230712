package pkg03array;

public class Ex01ArrayDeclare {
    public static void main(String[] args) {
        //선언과 초기화가 동시 진행이지만 원소의 값 할당은 나중에 초기화
        int[] score = new int[10];

        System.out.println(score.length);
        for (int i = 0; i < score.length; i++) {
            score[i] = (int) (Math.random() * 50) + 1 + 50;
            System.out.println(score[i]);
        }

        //선언과 초기화가 분리되는 경우
        int score1[];
        score1 = new int[12];
        score1[0] = 100;

        //선언과 동시에 초기화
        int[] score2 = new int[]{100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
        int[] score3 = new int[]{100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
        String names[] = {"김지영", "전성모", "신중현", "임윤서", "박주형", "이혜정", "임성훈", "김준기", "문영현", "김상백", "홍희범", "정영훈"};
        int total = 0;
        for (int i = 0; i < score.length; i++) {
            System.out.printf("이름: %s, 점수: %d \n", names[i], score[i]);
            total += score[i];
        }
        System.out.printf("총점 : %d 평균 : %3.2f\n", total, (double)total/score.length);



        int max = score[0];
        int min = score[0];
        int maxIdx=0,minIdx = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
                maxIdx = i;
            } else if (score[i] < min) {
                min = score[i];
                minIdx = i;
            }
        }
        System.out.printf("최고점수 : %d / 이름 : %s\n최소점수 : %d / 이름 : %s", max, names[maxIdx], min, names[minIdx]);
    }
}
