package dev.FIRSTGAME.gfx;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public  class imageload {
public static BufferedImage loadimage(String path) {
	try {
		return ImageIO.read(imageload.class.getResource(path));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.exit(1);
	}
	return null;
}
}
