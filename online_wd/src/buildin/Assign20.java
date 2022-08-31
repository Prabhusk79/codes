package buildin;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class Assign20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* create a charecter list & add,remove elements and iterate through it*/
		ArrayList<Character>c=new ArrayList<>();
		c.add('t');
		c.add('e');
		c.add('s');
		c.add('t');
		c.add('t');
		c.add('i');
		c.add('n');
		c.add('g');
		System.out.println(c);
		c.remove(4);
		System.out.println(c);
		for(Character x:c)
		{
			System.out.println(x);
		}
		
		
			/* create a float queue & add,remove element & iterate through it,retrive head of the queue*/
		ArrayBlockingQueue<Float>f=new ArrayBlockingQueue<>(4);
		f.add(12.5f);
		f.add(15.5f);
		f.add(24.37f);
		f.add(12.5f);
		System.out.println(f);
		f.remove((float)12.5);
		System.out.println(f);
		for(float ex:f)
		{
			System.out.println(ex);
		}
		System.out.println(f.peek());// retrive head of the queue
		
		
		/*create a double list,add & remove element and iterate through it*/
		ArrayList<Double>d=new ArrayList<>();
		d.add(48.56);
		d.add(56.12);
		d.add(37.28);
		System.out.println(d);
		d.remove(1);
		System.out.println(d);
		for(Double in:d)
		{
			System.out.println(in);
		}
		
	}

}
