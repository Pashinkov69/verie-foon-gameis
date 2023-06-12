package gameeee;
import Core.Terminal;
public class Main {
	
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
		String[][] strMatrix = new String[Msize][Msize];
		Bord.setMatrix(strMatrix);
		for(int i = 0; i<Msize; i++) {
			for(int j = 0; j<Msize; j++) {
				if(i==0||i==Msize-1)strMatrix[i][j] = "-";
				else if(j==0||j==Msize-1)strMatrix[i][j] = "|";
				else strMatrix[i][j] = " ";
			
			}
		}		
		Bord.printMatrix();
				
	}

}