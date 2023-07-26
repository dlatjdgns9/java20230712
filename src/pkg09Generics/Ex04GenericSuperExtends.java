package pkg09Generics;

public class Ex04GenericSuperExtends {
    public static void main(String[] args) {
        Gen3 gen3 = new Gen3();
        GenType<? super Gen2> genSuper = new GenType<Gen2>(gen3);
        GenType<? extends Gen2> genExtends = new GenType<Gen2>(gen3);
    }
}


class Gen1 {
    String name = "Gen1";
    public String getName() {
        return name;
    }
}

class Gen2 extends Gen1{
    String name = "Gen2";
    public String getName() {
        return name;
    }
}


class Gen3 extends Gen2 {
    String name = "Gen3";
    public String getName() {
        return name;
    }
}


class GenType<T> {
    T obj;

    public GenType(T obj) {
        this.obj = obj;
    }
    public void set(T obj) {
        this.obj = obj;
    }
    public T get() {
        return obj;
    }
}