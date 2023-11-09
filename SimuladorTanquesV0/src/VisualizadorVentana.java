import java.awt.Dimension;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class VisualizadorVentana implements Visualizador {
	private PanelTanques panel;

	public VisualizadorVentana(Mundo mundo) {
		JFrame frame = new JFrame("Sim");
		//frame.setSize(mundo.getAncho(), mundo.getAlto());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new PanelTanques();
		panel.setPreferredSize(new Dimension(mundo.getAncho(), mundo.getAlto()));
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}

	private long prev = 0;

	@Override
	public void mostrar(long now, List<Tanque> lista) {
		panel.mostrar(lista);

		if (now - prev > 50) {
			panel.repaint();
			prev = now;
		}
	}

}
