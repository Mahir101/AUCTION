package dev.FIRSTGAME;

import java.awt.Font;
import java.awt.Graphics;

public class Points {
	private static int point=0;
	private static int amount =10000000;
    public static void calculate(Graphics g,int amount,float points)
    {
    	  Font f=new Font("arial",Font.BOLD,40);
    	  g.setFont(f);
    	  if(amount==0){
    		  g.drawString(""+amount, 270, 90);
    	  }
    	  else
    	  g.drawString(""+amount, 210, 90);
    	  g.drawString(""+points, 880, 90);
    }
    public static void calculate2(Graphics g,int amount,float points)
    {
    	  Font f=new Font("arial",Font.BOLD,40);
    	  g.setFont(f);
    	  if(amount==0)
    	  {
    		  g.drawString(""+amount, 270, 90);
    	  }
    	  else
    	  g.drawString(""+amount, 220, 760);
    	  g.drawString(""+points, 880, 760);
    }
}
