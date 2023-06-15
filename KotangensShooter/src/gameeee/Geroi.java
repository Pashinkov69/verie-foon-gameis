package gameeee;

public class Geroi extends Choveche{
	public static int points;

	public Geroi() {
		super();
		this.x = 14;
		this.points = 0;
		this.simvol = '*';
		// TODO Auto-generated constructor stub
	}

	public Geroi(int Y, int points) {
		super(14, Y);
		this.points = points;
		this.simvol = '*';
		// TODO Auto-generated constructor stub
	}
	
}
