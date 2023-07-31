package pkg13Database.ui;

import javax.swing.*;

public abstract class BasicFrm extends JFrame {
    private int width, height;

    public BasicFrm(String title, int width, int height) {
        super(title); //JFrame에서 title이 선언되있어서 super(title)가능
        this.width = width;
        this.height = height;
        init(); arragne();  infalte();
    }

    public abstract void init();
    public abstract void arragne();

    public void infalte(){
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //닫기누르면 종료되게
        setLocationRelativeTo(this); //윈도우 창을 화면 가운데 띄우는 역할
        setVisible(true);  //창만들기
    }

}
