package kaardilaud;




import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import tugiproged.paneeliObjekt;
import main.Global;

public class Graafika {
	

    public static void main(String[] args) {
    	/*
        String[] labels = {
                "Found better price",
                "Not as shown on website",
                "Wrong product",
                "Damaged upon delivery",
                "None of the above"
        };
        
        */
          JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       
      /*   final JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        for (String s: labels) {
            panel.add(new JLabel(s));
            
        }
       */    
        paneeliObjekt paneelRida= new	paneeliObjekt("rida",0,0,"pilt","",5); //tabel=gridlayout, rida ja tulp on boxlayout, ilmakaared=borderlayout
		Global.paneeliObjektList.add(paneelRida);
		paneeliObjekt paneelTulp= new	paneeliObjekt("tulp",0,0,"","",0); //tabel=gridlayout, rida ja tulp on boxlayout, ilmakaared=borderlayout
		Global.paneeliObjektList.add(paneelTulp);
		
		//Global.paneeliObjektList.get(1).ObjektiPaneel.add(Global.paneeliObjektList.get(0).ObjektiPaneel);
		
       // frame.getContentPane().add(Global.paneeliObjektList.get(1).ObjektiPaneel);
		JPanel vahepaneel=new JPanel ();
		vahepaneel=Global.paneeliObjektList.get(0).ObjektiPaneel;
		Global.paneeliObjektList.get(1).ObjektiPaneel.add(vahepaneel);
	    frame.setSize(2, 2);
	    frame.setLocation(300,300);
		frame.getContentPane().add(BorderLayout.CENTER,Global.paneeliObjektList.get(1).ObjektiPaneel);
	//	Global.paneeliObjektList.get(0).ObjektiPaneel.add(new JLabel(new ImageIcon(Global.pildiAadressideList.get(0))));
		
        /*
        frame.add(panel);
        
        JButton button = new JButton("Select");
        button.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                if (panel.getComponentCount() > 0)
                    panel.remove(0);
                frame.repaint();
            }
        });
        frame.add(button, BorderLayout.NORTH);
         */
        frame.pack();
        frame.setVisible(true);
    }
}