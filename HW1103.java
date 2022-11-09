import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class MyJFrameHW extends JFrame {

    private static String S2 = "result";

    MyJFrameHW(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300,150,250,300);
        setTitle("HW1103");
        setLayout(null);
        
        String S = "choose here:";
        JLabel L1 = new JLabel(S);
        L1.setBounds(40,70,100,10);
        add(L1);

        String[] city = {"台北", "新北", "桃園", "台中", "嘉義", "台南", "高雄", "台東"};
        JList<String> Jli = new JList<>(city);
        //Jli.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        JScrollPane SP0 = new JScrollPane(Jli, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS , ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        SP0.setBounds(140,30,50,100);
        add(SP0);

        JTextArea TA = new JTextArea(S2);
        TA.setLineWrap(true);
        JScrollPane SP1 = new JScrollPane(TA, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS , ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        SP1.setBounds(40,150,150,80);
        add(SP1);

        Jli.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                S2 = "你選了 "+ Jli.getSelectedValue() + "\n";
                TA.setText(S2);

            }
        });

        setVisible(true);
    }
    /* 
    public void actionPerformed(ActionEvent e){
        String lbShow = "";
    
        if(!C1.isSelected()&&!C2.isSelected()&&!C3.isSelected()){
            lbShow += "what do you like?";
        }else{
            String interest = "";
            if(C1.isSelected()){
                interest += "eat ";
            }
            if(C2.isSelected()){
                interest += "sleep ";
            }
            if(C3.isSelected()){
                interest += "play ";
            }
            lbShow += "you like to " + interest;
        }
        L1.setText(lbShow);
    }*/
}

public class HW1103{
    public static void main(String[] args) throws Exception{
        
        MyJFrameHW HW_1103 = new MyJFrameHW();

    }        
}
