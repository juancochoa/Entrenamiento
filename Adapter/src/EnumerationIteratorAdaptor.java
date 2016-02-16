import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIteratorAdaptor<Coordenada> implements Enumeration<Coordenada> {

	private Iterator<Coordenada> iterator;

	public EnumerationIteratorAdaptor(Iterator<Coordenada> iterator) {
		this.iterator = iterator;
	}

	@Override
	public boolean hasMoreElements() {
		return iterator.hasNext();
	}

	@Override
	public Coordenada nextElement() {
		return iterator.next();
	}

}
