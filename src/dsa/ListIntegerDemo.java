package dsa;

import java.util.LinkedList;
import java.util.List;

public class ListIntegerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> e = new LinkedList<Integer>();
		e.add(1);
		e.add(2);
		e.add(3);
		e.add(4);
		e.add(5);
		e.add(6);
		e.remove(1);
		e.add(3,34);
		e.set(5, 15);
		System.out.println(e);


	}

}
