package dsa;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOperateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new LinkedList<Integer>();
		op(queue);
		Object[] ele = queue.toArray();
		for(Object element : ele) {
			System.out.println(element);
		}

	}

	public static void op(Queue queue) {
		// TODO Auto-generated method stub
		int[] numbers = {12,18,17,16,28,34,36};
		int count = 6;
		for(int num: numbers) {
			if(count == 0) {
				break;
			}
			if(num % count == 0) {
				queue.add(num);
				
			}
			--count;
		}
		
		
	}

}
