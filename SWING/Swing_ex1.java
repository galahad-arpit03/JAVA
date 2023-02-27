
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// import javax.swing.plaf.ColorUIResource;

class Arpit implements ActionListener {
        JFrame f;
        JPanel p;
        JLabel l1, l2, l3, l4, l5;
        JTextField t1, t2, t3;
        JButton b1, b2;
        JTextArea text;

        Arpit() {
                f = new JFrame("New Frame");
                p = new JPanel();
                // f.addWindowListener(this);

                // JColor c = new JColor(867);
                // f.setBackground(c);
                String name = JOptionPane.showInputDialog("Enter Your Name ");
                JOptionPane.showMessageDialog(f, "Your name is " + name);

                ImageIcon icon1 = new ImageIcon("1.jpg");
                ImageIcon icon2 = new ImageIcon("2.jpg");
                ImageIcon icon3 = new ImageIcon("3.jpg");
                ImageIcon icon4 = new ImageIcon("4.jpg");
                ImageIcon icon5 = new ImageIcon("5.jpg");

                text = new JTextArea(2, 2);
                l1 = new JLabel(icon1);
                l2 = new JLabel(icon2);
                l3 = new JLabel(icon3);
                l4 = new JLabel(icon4);
                l5 = new JLabel("------------------display result_----_________");

                b1 = new JButton(icon5);
                b2 = new JButton("Refresh");
                // Button b3 = new Button("Exit");

                t1 = new JTextField(20);
                t2 = new JTextField(20);
                t3 = new JTextField(20);

                p.setLayout(new GridLayout(6, 2));
                p.add(l1);
                p.add(t1);

                p.add(l2);
                p.add(t2);

                p.add(l3);
                p.add(t3);

                p.add(l4);
                p.add(text);

                p.add(b1);
                p.add(b2);
                // p.add(b3);

                b1.addActionListener(this);
                f.setLayout(new FlowLayout());
                f.add(p);
                f.setSize(500, 500);
                f.setVisible(true);

        }

        // public void windowClosing(WindowEvent e) {
        // f.dispose();
        // }

        public void actionPerformed(ActionEvent act) {
                if (act.getSource() == b1) {
                        double f1 = Double.parseDouble(t1.getText().toString());
                        double f2 = Double.parseDouble(t2.getText().toString());
                        double f3 = Double.parseDouble(t3.getText().toString());
                        double ot = ((f1 + f2 + f3) / 3);
                        text.setText(String.valueOf(ot));
                }

                if (act.getSource() == b2) {

                        t1.setText(" ");
                        t2.setText("");
                        t3.setText("");
                        text.setText("");
                }

        }

}

class Swing_ex1 {
        public static void main(String args[]) {
                Arpit g = new Arpit();

        }
}
