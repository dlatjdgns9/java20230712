package pkg12Stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex06StreamFinalOperator {
    public static void main(String[] args) {
        Stream<Student> stream = Stream.of(
                new Student("강자바", 3, 300), new Student("김자바", 1, 200),
                new Student("최자바", 2, 100), new Student("천자바", 2, 150),
                new Student("소자바", 1, 200), new Student("닥자바", 3, 290),
                new Student("홍자바", 3, 180)
        );
//		Optional<Student> s = stream.reduce(new BinaryOperator<Student>() {
//			@Override
//			public Student apply(Student t, Student u) {
//				return t.totalScore>u.totalScore?t:u;
//			}
//		});
//		if(s.isPresent()) System.out.println(s);

//		System.out.println(Arrays.toString(stream.toArray(Student[]::new)));
//		System.out.println(stream.count());
//		System.out.println(stream.collect(Collectors.counting()));
//		System.out.println(stream.collect(
//				Collectors.summingInt(Student::getTotalScore)));
//		System.out.println(stream.collect(
//				Collectors.maxBy(Comparator.comparingInt(Student::getTotalScore))));
        System.out.println(stream.collect(
                Collectors.summarizingInt(Student::getTotalScore)));

    }
}