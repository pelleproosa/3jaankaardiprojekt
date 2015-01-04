package tugiproged;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class paneeliObjekt {

	
	/*
	 For example, if you want to create an empty array list of Strings then you would do the following:

ArrayList<String> list = new ArrayList<String>();

If you want to create an array list with initial capacity, then you should do the following:

ArrayList<Integer> list = new ArrayList<Integer>(7);
	 */
	
	public static ArrayList<ImageIcon> 	pildilist=new ArrayList<ImageIcon>();
	public static ArrayList<JButton>	nupulist=new ArrayList<JButton>();
	JPanel ObjektiPaneel=new JPanel();
	ImageIcon image=new ImageIcon();
	JLabel label=new JLabel();
	JButton nupp=new JButton();
	
public paneeliObjekt(String paneeliLayout, int GridTulbad, int GridRead, String paneeliKomponendid,String paneelPildiAadressNupuNimi, int nrKomponendid){
	
	
	paneeliLayout=paneeliLayout.toUpperCase();

	switch (paneeliLayout){
	case "TABEL":
	{
		GridLayout gl=new GridLayout(GridTulbad,GridRead);
		ObjektiPaneel.setLayout(gl);
		
		System.out.println("TABEL");break;}
	case "RIDA":
	{
		ObjektiPaneel.setLayout(new BoxLayout(ObjektiPaneel,BoxLayout.X_AXIS));
		System.out.println("RIDA");break;}
	case "TULP":
	{
		ObjektiPaneel.setLayout(new BoxLayout(ObjektiPaneel,BoxLayout.Y_AXIS));
		System.out.println("TULP");break;}
	case "ILMAKAARED":
	{
		BorderLayout bl =new BorderLayout();
		ObjektiPaneel.setLayout(bl);
		System.out.println("ILMAKAARED");break;}
	}
	
setKomponendid(paneeliKomponendid,paneelPildiAadressNupuNimi, nrKomponendid);

}	

void setKomponendid(String paneeliKomponendid, String paneelPildiAadressNupuNimi, int nrKomponendid){
	paneeliKomponendid=paneeliKomponendid.toUpperCase();
	
	for(int i=0; i<nrKomponendid; i++)
	{
	   //Statements
	switch (paneeliKomponendid){
	case "PILT":
	{
		image=new ImageIcon(paneelPildiAadressNupuNimi);
		label=new JLabel(image);
		ObjektiPaneel.add(label);
		System.out.println("PILT");break;}
	case "NUPP":
	{
		nupp=new JButton();
		nupp.setText(paneelPildiAadressNupuNimi);
		ObjektiPaneel.add(nupp);
		System.out.println("NUPP");break;}
	
	}
	}	
}






	
	
}
