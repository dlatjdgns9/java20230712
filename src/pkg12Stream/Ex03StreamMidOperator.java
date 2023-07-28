package pkg12Stream;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Ex03StreamMidOperator {
    public static void main(String[] args) {
        String dir = "C:/";
        try {
            Stream<Path> fileListStream = Files.list(Paths.get(dir));
            fileListStream.map(Path::toFile)
//				.peek(s -> System.out.print(s.toString()+","))
                    .filter(File::isFile)
                    .map(s -> s.toString().substring(s.toString().indexOf(".") + 1))
//				.peek(System.out::println)
                    .map(String::toUpperCase)
                    .distinct().forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();

    }
}