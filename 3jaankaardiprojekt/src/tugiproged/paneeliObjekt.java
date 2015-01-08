package tugiproged;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.Global;

public class paneeliObjekt {

	
	/*
	 For example, if you want to create an empty array list of Strings then you would do the following:

ArrayList<String> list = new ArrayList<String>();

If you want to create an array list with initial capacity, then you should do the following:

ArrayList<Integer> list = new ArrayList<Integer>(7);
	 */
	
	public  ArrayList<ImageIcon> 	pildilist=new ArrayList<ImageIcon>();
	public  ArrayList<JButton>	nupulist=new ArrayList<JButton>();
	public  JPanel ObjektiPaneel=new JPanel();
	public  ImageIcon image=new ImageIcon();
	public  JLabel label=new JLabel();
	public  JButton nupp=new JButton();
	public 	GridBagConstraints gbc = new GridBagConstraints();
	public Box vertikaalkast =Box.createVerticalBox();
    public Box horisontaalkast = Box.createHorizontalBox();
	public String paneelilayout;
	public GridBagConstraints gBC = new GridBagConstraints();
	public int gBCgridx=0;
	public int gBCgridy=0;
	
public paneeliObjekt(String paneeliLayout, int GridTulbad, int GridRead, String paneeliKomponendid,String paneelPildiAadressNupuNimi, int nrKomponendid){
	
	paneelilayout=paneeliLayout;
	paneeliLayout=paneeliLayout.toUpperCase();

	switch (paneeliLayout){

	case "TABEL":
	{
		GridLayout gl=new GridLayout(GridTulbad,GridRead);
		ObjektiPaneel.setLayout(gl);
		ObjektiPaneel.setBounds(0, 0, 0, 0);break;
	}
	
	case "RIDA":
	{
		ObjektiPaneel.setLayout(new BoxLayout(ObjektiPaneel,BoxLayout.X_AXIS));break;
		
	}
	
	case "TULP":
	{
		ObjektiPaneel.setLayout(new BoxLayout(ObjektiPaneel,BoxLayout.Y_AXIS));;break;
		
	}
	
	case "ILMAKAARED":
	{
		BorderLayout bl =new BorderLayout(0,0);
		ObjektiPaneel.setLayout(bl);break;
		
	}

	case "FLOW":
	{
		FlowLayout fl=new FlowLayout();
		ObjektiPaneel.setLayout(fl);break;
		
	}
	case "GRIDBAG":
	{
	ObjektiPaneel.setLayout(new GridBagLayout());
break;
		
	}

	case "BOX":
	{
	ObjektiPaneel.setLayout(new BoxLayout(ObjektiPaneel, BoxLayout.Y_AXIS));break;
	}
	}

	
setKomponendid(paneeliKomponendid,paneelPildiAadressNupuNimi, nrKomponendid);

}	

void setKomponendid(String paneeliKomponendid, String paneelPildiAadressNupuNimi, int nrKomponendid){
	paneeliKomponendid=paneeliKomponendid.toUpperCase();
	
	for(int i=0; i<nrKomponendid; i++)
	{System.out.println(" lugeja = "+i);
	   //Statements
	switch (paneeliKomponendid){
	case "PILT":
	{
		if (paneelilayout.equalsIgnoreCase("box")){
		    vertikaalkast.add(Box.createRigidArea(new Dimension(50, 1)));
			image=new ImageIcon(paneelPildiAadressNupuNimi);
			label=new JLabel(image);
			ObjektiPaneel.add(label);
			image=new ImageIcon(Global.pildiAadressideList.get(0));
			label=new JLabel(image);
			vertikaalkast.add(label);
			vertikaalkast.add(Box.createHorizontalGlue());
		    horisontaalkast.add(Box.createHorizontalGlue());
		    horisontaalkast.add(vertikaalkast);
		    horisontaalkast.add(Box.createHorizontalGlue());
			ObjektiPaneel.add(horisontaalkast);
			break;
		}
		if(paneelilayout.equalsIgnoreCase("gridbag")){
			System.out.println("gridbag lugeja = "+i);
			if(paneelPildiAadressNupuNimi.equalsIgnoreCase("rida")){
				image=new ImageIcon(Global.pildiAadressideList.get(0));
				label=new JLabel(image);
				if(gBC.gridy<0){gBC.gridy=0;}
				gBC.gridx=gBCgridx;
				System.out.println("gridx= "+gBC.gridx+". gridy= "+gBC.gridy);
				ObjektiPaneel.add(label,gBC);
				gBCgridx++;
				break;	
			}else{
			image=new ImageIcon(Global.pildiAadressideList.get(0));
			label=new JLabel(image);
			if(gBC.gridx<0){gBC.gridx=0;}
			gBC.gridy=gBCgridy;
			System.out.println("gridx= "+gBC.gridx+". gridy= "+gBC.gridy);
			ObjektiPaneel.add(label,gBC);
			gBCgridy++;
			break;
			}
			
		}
		if((!paneelilayout.equalsIgnoreCase("gridbag"))&&(!paneelilayout.equalsIgnoreCase("box"))){
			{
				image=new ImageIcon(paneelPildiAadressNupuNimi);
				label=new JLabel(image);
				label.setHorizontalAlignment(JLabel.CENTER);
				label.setVerticalAlignment(JLabel.CENTER);
				ObjektiPaneel.add(label);
				image=new ImageIcon(Global.pildiAadressideList.get(0));
				label=new JLabel(image);
				ObjektiPaneel.add(label);
				System.out.println("PILT ELSE");
				break;
				}
		}
	}
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
