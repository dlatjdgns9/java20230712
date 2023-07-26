package pkg09Generics;

public class Ex02GenericType {
    public static void main(String[] args) {
        Generic<String> generic = new Generic<>();
        String[] ss = {"홍길동", "이순신", "김유신"};
        generic.set(ss);
        generic.print();

        Generic<Integer> generic1 = new Generic<>();
        Integer[] ii = {1, 2, 3};
        generic1.set(ii);
        generic1.print();
    }
}

class Generic<T> {
    T[] v;

    void set(T[] v) {
        this.v = v;
    }

    void print() {
        for (int i = 0; i < v.length; i++) {
            if(i!=0) System.out.print(", ");
            System.out.print(v[i]);
        }
        System.out.println();
    }
}
