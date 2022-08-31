package buildin;

import java.util.HashMap;

public class M1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,Double>h=new HashMap<>();
h.put(24,2.34);
h.put(18, 27.39);
h.put(7, 15.27);
h.put(12, 25.00);
System.out.println(h);
h.remove(18);
System.out.println(h);
System.out.println(h.get(7));
System.out.println(h.keySet());
for(Integer x:h.keySet())
{
	System.out.println(x+":"+h.get(x));
}
	}

}
