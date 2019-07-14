package dev.FIRSTGAME;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import dev.FIRSTGAME.gfx.imageload;

public class Football {
	private static BufferedImage t = imageload.loadimage("/texture/Football/bale.jpg");
	private static BufferedImage t2 = imageload.loadimage("/texture/Football/benzema.jpg");
	private static BufferedImage t3 = imageload.loadimage("/texture/Football/buffon.jpg");
	private static BufferedImage t4 = imageload.loadimage("/texture/who.jpg");
	private static BufferedImage t5 = imageload.loadimage("/texture/Football/Busquets.jpg");
	private static BufferedImage t6 = imageload.loadimage("/texture/Football/cavani.jpg");
	private static BufferedImage t7 = imageload.loadimage("/texture/Football/coutinho.jpg");
	private static BufferedImage t8 = imageload.loadimage("/texture/Football/de bryune.jpg");
	private static BufferedImage t9 = imageload.loadimage("/texture/Football/De gea.jpg");
	private static BufferedImage t10 = imageload.loadimage("/texture/Football/dembele.jpg");
	private static BufferedImage t11 = imageload.loadimage("/texture/Football/dybala.jpg");
	private static BufferedImage t12 = imageload.loadimage("/texture/Football/Griezmann.jpg");
	private static BufferedImage t13 = imageload.loadimage("/texture/Football/Hazard.jpg");
	private static BufferedImage t14 = imageload.loadimage("/texture/Football/Higuain.jpg");
	private static BufferedImage t15 = imageload.loadimage("/texture/Football/Ibrahimovic.jpg");
	private static BufferedImage t16 = imageload.loadimage("/texture/Football/Iniesta.jpg");
	private static BufferedImage t17 = imageload.loadimage("/texture/Football/isco.jpg");
	private static BufferedImage t18 = imageload.loadimage("/texture/Football/Jamal.jpg");
	private static BufferedImage t19 = imageload.loadimage("/texture/Football/kane.jpg");
	private static BufferedImage t20 = imageload.loadimage("/texture/Football/kroos.jpg");
	private static BufferedImage t21 = imageload.loadimage("/texture/Football/lewandowski.jpg");
	private static BufferedImage t22 = imageload.loadimage("/texture/Football/maradona.jpg");
	private static BufferedImage t23 = imageload.loadimage("/texture/Football/marcelo.jpg");
	private static BufferedImage t24 = imageload.loadimage("/texture/Football/Mbappe.jpg");
	private static BufferedImage t25 = imageload.loadimage("/texture/Football/MESSI.jpg");
	private static BufferedImage t26 = imageload.loadimage("/texture/Football/Mo Salah.jpg");
	private static BufferedImage t27 = imageload.loadimage("/texture/Football/Modric.jpg");
	private static BufferedImage t28 = imageload.loadimage("/texture/Football/Muller.jpg");
	private static BufferedImage t29 = imageload.loadimage("/texture/Football/Neuer.jpg");
	private static BufferedImage t30 = imageload.loadimage("/texture/Football/neymar.jpg");
	private static BufferedImage t31 = imageload.loadimage("/texture/Football/ozil.jpg");
	private static BufferedImage t32 = imageload.loadimage("/texture/Football/pele.jpg");
	private static BufferedImage t33 = imageload.loadimage("/texture/Football/pique.jpg");
	private static BufferedImage t34 = imageload.loadimage("/texture/Football/pirlo.jpg");
	private static BufferedImage t35 = imageload.loadimage("/texture/Football/pogba.jpg");
	private static BufferedImage t36 = imageload.loadimage("/texture/Football/Ramos.jpg");
	private static BufferedImage t37 = imageload.loadimage("/texture/Football/Reus.jpg");
	private static BufferedImage t38 = imageload.loadimage("/texture/Football/Ronaldinho.jpg");
	private static BufferedImage t39 = imageload.loadimage("/texture/Football/ronaldo.jpg");
	private static BufferedImage t40 = imageload.loadimage("/texture/Football/sanchez.jpg");
	private static BufferedImage t41 = imageload.loadimage("/texture/Football/suarez.jpg");
	private static BufferedImage t42 = imageload.loadimage("/texture/Football/Honda.jpg");
	private static BufferedImage t43 = imageload.loadimage("/texture/Football/Lukaku.jpg");
	private static BufferedImage t44 = imageload.loadimage("/texture/Football/Harry Kane.jpg");
	private static BufferedImage t45 = imageload.loadimage("/texture/Football/Fellaini.jpg");
	private static BufferedImage t46 = imageload.loadimage("/texture/Football/Mandzukic.jpg");
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
			g.drawString("BALE", 450, 510);
			point = (float) 8.5;
		} else if (number == 2) {
			g.drawImage(t2, 300, 200, null);
			g.drawString("BENZEMA", 450, 510);
			point = (float) 6.8;
		} else if (number == 3) {
			g.drawImage(t3, 300, 200, null);
			g.drawString("BUFFON", 450,510);
			point = (float) 7.0;
		} else if (number == 4) {
			g.drawImage(t5, 300, 200, null);
			g.drawString("BUSQUETS", 440, 510);
			point = (float) 9.0;
		} else if (number == 5) {
			g.drawImage(t6, 300, 200, null);
			g.drawString("CAVANI", 450, 510);
			point = (float) 7.8;
		} else if (number == 6) {
			g.drawImage(t7, 300, 200, null);
			g.drawString("COUTINHO", 440, 510);
			point = (float) 8.6;
		} else if (number == 7) {
			g.drawImage(t8, 300, 200, null);
			g.drawString("DE BRYUNE", 440, 510);
			point = (float) 8.2;
		} else if (number == 8) {
			g.drawImage(t9, 300, 200, null);
			g.drawString("DE GEA", 450, 510);
			point = (float) 9.2;
		} else if (number == 9) {
			g.drawImage(t10, 300, 200, null);
			g.drawString("DEMBELE", 450, 510);
			point = (float) 9.1;
		} else if (number == 10) {
			g.drawImage(t11, 300, 200, null);
			g.drawString("DYBALA", 450, 510);
			point = (float) 8.8;
		} else if (number == 11) {
			g.drawImage(t12, 300, 200, null);
			g.drawString("GRIEZMANN", 430, 510);
			point = (float) 8.8;
		} else if (number == 12) {
			g.drawImage(t13, 300, 200, null);
			g.drawString("HAZARD", 450, 510);
			point = (float) 9;
		} else if (number == 13) {
			g.drawImage(t14, 300, 200, null);
			g.drawString("HIGUAIN", 450, 510);
			point = (float) 6;
		} else if (number == 14) {
			g.drawImage(t15, 300, 200, null);
			g.drawString("IBRAHIMOVIC", 420, 510);
			point = (float) 8.5;
		} else if (number == 15) {
			g.drawImage(t16, 300, 200, null);
			g.drawString("INIESTA", 445, 510);
			point = (float) 9.8;
		} else if (number == 16) {
			g.drawImage(t17, 300, 200, null);
			g.drawString("ISCO", 450, 510);
			point = (float) 7.0;
		} else if (number == 17) {
			g.drawImage(t18, 300, 200, null);
			g.drawString("JAMAL", 450, 510);
			point = (float) 2;
		} else if (number == 18) {
			g.drawImage(t19, 300, 200, null);
			g.drawString("KANE", 450, 510);
			point = (float) 8.5;
		} else if (number == 19) {
			g.drawImage(t20, 300, 200, null);
			g.drawString("KROOS", 450, 510);
			point = (float) 8.3;
		} else if (number == 20) {
			g.drawImage(t21, 300, 200, null);
			g.drawString("LEWANDOWSKI", 420, 510);
			point = (float) 9.4;
		} else if (number == 21) {
			g.drawImage(t22, 300, 200, null);
			g.drawString("MARADONA", 430, 510);
			point = (float) 8.7;
		} else if (number == 22) {
			g.drawImage(t23, 300, 200, null);
			g.drawString("MARCELO", 435, 510);
			point = (float) 7.2;
		} else if (number == 23) {
			g.drawImage(t24, 300, 200, null);
			g.drawString("MBAPPE", 450, 510);
			point = (float) 8.1;
		} else if (number == 24) {
			g.drawImage(t25, 300, 200, null);
			g.drawString("MESSI", 450, 510);
			point = (float) 10;
		} else if (number == 25) {
			g.drawImage(t26, 300, 200, null);
			g.drawString("MO SALAH", 435, 510);
			point = (float) 9.8;
		} else if (number == 26) {
			g.drawImage(t27, 300, 200, null);
			g.drawString("MODRIC", 445, 510);
			point = (float) 9.1;
		} else if (number == 27) {
			g.drawImage(t28, 300, 200, null);
			g.drawString("MULLER", 445, 510);
			point = (float) 9.4;
		} else if (number == 28) {
			g.drawImage(t29, 300, 200, null);
			g.drawString("NEUER", 450, 510);
			point = (float) 8.8;
		} else if (number == 29) {
			g.drawImage(t30, 300, 200, null);
			g.drawString("NEYMAR", 440, 510);
			point = (float) 9.6;
		} else if (number == 30) {
			g.drawImage(t31, 300, 200, null);
			g.drawString("OZIL", 450, 510);
			point = (float) 8.6;
		} 
		 else if (number == 31) {
			g.drawImage(t32, 300, 200, null);
			g.drawString("PELE", 450, 510);
			point = (float) 10.0;
		} else if (number == 32) {
			g.drawImage(t33, 300, 200, null);
			g.drawString("PIQUE", 450, 510);
			point = (float) 8.0;
		} else if (number == 33) {
			g.drawImage(t34, 300, 200, null);
			g.drawString("PIRLO", 450, 510);
			point = (float) 7.2;
		} else if (number == 34) {
			g.drawImage(t35, 300, 200, null);
			g.drawString("POGBA", 450, 510);
			point = (float) 7.2;
		} else if (number == 35) {
			g.drawImage(t36, 300, 200, null);
			g.drawString("RAMOS", 450, 510);
			point = (float) 4.2;
		} else if (number == 36) {
			g.drawImage(t37, 300, 200, null);
			g.drawString("REUS", 455, 510);
			point = (float) 8.2;
		} else if (number == 37) {
			g.drawImage(t38, 300, 200, null);
			g.drawString("RONALDINHO", 420, 510);
			point = (float) 7.6;
		} else if (number == 38) {
			g.drawImage(t39, 300, 200, null);
			g.drawString("RONALDO", 430, 510);
			point = (float) 9.8;
		}else if (number == 39) {
			g.drawImage(t40, 300, 200, null);
			g.drawString("SANCHEZ", 430, 510);
			point = (float) 8.0;
		}
		else if (number == 40) {
			g.drawImage(t41, 300, 200, null);
			g.drawString("SUAREZ", 435, 510);
			point = (float) 8.8;
		} else if (number == 41) {
			g.drawImage(t42, 300, 200, null);
			g.drawString("Honda", 450, 510);
			point = (float) 5;
		} else if (number == 42) {
			g.drawImage(t43, 300, 200, null);
			g.drawString("Lukaku", 440, 510);
			point = (float) 7.3;
		} else if (number == 43) {
			g.drawImage(t44, 300, 200, null);
			g.drawString("Harry Kane", 425, 510);
			point = (float) 8.2;
		} else if (number == 44) {
			g.drawImage(t45, 300, 200, null);
			g.drawString("Fellaini", 430, 510);
			point = (float) 5.1;
		} else if (number == 45) {
			g.drawImage(t46, 300, 200, null);
			g.drawString("Mandzukic", 425, 510);
			point = (float) 7.0;
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
