package main;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import tugiproged.CompoundIcon;
import tugiproged.RotatedIcon;



public class Funktsioonid {

	public JLabel RotateImage(ImageIcon piltImage,int NurkKraadides){
		
	/*
		ImageIcon ii = new ImageIcon(...);
		JButton nupp=new JButton();
		TextIcon ti = new TextIcon(nupp,"Upside Down");
		CompoundIcon ci = new CompoundIcon(ii, ti);
		RotatedIcon ri = new RotatedIcon(ci, RotatedIcon.Rotate.UPSIDE_DOWN);
		JLabel pilt=new JLabel(ri);
		 
 */	
		

		CompoundIcon ci = new CompoundIcon(piltImage);
		RotatedIcon ri = new RotatedIcon(ci, RotatedIcon.Rotate.UPSIDE_DOWN);
		JLabel pilt=new JLabel(ri);
		
		return pilt;
	}
	
}