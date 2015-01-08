package kaardilaud;




import java.awt.*;

import javax.swing.*;

import main.Global;

public class Graafika {
	

    public static void main(String[] args) {

        Global.raam1.setLayout(new BorderLayout(1,1));
        Global.raam1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Global.raam1.setBounds(0, 0, 0, 0);
        Global.raam1.setSize(new Dimension(800, 600));

        System.out.println("Viimane liige Graafikas: "+Global.paneeliObjektList.size());
		Global.raam1.getContentPane().add(Global.paneeliObjektList.get(4).ObjektiPaneel, BorderLayout.CENTER);
   //     Global.raam1.pack();
        Global.raam1.setVisible(true);
    }
}