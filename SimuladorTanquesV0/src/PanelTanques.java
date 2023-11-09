import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import javax.swing.JPanel;

public class PanelTanques  extends JPanel {
	private List<Tanque> lista;
	
	public PanelTanques()
	{
	    setBackground(Color.WHITE);
	    setOpaque(true);
	}
	
	@Override
	public void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    
		for(Tanque t : lista) {
			pintarTanque(t, g);
		}
	}
	private void pintarTanque(Tanque t, Graphics g) {
		if (t.getNombre().equals("A")) g.setColor(Color.RED);
		else if (t.getNombre().equals("B")) g.setColor(Color.BLUE);
		else if (t.getNombre().equals("C")) g.setColor(Color.GREEN);
		
		int w = 10, h = 10;
		double x = t.getX() - w/2;
		double y = t.getY() - h/2;
		
		g.drawOval((int)x, (int)y, w, h);
	}	
	public void mostrar(List<Tanque> lista) {
		this.lista = lista;
	}
}
