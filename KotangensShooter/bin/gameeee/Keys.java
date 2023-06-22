import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Keys extends KeyAdapter{
	public static int geroicheY = 4;

    @Override
    public void keyPressed(KeyEvent e) {
    	if(e.getKeyCode() == KeyEvent.VK_A) {
    		Main.strMatrix[13][geroicheY] = ' ';
    		if(geroicheY!=1)geroicheY--;
    		
    	}
    	if(e.getKeyCode() == KeyEvent.VK_D) {
    		Main.strMatrix[13][geroicheY] = ' ';
    		if(geroicheY!=13)geroicheY++;
    	}
    }
}
