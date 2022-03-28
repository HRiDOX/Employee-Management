package Employee;


import java.lang.Thread;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class FrontPage implements ActionListener {

    JFrame f;
    JLabel id, l1;
    JButton b;

    FrontPage() {

        f = new JFrame("Employee management system");
        f.setBackground(Color.red);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Employee/icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);

        l1.setBounds(0, 150, 1360, 530);
        f.add(l1);

        b = new JButton("Click Here to Continue");
        b.setBackground(Color.black);
        b.setForeground(Color.WHITE);
        b.setBounds(500, 600, 300, 70);
        b.addActionListener(this);
        id = new JLabel();
        id.setBounds(0, 0, 1360, 750);
        id.setLayout(null);


        JLabel lid = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        lid.setBounds(80, 30, 1500, 100);
        lid.setFont(new Font("serif", Font.PLAIN, 70));
        lid.setForeground(Color.BLACK);
        id.add(lid);

        id.add(b);
        f.add(id);

        f.getContentPane().setBackground(Color.WHITE);

        f.setVisible(true);
        f.setSize(1360, 750);
        f.setLocation(200, 100);

        while (true) {
            lid.setVisible(false); // lid == jlabel;
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
            lid.setVisible(true);
            try {
                Thread.sleep(500); //500 means 500mlsecond
            } catch (Exception e) {

            }
        }


    }


     @Override
     public  void actionPerformed(ActionEvent e) {
         if(e.getSource()==b){
             f.setVisible(false);
              new LogIn();
         }
     }

     public static void main(String[] args)
     {
         FrontPage f = new FrontPage();
     }
 }