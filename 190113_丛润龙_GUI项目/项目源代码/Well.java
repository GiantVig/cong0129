package c0113;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Well extends JFrame implements ActionListener{

    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JButton button = new JButton("µÇÂ¼");
    JButton button2 = new JButton("×¢²á");
    Well() {
        this.setSize(300, 300);
        this.setTitle("LOGIN/REGISTER");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con = this.getContentPane();
        con.setBackground(Color.BLUE) ; 
        con.setForeground(Color.RED);
        con.setLayout(new FlowLayout());
        panel.add(button);
        panel.add(button2);
        con.add(panel);
        this.setVisible(true);
        button.addActionListener(this);
        button2.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button)
        {
            new Myframe6();

        }
        else if(e.getSource()==button2)
        {
            new Myframe5();

        }
    }

    public static void main(String arg[]){
        new Well();
}



}