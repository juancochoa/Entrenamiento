import java.util.Iterator;

public interface Menu {
	Iterator<MenuItem> createIterator();
	String getDescripcion();
}
