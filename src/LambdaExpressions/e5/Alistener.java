package LambdaExpressions.e5;

import javax.swing.*;

public class Alistener extends JFrame {
    public Alistener(){
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton b = new JButton("Ok"); //effectively final!
        //Action listener
        b.addActionListener(e -> b.setText(b.getText()+ " -*"));
        add(b);
        setSize(100,100);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater( () -> new Alistener()); //Runnable
    }
}
