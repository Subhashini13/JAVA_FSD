//package dsa;
//
//import java.util.LinkedList;
//class Node{
//	int data;
//	Node next;
//	public Object getNext() {
//		// TODO Auto-generated method stub
//		return next;
//	}
//	public void setData(Object next2) {
//		// TODO Auto-generated method stub
//		this.data = data;
//		
//	}
//}
//public class LinkedListdatDemo {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		LinkedList l = new LinkedList();
//		l.add("11");
//		l.add("13");
//		l.add("18");
//		l.add("34");
//		l.add("46");
//		operate(l);
//		for(Object stacks : l) {
//			System.out.println(stacks);
//			
//		}
//		
//
//	}
//	public static void operate(LinkedList lst) {
//		Node temp = (Node) lst.get(0);
//		while(((Node) temp.getNext()).getNext() != null) {
//			temp.setData(temp.getNext().getData());
//			temp = (Node) temp.getNext();
//		}
//		
//	}
//
//}
