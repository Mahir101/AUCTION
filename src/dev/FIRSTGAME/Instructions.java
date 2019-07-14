package dev.FIRSTGAME;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import dev.FIRSTGAME.gfx.imageload;

public class Instructions extends State{
	 private BufferedImage testimage;
	 private BufferedImage t;
	 private BufferedImage img1;
	 private MouseManager mousemanager;
	@Override
	public void tick() {
		 testimage = imageload.loadimage("/texture/instruction.jpg");
		 t=imageload.loadimage("/texture/button.jpg");
		 img1=imageload.loadimage("/texture/button2.jpg");
		
	}

	@Override
	public void tender(Graphics g) {
		g.drawImage(testimage,0,0,null);
		g.drawImage(t,550,680,null);
		if (mousemanager.getMouseX() >= 500 && mousemanager.getMouseX() <= 700 && mousemanager.getMouseY() >= 680
				&& mousemanager.getMouseY() <= 780) {
			g.drawImage(img1, 540, 670, 210, 110, null);
		}
		Font f=new Font("arial",Font.BOLD,30);
		g.setFont(f);
		g.drawString("BACK",600,740);
		Font k = new Font("arial", Font.BOLD, 20);
		g.setFont(k);
		g.setColor(Color.WHITE);
		g.drawString("INSTRUCTIONS", 580, 130);
	    g.drawString("1. First you have to find a bidder to play with you. It's a Multiplayer game",180, 200);
	    g.drawString("2. Both players are given BDT 10000000(1 crore Taka) ",180, 250);
	    g.drawString("3. A card is given in deck of 20 cards (cinema/cricket/football) whichever you select",180, 300);
	    g.drawString("4. Then both bidders have to bid. First player will bid by pressing 'W' key and Second player will click uparrow",180, 350);
	    g.drawString("5. If the timer ends at the count of ten, the last bidder will win the card and points will be addded to his score",180, 400);
	    g.drawString("6. To bid you must have more than 100000 bacause bidding start from 200000",180, 450);
	    g.drawString("7. A single bid will increase the card amount by 100000",180, 500);
	    g.drawString("8. If you don't have more money than the current amount of the card, then you can't bid",180, 550);
	    g.drawString("9. After 20 cards gone, the player with more points will win",180, 600);
	    g.drawString("N.B. CARDS ARE RATED ACCORDING TO THEIR PERFORMANCE IN REAL WORLD",250, 650);
	    
	}
	
}
