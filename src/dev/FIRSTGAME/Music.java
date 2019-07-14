package dev.FIRSTGAME;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Music {
	 static Clip clip;
	 public static void musi(File sound)
	 {
		try {
			 clip=AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(sound));
				clip.start();
			clip.loop(Clip.LOOP_CONTINUOUSLY);
		}
		catch(Exception e) {
			
		}
	 }
	 public static void offmusi(File sound)
	 {
		 try {
				//Clip clip=AudioSystem.getClip();
				//clip.open(AudioSystem.getAudioInputStream(sound));
				//clip.start();
				//clip.loop(Clip.LOOP_CONTINUOUSLY);
			 clip.close();
			 
			}
			catch(Exception e) {
				
			}
	 }
	 
	 public static void hell(File sound)
	 {
		 try {
				Clip clip=AudioSystem.getClip();
				clip.open(AudioSystem.getAudioInputStream(sound));
				clip.start();
				//clip.loop(Clip.LOOP_CONTINUOUSLY);
			}
			catch(Exception e) {
				
			}
	 }
	 public static void finale(File sound)
	 {
		 try {
				Clip clip=AudioSystem.getClip();
				clip.open(AudioSystem.getAudioInputStream(sound));
				clip.start();
			}
			catch(Exception e) {
				
			}
	 }
}
