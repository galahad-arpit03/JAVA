
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// import javax.swing.plaf.ColorUIResource;

class Arpit {
        JFrame f;
        JPanel p1, p2, p3, p4, p5;
        JLabel l1, l2, l3, l4, l5;
        JTextField t1, t2, t3, t4;
        JButton b1, b2;
        JTextArea text;

        Arpit() {
                f = new JFrame("New Frame");
                p1 = new JPanel();
                p2 = new JPanel();
                p3 = new JPanel();
                p4 = new JPanel();
                p5 = new JPanel();

                // String name = JOptionPane.showInputDialog("Enter Your Name ");
                // JOptionPane.showMessageDialog(f, "Your name is " + name);

                JTabbedPane tab_p = new JTabbedPane();

                tab_p.addTab("Name", p1);
                tab_p.addTab("Branch", p2);
                tab_p.addTab("Semester", p3);
                tab_p.addTab("Enroll", p4);
                tab_p.addTab("Result", p5);

                l1 = new JLabel("Name");
                l2 = new JLabel("Branch");
                l3 = new JLabel("Semester");
                l4 = new JLabel("Enroll");
                l5 = new JLabel("Result");

                t1 = new JTextField(20);
                t2 = new JTextField(20);
                t3 = new JTextField(20);
                t4 = new JTextField(20);
                text = new JTextArea("", 10, 20);

                p1.setLayout(new GridLayout(1, 2));
                p1.add(l1);
                p1.add(t1);

                p2.setLayout(new GridLayout(1, 2));
                p2.add(l2);
                p2.add(t2);

                p3.setLayout(new GridLayout(1, 2));
                p3.add(l3);
                p3.add(t3);

                p4.setLayout(new GridLayout(1, 2));
                p4.add(l4);
                p4.add(t4);

                p5.setLayout(new GridLayout(1, 2));
                p5.add(l5);
                p5.add(text);

                f.add(tab_p);
                f.setLayout(new FlowLayout());
                f.setSize(500, 500);
                f.setVisible(true);

        }
}

class JFameEx {
        public static void main(String args[]) {
                Arpit g = new Arpit();

        }
}
