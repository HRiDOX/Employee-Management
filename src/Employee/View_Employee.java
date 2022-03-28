package Employee;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class View_Employee implements ActionListener {
    JFrame f;
    JTextField t;
    JLabel l1, l2;
    JButton b, b2;


    View_Employee() {
        f = new JFrame("View");
        f.setBackground(Color.green);
        f.setLayout(null);

        l1 = new JLabel();
        l1.setBounds(0, 0, 500, 270);
        l1.setLayout(null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Employee/icons/view.jpg"));
        l1.setIcon(img);


        l2 = new JLabel("Employee Id");
        l2.setVisible(true);
        l2.setBounds(40, 60, 250, 30);
        l2.setForeground(Color.white);
        l2.setFont(new Font("serif", Font.BOLD, 30));
        l1.add(l2);
        f.add(l1);

        t = new JTextField();
        t.setBounds(240, 60, 220, 30);
        l1.add(t);

        b = new JButton("Search");
        b.setBounds(240, 150, 100, 30);
        b.addActionListener(this);
        l1.add(b);

        b2 = new JButton("Cancel");
        b2.setBounds(360, 150, 100, 30);
        b2.addActionListener(this);
        l1.add(b2);

        f.setSize(500, 270);
        f.setLocation(450, 250);
        f.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b2) {
            f.setVisible(false);
            details d = new details();
        }
        if (e.getSource() == b) {
            f.setVisible(false);
            Print_Data p = new Print_Data(t.getText());

        }
    }

    public static void main(String[] args) {
        View_Employee v = new View_Employee();
    }


}

