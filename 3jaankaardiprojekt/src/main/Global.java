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
public static int MaxKaartidearvPlayeril=0;
public static int MaxKaartidearvPakis=0;
//Kaartide arv
public static int PotikasMaxKaartePakis=36;
public static int PotikasMaxKaartePlayeril=36;
public static int BridgeMaxKaartePakis=52;
public static int BridgeMaxKaartePlayeril=13;
public static int kaarteWestil;
public static int kaarteNordil;
public static int kaarteEastil;
public static int kaarteSouthil;
//Pildikataloogi asukoht
public static String Kataloog="D:/temp/kaardid/2/koos/";
//pildikataloogi asukoht
//public static String pildiKataloogiAsukoht;
//Valitud m�nguga seonduv
public static String valitudM2ng;

//
}