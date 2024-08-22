package dsa;

import java.util.ArrayList;
import java.util.List;

public class updateEmployee_Tester {

	public static void main(String[] args) {
		
		List<String> emp = new ArrayList<String>();
		emp.add("Alex");
		emp.add("Tom");
		emp.add("Sam");
		emp.add("John");
		emp.add("Jack");
		updateEmp(emp);
		for (String emp1 : emp) {
			System.out.println(emp1 + " ");
		}

	}

	public static void updateEmp(List<String> emp) {
		// TODO Auto-generated method stub
		String[] newEmp = {"John", "Jack", "robert", "Steve"};
		for(int i = 0; i <= newEmp.length - 1 ; i++ ) {
			if(!emp.contains(newEmp[i])) {
				emp.add(i+1, newEmp[i]);
			}
		}
		
	}

}
