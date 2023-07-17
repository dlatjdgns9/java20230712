package pkg02method;

public class Ex16InitializeBlock {
    public static void main(String[] args) {
        Marine m1 = new Marine("M1");  //생성자가 생성될때마다 instance초기화블럭 동작
        Marine m2 = new Marine("M2");
    }
}

class Marine{
    private String name;

    //static 초기화 블럭 : 클래스가 메모리에 로드될때 한번만 실행
    static {
        String tribe = "Terran";
        System.out.println("종족 : " + tribe);
    }

    //instance 초기화 블럭 : 객체가 생성될 때 마다 실행
    {
        System.out.println(this.getClass().getSimpleName() + "생성되었습니다.");
    }



    public Marine(String name) {
        if (!name.equals("")) {
            this.name = name;
        }
    }


}