package test;

import java.util.LinkedHashMap;

public class Linkedhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // create a linked hash map(key:double,element:string). 1.add elements 2.remove elements. 3.retrive element
		
		LinkedHashMap<Double,String>lhm=new LinkedHashMap<>();
		lhm.put(88.56,"Tamil");
		lhm.put(68.95,"English");
		lhm.put(98.00,"Maths");
		lhm.put(94.23,"Science");
		lhm.put(97.23,"Social");
		lhm.put(35.00, "null");
		System.out.println(lhm);
		lhm.remove(35.00);
		System.out.println(lhm);
		System.out.println(lhm.get(98.00));
		
	}

}
