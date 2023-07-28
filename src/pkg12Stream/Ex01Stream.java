package pkg12Stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class Ex01Stream {
    // stream : 데이터를 추상화하고 이를 다루기 위한 메서드를 이용하는 것
    //1) 원래 소스를 변경안함   2)일회용   3) 내부반복으로 작업
    public static void main(String[] args) {
        Stream<Student> stream = Stream.of(
                new Student("마자바", 3, 300),
                new Student("감자바", 2, 200),
                new Student("김자바", 1, 150),
                new Student("왜자바", 2, 100),
                new Student("홍자바", 1, 200),
                new Student("신자바", 2, 290),
                new Student("안자바", 3, 100)
        );
        //.thenComparing(Comparator.naturalOrder()).reversed() 내림차순
        stream.sorted(Comparator.comparing(Student::getBan).thenComparing(Comparator.naturalOrder()).reversed())
                .forEach(System.out::println);


    }
}


class Student implements Comparable<Student> {
    String name; int ban; int totalScore;

    public Student(String name, int ban, int totalScore) {
        this.name = name; this.ban = ban; this.totalScore = totalScore;
    }

    @Override
    public int compareTo(Student s) {
        return totalScore-s.totalScore;
    }

    @Override
    public String toString() {
        return String.format("[%s, %d, %d]", name, ban, totalScore);
    }

    public String getName(){return name; }

    public int getBan() {
        return ban;
    }

    public int getTotalScore() {
        return totalScore;
    }
}