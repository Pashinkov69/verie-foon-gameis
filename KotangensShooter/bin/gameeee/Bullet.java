import Core.Terminal;

public class Bullet extends Geroi{
	public int x;
	public int y;
	public boolean hit;
	public boolean isGut;
	private final char simvolche;
	public Bullet(int x, int y, boolean isGut, char simvol) {
		this.x = x;
		this.y = y;
		this.isGut = isGut;
		this.simvolche = simvol;
	}

	public void movePatron() {
		if(x!=1 && isGut){
			Main.strMatrix[x][y] = ' ';
			x--;
		}else if(x!=13 && !isGut){
			Main.strMatrix[x][y] = ' ';
			x++;
		}
		Main.strMatrix[x][y] = simvolche;
		if(x==1 || x==13) Main.strMatrix[x][y] = ' ';
	}
}
