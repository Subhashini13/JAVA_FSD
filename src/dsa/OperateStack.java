package dsa;

import java.util.Stack;

public class OperateStack {
	public static void operate(Stack stack) {
		// TODO Auto-generated method stub
		for(int i = 0; i <=2; i++) {
			if((int)stack.pop() % 3 == 0) {
				int tmp = (int) stack.pop();
				stack.push(++tmp);
				stack.push(++tmp);

				
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		stack.push(18);
		stack.push(10);
		stack.push(24);
		stack.push(56);
		stack.push(27);
		operate(stack);
		for(Object stacks : stack) {
			System.out.println(stacks);
			
		}
	}

	

}
