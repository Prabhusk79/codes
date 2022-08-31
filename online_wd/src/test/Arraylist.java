package test;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  // Create an array list of type Character, add elements,remove elements and iterate through it
		
		ArrayList<Character>al=new ArrayList<>();
		al.add('q');
		al.add('t');
		al.add('r');
		al.add('e');
		al.add('e');
		System.out.println(al);
		al.remove(4);
		System.out.println(al);
		for(char x:al)
		{
			System.out.println(x);
		}
	}

}
