public class Choveche {
	public int x;
	public int y;
	public char simvol;
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
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}
