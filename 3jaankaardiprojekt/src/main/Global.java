package main;
import java.util.ArrayList;

import javax.swing.ImageIcon;
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
public static int ViimaneSuurKaartListis=0;
public static int ViimanePisikeKaartListis=0;
public static ArrayList<ImageIcon> piltideList=new ArrayList<ImageIcon>();

//Pildikataloogi asukoht
//public static String Kataloog="D:/temp/kaardid/2/joker/jokerextra.png";	//Desktop
public static String Kataloog="D:/temp/kaardid/2/koos/";
//Lihtsalt yks teine pilt
public static String Desktop1="D:/temp/kaardid/2/koos/hA.png";	//Desktop
//pildikataloogi asukoht
public static String pildiKataloogiAsukoht;

//
}