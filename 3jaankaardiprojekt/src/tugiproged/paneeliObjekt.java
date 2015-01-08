package tugiproged;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.Global;

public class paneeliObjekt {


	
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
	
public paneeliObjekt(String paneeliLayout, String layoutSuund, String paneeliKomponendid,String paneelPildiAadressNupuNimi, int nrKomponendid){
	
	paneelilayout=paneeliLayout;
	paneeliLayout=paneeliLayout.toUpperCase();

	switch (paneeliLayout){

	
	
	
	
	
	
	case "ILMAKAARED":
	{
		BorderLayout bl =new BorderLayout(0,0);
		ObjektiPaneel.setLayout(bl);break;
		
	}

	
	case "GRIDBAG":
	{
	ObjektiPaneel.setLayout(new GridBagLayout());
break;
		
	}

	
	}

	
setKomponendid(layoutSuund, paneeliKomponendid,paneelPildiAadressNupuNimi, nrKomponendid);

}	

void setKomponendid(String layoutSuund,String paneeliKomponendid, String paneelPildiAadressNupuNimi, int nrKomponendid){
	paneeliKomponendid=paneeliKomponendid.toUpperCase();
	
	for(int i=0; i<nrKomponendid; i++)
	{System.out.println(" lugeja = "+i);
	   //Statements
	switch (paneeliKomponendid){
	case "PILT":
	{
		if (paneelilayout.equalsIgnoreCase("box")){
		    vertikaalkast.add(Box.createRigidArea(new Dimension(50, 1)));
			image=new ImageIcon();
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
			if(layoutSuund.equalsIgnoreCase("rida")){
				image=new ImageIcon(Global.pildiAadressideList.get(0));
				label=new JLabel(image);
				if(gBC.gridy<0){gBC.gridy=0;}
				gBC.gridx=gBCgridx;
				System.out.println("gridx= "+gBC.gridx+". gridy= "+gBC.gridy);
				ObjektiPaneel.add(label,gBC);
				gBCgridx++;
				break;	
			}
			if(layoutSuund.equalsIgnoreCase("tulp")){
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
				image=new ImageIcon();
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
		break;
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
