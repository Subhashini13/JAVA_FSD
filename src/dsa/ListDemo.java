package dsa;

import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<Integer> e = new LinkedList<Integer>();
		e.add(10);
		e.add(12);
		e.add(33);
		e.add(44);
		e.add(75);
		e.add(67);
		int sum =0;
		int temp = 0;
		for(int ele : e) {
			temp = ele;
			while(temp != 0) {
				sum += temp % 10;
				temp = temp / 10;
				
				
			}
			if(sum % 2 == 0) {
				System.out.println("Infy");
			}
			
		}

	}

}
