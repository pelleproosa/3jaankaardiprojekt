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
		
for(int i=0;i<52;i++){		
System.out.println((i+1)+" "+Global.pildiAadressideList.get(i));
}
System.out.println("V�ikesed on hetkel lisamata... kas teha teine list, et m�lemas sama liige on paar(suur ja v�ike versioon)?");
System.out.println("Pildid v�iks programmi k�ivitumisel m�llu(Listi) lugeda igakordse uuestilugemise asemel?");
System.exit(0);


		Global.pildiAadressideList.add(Global.Kataloog);
		Global.pildiAadressideList.add(Global.Desktop1);
		PaneelideKombineerimine.kogumpaneel_1();
	
		kaardilaud.Main.main(null);
	
	}

}
