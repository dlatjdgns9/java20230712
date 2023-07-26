package pkg08IO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;


public class Ex07NotePad {
    public static void main(String[] args) {
        new NotePad();
    }
}

class NotePad extends JFrame implements ActionListener {
    private JMenuBar menuBar;
    private JMenu menuF,menuE,menuO,menuV, menuH;
    private JMenuItem miNew, miOpen, miSave, miExit, miInfo;


    private JTextArea textArea;
    private JScrollPane scrollPane;
    private JFileChooser fileChooser;



    public NotePad() throws HeadlessException {
        init(); arrange();  inflate();

    }

    private void init() {
        menuBar = new JMenuBar();
        menuF = new JMenu("파일(F)");
        menuE = new JMenu("편집(E)");
        menuO = new JMenu("서식(O)");
        menuV = new JMenu("보기(V)");
        menuH = new JMenu("도움말(H)");

        miNew = new JMenuItem("새로 만들기(N)");
        miOpen = new JMenuItem("열기(O)");
        miSave = new JMenuItem("저장(S)");
        miExit = new JMenuItem("끝내기(X)");
        miInfo = new JMenuItem("정보(A)");

        menuF.add(miNew); menuF.add(miOpen);
        menuF.add(miSave); menuF.add(miExit);
        menuF.add(miInfo); menuH.add(miInfo);
        menuBar.add(menuF);
        menuBar.add(menuE);
        menuBar.add(menuO);
        menuBar.add(menuV);
        menuBar.add(menuH);
        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea);
        fileChooser = new JFileChooser();
        miNew.addActionListener(this);
        miOpen.addActionListener(this);
        miSave.addActionListener(this);
        miInfo.addActionListener(this);
        miExit.addActionListener(this);
    }

    private void arrange() {
        setJMenuBar(menuBar);
        add(scrollPane);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == miNew) {
            textArea.setText("aa");
        } else if (e.getSource() == miOpen) {
            fileOpen();
        } else if (e.getSource() == miSave) {
            fileSave();
        } else if (e.getSource() == miInfo) {
            new InfoDialog(this, true);
        } else if (e.getSource() == miExit) {
            dispose();
        }
    }

    private void fileOpen() {
        int ret = fileChooser.showOpenDialog(miOpen);
        if (ret == 0) {
            try {
                String selectedFile = fileChooser.getSelectedFile().toString();
                FileReader fr = new FileReader(selectedFile);
                int data = 0;
                textArea.setText("");
                while ((data = fr.read()) != -1) {
                    textArea.append(String.valueOf(data));
                }
                fr.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void fileSave() {
        int ret = fileChooser.showSaveDialog(miSave);
        if (ret == 0) {
            try {
                String selectedFile = fileChooser.getSelectedFile().toString();
                FileWriter fw = new FileWriter(selectedFile);
                BufferedWriter bw = new BufferedWriter(fw);

                bw.write(textArea.getText());

                bw.close();
                fw.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }



    private void inflate() {
        setTitle("메모장");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        setVisible(true);
    }

}


class InfoDialog extends JDialog {
    public InfoDialog(JFrame fr, boolean modal) {
        super(fr,modal);
        JPanel pnl = new JPanel();
        JLabel lb = new JLabel("Author: ISH");
        pnl.add(lb);
        add(pnl, "Center");

        setTitle("Version 0.1 ");
        setSize(200, 100);
        setLocationRelativeTo(this);
        setVisible(true);
    }
}
