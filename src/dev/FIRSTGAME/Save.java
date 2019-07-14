package dev.FIRSTGAME;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import dev.FIRSTGAME.gfx.imageload;

public class Save extends State {

	private BufferedImage testimage;
	private MouseManager mousemanager;
	private BufferedImage t;
	private BufferedImage img1;
	private float hs = 2;
	private float sc = 0;
	private String finalname;

	public void tick() {
		// TODO Auto-generated method stub
		testimage = imageload.loadimage("/texture/menuback.jpg");
		t = imageload.loadimage("/texture/button.jpg");
		img1 = imageload.loadimage("/texture/button2.jpg");
		// TODO Auto-generated method stub
	}

	public void saves() {
		// File f=new File("lala.txt")
		try {

			BufferedReader reader = new BufferedReader(new FileReader("D:\\FIRSTGAME\\res\\lala.txt"));
			String line = reader.readLine();
			while (line != null) // read the score file line by line
			{
				try {
					sc = Float.parseFloat(line.trim());
					System.out.println("bcbhdbc   " + sc);// parse each line as an int
					hs = sc;
				} catch (NumberFormatException e1) {
					// ignore invalid scores
					// System.err.println("ignoring invalid score: " + line);
				}
				line = reader.readLine();
			}
			reader.close();

		} catch (IOException ex) {
			System.err.println("ERROR reading scores from file");
		}
	}

	public float getHs() {
		return hs;
	}

	public void setHs(float hs) {
		this.hs = hs;
	}

	public void names() {
		// File f=new File("lala.txt")
		try {

			BufferedReader reader = new BufferedReader(new FileReader("D:\\FIRSTGAME\\res\\name.txt"));
			String line = reader.readLine();
			while (line != null) // read the score file line by line
			{
				try {
					finalname = line;
					System.out.println(line);
					// nt highScore = 0;
				} catch (NumberFormatException e1) {
					// ignore invalid scores
					// System.err.println("ignoring invalid score: " + line);
				}
				line = reader.readLine();
			}
			reader.close();

		} catch (IOException ex) {
			System.err.println("ERROR reading scores from file");
		}
	}

	public void tender(Graphics g) {
		// TODO Auto-generated method stub
		// g.drawImage();
		g.drawImage(testimage, 0, 0, null);
		// g.drawImage(testimage, 0, 0, null);
		Font f1 = new Font("arial", Font.BOLD, 50);
		g.setFont(f1);
		g.drawString("HIGHSCORES -" + hs, 420, 200);
		g.drawString("PLAYER -" + finalname, 480, 320);
		g.drawImage(t, 550, 580, null);
		if (mousemanager.getMouseX() >= 550 && mousemanager.getMouseX() <= 670 && mousemanager.getMouseY() >= 580
				&& mousemanager.getMouseY() <= 674) {
			g.drawImage(img1, 540, 570, 210, 110, null);
		}
		Font f = new Font("arial", Font.BOLD, 30);
		g.setFont(f);
		g.setColor(Color.WHITE);
		g.drawString("BACK", 600, 635);
		

	}

}
