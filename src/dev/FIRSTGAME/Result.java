package dev.FIRSTGAME;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import dev.FIRSTGAME.Game;

import dev.FIRSTGAME.gfx.imageload;

public class Result extends State {
	private Music msr;
	private BufferedImage resultimg, t, img1;
	private float p1;
	private float p2;
	private boolean f2=true;
	private String a,b;
	//private highscores hs;
	//private static String a,b;
    //private static float scores;
    //private static float highScore;
    private static float point;
    private float scores;
    private Save s;
    private String str;
    private float d;
    private BufferedWriter writer;
	private MouseManager mousemanager;
	private int reecord;

	@Override
	public void tick() {
		//hs=new highscores()
		s=new Save();
		resultimg = imageload.loadimage("/texture/resimg.jpg");
		t = imageload.loadimage("/texture/button.jpg");
		img1 = imageload.loadimage("/texture/button2.jpg");
		// TODO Auto-generated method stub

	}

	@Override
	public void tender(Graphics g)  {
		a=Game.player1;
		b=Game.player2;
		//reecord=hs.getScores();
		g.drawImage(resultimg, 0, 0, null);
		g.drawImage(t, 500, 480, null);
		g.drawImage(t, 500, 680, null);
		p1 = Game.point1;
		p2 = Game.point2;
		Font f = new Font("arial", Font.BOLD, 60);
		g.setFont(f);
		g.setColor(Color.BLACK);
		g.drawString("RESULT", 500, 200);
		Font f1 = new Font("arial", Font.BOLD, 30);
		g.setFont(f1);
		g.setColor(Color.WHITE);
		if (p1 > p2)
			{
			g.drawString(a+" wins with " + p1 + " points!!!!!", 400, 300);
			//hs.setPoint(p1);
			}
		else if (p1 < p2)
			{
			g.drawString(b+" wins with " + p2 + " points!!!!!", 400, 300);
			//hs.setPoint(p2);
			}
		else
			{
			g.drawString("DRAW!!!!!!!!!!", 550, 300);
			//hs.setPoint(p1);
			}
		s.saves();
		float hp=s.getHs();
		//float hp=0;
		if(p1>p2)
		{
			d=p1;
			str=a;
		}
		else if(p2>p1)
			{
			d=p2;
			str=b;
			}
		System.out.println(""+d+" gggg"+hp);
		if(d>hp&&f2)
		{
			f2=false;
			try {
		        BufferedWriter output = new BufferedWriter(new FileWriter("D:\\FIRSTGAME\\res\\lala.txt", true));
		        output.newLine();
		        output.append("" + d);
		        output.close();

		    } catch (IOException ex1) {
		        System.out.printf("ERROR writing score to file: %s\n", ex1);
		    }
			try {
		        BufferedWriter output = new BufferedWriter(new FileWriter("D:\\FIRSTGAME\\res\\name.txt", true));
		        output.newLine();
		        output.append(str);
		        output.close();

		    } catch (IOException ex1) {
		        System.out.printf("ERROR writing score to file: %s\n", ex1);
		    }
		}
		if(!f2)
		{
			g.drawString("NEW RECORD", 490, 420);
		}
		g.drawString("MAIN MENU", 510, 540);
		g.drawString("EXIT", 560, 740);
		if (mousemanager.getMouseX() >= 500 && mousemanager.getMouseX() <= 700 && mousemanager.getMouseY() >= 680
				&& mousemanager.getMouseY() <= 780)
			g.drawImage(img1, 490, 670, 210, 110, null);
		else if (mousemanager.getMouseX() >= 500 && mousemanager.getMouseX() <= 700 && mousemanager.getMouseY() >= 480
				&& mousemanager.getMouseY() <= 580)
			g.drawImage(img1, 490, 470, 210, 110, null);
		g.drawString("MAIN MENU", 510, 540);
		g.drawString("EXIT", 560, 740);
		//hs.save();
		// TODO Auto-generated method stub

	}

}
