package pkg06Collection;

import java.util.*;

public class Ex11Collections {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList();
        list.add(new Student(" 임성훈", 1,10,80,80,90));
        list.add(new Student(" 김준기", 2,11,90,90,80));
        list.add(new Student(" 임종훈", 1,12,100,100,90));
        list.add(new Student(" 염 건", 2,13,70,80,80));
        list.add(new Student(" 진희륜", 1,14,80,90,100));
//        for (Student s : list) {
//            System.out.println(s);
//        }
        Collections.sort(list, new BanNoAscending());
        for (Student s : list) {
            System.out.println(s);
        }
    }
}

class BanNoAscending implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Student && o2 instanceof Student) {
            Student s1 = (Student) o1;
            Student s2 = (Student) o2;
            int result = (s1.ban - s2.ban) * -1; //-1을 곱해서 역순으로 출력 가능
            if (result == 0) { //번호순으로 출력
                return s1.no - s2.no;
            }
            return result;
        }
        return -1;
    }
}

class Student {
    String name;
    int ban, no, kor, eng, math;

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor + eng + math;
    }
    double getAverage() {
        return Math.round(getTotal() / 3);
    }

    @Override
    public String toString() {
        return ban+"반 "+ no + "번" + name + " 총점:"+ getTotal() + " 평균:"+ Math.round(getAverage());
    }
}
