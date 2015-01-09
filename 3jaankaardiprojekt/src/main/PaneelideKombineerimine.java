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

	public static paneeliObjekt paneelRida=new paneeliObjekt("rida","","",Global.pildiAadressideList.get(0),0);

	
	public void algseadistus(){
	}
	
	
	public static void kogumpaneel_1(){
	
		
		
		paneelRida= new	paneeliObjekt("gridbag","rida","pilt",Global.pildiAadressideList.get(0),2); //tabel=gridlayout, rida ja tulp on boxlayout, ilmakaared=borderlayout
		Global.paneeliObjektList.add(paneelRida);		

		paneelRida= new	paneeliObjekt("gridbag","rida","pilt",Global.pildiAadressideList.get(0),2); //tabel=gridlayout, rida ja tulp on boxlayout, ilmakaared=borderlayout
		Global.paneeliObjektList.add(paneelRida);
		
		
		paneelRida= new	paneeliObjekt("gridbag","tulp","pilt",Global.pildiAadressideList.get(0),1); //tabel=gridlayout, rida ja tulp on boxlayout, ilmakaared=borderlayout
		Global.paneeliObjektList.add(paneelRida);
//siin käib töö


		Global.paneeliObjektList.get(1).setLisaPiltRitta(Global.pildiAadressideList.get(1), 2);
		Global.paneeliObjektList.get(1).setLisaPiltRitta(Global.pildiAadressideList.get(0), 3);

		
		
		
		Global.paneeliObjektList.get(2).setLisaPiltTulpa(Global.pildiAadressideList.get(1),1);
		Global.paneeliObjektList.get(2).setLisaPiltTulpa(Global.pildiAadressideList.get(0),2);




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
		Global.paneeliObjektList.get(2).setLisaPiltTulpa(Global.pildiAadressideList.get(0),1);
		
		
//siin käib töö		
		paneelRida= new	paneeliObjekt("gridbag","tulp","pilt",Global.pildiAadressideList.get(1),3); //tabel=gridlayout, rida ja tulp on boxlayout, ilmakaared=borderlayout
		Global.paneeliObjektList.add(paneelRida);
		
		
		paneeliObjekt paneelObjekt= new	paneeliObjekt("ilmakaared","","pilt","",0); //tabel=gridlayout, rida ja tulp on boxlayout, ilmakaared=borderlayout
		Global.paneeliObjektList.add(paneelObjekt);
		Global.paneeliObjektList.get(4).ObjektiPaneel.setBounds(0, 0, 0, 0);

		Global.paneeliObjektList.get(4).ObjektiPaneel.add(Global.paneeliObjektList.get(0).ObjektiPaneel,BorderLayout.NORTH);
		Global.paneeliObjektList.get(4).ObjektiPaneel.add(Global.paneeliObjektList.get(1).ObjektiPaneel,BorderLayout.SOUTH);
		Global.paneeliObjektList.get(4).ObjektiPaneel.add(Global.paneeliObjektList.get(2).ObjektiPaneel,BorderLayout.WEST);
		Global.paneeliObjektList.get(4).ObjektiPaneel.add(Global.paneeliObjektList.get(3).ObjektiPaneel,BorderLayout.EAST);
		
		
	}

	
	
}
