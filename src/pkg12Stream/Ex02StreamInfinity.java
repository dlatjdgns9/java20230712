package pkg12Stream;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Ex02StreamInfinity {
    public static void main(String[] args) {
        // 무한 스트림 생성 ints, longs, doubles
        IntStream intStream = new Random().ints(1,5);
        intStream.limit(5).forEach(System.out::print);
        System.out.println();

        LongStream longStream = LongStream.range(1,45);//끝수 미포함.
        longStream.forEach(System.out::print);
        System.out.println();

        IntStream lottoStream = IntStream.rangeClosed(1, 45);
//		lottoStream.forEach(new IntConsumer() {
//			@Override
//			public void accept(int value) {
//				System.out.printf("%3d", value);
//			}
//		});
        lottoStream.forEach(v -> System.out.printf("%3d", v));
        System.out.println();

        Stream<Integer> itrStream = Stream.iterate(0, n -> n+2);
        itrStream.limit(5).forEach(System.out::print);
        System.out.println();

        Stream<Integer> genStream = Stream.generate(()->(int)(Math.random()*10));
        genStream.limit(5).forEach(System.out::print);
        System.out.println();

        String dir = "C:/";
        try {
            Stream<Path> fileListStream = Files.list(Paths.get(dir));
            List<File> files = fileListStream.map(Path::toFile)
                    .filter(File::isFile)
                    .collect(Collectors.toList());
            files.forEach(System.out::print);
        } catch (Exception e) {e.printStackTrace();}
        System.out.println();

        //빈 스트림 생성할 때
        Stream initStream = Stream.empty();
        System.out.println(initStream.count());
    }
}