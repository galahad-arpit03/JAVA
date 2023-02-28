import java.awt.*;
import java.awt.event.*;

class myFirstGUI extends WindowAdapter {
        Frame f;

        myFirstGUI() {
                f = new Frame("New Frame");
                f.setVisible(true);
                f.addWindowListener(this);

                f.setSize(500, 500);
                Button b1 = new Button("Contact");
                Button b2 = new Button("MENU");

                f.add(b1);
                b1.setBounds(100, 0, 100, 100);
                f.add(b2);
                b2.setBounds(200, 00, 100, 100);

                f.setLayout(null);
                f.setLayout(null);

                Color c = Color.yellow;
                f.setBackground(c);

        }

        public void windowClosing(WindowEvent e) {
                f.dispose();
        }

}

class Main {
        public static void main(String args[]) {
                myFirstGUI g = new myFirstGUI();

        }
}
