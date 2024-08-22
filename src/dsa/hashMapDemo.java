package dsa;

import java.util.HashMap;
import java.util.Map;

public class hashMapDemo {

	public static void main(String[] args) {
		Map<Integer, Integer> hashMap = new HashMap<Integer,Integer>();
		for(int i = 0; i <=5; i++) {
			for(int i2 = 5; i2 >= 1 ; i2 --) {
				hashMap.put(i, i2);
			}
		}
		System.out.println(hashMap);
		

	}

}
