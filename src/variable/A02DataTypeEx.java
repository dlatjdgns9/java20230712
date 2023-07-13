package variable;

public class A02DataTypeEx {
    public static void main(String[] args) {
        Tv tv = new Tv(); // Tv객체 인스턴스 생성
        System.out.println(tv.power);

        tv.power = true;
        System.out.println(tv.power);

        tv.power();
        //tv.channel = 19;
        tv.volumePlus();
        tv.power();
        tv.volumePlus();
        tv.volumeMinus();
    }
}

class Tv {
    boolean power;
    int channel;
    int volume;

    void power() {
        power = !power;  // 전원 작동시 On/Off 로 전환

        if (power == true) {
            System.out.println("TV가 켜졌습니다.");
        } else {
            System.out.println("TV가 꺼졌습니다.");
        }
    }

    void volumePlus() {
        ++volume;
        System.out.println("volume = " + volume);
    }

    void volumeMinus() {
        --volume;
        System.out.println("volume = " + volume);
    }


}
