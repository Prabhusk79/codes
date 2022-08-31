package test;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   // Create a tree set of type string, and add element,remove element & iterate through it
		
		TreeSet<String> ts=new TreeSet<>();
		ts.add("Tcs");
		ts.add("Wipro");
		ts.add("Cognizant");
		ts.add("Robert bosch");
		ts.add("Nothing");
		ts.add("Zogo");
		ts.add("Hcl");
		System.out.println(ts);
		ts.remove("Nothing");
		System.out.println(ts);
		for(String x:ts)
		{
			System.out.println(x);
		}
	}

}
