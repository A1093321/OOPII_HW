import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

class MyJFrame extends JFrame {
    private JPanel contentPane;

    static int i = 1;

    MyJFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(600,250,700,600);
        setTitle("Picture Browser");
        
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(new GridLayout(2,2,10,10));

        JLabel L1 = new JLabel("PICTURE 1", JLabel.CENTER);
        contentPane.add(L1);

        JLabel L2 = new JLabel(new ImageIcon("1.jpg"));
        contentPane.add(L2);

        JButton B1 = new JButton("Last One");
        B1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                i--;
                File f = new File(i+".jpg");
                if(f.exists()) {
                    L1.setText("PICTURE" + i);
                    L2.setIcon(new ImageIcon(i + ".jpg"));
                }else{
                    JOptionPane.showMessageDialog(null, "cant find it");
                }
            }
        });
        contentPane.add(B1);

        JButton B2 = new JButton("Next One");
        B2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                i++;
                File f = new File(i+".jpg");
                if(f.exists()) {
                    L1.setText("PICTURE" + i);
                    L2.setIcon(new ImageIcon(i + ".jpg"));
                }else{
                    JOptionPane.showMessageDialog(null, "cant find it");
                }
            }
        });
        contentPane.add(B2);

        setVisible(true);
    }
}

public class HW1020{
    public static void main(String[] args) throws Exception{
        MyJFrame MF1 = new MyJFrame();
    }        
}
