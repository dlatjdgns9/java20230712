package pkg13Database.ui;

import javax.swing.*;

public abstract class BasicFrm extends JFrame {
    private int width, height;

    public BasicFrm(String title, int width, int height) {
        super(title);
        this.width = width;
        this.height = height;
        init();arrange();inflate();
    }

    public abstract void init();
    public abstract void arrange();
    public void inflate() {
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        setVisible(true);
    }

}