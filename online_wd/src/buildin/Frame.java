package buildin;

import java.util.ArrayList;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>s=new ArrayList<>();
s.add("java");
s.add("python");
s.add("ruby");
s.add("perl");
System.out.println(s);
s.remove(2);
System.out.println(s);
System.out.println(s.get(0));
for(String x:s)
{
	System.out.println(x);
}
	}

}
