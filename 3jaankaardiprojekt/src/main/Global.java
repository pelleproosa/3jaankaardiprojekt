package main;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import tugiproged.*;
public class Global {
	
//Paneelide listid	
	//paneelide vahemikud: 
		//kogumpaneel_1[0-8]
public static ArrayList<paneeliObjekt> paneeliObjektList=new ArrayList<paneeliObjekt>();

//Raamid
public static JFrame raam1=new JFrame();
//Peapaneelid
public static JPanel katseraam1=new JPanel();

//Pildiaadresside list
public static ArrayList<String> pildiAadressideList=new ArrayList<String>();
//Pildikataloogi asukoht
public static String Desktop="D:/temp/kaardid/2/joker/jokerextra.png";	//Desktop
//Lihtsalt yks teine pilt
public static String Desktop1="D:/temp/kaardid/2/h/hA.png";	//Desktop
//pildikataloogi asukoht
public static String pildiKataloogiAsukoht;

//
}