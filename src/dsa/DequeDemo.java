package dsa;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {

	public static void main(String[] args) {
		Deque<String> br = new ArrayDeque<String>();
		br.add("apple");
		br.add("sam");

		br.add("one");

		br.add("nokia");

		br.add("bb");
		br.poll();
		br.add("micr");
		br.element();
		br.peek();
		br.remove();
		for(String br1 : br) {
			System.out.println(br1);
		}

		
	}

}
