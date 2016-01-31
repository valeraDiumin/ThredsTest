package ThredsTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by 123 on 24.01.2016.
 */
public class TestWithoutSecondThread extends JFrame implements ActionListener{

    public TestWithoutSecondThread() {

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

        for (int i = 0; i < 100_001; i++) {
            this.setTitle("i= " + i);
        }
    }
    public static void main(String[] args) {
        TestWithoutSecondThread testWithout = new TestWithoutSecondThread();
        testWithout.setBounds(10, 10, 250, 100);
        testWithout.setVisible(true);
    }
}