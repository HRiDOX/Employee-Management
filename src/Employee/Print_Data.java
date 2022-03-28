package Employee;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

class Print_Data implements ActionListener {
    JFrame f;
    JLabel id8, id, aid, id1, aid1, id2, aid2, id3, aid3, id4, aid4, id5, aid5, id6, aid6, id7, aid7, id9, id10, aid10, id11, aid11, id12, aid12;
    String emp_id, name, father, address, phone, email, education, post, age, dob, iD;
    JButton b1, b2;
    ImageIcon icon;


    public Print_Data(String e_id) {

        try {
            conn con = new conn();
            String str = "select *from Employees where EMP_ID ='" + e_id + "'";
            ResultSet rs = con.s.executeQuery(str);
            while (rs.next()) {

                name = rs.getString("NAME");
                father = rs.getString("FNAME");
                age = rs.getString("AGE");
                //dob = rs.getString("DOB");
                address = rs.getString("ADDRESS");
                phone = rs.getString("PHONE");
                email = rs.getString("EMAIL");
                education = rs.getString("EDUCATION");
                post = rs.getString("POST");
                iD = rs.getString("ID");
                emp_id = rs.getString("EMP_ID");


            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        f = new JFrame("Print Data");
        f.setVisible(true);
        f.setSize(595, 642);
        f.setLocation(450, 200);
        f.setBackground(Color.white);
        f.setLayout(null);

        id9 = new JLabel();
        id9.setBounds(0, 0, 595, 642);
        id9.setLayout(null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Employee/icons/print.jpg"));
        id9.setIcon(img);

        id8 = new JLabel("Employee Details");
        id8.setBounds(50, 10, 250, 30);
        //f.add(id8);
        id8.setFont(new Font("serif", Font.BOLD, 25));
        id9.add(id8);
        f.add(id9);

        id = new JLabel("Employee ID:");
        id.setBounds(50, 70, 120, 30);
        id.setFont(new Font("serif", Font.BOLD, 20));
        id9.add(id);

        aid = new JLabel(emp_id);
        aid.setBounds(200, 70, 200, 30);
        aid.setFont(new Font("serif", Font.BOLD, 20));
        id9.add(aid);

        id1 = new JLabel("Name:");
        id1.setBounds(50, 120, 100, 30);
        id1.setFont(new Font("serif", Font.BOLD, 20));
        id9.add(id1);

        aid1 = new JLabel(name);
        aid1.setBounds(200, 120, 300, 30);
        aid1.setFont(new Font("serif", Font.BOLD, 20));
        id9.add(aid1);

        id2 = new JLabel("Father's Name:");
        id2.setBounds(50, 170, 200, 30);
        id2.setFont(new Font("serif", Font.BOLD, 20));
        id9.add(id2);

        aid2 = new JLabel(father);
        aid2.setBounds(260, 170, 300, 30);
        aid2.setFont(new Font("serif", Font.BOLD, 20));
        id9.add(aid2);

        id3 = new JLabel("Address:");
        id3.setBounds(50, 220, 100, 30);
        id3.setFont(new Font("serif", Font.BOLD, 20));
        id9.add(id3);

        aid3 = new JLabel(address);
        aid3.setBounds(200, 220, 300, 30);
        aid3.setFont(new Font("serif", Font.BOLD, 20));
        id9.add(aid3);


        id4 = new JLabel("Mobile NO:");
        id4.setBounds(50, 270, 100, 30);
        id4.setFont(new Font("serif", Font.BOLD, 20));
        id9.add(id4);

        aid4 = new JLabel(phone);
        aid4.setBounds(200, 270, 300, 30);
        aid4.setFont(new Font("serif", Font.BOLD, 20));
        id9.add(aid4);

        id5 = new JLabel("Email ID:");
        id5.setBounds(50, 320, 100, 30);
        id5.setFont(new Font("serif", Font.BOLD, 20));
        id9.add(id5);

        aid5 = new JLabel(email);
        aid5.setBounds(200, 320, 300, 30);
        aid5.setFont(new Font("serif", Font.BOLD, 20));
        id9.add(aid5);

        id6 = new JLabel("Education:");
        id6.setBounds(50, 370, 100, 30);
        id6.setFont(new Font("serif", Font.BOLD, 20));
        id9.add(id6);

        aid6 = new JLabel(education);
        aid6.setBounds(200, 370, 300, 30);
        aid6.setFont(new Font("serif", Font.BOLD, 20));
        id9.add(aid6);

        id7 = new JLabel("JoB post:");
        id7.setBounds(50, 420, 100, 30);
        id7.setFont(new Font("serif", Font.BOLD, 20));
        id9.add(id7);

        aid7 = new JLabel(post);
        aid7.setBounds(200, 420, 300, 30);
        aid7.setFont(new Font("serif", Font.BOLD, 20));
        id9.add(id7);

        id10 = new JLabel("IDD:");
        id10.setBounds(50, 470, 100, 30);
        id10.setFont(new Font("serif ", Font.BOLD, 20));
        id9.add(id10);

        aid10 = new JLabel(iD);
        aid10.setBounds(200, 470, 300, 30);
        aid10.setFont(new Font("serif", Font.BOLD, 20));
        id9.add(aid10);

        b1 = new JButton("Print");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(100, 520, 100, 30);
        b1.addActionListener(this);
        id9.add(b1);

        b2 = new JButton("Cancel");
        b2.setForeground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(250, 520, 100, 30);
        b2.addActionListener(this);
        id9.add(b2);


    }


    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {
            JOptionPane.showMessageDialog(null, "Printed Successfully");
            f.setVisible(false);
            details d = new details();
        }
        if (ae.getSource() == b2) {
            f.setVisible(false);
            new View_Employee();
        }

    }

    public static void main(String[] args) {
        new Print_Data("Print Data");
    }
}
