import java.util.Iterator;

import javax.sql.rowset.spi.TransactionalWriter;

public class DinerMenuIterator implements Iterator<MenuItem> {
	private MenuItem[] menuItems;
	private int posicion = 0;

	public DinerMenuIterator(MenuItem[] menuItems) {
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		if (posicion >= menuItems.length || menuItems[posicion] == null) {
			return false;
		}
		return true;
	}

	@Override
	public MenuItem next() {
		MenuItem item = menuItems[posicion];
		posicion++;
		return item;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		if(posicion<0){
			throw new IllegalStateException("no se puede eliminar");
		}
		
		if(menuItems[posicion-1]!=null){
			for (int i = posicion-1; i < menuItems.length-1; i++) {
				menuItems[i]=menuItems[i+1];
			}
			this.menuItems[posicion-1]=null;
		}
	}

}
