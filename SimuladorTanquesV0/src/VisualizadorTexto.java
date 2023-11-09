import java.util.List;

public class VisualizadorTexto implements Visualizador {
	private int count = 0;
	
	public void mostrar(long now, List<Tanque> lista) {
		count++;
		if (count < 10000000) return;
		count = 0;
		
		System.out.println("------------------------");
		
		for(Tanque t : lista) {
			System.out.println(t.getNombre() +
					" " + t.getX() +
					" " + t.getY()
				);
		}
	}

}
