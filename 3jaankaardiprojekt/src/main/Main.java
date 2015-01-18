/**
 * Pelle fail
 */
package main;
/**
 *
 */
public class Main {

	/**
	 * Pelle meetod
	 * @param args 
	 */
	public static void main(String[] args) {

		Funktsioonid.KaardidListi(); // hetkel on aadress puudu
		Funktsioonid.KaardidPildiListi();
		
/*		
		int kokku=(Global.pildiAadressideList.size());
for(int i=0;i<kokku;i++){		
System.out.println((i+1)+" "+Global.pildiAadressideList.get(i));
}

*/

		PaneelideKombineerimine.algseadistus("bridge",1,1,Global.piltideList.get(1));
	
		kaardilaud.Main.main(null);
	
	}

}
