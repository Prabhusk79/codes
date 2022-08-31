package buildin;

import java.util.concurrent.ArrayBlockingQueue;

public class Que {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayBlockingQueue<Integer>i=new ArrayBlockingQueue<>(3);
i.add(5);
i.add(15);
i.add(7);
System.out.println(i);
i.remove(15);
System.out.println(i);
System.out.println(i.peek());
for(int x:i)
{
	System.out.println(x);
}
	}

}
