package dev.FIRSTGAME.Display;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JLabel;

import dev.FIRSTGAME.State;
import dev.FIRSTGAME.gfx.imageload;
import dev.FIRSTGAME.Game;

public class GameState extends State {
	private BufferedImage testimage;
	private BufferedImage test;
	private BufferedImage t;
	private BufferedImage t2;
	private BufferedImage t3;
	private BufferedImage t4;
	private BufferedImage t5;
	private JButton jb;
	private Display dis;
	private JLabel jl;
	private static int number = 20;

	public void tick() {

		testimage = imageload.loadimage("/texture/wood.jpg");
		test = imageload.loadimage("/texture/card21.jpg");
		t = imageload.loadimage("/texture/power button.jpg");
		t2 = imageload.loadimage("/texture/watch.jpg");
		t3 = imageload.loadimage("/texture/all info.jpg");
		t4 = imageload.loadimage("/texture/money.jpg");
	}

	@Override
	public void tender(Graphics g) {

		g.drawImage(testimage, 0, 0, null);
		g.drawImage(t2, 1050, 300, null);
		g.drawImage(t3, 300, 465, null);
		g.drawImage(t3, 300, 550, null);
		g.drawImage(t4, 200, 30, null);
		g.drawImage(t4, 200, 705, null);
		g.drawImage(t4, 800, 30, null);
		g.drawImage(t4, 800, 705, null);
		Font f = new Font("arial", Font.BOLD, 30);
		g.setFont(f);
		g.setColor(Color.ORANGE);
		g.drawString("" + Game.player1, 500, 75);
		g.drawString("" + Game.player2, 500, 750);
		Font f2 = new Font("arial", Font.BOLD, 20);
		g.setFont(f2);
		g.setColor(Color.WHITE);
	}

	public static void setNumber(int number) {
		GameState.number -= number;
	}

}
