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

	public void algseadistus(){
	}
	
	
	public void kogumpaneel_1(){
		paneeliObjekt paneelObjekt= new	paneeliObjekt("rida",0,0,"","",0); //tabel=gridlayout, rida ja tulp on boxlayout, ilmakaared=borderlayout
		Global.paneeliObjektList.add(paneelObjekt);
		paneelObjekt= new	paneeliObjekt("tulp",0,0,"","",0); //tabel=gridlayout, rida ja tulp on boxlayout, ilmakaared=borderlayout
		Global.paneeliObjektList.add(paneelObjekt);
				paneeliliitmine(0,1);
		paneelObjekt= new	paneeliObjekt("rida",1,0,"","",0); //tabel=gridlayout, rida ja tulp on boxlayout, ilmakaared=borderlayout
		Global.paneeliObjektList.add(paneelObjekt);
		paneelObjekt= new	paneeliObjekt("tulp",1,0,"","",0); //tabel=gridlayout, rida ja tulp on boxlayout, ilmakaared=borderlayout
		Global.paneeliObjektList.add(paneelObjekt);
		paneeliliitmine(2,3);
		paneelObjekt= new	paneeliObjekt("tulp",1,0,"","",0); //tabel=gridlayout, rida ja tulp on boxlayout, ilmakaared=borderlayout
		Global.paneeliObjektList.add(paneelObjekt);
		paneelObjekt= new	paneeliObjekt("rida",1,0,"","",0); //tabel=gridlayout, rida ja tulp on boxlayout, ilmakaared=borderlayout
		Global.paneeliObjektList.add(paneelObjekt);
		paneeliliitmine(4,5);
		paneelObjekt= new	paneeliObjekt("tulp",1,0,"","",0); //tabel=gridlayout, rida ja tulp on boxlayout, ilmakaared=borderlayout
		Global.paneeliObjektList.add(paneelObjekt);
		paneelObjekt= new	paneeliObjekt("rida",1,0,"","",0); //tabel=gridlayout, rida ja tulp on boxlayout, ilmakaared=borderlayout
		Global.paneeliObjektList.add(paneelObjekt);
		paneeliliitmine(6,7);
		
		paneelObjekt= new	paneeliObjekt("ilmakaared",1,0,"","",0); //tabel=gridlayout, rida ja tulp on boxlayout, ilmakaared=borderlayout
		Global.paneeliObjektList.add(paneelObjekt);
		Global.paneeliObjektList.get(8).ObjektiPaneel.add(Global.paneeliObjektList.get(0).ObjektiPaneel,BorderLayout.NORTH);
		Global.paneeliObjektList.get(8).ObjektiPaneel.add(Global.paneeliObjektList.get(2).ObjektiPaneel,BorderLayout.SOUTH);
		Global.paneeliObjektList.get(8).ObjektiPaneel.add(Global.paneeliObjektList.get(4).ObjektiPaneel,BorderLayout.WEST);
		Global.paneeliObjektList.get(8).ObjektiPaneel.add(Global.paneeliObjektList.get(6).ObjektiPaneel,BorderLayout.EAST);
		
		
	}
	void paneeliliitmine(int alus, int lisa){
		Global.paneeliObjektList.get(alus).ObjektiPaneel.add(Global.paneeliObjektList.get(lisa).ObjektiPaneel);
	}
	
	
}
