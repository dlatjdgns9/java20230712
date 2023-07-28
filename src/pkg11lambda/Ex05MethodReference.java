package pkg11lambda;
import java.util.function.Function;
import java.util.function.Supplier;

public class Ex05MethodReference {
    public static void main(String[] args) {
        //람다식이 하나의 메서드만 호출하는 경우
        Function<String, Integer> f = s -> Integer.parseInt(s);
        f = Integer::parseInt;

        Supplier<MyClass> s = () -> new MyClass();
        s = MyClass::new;


        Function<Integer, int[]> f2 = i -> new int[i];
        f2 = int[]::new;
    }
}

class MyClass { }