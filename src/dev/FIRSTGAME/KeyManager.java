package dev.FIRSTGAME;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class KeyManager implements KeyListener {
	
	private boolean[] keys;
	public boolean up, down, left, right,uparrow;
	
	public KeyManager(){
		keys = new boolean[256];
	}
	
	public void tick(){
		up = keys[KeyEvent.VK_W];
		down = keys[KeyEvent.VK_S];
		left = keys[KeyEvent.VK_A];
		right = keys[KeyEvent.VK_D];
		uparrow=keys[KeyEvent.VK_UP];
	}

	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	public void make()
	{
		keys[KeyEvent.VK_W]=false;
		keys[KeyEvent.VK_D]=false;
		keys[KeyEvent.VK_UP]=false;

	}

}
