package gameeee;

public class Vrag extends Choveche{
	public static double speed;
	public Vrag() {
		super();
		this.speed = 1;
		this.simvol = '@';
	}

	public static double getSpeed() {
		return speed;
	}

	public static void setSpeed() {
		speed = (Math.random()*7)/10.0+0.7;
		System.out.println(speed);
	}

	public Vrag(int X, int Y, double speed) {
		super(X, Y);
		this.speed = speed;
		this.simvol = '@';
		// TODO Auto-generated constructor stub
	}

}
