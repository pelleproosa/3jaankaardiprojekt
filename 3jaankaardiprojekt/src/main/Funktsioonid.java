package main;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import tugiproged.CompoundIcon;
import tugiproged.RotatedIcon;



public class Funktsioonid {
private String sisestatav="";
	public void KaardidListi(){
	
	String mast="";
	String pilt="";
	//numbrite sisestamine + pildid
	for(int i=1; i<4;i++){
		if (i==1){mast="c";}
		if (i==2){mast="d";}
		if (i==3){mast="h";}
		if (i==4){mast="s";}
		
		numbrid(mast);
		pildid(mast);
		
		
	}
	
	}
	private void numbrid(String mast){
		for(int ii=2;ii<11;ii++){
			sisestatav=mast+ii;
			listi(sisestatav);
		}
		
	}
	private void pildid(String mast){
		
		for(int i=1; i<4;i++){
			if (i==1){sisestatav="J";}
			if (i==2){sisestatav="Q";}
			if (i==3){sisestatav="K";}
			if (i==4){sisestatav="A";}
			sisestatav=mast+sisestatav;
			listi(sisestatav);
		}
		
	}
	private void listi(String kaart){
		
		Global.pildiAadressideList.add(kaart);
	}
	
}