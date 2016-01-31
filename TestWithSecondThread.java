package ThredsTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by 123 on 24.01.2016.
 */
public class TestWithSecondThread extends JFrame implements ActionListener, Runnable {

    public TestWithSecondThread() {// I woud like to see this String in GITHUB

        GridLayout gridLayout = new GridLayout(2, 1);
        this.getContentPane().setLayout(gridLayout);

        JButton jButton = new JButton("Kill time");
        jButton.addActionListener(this);

        this.getContentPane().add(jButton);
        this.getContentPane().add(new JTextField(10));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Thread thread = new Thread(this);
        thread.start();
    }
    public void run() {
        for (int i = 0; i < 101; i++) {
            this.setTitle("i= " + i);
            try {
                Thread.sleep(999);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main (String[]args){
        TestWithSecondThread testWithSecondThread = new TestWithSecondThread();
        testWithSecondThread.setBounds(0, 0, 250, 100);
        testWithSecondThread.setVisible(true);
    }
}
//добавили имплементс Раннэбл,добавили в акшион Thread thread = new Thread(this); thread.start();
// а в новый метод Ран переместили код из акшион