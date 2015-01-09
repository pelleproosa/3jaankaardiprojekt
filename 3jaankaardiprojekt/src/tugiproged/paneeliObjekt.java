package tugiproged;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.Box;
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
//	public Box vertikaalkast =Box.createVerticalBox();
//    public Box horisontaalkast = Box.createHorizontalBox();
	public String korraldus;
	public GridBagConstraints gBC = new GridBagConstraints();
	public int gBCgridx=0;
	public int gBCgridy=0;
	public boolean edasi=false;
	
public paneeliObjekt(String Korraldus, String layoutSuund, String paneeliKomponendid,String paneelPildiAadressNupuNimi, int nrKomponendid){
	layoutSuund=layoutSuund.toUpperCase();
	Korraldus=Korraldus.toUpperCase();
	korraldus=Korraldus;
	switch (korraldus){
		case "ILMAKAARED":
		{
			BorderLayout bl =new BorderLayout(0,0);
			ObjektiPaneel.setLayout(bl);
			edasi=true;
			break;
		}
		case "GRIDBAG":
		{
			ObjektiPaneel.setLayout(new GridBagLayout());
			edasi=true;
			break;
		}

		case "LISA":
		{
			edasi=true;
		}
		
	}
if(edasi){	
setKomponendid(korraldus,layoutSuund, paneeliKomponendid,paneelPildiAadressNupuNimi, nrKomponendid);
}else{
	
}

}	

public void setLisaPiltTulpa(String paneelPildiAadressNupuNimi, int kohtTulbas){
	
	image=new ImageIcon(paneelPildiAadressNupuNimi);
	label=new JLabel(image);
	if(gBC.gridx<0){gBC.gridx=0;gBCgridx=gBC.gridx;}
	gBC.gridy=kohtTulbas;
	ObjektiPaneel.add(label,gBC);
	gBCgridy++;
	
}
public void setLisaPiltRitta(String paneelPildiAadressNupuNimi, int kohtTulbas){
	
	image=new ImageIcon(paneelPildiAadressNupuNimi);
	label=new JLabel(image);
	if(gBC.gridy<0){gBC.gridy=0;gBCgridy=gBC.gridy;}
	gBC.gridx=kohtTulbas;
	ObjektiPaneel.add(label,gBC);
	gBCgridx++;
	
}
public void setKustutaKomponentPaneelist(int komponendiNr){
	ObjektiPaneel.remove(komponendiNr);
	gBCgridx--;
	gBCgridy--;
}
public int getKomponentideArv(){
	return ObjektiPaneel.getComponentCount();
}
public ArrayList<String> getKomponentideLoetelu(){
	ArrayList<String> loetelu=new ArrayList<String>();
	Component[] komponendid= ObjektiPaneel.getComponents();
	for(int i=0; i<komponendid.length;i++){
	loetelu.add(komponendid[i].getClass().getName().toString());
	}
	 
	 return loetelu;
}


public void setKomponendid(String korraldus,String layoutSuund,String paneeliKomponendid, String paneelPildiAadressNupuNimi, int nrKomponendid){
	paneeliKomponendid=paneeliKomponendid.toUpperCase();
	korraldus=korraldus.toUpperCase();
	layoutSuund=layoutSuund.toUpperCase();
	System.out.println(korraldus+" "+layoutSuund+" "+paneeliKomponendid+" "+paneelPildiAadressNupuNimi+" "+nrKomponendid);
	if (korraldus.equalsIgnoreCase("lisa")){edasi=true;}
	if (edasi){
	for(int i=0; i<nrKomponendid; i++)
	{
	switch (paneeliKomponendid){
	case "PILT":
	{		switch (korraldus)
		{
				
				case "GRIDBAG":
					{
						
						switch (layoutSuund)
						{
							case "RIDA":
							{
								
								image=new ImageIcon(paneelPildiAadressNupuNimi);
								label=new JLabel(image);
								if(gBC.gridy<0){gBC.gridy=0;}
								gBC.gridx=gBCgridx;
								ObjektiPaneel.add(label,gBC);
								gBCgridx++;
								break;	
							}
							case "TULP":
							{
								System.out.println("layoutSuund-tulp sees");
								image=new ImageIcon(paneelPildiAadressNupuNimi);
								label=new JLabel(image);
								if(gBC.gridx<0){gBC.gridx=0;}
								gBC.gridy=gBCgridy;
								ObjektiPaneel.add(label,gBC);
								gBCgridy++;
								break;
							}
					
						}
					}
		if((!korraldus.equalsIgnoreCase("gridbag"))&&(!korraldus.equalsIgnoreCase("box"))){
			{
				image=new ImageIcon();
				label=new JLabel(image);
				label.setHorizontalAlignment(JLabel.CENTER);
				label.setVerticalAlignment(JLabel.CENTER);
				ObjektiPaneel.add(label);
				image=new ImageIcon(paneelPildiAadressNupuNimi);
				label=new JLabel(image);
				ObjektiPaneel.add(label);
				break;
				}
		}
		break;
			}
	break;
	}//PILT END
	case "NUPP":
	{
		nupp=new JButton();
		nupp.setText(paneelPildiAadressNupuNimi);
		ObjektiPaneel.add(nupp);
		System.out.println("NUPP!");
	}
	
	}
	}	
}else{System.out.println("edasi == false!");}


}
}
