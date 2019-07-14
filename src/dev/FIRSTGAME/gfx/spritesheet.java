package dev.FIRSTGAME.gfx;

import java.awt.image.BufferedImage;

public class spritesheet {
	private BufferedImage shet;
	public spritesheet(BufferedImage shet) {
		this.shet=shet;
		
	}
	public BufferedImage crop(int x,int y,int widght,int height)
	{
		return shet.getSubimage(x, y, widght, height);
	}

}
