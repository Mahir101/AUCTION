package dev.FIRSTGAME.Display;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JFrame;

import dev.FIRSTGAME.MouseManager;
import dev.FIRSTGAME.gfx.imageload;

public class Display {
    private JFrame frame;
    private Canvas cas;
    private String title;
    public static  MouseManager mm;
    private BufferedImage iconimg;
    private int height,width;
    public Display(String s,int h,int w) {
    	title=s;
    	height=h;
    	width=w;
    	createDisplay();
    }
    void createDisplay()
    {
    	iconimg = imageload.loadimage("/texture/ico.jpg");
    	frame = new JFrame(title);
    	mm=new MouseManager();
    	frame.setSize(height, width);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setResizable(false);
    	frame.setVisible(true);
    	frame.setIconImage(iconimg);
    	frame.setLocationRelativeTo(null);
    	frame.addMouseListener(mm);
    	frame.addMouseMotionListener(mm);
    	cas=new Canvas();
    	cas.setPreferredSize(new Dimension(width,height));
    	cas.setMaximumSize(new Dimension(width,height));
    	cas.setMinimumSize(new Dimension(width,height));
    	frame.add(cas);
    	frame.pack();
    }
    public Canvas getCanvas() {
		return cas;
	}
    public  JFrame getFrame(){
		return frame;
	}
}
