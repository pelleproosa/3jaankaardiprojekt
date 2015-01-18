package main;



public class Funktsioonid {
private static String sisestatav="";
	public static void KaardidListi(){
	
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
			listi(sisestatav);
		}
		
	}
	private static void pildid(String mast){
		
		for(int i=1; i<5;i++){
			if (i==1){sisestatav="J";}
			if (i==2){sisestatav="Q";}
			if (i==3){sisestatav="K";}
			if (i==4){sisestatav="A";}
			sisestatav=mast+sisestatav;
			listi(sisestatav);
		}
		
	}
	private static void jokkerid(){
		
		for(int i=1; i<4;i++){
			if (i==1){sisestatav="jokerb";}
			if (i==2){sisestatav="jokerr";}
			if (i==3){sisestatav="jokerextra";}
			listi(sisestatav);
		}
		
		System.out.println("Funktsioonid jokkerid lisada");
	}
	private static void tagused(){
		System.out.println("Funktsioonid tagused lisada");
	}
	private static void listi(String kaart){
		
		Global.pildiAadressideList.add(Global.Kataloog+kaart+".png");
	}
	
}