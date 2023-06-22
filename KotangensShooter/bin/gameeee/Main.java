import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import Core.Terminal;
import Core.TerminalScheduleUpdate;


public class Main {
	public static char[][] strMatrix;
	public static int Msize;

	public static ArrayList<Bullet> bullets = new ArrayList<>();
	public static ArrayList<Vrag> vrags = new ArrayList<>();


	public static void main(String[] args) {
		
		Terminal Bord = new Terminal(500, 500);
		Bord.setEditable(false);
		Bord.setResizeable(false);
		Bord.setBackgroundColor(40,40,40);
		Bord.setInitialDelay(40);
		Bord.setFontSize(26);
		Bord.setFont("Lucida Console");		
		Bord.setFontColor(50,170,50);
		Keys key = new Keys();
		Bord.addKeyListener(key);
		Bord.run();
		int Msize = 15;
		strMatrix = new char[Msize][Msize];
		Bord.setMatrix(strMatrix);
		for(int i = 0; i<Msize; i++) {
			for(int j = 0; j<Msize; j++) {
				if(i==0||i==Msize-1)strMatrix[i][j] = '-';
				else if(j==0||j==Msize-1)strMatrix[i][j] = '|';
				else strMatrix[i][j] = ' ';
			}
		}
		for(int i=1; i<=13;i++){
			vrags.add(new Vrag());
			vrags.get(i-1).spawnVrag(i);
		}

		Bord.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_SPACE){
					bullets.add(new Bullet(12, Keys.geroicheY, true, '^'));
				}
			}
		});
		Bord.setDelay(350);
		Random ran = new Random();
		Bord.setSchedule(() -> {
			Geroi.createCharachter();
			for(Vrag vrag : vrags){
				if(vrag.checkHit()){
					if(vrag.alive){
						Geroi.points++;
						vrag.alive=false;
					}

				}
			}
			bullets.add(new Bullet(2, vrags.get(ran.nextInt(13)).getX(), false, '↓'));
			if(bullets.size()!=0){
				for (Bullet bullet : bullets) {
					bullet.movePatron();
					if(bullet.hit){
						bullets.remove(bullet);
					}
				}
			}

			Bord.printMatrix(strMatrix, true);
			Bord.println("Points: " + Geroi.points);
		});
	}
}