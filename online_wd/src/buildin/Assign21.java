package buildin;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class Assign21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* create a hashmap(character key and integer element) add,remove element & iterate through it */
		HashMap<Character,Integer>hm=new HashMap<>();
		hm.put('p',16);
		hm.put('r',18);
		hm.put('a',1);
		hm.put('c',3);
		hm.put('b',2);
		hm.put('h',8);
		hm.put('u',21);
		System.out.println(hm);
		hm.remove('c');
		System.out.println(hm);
		System.out.println(hm.keySet());
		for(Character x:hm.keySet())
		{
			System.out.println(x+":"+hm.get(x));
		}
		
		/* create linked hashset (string) & add,remove element and iterate through it*/
	LinkedHashSet<String>lhs=new LinkedHashSet<>();
	lhs.add("tcs");
	lhs.add("wipro");
	lhs.add("infosis");
	lhs.add("hcl");
	lhs.add("oracle");
	lhs.add("cts");
	System.out.println(lhs);
	lhs.remove("oracle");
	System.out.println(lhs);
	for(String p:lhs)
	{
		System.out.println(p);
	}
	
	/* create a treemap(key double,element string) add,remove,retrivel element and iterate it*/
	TreeMap<Double,String>tm=new TreeMap<>();
	tm.put(84.57,"Tamil");
	tm.put(72.36,"English");
	tm.put(98.35,"Maths");
	tm.put(94.23,"Science");
	tm.put(97.87,"Social");
	System.out.println(tm);
	tm.remove(97.87);
	System.out.println(tm);
	System.out.println(tm.get(98.35));
	System.out.println(tm.keySet());
	for(Double n:tm.keySet())
	{
		System.out.println(n+":"+tm.get(n));
	}
	}
}
