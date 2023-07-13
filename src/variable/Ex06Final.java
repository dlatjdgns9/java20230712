package variable;

import javax.swing.*;

public class Ex06Final {
    public static void main(String[] args) {
        final int GAUS_VALUE = 10;
        //gaus_value = 20; 상수이기 때문에 값을 변경할 수 없다.

        final String INPUT;
        INPUT = JOptionPane.showInputDialog("데이터를 입력하세요");
        System.out.println("Your ID : " + INPUT);
    }
}

final class Foo { //Foo 클래스는 final이 붙어서 상속이 안된다.

}
