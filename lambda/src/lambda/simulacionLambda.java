package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class simulacionLambda {
	public static void main(String[] args) {
		List<String> lista = Arrays.asList("mike", "zapata", "camilo", "ochoa");
		Collections.sort(lista, (String a, String b) -> {
			return b.compareTo(a);
		});
		Iterator<String> iterator1 = lista.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		Collections.sort(lista, (a, b) -> b.compareTo(a));
		Iterator<String> iterator2 = lista.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		List<String> stringCollection = new ArrayList<>();
		stringCollection.add("ddd2");
		stringCollection.add("aaa2");
		stringCollection.add("bbb1");
		stringCollection.add("aaa1");
		stringCollection.add("bbb3");
		stringCollection.add("ccc");
		stringCollection.add("bbb2");
		stringCollection.add("ddd1");
		
		
		Stream<String> stream=stringCollection.stream();
		stream.filter((s)->s.startsWith("aa")).forEach(System.out::println);
		stream.filter((s)->s.startsWith("ddd")).forEach(System.out::println);

	}
}