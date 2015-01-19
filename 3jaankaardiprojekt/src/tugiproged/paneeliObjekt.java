package tugiproged;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
	private boolean HiireActionJahEi=false;
	
public paneeliObjekt(String Korraldus, String layoutSuund, String paneeliKomponendid,ImageIcon imagesisse, int nrKomponendid, String nurk,boolean hiireactionJahEi){
	HiireActionJahEi=hiireactionJahEi;
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
setKomponendid(korraldus,layoutSuund, paneeliKomponendid,imagesisse, nrKomponendid, nurk);
}else{
	
}

}	

public void setLisaPiltTulpa(ImageIcon uuspilt, int kohtTulbas,String nurk,boolean hiireactionJahEi){
	HiireActionJahEi=hiireactionJahEi;
	image=uuspilt;
	label=rotatePilt(image,nurk);
	if(HiireActionJahEi){hiireaction();}
	if(gBC.gridx<0){gBC.gridx=0;gBCgridx=gBC.gridx;}
	gBC.gridy=lisamiseksvaba();
	System.out.println("lisamiseksvaba: "+lisamiseksvaba()+" / kohttulbas: "+kohtTulbas);
	ObjektiPaneel.add(label,gBC);
	gBCgridy++;
	
}
public void setLisaPiltRitta(ImageIcon uuspilt, int kohtReas,String nurk,boolean hiireactionJahEi){
	HiireActionJahEi=hiireactionJahEi;
	image=uuspilt;
	label=rotatePilt(image,nurk);
	if(HiireActionJahEi){hiireaction();}
	if(gBC.gridy<0){gBC.gridy=0;gBCgridy=gBC.gridy;}
	System.out.println("lisamiseksvaba: "+lisamiseksvaba()+" / kohtreas: "+kohtReas);
	gBC.gridx=lisamiseksvaba();
	
	ObjektiPaneel.add(label,gBC);
	gBCgridx++;
	
}
private int lisamiseksvaba(){
	ArrayList<String>loetelu=getKomponentideLoetelu();
	return (loetelu.size());
}

public void setKustutaKomponentPaneelist(int komponendiNr){
	ObjektiPaneel.remove(komponendiNr);
	if(gBCgridx>0){gBCgridx--;}
	if(gBCgridy>0){gBCgridy--;}
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


public void setKomponendid(String korraldus,String layoutSuund,String paneeliKomponendid, ImageIcon imagesisse, int nrKomponendid,String nurk){
	paneeliKomponendid=paneeliKomponendid.toUpperCase();
	korraldus=korraldus.toUpperCase();
	layoutSuund=layoutSuund.toUpperCase();
	//System.out.println(korraldus+" "+layoutSuund+" "+paneeliKomponendid+" "+paneelPildiAadressNupuNimi+" "+nrKomponendid);
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
								
								image=imagesisse;
								
								

								label=rotatePilt(image,nurk);
								if(HiireActionJahEi){hiireaction();}
								
								
								if(gBC.gridy<0){gBC.gridy=0;}
								gBC.gridx=gBCgridx;
								ObjektiPaneel.add(label,gBC);
								gBCgridx++;
								break;	
							}
							case "TULP":
							{
								//System.out.println("layoutSuund-tulp sees");
								image=imagesisse;
								label=rotatePilt(image,nurk);
								if(HiireActionJahEi){hiireaction();}
								
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
			/*	image=new ImageIcon();
				label=rotatePilt(image,nurk);
				if(HiireActionJahEi){hiireaction();}
				label.setHorizontalAlignment(JLabel.CENTER);
				label.setVerticalAlignment(JLabel.CENTER);
				ObjektiPaneel.add(label);
			*/	
				image=imagesisse;
				label=rotatePilt(image,nurk);
				if(HiireActionJahEi){hiireaction();}
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
		//nupp.setText(paneelPildiAadressNupuNimi);
		ObjektiPaneel.add(nupp);
		//System.out.println("NUPP!");
	}
	
	}
	}	
}else{System.out.println("edasi == false!");}


}
public JLabel rotatePilt(ImageIcon image1, String nurk){
	JLabel pilt=new JLabel();
	
	
	
	switch(nurk)
	{
	case "180":{
	CompoundIcon ci = new CompoundIcon(image1);
	RotatedIcon ri = new RotatedIcon(ci, RotatedIcon.Rotate.UPSIDE_DOWN);
	pilt=new JLabel(ri);
	return pilt;
	}
	case "90":{
		//System.out.println("90");
		CompoundIcon ci = new CompoundIcon(image1);
		RotatedIcon ri = new RotatedIcon(ci, RotatedIcon.Rotate.DOWN);
		pilt=new JLabel(ri);
		return pilt;
		
		}
	case "270":{
		CompoundIcon ci = new CompoundIcon(image1);
		RotatedIcon ri = new RotatedIcon(ci, RotatedIcon.Rotate.UP);
		pilt=new JLabel(ri);
		return pilt;
		}
	case "0":{
		
		pilt=new JLabel(image1);
		return pilt;
		}
	}

	return pilt;
}

private void hiireaction(){
	label.addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent evt) {
			if ((evt.getModifiers() & InputEvent.BUTTON1_MASK) != 0) {
				System.out.println("Left clicked");
			}
/*			
			if ((evt.getModifiers() & InputEvent.BUTTON2_MASK) != 0) {
				System.out.println("Center clicked");
			}
			if ((evt.getModifiers() & InputEvent.BUTTON3_MASK) != 0) {				
				System.out.println("Right clicked");	 
			}
 */
				    }
		public void mouseEntered(MouseEvent e){
			System.out.println("Hiir Saabus");
		}
		public void mouseExited(MouseEvent e){
			System.out.println("Hiir Lahkus");
		}
	});
	
}

}
