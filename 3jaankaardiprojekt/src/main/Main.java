package main;
public class Main {
	public static void main(String[] args) {

		Funktsioonid.KaardidListi(); // hetkel on aadress puudu
		Funktsioonid.KaardidPildiListi();
/*		
		int kokku=(Global.pildiAadressideList.size());
for(int i=0;i<kokku;i++){		
System.out.println((i+1)+" "+Global.pildiAadressideList.get(i));
}
*/
		PaneelideKombineerimine.algseadistus("bridge",'W',1,Global.piltideList.get(0));
		PaneelideKombineerimine.algseadistus("bridge",'N',1,Global.piltideList.get(1));
		PaneelideKombineerimine.algseadistus("bridge",'E',1,Global.piltideList.get(2));
		PaneelideKombineerimine.algseadistus("bridge",'S',1,Global.piltideList.get(3));
	
		kaardilaud.Main.main(null);
	}
}
