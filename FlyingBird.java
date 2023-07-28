import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FlyingBird extends JFrame implements ActionListener,ItemListener,Runnable {
    Container cp;
    JPanel panel;
    JButton b1, b2, b3;
    JLabel label,image;
    JScrollPane sp;
    JComboBox comboBox;
    Thread thread;
    int sleep;

    FlyingBird() {
        cp = getContentPane();
        thread = new Thread(this);
        panel = new JPanel();

        b1 = new JButton("Start");
        b2 = new JButton("Pause");
        b3 = new JButton("Un Pause");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        String timeSleep[] = {"50","100","150","200","250","300"};
        comboBox = new JComboBox(timeSleep);
        comboBox.addItemListener(this);

        image = new JLabel();
        label = new JLabel("Sleep Time");
        sp = new JScrollPane(image);

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(label);
        panel.add(comboBox);

        cp.add(panel, "North");
        cp.add(sp);

        setTitle("Animation");
        setSize(380,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void run() {
        while(true) {
            for (int i=1; i<=4; i++) {
                image.setIcon(new ImageIcon("b"+i+".jpg"));
                try {
                    Thread.sleep(sleep);
                }
                catch(InterruptedException e) {
                    System.out.println("Interrupted");
                }
            }
        }
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource().equals(b1)) thread.start();
        if(ae.getSource().equals(b2)) thread.suspend();
        if(ae.getSource().equals(b3)) thread.resume();
    }

    public void itemStateChanged(ItemEvent ae) {
       sleep = Integer.parseInt(comboBox.getSelectedItem().toString());
    }

    public static void main (String[] args) {
       new FlyingBird();
    }
}
