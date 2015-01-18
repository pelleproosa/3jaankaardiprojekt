/**
 * Pelle fail
 */
package main;

import java.awt.BorderLayout;
import java.awt.Component;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import tugiproged.paneeliObjekt;

/**
 *
 */
public class PaneelideKombineerimine {

	// 
	public static paneeliObjekt paneelRida=new paneeliObjekt("rida","","",Global.piltideList.get(0),0,"0");

	
	public static void algseadistus(String valik){
		valik=valik.toUpperCase();
		switch (valik){
		case"BRIDGE":{
			Bridge();
			break;
		}
		}
		
		
	}
	
	
	private static void Bridge(){
	
		
		//public static paneeliObjekt paneelRida=new paneeliObjekt("gridbag","rida","","",Global.pildiAadressideList.get(0),0,"90");
		paneelRida= new	paneeliObjekt("gridbag","rida","pilt",Global.piltideList.get(112),12,"0"); //tabel=gridlayout, rida ja tulp on boxlayout, ilmakaared=borderlayout
		paneelRida.setLisaPiltRitta((Global.piltideList.get(55)), 13, "0");
		Global.paneeliObjektList.add(paneelRida);		
		
			

		paneelRida= new	paneeliObjekt("gridbag","rida","pilt",Global.piltideList.get(112),12,"0"); //tabel=gridlayout, rida ja tulp on boxlayout, ilmakaared=borderlayout
		paneelRida.setLisaPiltRitta((Global.piltideList.get(55)), 13, "0");
		Global.paneeliObjektList.add(paneelRida);
		
		
		paneelRida= new	paneeliObjekt("gridbag","tulp","pilt",Global.piltideList.get(112),12,"90"); //tabel=gridlayout, rida ja tulp on boxlayout, ilmakaared=borderlayout
		paneelRida.setLisaPiltTulpa((Global.piltideList.get(55)), 13, "90");
		Global.paneeliObjektList.add(paneelRida);
//siin käib töö
/*
		Global.paneeliObjektList.get(1).setLisaPiltRitta(Global.piltideList.get(1), 2,"0");
		Global.paneeliObjektList.get(1).setLisaPiltRitta(Global.piltideList.get(0), 3,"0");

		
		
		
		Global.paneeliObjektList.get(2).setLisaPiltTulpa(Global.piltideList.get(1),1,"0");
		Global.paneeliObjektList.get(2).setLisaPiltTulpa(Global.piltideList.get(0),2,"0");




		Global.paneeliObjektList.get(2).setKustutaKomponentPaneelist(2);
		try{		
			Component comp = Global.paneeliObjektList.get(2).ObjektiPaneel.getComponent(1);
			if (comp==null){System.out.println("tühi!");}else{System.out.println("täis!");}
		}catch(Exception ex){System.out.println("error");}
		//pisut nipsakas värk... aga kuidagi toimib
 

		
		ArrayList<String>loetelu=Global.paneeliObjektList.get(2).getKomponentideLoetelu();
		for (int i=0;i<loetelu.size();i++){
			System.out.println(loetelu.size());
			System.out.println(loetelu.get(i));
		}
		Global.paneeliObjektList.get(2).setKustutaKomponentPaneelist(1);
		Global.paneeliObjektList.get(2).setLisaPiltTulpa(Global.piltideList.get(0),1,"270");
*/		
		
//siin käib töö		
		paneelRida= new	paneeliObjekt("gridbag","tulp","pilt",Global.piltideList.get(112),12,"90"); //tabel=gridlayout, rida ja tulp on boxlayout, ilmakaared=borderlayout
		paneelRida.setLisaPiltTulpa((Global.piltideList.get(55)), 13, "90");
		Global.paneeliObjektList.add(paneelRida);
		
		
		paneeliObjekt paneelObjekt= new	paneeliObjekt("ilmakaared","","pilt",null,0,"0"); //tabel=gridlayout, rida ja tulp on boxlayout, ilmakaared=borderlayout
		Global.paneeliObjektList.add(paneelObjekt);
		Global.paneeliObjektList.get(4).ObjektiPaneel.setBounds(0, 0, 0, 0);

		Global.paneeliObjektList.get(4).ObjektiPaneel.add(Global.paneeliObjektList.get(0).ObjektiPaneel,BorderLayout.NORTH);
		Global.paneeliObjektList.get(4).ObjektiPaneel.add(Global.paneeliObjektList.get(1).ObjektiPaneel,BorderLayout.SOUTH);
		Global.paneeliObjektList.get(4).ObjektiPaneel.add(Global.paneeliObjektList.get(2).ObjektiPaneel,BorderLayout.WEST);
		Global.paneeliObjektList.get(4).ObjektiPaneel.add(Global.paneeliObjektList.get(3).ObjektiPaneel,BorderLayout.EAST);
		
		
	}

	
	
}
