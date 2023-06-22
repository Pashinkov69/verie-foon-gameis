public class Vrag extends Choveche{
	private final char simvol = 'V';
	public boolean alive = true;
	public char getSimvol(){
		return simvol;
	}
	public boolean checkHit(){
		return Main.strMatrix[2][x] == '^';
	}
	public void spawnVrag(int x){
		super.x = x;
		super.y = 1;
		Main.strMatrix[1][x]=simvol;
	}

}
