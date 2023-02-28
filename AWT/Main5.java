import java.awt.*;
import java.awt.event.*;

class myFirstGUI extends Frame {
        Frame f;
        Panel p;
        Label l1, l2, l3, l4, l5;
        TextField t1, t2, t3;
        Button b1, b2, b3;

        myFirstGUI() {
                f = new Frame("New Frame");
                p = new Panel();

                f.add(p);

                l1 = new Label("Enter 1st Number");
                l2 = new Label("Enter 2st Number");
                l3 = new Label("Enter 3st Number");
                l4 = new Label("----------Average----------");
                l4 = new Label("-----Display Result Here-----");

                Button b1 = new Button("Compute");
                Button b2 = new Button("Refresh");
                Button b3 = new Button("Exit");

                t1 = new TextField(20);
                t2 = new TextField(20);
                t3 = new TextField(20);

                p.setLayout(new GridLayout(6, 2));
                p.add(l1);
                p.add(t1);
                p.add(l2);
                p.add(t2);
                p.add(l3);
                p.add(t3);

                f.setLayout(new FlowLayout());
                f.add(p);
                f.setSize(500, 500);
                f.setVisible(true);

                // Color c = Color.yellow;
                // f.setBackground(c);

                // f.setLayout(null);
        }

        // public void windowClosing(WindowEvent e) {
        // f.dispose();
        // }

}

// class WindowListner extends myFirstGUI{
// Frame f;

// void WindowListener() {
// f.addWindowListener(this);
// }

// public void windowClosing(WindowEvent e) {
// f.dispose();
// }
// }

class Main5 {
        public static void main(String args[]) {
                myFirstGUI g = new myFirstGUI();

        }
}
