import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Window battlefield = new Window();
		
		battlefield.setVisible(true);
		battlefield.setSize(1000, 600);
		battlefield.setTitle("Tank Game");
		
		Terrain terrain = new Terrain();
		
		battlefield.add(terrain);
		terrain.setPreferredSize(new Dimension(battlefield.getSize()));
		terrain.setBackground(Color.DARK_GRAY);
		
		Tank firstTank = new Tank(new Point(200, 200));
		
		terrain.add(firstTank.getIcon());

	}

}
