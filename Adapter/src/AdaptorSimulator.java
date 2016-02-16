import java.util.ArrayList;
import java.util.Iterator;

public class AdaptorSimulator {
	public static void main(String[] args) {
		ArrayList<Coordenada> coordenadas = new ArrayList();
		Coordenada coordenada;
		for (int i = 0; i < 4; i++) {
			coordenada = new Coordenada(i, (i + 1));
			coordenadas.add(coordenada);
		}
		Iterator<Coordenada> it = coordenadas.iterator();
		EnumerationIteratorAdaptor<Coordenada> adaptador = new EnumerationIteratorAdaptor(it);
		while (adaptador.hasMoreElements()) {
			coordenada=adaptador.nextElement();
			System.out.println("Coordenada x: " + coordenada.getX() + " Coordenada y: " + coordenada.getY());
		}
	}
}
