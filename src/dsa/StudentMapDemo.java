package dsa;

import java.util.HashMap;
import java.util.Map;

public class StudentMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> sD = new HashMap<String, Integer>();
		sD.put("Max", 337);
		sD.put("Stocks", 480);
		sD.put("Mlinda", 570);
		sD.put("Mathew", 640);
		sD.put("Max", 340);
		if(sD.replace("stocks", 480, 650)) {
			sD.remove("Max");
			
		}
		else {
			sD.put("Sam", 490);
		}
		
		System.out.println(sD);
		

	}

}
