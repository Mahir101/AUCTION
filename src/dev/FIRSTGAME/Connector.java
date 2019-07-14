package dev.FIRSTGAME;

public class Connector {
	public static int check = 0;

	public static boolean getCheck() {
		if (check == 1)
			return true;
		else
			return false;
	}

	public static void setCheck(int check) {
		Connector.check = check;
	}

}
