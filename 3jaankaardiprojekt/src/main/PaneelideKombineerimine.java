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
	public static paneeliObjekt paneelTulp=new paneeliObjekt("tulp",0,0,"","",0);
	
	public void algseadistus(){
	}
	
	
	public static void kogumpaneel_1(){
		paneelRida= new	paneeliObjekt("rida",0,0,"pilt","",2); //tabel=gridlayout, rida ja tulp on boxlayout, ilmakaared=borderlayout
		Global.paneeliObjektList.add(paneelRida);
		paneelTulp= new	paneeliObjekt("flow",0,0,"","",0); //tabel=gridlayout, rida ja tulp on boxlayout, ilmakaared=borderlayout
		Global.paneeliObjektList.add(paneelTulp);
		paneeliliitmine(1,0);
		paneelRida= new	paneeliObjekt("rida",0,0,"pilt","",2); //tabel=gridlayout, rida ja tulp on boxlayout, ilmakaared=borderlayout
		Global.paneeliObjektList.add(paneelRida);
		paneelTulp= new	paneeliObjekt("tulp",0,0,"","",0); //tabel=gridlayout, rida ja tulp on boxlayout, ilmakaared=borderlayout
		Global.paneeliObjektList.add(paneelTulp);
		paneeliliitmine(3,2);
		paneelRida= new	paneeliObjekt("tulp",0,0,"pilt","",2); //tabel=gridlayout, rida ja tulp on boxlayout, ilmakaared=borderlayout
		Global.paneeliObjektList.add(paneelRida);
		paneelTulp= new	paneeliObjekt("rida",0,0,"","",0); //tabel=gridlayout, rida ja tulp on boxlayout, ilmakaared=borderlayout
		Global.paneeliObjektList.add(paneelTulp);
		paneeliliitmine(5,4);
		paneelRida= new	paneeliObjekt("tulp",0,0,"pilt","",2); //tabel=gridlayout, rida ja tulp on boxlayout, ilmakaared=borderlayout
		Global.paneeliObjektList.add(paneelRida);
		paneelTulp= new	paneeliObjekt("rida",0,0,"","",0); //tabel=gridlayout, rida ja tulp on boxlayout, ilmakaared=borderlayout
		Global.paneeliObjektList.add(paneelTulp);
		paneeliliitmine(7,6);
		
		paneeliObjekt paneelObjekt= new	paneeliObjekt("ilmakaared",1,0,"pilt","",0); //tabel=gridlayout, rida ja tulp on boxlayout, ilmakaared=borderlayout
		Global.paneeliObjektList.add(paneelObjekt);
		Global.paneeliObjektList.get(8).ObjektiPaneel.add(Global.paneeliObjektList.get(0).ObjektiPaneel,BorderLayout.NORTH);
		Global.paneeliObjektList.get(8).ObjektiPaneel.add(Global.paneeliObjektList.get(2).ObjektiPaneel,BorderLayout.SOUTH);
		Global.paneeliObjektList.get(8).ObjektiPaneel.add(Global.paneeliObjektList.get(4).ObjektiPaneel,BorderLayout.WEST);
		Global.paneeliObjektList.get(8).ObjektiPaneel.add(Global.paneeliObjektList.get(6).ObjektiPaneel,BorderLayout.EAST);
		
		
	}
	public static void paneeliliitmine(int alus, int lisa){
		Global.paneeliObjektList.get(alus).ObjektiPaneel.add(Global.paneeliObjektList.get(lisa).ObjektiPaneel);
	}
	
	
}
