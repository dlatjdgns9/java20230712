package pkg13Database.ui;

import pkg13Database.vo.Members;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class MainListFrm extends BasicFrm {
    private JTable tbl;
    private JScrollPane scp;
    private JLabel lbTitle;
    private DefaultTableModel tableModel;
    private JPanel pnlBtn;
    private JButton btnModify, btnDelete;

    public MainListFrm(ArrayList<Members> list) {
        super("회원 목록", 900, 500);
        setTableModel(list);
    }

    void setTableModel(ArrayList<Members> list){
        for (int i = 0; i < list.size(); i++) {
            Members m = list.get(i);
            tableModel.addRow(new String[]{m.getMno() + "", m.getSname(), m.getId(), m.getMobile(),
                    m.getEmail(), m.getRegdate().toString(), m.getBirthdate().toString()});
        }
        tbl.setModel(tableModel);
    }

    @Override
    public void init() {
        lbTitle = new JLabel("회원 목록");
        lbTitle.setFont(new Font("맑은 고딕", Font.BOLD, 28));
        lbTitle.setHorizontalAlignment(JLabel.CENTER);
        tbl = new JTable();
        scp = new JScrollPane(tbl);
        tableModel = new DefaultTableModel(
                new String[]{"회원번호", "이름", "ID", "Mobile", "Email", "등록일", "생년월일"}, 0);
        pnlBtn = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnModify = new JButton("수정");
        btnModify.addActionListener(e->{
            int row = tbl.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(null, "회원을 먼저 선택하세요");
                return;
            }
            JOptionPane.showMessageDialog(null, tableModel.getValueAt(row, 0));
            //회원을 수정하는 코드를 작성하여 추가하고 수정되었으면 JTable도 새로고침 되도록 한다.
        });
        btnDelete = new JButton("삭제");
        btnDelete.addActionListener(e->{
            int row = tbl.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(null, "회원을 먼저 선택하세요");
                return;
            }
            tableModel.removeRow(row);
            // ui에서 지웠으면 Database에서도 같이 지워야 함.

        });
    }

    @Override
    public void arrange() {
        pnlBtn.add(btnModify);
        pnlBtn.add(btnDelete);
        add(lbTitle, "North");
        add(scp, "Center");
        add(pnlBtn, "South");
    }
}