package main;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		Funktsioonid.KaardidListi(); 
		Funktsioonid.KaardidPildiListi();
		
		int kokku=(Global.pildiAadressideList.size());
for(int i=0;i<kokku;i++){		
System.out.println((i+1)+" "+Global.pildiAadressideList.get(i));
}

		Global.valitudM2ng="bridge";

			for(int i=1;i<13;i++) //12 korda
			{
			PaneelideKombineerimine.algseadistus('W', 112);
			PaneelideKombineerimine.algseadistus('N', 112);
			PaneelideKombineerimine.algseadistus('E', 112);
			PaneelideKombineerimine.algseadistus('S', 112);
			}
			PaneelideKombineerimine.algseadistus('W', 55);
			PaneelideKombineerimine.algseadistus('N', 55);
			PaneelideKombineerimine.algseadistus('E', 55);
			PaneelideKombineerimine.algseadistus('S', 55);
		
			System.out.println("kaartide ülekirjutamine ja kustutamine üle vaadata!");

			/*

		ArrayList<String>loetelu=Global.paneeliObjektList.get(2).getKomponentideLoetelu();
		for (int i=0;i<loetelu.size();i++){
			System.out.println((i+1)+" / "+loetelu.size());
			System.out.println(loetelu.get(i));
		}
	//	System.exit(0);
		
 */	
		
		kaardilaud.Main.main(null);
	}
}
