package gameeee;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import Core.Terminal;
import Core.TerminalScheduleUpdate;


public class Main {
	public class Keys extends KeyAdapter {
		public static int geroicheY = 4;
		public static String[][] strMatrix;
		public static int Msize;
	    @Override
	    public void keyPressed(KeyEvent e) {
	    	if(e.getKeyCode() == KeyEvent.VK_A) {
	    		geroicheY--;
	    	}
	    	if(e.getKeyCode() == KeyEvent.VK_W) {
	    		
	    	}
	    	if(e.getKeyCode() == KeyEvent.VK_S) {
	    		
	    	}
	    	if(e.getKeyCode() == KeyEvent.VK_D) {
	    		geroicheY++;
	    	}
	    	
	    }
		

	public static void main(String[] args) {
		
		Terminal Bord = new Terminal(500, 500);
		Bord.setEditable(false);
		Bord.setResizeable(false);
		Bord.setBackgroundColor(40,40,40);
		Bord.setInitialDelay(40);
		Bord.setFontSize(26);
		Bord.setFont("Lucida Console");		
		Bord.setFontColor(50,170,50);
		Bord.run();
		int Msize = 15;
		strMatrix = new String[Msize][Msize];
		Bord.setMatrix(strMatrix);
		for(int i = 0; i<Msize; i++) {
			for(int j = 0; j<Msize; j++) {
				if(i==0||i==Msize-1)strMatrix[i][j] = "-";
				else if(j==0||j==Msize-1)strMatrix[i][j] = "|";
				else strMatrix[i][j] = " ";
			
			}
		}	
		Bord.setDelay(1);
		Bord.setSchedule(new TerminalScheduleUpdate() {
			
			
			@Override
			public void Update() {
				Geroi g = new Geroi();
			
			strMatrix[13][geroicheY] = "*";
				Bord.clear();
				Bord.printMatrix();
			}
		});
		
				
	}

}}