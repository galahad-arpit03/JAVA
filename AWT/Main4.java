
import java.awt.*;
import java.awt.event.*;

class myFirstGUI extends WindowAdapter {
        Frame f;
        Panel p;
        Label l1, l2, l3, l4, l5;
        TextField t1, t2, t3, t4, t5;
        Button b1;
        TextArea a;

        myFirstGUI() {
                f = new Frame("LOGIN FORM");
                p = new Panel();
                f.addWindowListener(this);
                // Color c = Color.yellow;
                // f.setBackground(c);
                // a = new TextArea("", 1, 1);

                l1 = new Label("USER NAME");
                l2 = new Label("PASSWORD");
                // l3 = new Label("Branch");
                // l4 = new Label("Sementer");
                // l5 = new Label("Information");

                Button b1 = new Button("LOGIN");

                // TextArea textArea = new TextArea();
                // ScrollPane scroll = new ScrollPane();
                // scroll.add(t5);

                // ScrollPane scrollPane = new ScrollPane();
                // scrollPane.add(t5);

                // add(scrollPane);

                t1 = new TextField(20);
                t2 = new TextField(20);
                // t3 = new TextField(20);
                // t4 = new TextField(20);
                // t5 = new TextField(20);

                p.setLayout(new GridLayout(3, 2));
                p.add(l1);
                p.add(t1);
                p.add(l2);
                p.add(t2);
                // p.add(l3);
                // p.add(t3);
                // p.add(l4);
                // p.add(t4);
                // p.add(l5);
                // p.add(a);

                p.add(b1);

                f.setLayout(new FlowLayout());
                f.add(p);
                f.setSize(500, 500);
                f.setVisible(true);
                // f.add(p);

                // f.setLayout(null);
        }

        public void windowClosing(WindowEvent e) {
                f.dispose();
        }

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

public class Main4 {
        public static void main(String args[]) {
                myFirstGUI g = new myFirstGUI();

        }
}
