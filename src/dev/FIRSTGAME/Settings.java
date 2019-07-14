package dev.FIRSTGAME;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import dev.FIRSTGAME.gfx.imageload;

public class Settings extends State{

	 private BufferedImage testimage;
	 private BufferedImage t;
	 private BufferedImage img1;
	 private MouseManager mousemanager;
	@Override
	public void tick() {
		testimage = imageload.loadimage("/texture/menuback.jpg");
		t=imageload.loadimage("/texture/button.jpg");
		img1=imageload.loadimage("/texture/button2.jpg");
		
	}

	@Override
	public void tender(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(testimage,0,0,null);
		g.drawImage(t,500,100,null);
		g.drawImage(t,500,300,null);
		g.drawImage(t,500,500,null);
		if (mousemanager.getMouseX() >= 500 && mousemanager.getMouseX() <= 690 && mousemanager.getMouseY() >= 100
				&& mousemanager.getMouseY() <= 192) {
			g.drawImage(img1, 490, 90, 210, 110, null);
		}
		if (mousemanager.getMouseX() >= 500 && mousemanager.getMouseX() <= 690 && mousemanager.getMouseY() >= 300
				&& mousemanager.getMouseY() <= 392) {
			g.drawImage(img1, 490, 290, 210, 110, null);
		}
		if (mousemanager.getMouseX() >= 500 && mousemanager.getMouseX() <= 690 && mousemanager.getMouseY() >= 500
				&& mousemanager.getMouseY() <= 592) {
			g.drawImage(img1, 490, 490, 210, 110, null);
		}
		
		Font f=new Font("arial",Font.BOLD,30);
		g.setFont(f);
		g.setColor(Color.WHITE);
		g.drawString("SOUND", 540, 155);
		g.drawString("RECORD", 535, 355);
		g.drawString("BACK",550,555);
	}

}
