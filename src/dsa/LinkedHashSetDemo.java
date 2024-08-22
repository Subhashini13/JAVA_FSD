package dsa;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Set<String> t = new LinkedHashSet<String>();
				t.add(new String("A"));
				t.add(new String("B"));

				t.add(new String("C"));

				t.add(new String("C"));

				t.add(new String("E"));

				t.add(new String("D"));
				t.add(new String("E"));
				t.add(null);

				Object[] ele = t.toArray();
				for(Object element : ele) {
					System.out.println(element);
				}

	}

}
