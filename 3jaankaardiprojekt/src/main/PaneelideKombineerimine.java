/**
 * Pelle fail
 */
package main;

import java.awt.BorderLayout;
import tugiproged.paneeliObjekt;

/**
 *
 */
public class PaneelideKombineerimine {

	public static paneeliObjekt paneelRida=new paneeliObjekt("rida",0,0,"","",0);

	
	public void algseadistus(){
	}
	
	
	public static void kogumpaneel_1(){
	
		paneelRida= new	paneeliObjekt("gridbag",0,0,"pilt","rida",2); //tabel=gridlayout, rida ja tulp on boxlayout, ilmakaared=borderlayout
		Global.paneeliObjektList.add(paneelRida);		

		paneelRida= new	paneeliObjekt("gridbag",0,0,"pilt","rida",2); //tabel=gridlayout, rida ja tulp on boxlayout, ilmakaared=borderlayout
		Global.paneeliObjektList.add(paneelRida);
		
		paneelRida= new	paneeliObjekt("gridbag",0,1,"pilt","",3); //tabel=gridlayout, rida ja tulp on boxlayout, ilmakaared=borderlayout
		Global.paneeliObjektList.add(paneelRida);
		
		paneelRida= new	paneeliObjekt("gridbag",0,1,"pilt","",3); //tabel=gridlayout, rida ja tulp on boxlayout, ilmakaared=borderlayout
		Global.paneeliObjektList.add(paneelRida);
		
		
		paneeliObjekt paneelObjekt= new	paneeliObjekt("ilmakaared",1,0,"pilt","",0); //tabel=gridlayout, rida ja tulp on boxlayout, ilmakaared=borderlayout
		Global.paneeliObjektList.add(paneelObjekt);
		Global.paneeliObjektList.get(4).ObjektiPaneel.setBounds(0, 0, 0, 0);
		System.out.println("Viimane liige on nr: "+(Global.paneeliObjektList.size()-1));
		Global.paneeliObjektList.get(4).ObjektiPaneel.add(Global.paneeliObjektList.get(0).ObjektiPaneel,BorderLayout.NORTH);
		Global.paneeliObjektList.get(4).ObjektiPaneel.add(Global.paneeliObjektList.get(1).ObjektiPaneel,BorderLayout.SOUTH);
		Global.paneeliObjektList.get(4).ObjektiPaneel.add(Global.paneeliObjektList.get(2).ObjektiPaneel,BorderLayout.WEST);
		Global.paneeliObjektList.get(4).ObjektiPaneel.add(Global.paneeliObjektList.get(3).ObjektiPaneel,BorderLayout.EAST);
		
		
	}

	
	
}
