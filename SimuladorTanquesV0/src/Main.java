import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Tanque> lista = new ArrayList<>();
		Mundo mundo = new Mundo(400, 300);
		
		lista.add(new Tanque("A", 4,4, 10,20));
		lista.add(new TanqueCurvo("B", 2,33, 20,13));
		lista.add(new Tanque("C", 15,2, 30,20));
		
		//Visualizador v = new VisualizadorTexto();
		Visualizador v = new VisualizadorVentana(mundo);
		
		Simulacion s = new Simulacion(lista, v);
		s.ejecutar(mundo);
	}

}
