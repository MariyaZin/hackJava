import java.awt.Color;
import java.awt.Component;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Tank {

	private int RIGHT = 50;
	private Point pos;
	private int size;
	private Color color;
	private ImageIcon icon;
	private JLabel tank_label;

	
	public Tank(Point pos) {
		
		this.pos = pos;
		tank_label = new JLabel();
		
		icon = new ImageIcon("tank_icon.png");
		System.out.println(icon.getIconHeight() + "" + icon.getIconWidth());
		
		tank_label.setIcon(icon);
//		tank_label.setText("This is Our Tank"); 
	}
	public JLabel getIcon(){
		tank_label.setVisible(true);
		return tank_label;
	}
}
