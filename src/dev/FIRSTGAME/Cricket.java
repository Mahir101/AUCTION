package dev.FIRSTGAME;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.StringTokenizer;

import dev.FIRSTGAME.gfx.imageload;

public class Cricket {
	
	private static BufferedImage t = imageload.loadimage("/texture/Cricket/ali.jpg");
	private static BufferedImage t2 = imageload.loadimage("/texture/Cricket/SHaKIB.jpg");
	private static BufferedImage t3 = imageload.loadimage("/texture/Cricket/samuel.jpg");
	private static BufferedImage t4 = imageload.loadimage("/texture/who.jpg");
	private static BufferedImage t5 = imageload.loadimage("/texture/Cricket/faulkner.jpg");
	private static BufferedImage t6 = imageload.loadimage("/texture/Cricket/elliot.jpg");
	private static BufferedImage t7 = imageload.loadimage("/texture/Cricket/riad.jpg");
	private static BufferedImage t8 = imageload.loadimage("/texture/Cricket/jadeja.jpg");
	private static BufferedImage t9 = imageload.loadimage("/texture/Cricket/gururatne.jpg");
	private static BufferedImage t10 = imageload.loadimage("/texture/Cricket/elgar.jpg");
	private static BufferedImage t11 = imageload.loadimage("/texture/Cricket/kuldeep.jpg");
	private static BufferedImage t12 = imageload.loadimage("/texture/Cricket/kohli.jpg");
	private static BufferedImage t13 = imageload.loadimage("/texture/Cricket/rashid.jpg");
	private static BufferedImage t14 = imageload.loadimage("/texture/Cricket/sarfaraz.jpg");
	private static BufferedImage t15 = imageload.loadimage("/texture/Cricket/southee.jpg");
	private static BufferedImage t16 = imageload.loadimage("/texture/Cricket/taskin.jpg");
	private static BufferedImage t17 = imageload.loadimage("/texture/Cricket/will.jpg");
	private static BufferedImage t18 = imageload.loadimage("/texture/Cricket/bumrah.jpg");
	private static BufferedImage t19 = imageload.loadimage("/texture/Cricket/mortaza.jpg");
	private static BufferedImage t20 = imageload.loadimage("/texture/Cricket/hasan.jpg");
	private static BufferedImage t21 = imageload.loadimage("/texture/Cricket/milne.jpg");
	private static BufferedImage t22 = imageload.loadimage("/texture/Cricket/shahid.jpg");
	private static BufferedImage t23 = imageload.loadimage("/texture/Cricket/root.jpg");
	private static BufferedImage t24 = imageload.loadimage("/texture/Cricket/afridi.jpg");
	private static BufferedImage t25 = imageload.loadimage("/texture/Cricket/milner.jpg");
	private static BufferedImage t26 = imageload.loadimage("/texture/Cricket/smith.jpg");
	private static BufferedImage t27 = imageload.loadimage("/texture/Cricket/Ab deVilliers.jpg");
	private static BufferedImage t28 = imageload.loadimage("/texture/Cricket/Cook.jpg");
	private static BufferedImage t29 = imageload.loadimage("/texture/Cricket/dhoni.jpg");
	private static BufferedImage t30 = imageload.loadimage("/texture/Cricket/Gayle.jpg");
	private static BufferedImage t31 = imageload.loadimage("/texture/Cricket/Hafeez.jpg");
	private static BufferedImage t32 = imageload.loadimage("/texture/Cricket/Holder.jpg");
	private static BufferedImage t33 = imageload.loadimage("/texture/Cricket/hashim-amla.jpg");
	private static BufferedImage t34 = imageload.loadimage("/texture/Cricket/mushi.jpg");
	private static BufferedImage t35 = imageload.loadimage("/texture/Cricket/Mustafizur.jpg");
	private static BufferedImage t36 = imageload.loadimage("/texture/Cricket/Tamim.jpg");
	private static BufferedImage t37 = imageload.loadimage("/texture/Cricket/Warner.jpg");
	private static BufferedImage t38 = imageload.loadimage("/texture/Cricket/S.Tendulkar.jpg");
	private static BufferedImage t39 = imageload.loadimage("/texture/Cricket/Perera.jpg");
	private static BufferedImage t40 = imageload.loadimage("/texture/Cricket/nabi.jpg");
	private static BufferedImage t41 = imageload.loadimage("/texture/Cricket/Rohit.jpg");
	private static BufferedImage t42 = imageload.loadimage("/texture/Cricket/Richardson.jpg");
	private static BufferedImage t43 = imageload.loadimage("/texture/Cricket/Aftab.jpg");
	private static BufferedImage t44 = imageload.loadimage("/texture/Cricket/Babar Azam.jpg");
	private static BufferedImage t45 = imageload.loadimage("/texture/Cricket/Dawlat.jpg");
	private static BufferedImage t46 = imageload.loadimage("/texture/Cricket/Liton das.jpg");
	private static float point = 0;

	public static void tender(Graphics g, int counter, int cnt, int number) {
		Font f = new Font("arial", Font.BOLD, 40);
		Font f2 = new Font("arial", Font.BOLD, 20);
		g.setFont(f);
		if (cnt == 0) {
			g.drawImage(t4, 300, 200, null);
			g.drawString("PRESS D", 430, 510);
		} else if (number == 1) {
			g.drawImage(t, 300, 200, null);
			g.drawString("ALI", 490, 510);
			point = (float) 7.3;
		} else if (number == 2) {
			g.drawImage(t2, 300, 200, null);
			g.drawString("SHAKIB-AL-HASAN", 320, 510);
			point = 10;
		} else if (number == 3) {
			g.drawImage(t3, 300, 200, null);
			g.drawString("SAMUEL", 440, 510);
			point = (float) 8;
		} else if (number == 4) {
			g.drawImage(t5, 300, 200, null);
			g.drawString("FAULKNER", 420, 510);
			point = (float) 7;
		} else if (number == 5) {
			g.drawImage(t6, 300, 200, null);
			g.drawString("ELLIOT", 440, 510);
			point = (float) 7.8;
		} else if (number == 6) {
			g.drawImage(t7, 300, 200, null);
			g.drawString("RIAD", 480, 510);
			point = (float) 8.3;
		} else if (number == 7) {
			g.drawImage(t8, 300, 200, null);
			g.drawString("JADEJA", 440, 510);
			point = (float) 8;
		} else if (number == 8) {
			g.drawImage(t9, 300, 200, null);
			g.drawString("GURURATNE", 410, 510);
			point = (float) 5;
		} else if (number == 9) {
			g.drawImage(t10, 300, 200, null);
			g.drawString("ELGAR", 450, 510);
			point = (float) 8;
		} else if (number == 10) {
			g.drawImage(t11, 300, 200, null);
			g.drawString("KULDEEP", 440, 510);
			point = (float) 8.8;
		} else if (number == 11) {
			g.drawImage(t12, 300, 200, null);
			g.drawString("KOHLI", 440, 510);
			point = (float) 10;
		} else if (number == 12) {
			g.drawImage(t13, 300, 200, null);
			g.drawString("RASHID", 440, 510);
			point = (float) 9;
		} else if (number == 13) {
			g.drawImage(t14, 300, 200, null);
			g.drawString("SARFARAZ", 420, 510);
			point = (float) 6;
		} else if (number == 14) {
			g.drawImage(t15, 300, 200, null);
			g.drawString("SOUTHEE", 430, 510);
			point = (float) 8.5;
		} else if (number == 15) {
			g.drawImage(t16, 300, 200, null);
			g.drawString("TASKIN", 440, 510);
			point = (float) 5.8;
		} else if (number == 16) {
			g.drawImage(t17, 300, 200, null);
			g.drawString("WILLIAMSON", 400, 510);
			point = (float) 10;
		} else if (number == 17) {
			g.drawImage(t18, 300, 200, null);
			g.drawString("BUMRAH", 440, 510);
			point = (float) 10;
		} else if (number == 18) {
			g.drawImage(t19, 300, 200, null);
			g.drawString("MORTAZA", 440, 510);
			point = (float) 7;
		} else if (number == 19) {
			g.drawImage(t20, 300, 200, null);
			g.drawString("HASAN", 450, 510);
			point = (float) 9.3;
		} else if (number == 20) {
			g.drawImage(t21, 300, 200, null);
			g.drawString("MILNE", 450, 510);
			point = (float) 5;
		} else if (number == 21) {
			g.drawImage(t22, 300, 200, null);
			g.drawString("SHAHID", 440, 510);
			point = (float) 2.3;
		} else if (number == 22) {
			g.drawImage(t23, 300, 200, null);
			g.drawString("ROOT", 460, 510);
			point = (float) 9.1 ;
		} else if (number == 23) {
			g.drawImage(t24, 300, 200, null);
			g.drawString("AFRIDI", 440, 510);
			point = (float) 6.3;
		} else if (number == 24) {
			g.drawImage(t25, 300, 200, null);
			g.drawString("MILNER", 440, 510);
			point = (float) 7.1;
		} else if (number == 25) {
			g.drawImage(t26, 300, 200, null);
			g.drawString("SMITH", 450, 510);
			point = (float) 7;
		}
		else if (number == 26) {
			g.drawImage(t27, 300, 200, null);
			g.drawString("AB DeVilliers", 410, 510);
			point = (float) 10;
		} else if (number == 27) {
			g.drawImage(t28, 300, 200, null);
			g.drawString("COOK", 460, 510);
			point = (float)7.2;
		} else if (number == 28) {
			g.drawImage(t29, 300, 200, null);
			g.drawString("DHONI", 440, 510);
			point = (float) 8.8;
		} else if (number == 29) {
			g.drawImage(t30, 300, 200, null);
			g.drawString("GAYLE", 440, 510);
			point = (float) 8.6;
		} else if (number == 30) {
			g.drawImage(t31, 300, 200, null);
			g.drawString("HAFEEZ", 450, 510);
			point = (float) 7;
		} else if (number == 31) {
			g.drawImage(t32, 300, 200, null);
			g.drawString("HOLDER", 450, 510);
			point = (float) 7.2;
		} else if (number == 32) {
			g.drawImage(t33, 300, 200, null);
			g.drawString("AMLA", 460, 510);
			point = (float) 9.0;
		} else if (number == 33) {
			g.drawImage(t34, 300, 200, null);
			g.drawString("MUSHFIQUR", 410, 510);
			point = (float) 8.0;
		} else if (number == 34) {
			g.drawImage(t35, 300, 200, null);
			g.drawString("MUSTAFIZUR", 450, 510);
			point = (float) 7.2;
		} else if (number == 35) {
			g.drawImage(t36, 300, 200, null);
			g.drawString("TAMIM", 440, 510);
			point = (float) 8.2;
		} else if (number == 36) {
			g.drawImage(t37, 300, 200, null);
			g.drawString("WARNER", 420, 510);
			point = (float) 9.2;
		} else if (number == 37) {
			g.drawImage(t38, 300, 200, null);
			g.drawString("TENDULKAR", 440, 510);
			point = (float) 9;
		} else if (number == 38) {
			g.drawImage(t39, 300, 200, null);
			g.drawString("PERERA", 460, 510);
			point = (float) 6;
		} else if (number == 39) {
			g.drawImage(t40, 300, 200, null);
			g.drawString("NABI", 460, 510);
			point = (float) 8.5;
		} else if (number == 40) {
			g.drawImage(t41, 300, 200, null);
			g.drawString("ROHIT", 400, 510);
			point = (float) 9.8;
		} else if (number == 41) {
			g.drawImage(t42, 300, 200, null);
			g.drawString("Richardson", 410, 510);
			point = (float) 4.6;
		} else if (number == 42) {
			g.drawImage(t43, 300, 200, null);
			g.drawString("Aftab", 440, 510);
			point = (float) 5;
		} else if (number == 43) {
			g.drawImage(t44, 300, 200, null);
			g.drawString("Babar Azam", 410, 510);
			point = (float) 9.7;
		} else if (number == 44) {
			g.drawImage(t45, 300, 200, null);
			g.drawString("Dawlat", 440, 510);
			point = (float) 6.6;
		} else if (number == 45) {
			g.drawImage(t46, 300, 200, null);
			g.drawString("Liton Das", 430, 510);
			point = (float) 3.1;
		} 
		g.setFont(f2);
		g.drawString("" + counter, 1170, 375);
	}

	public static float getPoint() {
		return point;
	}

	public static void amount(Graphics g, int am) {
		Font f = new Font("arial", Font.BOLD, 40);
		g.setFont(f);
		String s;
		s = Integer.toString(am);
		g.drawString(s, 460, 590);
	}
}
