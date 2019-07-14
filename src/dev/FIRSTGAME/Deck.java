package dev.FIRSTGAME;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import dev.FIRSTGAME.gfx.imageload;

public class Deck {
	 private static BufferedImage test= imageload.loadimage("/texture/card21.jpg");
	 private static int number=20;
	 public static void set(Graphics g)
	 {
		 if(number>=1)
			 g.drawImage(test,20,30,null);
			if(number>=2)
			 g.drawImage(test,20,60,null);
			if(number>=3)
			 g.drawImage(test,20,90,null);
			if(number>=4)
			 g.drawImage(test,20,120,null);
			if(number>=5)
			 g.drawImage(test,20,150,null);
			if(number>=6)
			 g.drawImage(test,20,180,null);
			if(number>=7)
			 g.drawImage(test,20,210,null);
			if(number>=8)
			 g.drawImage(test,20,240,null);
			if(number>=9)
			 g.drawImage(test,20,270,null);
			if(number>=10)
			 g.drawImage(test,20,300,null);
			if(number>=11)
			 g.drawImage(test,20,330,null);
			if(number>=12)
			 g.drawImage(test,20,360,null);
			if(number>=13)
			 g.drawImage(test,20,390,null);
			if(number>=14)
			 g.drawImage(test,20,420,null);
			if(number>=15)
			g.drawImage(test,20,450,null);
			if(number>=16)
			 g.drawImage(test,20,480,null);
			if(number>=17)
			 g.drawImage(test,20,510,null);
			if(number>=18)
			 g.drawImage(test,20,540,null);
			if(number>=19)
			 g.drawImage(test,20,570,null);
			if(number>=20)
				 g.drawImage(test,20,600,null);
	 }
	 public static void setnumber()
	 {
		 number--;
	 }
}
