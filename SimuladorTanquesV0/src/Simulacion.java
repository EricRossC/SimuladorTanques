import java.util.List;

public class Simulacion {

	private List<Tanque> lista;
	private Visualizador visualizador;

	public Simulacion(List<Tanque> lista, Visualizador visualizador) {
		this.lista = lista;
		this.visualizador = visualizador;
	}

	public void ejecutar(Mundo mundo) {

		while (true) {
			long now = System.currentTimeMillis();
			
			for(Tanque t : lista) {
				t.tick(now, mundo);
			}
			
			visualizador.mostrar(now, lista);
		}
	}

}
