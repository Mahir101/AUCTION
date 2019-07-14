package dev.FIRSTGAME;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import dev.FIRSTGAME.gfx.imageload;

public class Cinema {
	private static BufferedImage t = imageload.loadimage("/texture/Cinema/Aishwarya.jpg");
	private static BufferedImage t2 = imageload.loadimage("/texture/Cinema/Akhshay.jpg");
	private static BufferedImage t3 = imageload.loadimage("/texture/Cinema/Alia.jpg");
	private static BufferedImage t4 = imageload.loadimage("/texture/who.jpg");
	private static BufferedImage t5 = imageload.loadimage("/texture/Cinema/Amir Khan.jpg");
	private static BufferedImage t6 = imageload.loadimage("/texture/Cinema/Amitabh.jpg");
	private static BufferedImage t7 = imageload.loadimage("/texture/Cinema/atkinson.jpg");
	private static BufferedImage t8 = imageload.loadimage("/texture/Cinema/Benedict.jpg");
	private static BufferedImage t9 = imageload.loadimage("/texture/Cinema/brad.jpg");
	private static BufferedImage t10 = imageload.loadimage("/texture/Cinema/Deepika.jpg");
	private static BufferedImage t11 = imageload.loadimage("/texture/Cinema/depp.jpg");
	private static BufferedImage t12 = imageload.loadimage("/texture/Cinema/Dev.jpg");
	private static BufferedImage t13 = imageload.loadimage("/texture/Cinema/DiCaprio.jpg");
	private static BufferedImage t14 = imageload.loadimage("/texture/Cinema/Downey.jpg");
	private static BufferedImage t15 = imageload.loadimage("/texture/Cinema/Emma.jpg");
	private static BufferedImage t16 = imageload.loadimage("/texture/Cinema/Ferdous.jpg");
	private static BufferedImage t17 = imageload.loadimage("/texture/Cinema/Illeana.jpg");
	private static BufferedImage t18 = imageload.loadimage("/texture/Cinema/jackie-chan.jpg");
	private static BufferedImage t19 = imageload.loadimage("/texture/Cinema/Jeet.jpg");
	private static BufferedImage t20 = imageload.loadimage("/texture/Cinema/JLo.jpg");
	private static BufferedImage t21 = imageload.loadimage("/texture/Cinema/katrina.jpg");
	private static BufferedImage t22 = imageload.loadimage("/texture/Cinema/kriti-sanon.jpg");
	private static BufferedImage t23 = imageload.loadimage("/texture/Cinema/Lawrence.jpg");
	private static BufferedImage t24 = imageload.loadimage("/texture/Cinema/Liam Neeson.jpg");
	private static BufferedImage t25 = imageload.loadimage("/texture/Cinema/Madhuri.jpg");
	private static BufferedImage t26 = imageload.loadimage("/texture/Cinema/Megan Fox.jpg");
	private static BufferedImage t27 = imageload.loadimage("/texture/Cinema/Mim.jpg");
	private static BufferedImage t28 = imageload.loadimage("/texture/Cinema/Monroe.jpg");
	private static BufferedImage t29 = imageload.loadimage("/texture/Cinema/Nargis.jpg");
	private static BufferedImage t30 = imageload.loadimage("/texture/Cinema/Natalie.jpg");
	private static BufferedImage t31 = imageload.loadimage("/texture/Cinema/porimoni.jpg");
	private static BufferedImage t32 = imageload.loadimage("/texture/Cinema/priyanka.jpg");
	private static BufferedImage t33 = imageload.loadimage("/texture/Cinema/purnima.jpg");
	private static BufferedImage t34 = imageload.loadimage("/texture/Cinema/Salman Khan.jpg");
	private static BufferedImage t35 = imageload.loadimage("/texture/Cinema/Salman Shah.jpg");
	private static BufferedImage t36 = imageload.loadimage("/texture/Cinema/Sanjay Dutta.jpg");
	private static BufferedImage t37 = imageload.loadimage("/texture/Cinema/Shahrukh Khan.jpg");
	private static BufferedImage t38 = imageload.loadimage("/texture/Cinema/Shakib.jpg");
	private static BufferedImage t39 = imageload.loadimage("/texture/Cinema/Sonakshi.jpg");
	private static BufferedImage t40 = imageload.loadimage("/texture/Cinema/Tobey.jpg");
	private static BufferedImage t41 = imageload.loadimage("/texture/Cinema/Will Smith.jpg");
	private static BufferedImage t42 = imageload.loadimage("/texture/Cinema/Tamanna.jpg");
	private static BufferedImage t43 = imageload.loadimage("/texture/Cinema/Schwarzenegger.jpg");
	private static BufferedImage t44 = imageload.loadimage("/texture/Cinema/Tom Cruise.jpg");
	private static BufferedImage t45 = imageload.loadimage("/texture/Cinema/Heroalam.jpg");
	private static BufferedImage t46 = imageload.loadimage("/texture/Cinema/Kate Winslet.jpg");
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
			g.drawString("AISHWARYA", 420, 510);
			point = (float) 7.6;
		} else if (number == 2) {
			g.drawImage(t2, 300, 200, null);
			g.drawString("AKHSHAY", 440, 510);
			point = (float) 7.2;
		} else if (number == 3) {
			g.drawImage(t3, 300, 200, null);
			g.drawString("ALIA", 450, 510);
			point = (float) 8.2;
		} else if (number == 4) {
			g.drawImage(t5, 300, 200, null);
			g.drawString("AMIR KHAN", 420, 510);
			point = (float) 10;
		} else if (number == 5) {
			g.drawImage(t6, 300, 200, null);
			g.drawString("AMITABH", 440, 510);
			point = (float) 9.8;
		} else if (number == 6) {
			g.drawImage(t7, 300, 200, null);
			g.drawString("ATKINSON", 435, 510);
			point = (float) 10;
		} else if (number == 7) {
			g.drawImage(t8, 300, 200, null);
			g.drawString("BENEDICT", 435, 510);
			point = (float) 8.6;
		} else if (number == 8) {
			g.drawImage(t9, 300, 200, null);
			g.drawString("BRAD PIT", 425, 510);
			point = (float) 9.5;
		} else if (number == 9) {
			g.drawImage(t10, 300, 200, null);
			g.drawString("DEEPIKA", 440, 510);
			point = (float) 8.8;
		} else if (number == 10) {
			g.drawImage(t11, 300, 200, null);
			g.drawString("JOHNY DEPP", 420, 510);
			point = (float) 10;
		} else if (number == 11) {
			g.drawImage(t12, 300, 200, null);
			g.drawString("DEV", 470, 510);
			point = (float) 6.2;
		} else if (number == 12) {
			g.drawImage(t13, 300, 200, null);
			g.drawString("DI CAPRIO", 435, 510);
			point = (float) 10;
		} else if (number == 13) {
			g.drawImage(t14, 300, 200, null);
			g.drawString("R.DOWNEY", 435, 510);
			point = (float) 8.6;
		} else if (number == 14) {
			g.drawImage(t15, 300, 200, null);
			g.drawString("EMMA WATSON", 420, 510);
			point = (float) 10;
		} else if (number == 15) {
			g.drawImage(t16, 300, 200, null);
			g.drawString("FERDOUS", 430, 510);
			point = (float) 5.2;
		} else if (number == 16) {
			g.drawImage(t17, 300, 200, null);
			g.drawString("ILLEANA", 430, 510);
			point = (float) 7.6;
		} else if (number == 17) {
			g.drawImage(t18, 300, 200, null);
			g.drawString("JACKIE CHAN", 410, 510);
			point = (float) 10;
		} else if (number == 18) {
			g.drawImage(t19, 300, 200, null);
			g.drawString("JEET", 440, 510);
			point = (float) 6.6;
		} else if (number == 19) {
			g.drawImage(t20, 300, 200, null);
			g.drawString("JENNIFER LOPEZ", 390, 510);
			point = (float) 10;
		} else if (number == 20) {
			g.drawImage(t21, 300, 200, null);
			g.drawString("KATRINA KAIF", 410, 510);
			point = (float) 8.5;
		} else if (number == 21) {
			g.drawImage(t22, 300, 200, null);
			g.drawString("KRITI SANON", 410, 510);
			point = (float) 6.9;
		} else if (number == 22) {
			g.drawImage(t23, 300, 200, null);
			g.drawString("J.LAWRENCE", 420, 510);
			point = (float) 8.8;
		} else if (number == 23) {
			g.drawImage(t24, 300, 200, null);
			g.drawString("LIAM NEESON", 415, 510);
			point = (float) 8.0;
		} else if (number == 24) {
			g.drawImage(t25, 300, 200, null);
			g.drawString("MADHURI DIXIT", 400, 510);
			point = (float) 6.7;
		} else if (number == 25) {
			g.drawImage(t26, 300, 200, null);
			g.drawString("MEGAN FOX", 420, 510);
			point = (float) 9.0;
		}
		else if (number == 26) {
			g.drawImage(t27, 300, 200, null);
			g.drawString("MIM", 460, 510);
			point = (float) 6.1;
		} else if (number == 27) {
			g.drawImage(t28, 300, 200, null);
			g.drawString("MONROE", 450, 510);
			point = (float) 7.2;
		} else if (number == 28) {
			g.drawImage(t29, 300, 200, null);
			g.drawString("NARGIS", 450, 510);
			point = (float) 3.8;
		} else if (number == 29) {
			g.drawImage(t30, 300, 200, null);
			g.drawString("NATALIE", 430, 510);
			point = (float) 10;
		} else if (number == 30) {
			g.drawImage(t31, 300, 200, null);
			g.drawString("PORIMONI", 430, 510);
			point = (float) 4.5;
		} else if (number == 31) {
			g.drawImage(t32, 300, 200, null);
			g.drawString("PRIYANKA", 430, 510);
			point = (float) 7.6;
		} else if (number == 32) {
			g.drawImage(t33, 300, 200, null);
			g.drawString("PURNIMA", 430, 510);
			point = (float) 6.4;
		} else if (number == 33) {
			g.drawImage(t34, 300, 200, null);
			g.drawString("SALMAN KHAN", 410, 510);
			point = (float) 9.0;
		} else if (number == 34) {
			g.drawImage(t35, 300, 200, null);
			g.drawString("SALMAN SHAH", 410, 510);
			point = (float) 9.0;
		} else if (number == 35) {
			g.drawImage(t36, 300, 200, null);
			g.drawString("SANJAY DUTTA", 400, 510);
			point = (float) 6.2;
		} else if (number == 36) {
			g.drawImage(t37, 300, 200, null);
			g.drawString("SHAHRUKH KHAN", 400, 510);
			point = (float) 10;
		} else if (number == 37) {
			g.drawImage(t38, 300, 200, null);
			g.drawString("SHAKIB KHAN", 410, 510);
			point = (float) 8.0;
		} else if (number == 38) {
			g.drawImage(t39, 300, 200, null);
			g.drawString("SONAKSHI", 425, 510);
			point = (float) 7.0;
		} else if (number == 39) {
			g.drawImage(t40, 300, 200, null);
			g.drawString("TOBEY", 450, 510);
			point = (float) 7.3;
		} else if (number == 40) {
			g.drawImage(t41, 300, 200, null);
			g.drawString("WILL SMITH", 415, 510);
			point = (float) 8.6;
		} else if (number == 41) {
			g.drawImage(t42, 300, 200, null);
			g.drawString("Tamanna", 400, 510);
			point = (float) 5;
		} else if (number == 42) {
			g.drawImage(t43, 300, 200, null);
			g.drawString("Schwarzenegger", 400, 510);
			point = (float) 7.3;
		} else if (number == 43) {
			g.drawImage(t44, 300, 200, null);
			g.drawString("Tom Cruise", 425, 510);
			point = (float) 9.6;
		} else if (number == 44) {
			g.drawImage(t45, 300, 200, null);
			g.drawString("Hero Alam", 430, 510);
			point = (float) 1.1;
		} else if (number == 45) {
			g.drawImage(t46, 300, 200, null);
			g.drawString("Kate Winslet", 425, 510);
			point = (float) 7.5;
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
