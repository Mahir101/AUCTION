package dev.FIRSTGAME;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import dev.FIRSTGAME.gfx.imageload;

public class MainMenu extends State {
	private MouseManager mousemanager;
	public Game GAME;
	private BufferedImage t;
	private BufferedImage img1;
	private BufferedImage testimage;
	public MainMenu() {
	}

	public void tick() {
		testimage = imageload.loadimage("/texture/menuback.jpg");
		t = imageload.loadimage("/texture/button.jpg");
		img1 = imageload.loadimage("/texture/button2.jpg");
		
	}

	@Override
	public void tender(Graphics g) {
		g.drawImage(testimage, 0, 0, null);
		g.drawImage(t, 500, 80, null);
		g.drawImage(t, 500, 280, null);
		g.drawImage(t, 500, 480, null);
		g.drawImage(t, 500, 680, null);
		if ( mousemanager.getMouseX() >= 500 && mousemanager.getMouseX() <= 700
				&& mousemanager.getMouseY() >= 80 && mousemanager.getMouseY() <= 180 ) {
				g.drawImage(img1, 490, 70, 210, 110, null);
		}
		else if (  mousemanager.getMouseX() >= 500 && mousemanager.getMouseX() <= 700
				&& mousemanager.getMouseY() >= 280 && mousemanager.getMouseY() <= 380)
			g.drawImage(img1, 490, 270, 210, 110, null);
		else if ( mousemanager.getMouseX() >= 500 && mousemanager.getMouseX() <= 700
				&& mousemanager.getMouseY() >= 680 && mousemanager.getMouseY() <= 780)
			g.drawImage(img1, 490, 670, 210, 110, null);
		else if ( mousemanager.getMouseX() >= 500 && mousemanager.getMouseX() <= 700
				&& mousemanager.getMouseY() >= 480 && mousemanager.getMouseY() <= 580)
			g.drawImage(img1, 490, 470, 210, 110, null);

		Font f = new Font("arial", Font.BOLD, 30);
		g.setFont(f);
		g.setColor(Color.WHITE);
		g.drawString("PLAY", 550, 140);
		g.drawString("SETTINGS", 520, 340);
		g.drawString("RULES", 540, 540);
		g.drawString("QUIT", 550, 740);
	}
	public void drawit(Graphics g) {
		g.drawImage(img1, 500, 80, null);
	}
}
