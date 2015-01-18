package main;

import javax.swing.ImageIcon;



public class Funktsioonid {
	
	
	//1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111
	
private static String sisestatav="";
private static String SuurPisike="";

	public static void KaardidListi(){
		SuurPisike="";
		KaardidListi2x();
		Global.ViimaneSuurKaartListis=(Global.pildiAadressideList.size());
		SuurPisike="x";
		KaardidListi2x();
		Global.ViimanePisikeKaartListis=(Global.pildiAadressideList.size());
	}


	private static void KaardidListi2x(){
	
	String mast="";
	String pilt="";
	//numbrite sisestamine + pildid
	for(int i=1; i<5;i++){
		if (i==1){mast="c";}
		if (i==2){mast="d";}
		if (i==3){mast="h";}
		if (i==4){mast="s";}
		
		numbrid(mast);
		pildid(mast);
		
		
		
	}
	jokkerid();
	tagused();
	}
	private static void numbrid(String mast){
		for(int ii=2;ii<11;ii++){
			sisestatav=mast+ii;
			listi(sisestatav+SuurPisike);
		}
		
	}
	private static void pildid(String mast){
		
		for(int i=1; i<5;i++){
			if (i==1){sisestatav="J";}
			if (i==2){sisestatav="Q";}
			if (i==3){sisestatav="K";}
			if (i==4){sisestatav="A";}
			sisestatav=mast+sisestatav;
			listi(sisestatav+SuurPisike);
		}
		
	}
	private static void jokkerid(){
		
		for(int i=1; i<4;i++){
			if (i==2){sisestatav="jokerr";}
			if (i==1){sisestatav="jokerb";}
			if (i==3){sisestatav="jokerextra";}
			listi(sisestatav+SuurPisike);
		}
		
		
	}
	private static void tagused(){
		for(int i=1; i<3;i++){
			if (i==1){sisestatav="punane";}
			if (i==2){sisestatav="sinine";}
			listi(sisestatav+SuurPisike);
		}
		
	}
	private static void listi(String kaart){
		
		Global.pildiAadressideList.add(Global.Kataloog+kaart+".png");
	}
	//22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222
	
	public static void KaardidPildiListi(){
		ImageIcon image=new ImageIcon();
		for(int i=0;i<(Global.pildiAadressideList.size());i++){
			image=new ImageIcon(Global.pildiAadressideList.get(i));
			Global.piltideList.add(image);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}