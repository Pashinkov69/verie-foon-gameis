package gameeee;

public class Choveche {
	public static int x;
	public static int y;
	public static char simvol;
	public Choveche() {
		this.x = 1;
		this.y = 1;
		this.simvol = '#';
	}
	public Choveche(int X, int Y) {
		this.x = X;
		this.y = Y;
		this.simvol = '#';
	}
	public static int getX() {
		return x;
	}
	public static void setX(int x) {
		Choveche.x = x;
	}
	public static int getY() {
		return y;
	}
	public static void setY(int y) {
		Choveche.y = y;
	}
	
}
