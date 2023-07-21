package pkg04class;

public class ExExercise237p {
    public static void main(String[] args) {
        ChildEx ce = new ChildEx();
        ParentEx pe = new ParentEx();
        pe = ce;  //1 자부
        pe = (ParentEx) pe; //2
        //ce= pe; //부자
        ce = (ChildEx) pe; //자부자

    }
}


class ParentEx {
    public ParentEx() {
        this(1);
        System.out.println(1);
    }

    public ParentEx(int x) {
        System.out.println(2);
    }

}

// super() 생성자와 this() 생성자는 동시에 처리 불가
class ChildEx extends ParentEx {
    public ChildEx() {
        this(1);
        System.out.println(3);
    }

    public ChildEx(int x) {
        super(); //원래는 생략되어있음
        System.out.println(4);
    }
}