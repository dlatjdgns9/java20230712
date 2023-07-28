package pkg12Stream;

import java.util.Optional;

public class Ex05Optional {public static void main(String[] args) {
    Optional<Value> opt = Optional.of(new Value()); // Optional 객체 생성
    Optional<Value> opt1 = Optional.ofNullable(null); // 널일 경우객체 생성
    Optional<Value> opt2 = Optional.<Value>empty(); // 빈객체를 생성

    Value v;
    if(opt.isPresent()) { v = opt.get();System.out.println(v);}
    if(opt1.isPresent()) { v = opt1.get();System.out.println(v);}
    if(opt2.isPresent()) {v = opt2.get();System.out.println(v);}

}
}
class Value{
    int val = 10;
    @Override
    public String toString() {
        return val+"";
    }
}