package tugiproged;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class paneeliObjekt {

	
	/*
	 For example, if you want to create an empty array list of Strings then you would do the following:

ArrayList<String> list = new ArrayList<String>();

If you want to create an array list with initial capacity, then you should do the following:

ArrayList<Integer> list = new ArrayList<Integer>(7);
	 */
	
	public static ArrayList<ImageIcon> 	pildilist=new ArrayList<ImageIcon>();
	public static ArrayList<JButton>	nupulist=new ArrayList<JButton>();
	
	
	
public paneeliObjekt(String paneeliLayout, int nrTulbad, int nrRead, String paneeliKomponendid, int nrKomponendid){

	paneeliLayout=paneeliLayout.toUpperCase();

	switch (paneeliLayout){
	case "TABEL":
	{System.out.println("TABEL");break;}
	case "RIDA":
	{System.out.println("RIDA");break;}
	case "TULP":
	{System.out.println("TULP");break;}
	case "ILMAKAARED":
	{System.out.println("ILMAKAARED");break;}
	}
	
}	








	
	
}
