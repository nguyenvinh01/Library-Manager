package Library;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class AddStudent extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField t1,t2,t3;
    private JComboBox comboBox, comboBox_1, comboBox_2, comboBox_3;
    JButton b1,b2;

    public static void main(String[] args) {
        new AddStudent().setVisible(true);
    }


    public AddStudent() {
        super("Add Student");
        setBounds(700, 200, 550, 450);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel l1 = new JLabel("Mã SV");
        l1.setForeground(new Color(25, 25, 112));
        l1.setFont(new Font("Tahoma", Font.BOLD, 14));
        l1.setBounds(64, 63, 102, 22);
        contentPane.add(l1);

        JLabel l2 = new JLabel("Tên");
        l2.setForeground(new Color(25, 25, 112));
        l2.setFont(new Font("Tahoma", Font.BOLD, 14));
        l2.setBounds(64, 97, 102, 22);
        contentPane.add(l2);

        JLabel l3 = new JLabel("Họ");
        l3.setForeground(new Color(25, 25, 112));
        l3.setFont(new Font("Tahoma", Font.BOLD, 14));
        l3.setBounds(64, 130, 102, 22);
        contentPane.add(l3);

        JLabel l4 = new JLabel("Khoa");
        l4.setForeground(new Color(25, 25, 112));
        l4.setFont(new Font("Tahoma", Font.BOLD, 14));
        l4.setBounds(64, 170, 102, 22);
        contentPane.add(l4);

        JLabel l5 = new JLabel("Năm");
        l5.setForeground(new Color(25, 25, 112));
        l5.setFont(new Font("Tahoma", Font.BOLD, 14));
        l5.setBounds(64, 244, 102, 22);
        contentPane.add(l5);

        JLabel l6 = new JLabel("Học kỳ");
        l6.setForeground(new Color(25, 25, 112));
        l6.setFont(new Font("Tahoma", Font.BOLD, 14));
        l6.setBounds(64, 205, 102, 22);
        contentPane.add(l6);

        t1 = new JTextField();
        t1.setForeground(new Color(47, 79, 79));
        t1.setFont(new Font("Tahoma", Font.BOLD, 14));
        t1.setBounds(174, 66, 156, 20);
        contentPane.add(t1);
        t1.setColumns(10);

        t2 = new JTextField();
        t2.setForeground(new Color(47, 79, 79));
        t2.setFont(new Font("Tahoma", Font.BOLD, 14));
        t2.setColumns(10);
        t2.setBounds(174, 100, 156, 20);
        contentPane.add(t2);

        t3 = new JTextField();
        t3.setForeground(new Color(47, 79, 79));
        t3.setFont(new Font("Tahoma", Font.BOLD, 14));
        t3.setColumns(10);
        t3.setBounds(174, 133, 156, 20);
        contentPane.add(t3);

        comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] { "CNTT", "QTKD", "Ngon ngu anh", "Other" }));
        comboBox.setForeground(new Color(47, 79, 79));
        comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
        comboBox.setBounds(176, 170, 154, 20);
        contentPane.add(comboBox);

        comboBox_1 = new JComboBox();
        comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        comboBox_1.setForeground(new Color(47, 79, 79));
        comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        comboBox_1.setBounds(176, 248, 154, 20);
        contentPane.add(comboBox_1);

        comboBox_2 = new JComboBox();
        comboBox_2.setModel(
                new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 14));
        comboBox_2.setForeground(new Color(47, 79, 79));
        comboBox_2.setBounds(176, 206, 154, 20);
        contentPane.add(comboBox_2);

        b1 = new JButton("Thêm");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    conn con = new conn();
                    String sql = "insert into student(student_id, name, father,branch, year, semester) values (?, ?, ?, ?, ?, ?)";
                    PreparedStatement st = con.c.prepareStatement(sql);
                    st.setString(1, t1.getText());
                    st.setString(2, t2.getText());
                    st.setString(3, t3.getText());
                    //st.setString(4, (String) comboBox_3.getSelectedItem());
                    st.setString(4, (String) comboBox.getSelectedItem());
                    st.setString(5, (String) comboBox_1.getSelectedItem());
                    st.setString(6, (String) comboBox_2.getSelectedItem());
                    int i = st.executeUpdate();

                    if (i > 0){
                        JOptionPane.showMessageDialog(null, "Thành công");
                        //setVisible(false);
                        //new Home().setVisible(true);
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Lỗi");
                }catch(SQLException throwables){
                }
            }
            }
        );
        b1.setFont(new Font("Tahoma", Font.BOLD, 14));
        b1.setBounds(64, 321, 111, 33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        contentPane.add(b1);

        b2 = new JButton("Back");
        b2.addActionListener(this);
        b2.setFont(new Font("Tahoma", Font.BOLD, 14));
        b2.setBounds(198, 321, 111, 33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        contentPane.add(b2);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(211, 211, 211));
        panel.setBounds(10, 38, 358, 348);

        contentPane.setBackground(Color.WHITE);
        panel.setBackground(Color.WHITE);

        contentPane.add(panel);
    }

    public void actionPerformed(ActionEvent ae){
        try{

            if(ae.getSource() == b2){
                this.setVisible(false);
                new Home().setVisible(true);
            }
        }catch(Exception e){

        }
    }
}
