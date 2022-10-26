import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyJFrame extends JFrame{
    private JPanel contentPane;

    MyJFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(750,300,350,500);
        setTitle("J Calculator");

        contentPane = new JPanel();
        contentPane.setLayout(new GridLayout(5,4,5,5));
        setContentPane(contentPane);

        JTextField T1 = new JTextField(29);
        contentPane.add(T1);

        JButton B1 = new JButton("1");
        B1.setBounds(100,20,100,50);
        B1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, B1.getText());
            }
        });
        contentPane.add(B1);

        JButton B2 = new JButton("2");
        B2.setBounds(100,200,100,100);
        B2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, B2.getText());
            }
        });
        contentPane.add(B2);

        JButton B3 = new JButton("3");
        B3.setBounds(100,200,100,100);
        B3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, B3.getText());
            }
        });
        contentPane.add(B3);

        JButton B4 = new JButton("4");
        B4.setBounds(100,200,100,100);
        B4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, B4.getText());
            }
        });
        contentPane.add(B4);

        JButton B5 = new JButton("5");
        B5.setBounds(100,200,100,100);
        B5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, B5.getText());
            }
        });
        contentPane.add(B5);

        JButton B6 = new JButton("6");
        B6.setBounds(100,200,100,100);
        B6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, B6.getText());
            }
        });
        contentPane.add(B6);

        JButton B7 = new JButton("7");
        B7.setBounds(100,200,100,100);
        B7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, B7.getText());
            }
        });
        contentPane.add(B7);

        JButton B8 = new JButton("8");
        B8.setBounds(100,200,100,100);
        B8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, B8.getText());
            }
        });
        contentPane.add(B8);

        JButton B9 = new JButton("9");
        B9.setBounds(100,200,100,100);
        B9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, B9.getText());
            }
        });
        contentPane.add(B9);

        JButton B10 = new JButton("+");
        B10.setBounds(100,200,100,100);
        B10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, B10.getText());
            }
        });
        contentPane.add(B10);

        JButton B11 = new JButton("-");
        B11.setBounds(100,200,100,100);
        B11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, B11.getText());
            }
        });
        contentPane.add(B11);

        JButton B12 = new JButton("=");
        B12.setBounds(100,200,100,100);
        B12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, B12.getText());
            }
        });
        contentPane.add(B12);

        setVisible(true);
    }    
}

public class HW1013{
    public static void main(String[] args) throws Exception{
        
        MyJFrame MF1 = new MyJFrame();

    }        
}
