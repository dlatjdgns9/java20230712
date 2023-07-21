package pkg04class;

public class ExExercise265p {
    public static void main(String[] args) {
        //인터페이스는 인스턴스를 생성할수 없기 때문에 클래스가 인터페이스로 형변환
        //1) 인터페이스를 임플리먼트한 객체가 인터페이스타입의 인스턴스 생성가능
        //2) 인터페이스의 익명객체를 생성해서 인터페이스타입의 인스턴스 생성가능
        Player p1 = new BaseBallPlayer();
        Player p2 = new FootBallPlayer();

        playGame(p1);
        playGame(p2);

        Player p3 = new Player() {
            @Override
            public void play() {
                System.out.println("교체선수입니다.");
            }
        };
        playGame(p3);
        Television q1 = new Television() {
            @Override
            public void turnOn() {
                System.out.println("Tv를 켭니다.");
            }
        };
        power(q1);
    }

    public static void playGame(Player p1){
        p1.play();
    }


    public static void power(Television q1) {
        q1.turnOn();
    }

}





interface Player {
    void play();
}

class BaseBallPlayer implements Player {
    @Override
    public void play() {
        System.out.println("야구선수가 야구를 합니다.");
    }
}

class FootBallPlayer implements Player {
    @Override
    public void play() {
        System.out.println("축구선수가 축구를 합니다.");
    }
}

interface Television {
    void turnOn();
}