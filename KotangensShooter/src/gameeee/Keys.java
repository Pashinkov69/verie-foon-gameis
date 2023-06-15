package gameeee;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Keys extends KeyAdapter {
	public static int geroicheY = 4;
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
//	public static int getGeroicheY() {
//		return geroicheY;
//	}
//	public static void setGeroicheY(int geroicheY) {
//		Keys.geroicheY = geroicheY;
//	}
}
