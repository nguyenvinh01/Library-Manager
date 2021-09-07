package Library;


import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JButton b1,b2,b3,b4,b5,b6;

    public static void main(String[] args) {
        new Home().setVisible(true);
    }

    public Home() {

        setBounds(300, 50, 900, 750);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);


        JMenuBar menuBar = new JMenuBar();
        menuBar.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 128, 0), new Color(128, 128, 128)));
        menuBar.setBackground(Color.CYAN);
        menuBar.setBounds(0, 10, 1000, 35);
        contentPane.add(menuBar);

        JMenu mnExit = new JMenu("Thoát");
        mnExit.setFont(new Font("Arial", Font.BOLD, 17));


        JMenuItem mntmLogout = new JMenuItem("Đăng xuất");
        mntmLogout.setBackground(new Color(211, 211, 211));
        mntmLogout.setForeground(new Color(105, 105, 105));
        mntmLogout.addActionListener(this);
        mnExit.add(mntmLogout);

        JMenu mnRecord = new JMenu("Hệ thống");
        mnRecord.setFont(new Font("Arial", Font.BOLD, 17));


        JMenuItem bookdetails = new JMenuItem("Thông tin sách");
        bookdetails.addActionListener(this);
        bookdetails.setBackground(new Color(211, 211, 211));
        bookdetails.setForeground(Color.DARK_GRAY);
        mnRecord.add(bookdetails);

        JMenuItem studentdetails = new JMenuItem("Thông tin sinh viên");
        studentdetails.setBackground(new Color(211, 211, 211));
        studentdetails.setForeground(Color.DARK_GRAY);
        studentdetails.addActionListener(this);
        mnRecord.add(studentdetails);

        menuBar.add(mnRecord);
        menuBar.add(mnExit);


        JLabel l1 = new JLabel("Quản lý thư viện");
        l1.setForeground(new Color(204, 51, 102));
        l1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 30));
        l1.setBounds(268, 30, 701, 80);
        contentPane.add(l1);

        JLabel l2 = new JLabel("");
        l2.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("Library/icons/second.png"));
        Image i2 = i1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l2 = new JLabel(i3);
        l2.setBounds(60, 140, 159, 152);
        contentPane.add(l2);

        JLabel l3 = new JLabel("");
        ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("Library/icons/third.png"));
        Image i5 = i4.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        l3 = new JLabel(i6);
        l3.setBounds(300, 160, 134, 128);
        contentPane.add(l3);

        JLabel l4 = new JLabel("");
        ImageIcon i7  = new ImageIcon(ClassLoader.getSystemResource("Library/icons/fourth.png"));
        Image i8 = i7.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        l4 = new JLabel(i9);
        l4.setBounds(530, 140, 225, 152);
        contentPane.add(l4);

        b1 = new JButton("Thêm sách");
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(60, 320, 159, 44);
        contentPane.add(b1);

        b2 = new JButton("Thống kê");
        b2.addActionListener(this);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(313, 320, 139, 44);
        contentPane.add(b2);

        b3 = new JButton("Thêm Sinh Viên");
        b3.addActionListener(this);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(562, 320, 167, 44);
        contentPane.add(b3);

        b4 = new JButton("Mượn Sách");
        b4.addActionListener(this);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(76, 620, 143, 41);
        contentPane.add(b4);

        b5 = new JButton("Trả Sách");
        b5.addActionListener(this);
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b5.setBounds(310, 620, 159, 41);
        contentPane.add(b5);


        JLabel l5 = new JLabel("");
        ImageIcon i10  = new ImageIcon(ClassLoader.getSystemResource("Library/icons/fifth.png"));
        Image i11 = i10.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        l5 = new JLabel(i12);
        l5.setBounds(60, 440, 159, 163);
        contentPane.add(l5);

        JLabel l6 = new JLabel("");
        ImageIcon i13  = new ImageIcon(ClassLoader.getSystemResource("Library/icons/sixth.png"));
        Image i14 = i13.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        l6 = new JLabel(i15);
        l6.setBounds(332, 440, 139, 152);
        contentPane.add(l6);


        getContentPane().setBackground(Color.WHITE);
        contentPane.setBackground(Color.WHITE);
    }


    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        if(msg.equals("Đăng xuất")){
            setVisible(false);
            new Login_user().setVisible(true);
        }


        else if(msg.equals("Thông tin sách")){
            setVisible(false);
            new BookDetails().setVisible(true);
        }else if(msg.equals("Thông tin sinh viên")){
            setVisible(false);
            new StudentDetails().setVisible(true);

        }
        if(ae.getSource() == b1){
            this.setVisible(false);
            new AddBook().setVisible(true);
        }
        if(ae.getSource() == b2){
            this.setVisible(false);
            new Statistics().setVisible(true);
        }
        if(ae.getSource() == b3){
            this.setVisible(false);
            new AddStudent().setVisible(true);
        }
        if(ae.getSource() == b4){
            this.setVisible(false);
            new IssueBook().setVisible(true);
        }
        if(ae.getSource() == b5){
            this.setVisible(false);
            new ReturnBook().setVisible(true);

        }


    }
}
