package optional;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class simulacionOptional {
	public static void main(String[] args) {
		List<Fruta> frutas = Arrays.asList(new Fruta("Pera"), new Fruta("Manzana"));
		Optional<Fruta> encontrada = find("Pera", frutas);
		if(encontrada.isPresent()){
			System.out.println(encontrada.get().getNombre());
		}
	}

	public static Optional<Fruta> find(String name, List<Fruta> frutas) {
		Iterator<Fruta> it = frutas.iterator();
		while (it.hasNext()) {
			Fruta fruta = it.next();
			if (fruta.getNombre().equals(name)) {
				return Optional.of(fruta);
			}
		}
		return Optional.empty();
	}
}
