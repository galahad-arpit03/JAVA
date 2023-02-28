import java.awt.*;
import java.awt.event.*;

class myFirstGUI extends WindowAdapter implements ActionListener {
        Frame f;
        Panel p;
        Label l1, l2, l3, l4, l5;
        TextField t1, t2, t3, t4, t5;
        Button b1;
        TextArea a;

        myFirstGUI() {
                f = new Frame("New Frame");
                p = new Panel();

                f.addWindowListener(this);

                Color c = Color.yellow;
                f.setBackground(c);

                a = new TextArea("", 1, 1);

                l1 = new Label("Enrollment");
                l2 = new Label("Name");
                l3 = new Label("Branch");
                l4 = new Label("Sementer");
                l5 = new Label("Information");

                b1 = new Button("Submit");
                b1.addActionListener(this);

                t1 = new TextField(20);
                t2 = new TextField(20);
                t3 = new TextField(20);
                t4 = new TextField(20);
                t5 = new TextField(20);

                p.setLayout(new GridLayout(6, 2));
                p.add(l1);
                p.add(t1);

                p.add(l2);
                p.add(t2);

                p.add(l3);
                p.add(t3);

                p.add(l4);
                p.add(t4);
                
                p.add(l5);
                p.add(a);

                p.add(b1);

                f.setLayout(new FlowLayout());
                f.add(p);
                f.setSize(500, 500);
                f.setVisible(true);
            
        }

        public void windowClosing(WindowEvent e) {
                f.dispose();
        }

        public void actionPerformed(ActionEvent act) {
                if (act.getSource() == b1) {
                        String e_no = t1.getText();
                        String nm = t2.getText();
                        String br = t3.getText();
                        String sem = t4.getText();
                        String str_out = "Entered Details are : \n";
                        str_out += "Entrollment is " + e_no + "\n";
                        str_out += "Name is  " + nm + "\n";
                        str_out += "Branch is  " + br + "\n";
                        str_out += "Semester is  " + sem + "\n";
                        a.setText(str_out);
                }

        }

}



class MAin3 {
        public static void main(String args[]) {
                myFirstGUI g = new myFirstGUI();

        }
}
