package pkg12Stream;
import java.util.Arrays;
import java.util.stream.Stream;

public class Ex04StreamMidOperator {
    public static void main(String[] args) {
        Stream<String[]> strArrStream = Stream.of(
                new String[]{"abc", "def", "ghi"},
                new String[]{"ABC", "DEF", "GHI"});
        Stream<String> strStream = strArrStream.flatMap(Arrays::stream);
        strStream.map(String::toLowerCase).distinct().sorted().forEach(
                System.out::print);
        System.out.println();
    }
}