package buildin;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashSet<Double>d=new LinkedHashSet<>();
d.add(27.56);
d.add(47.24);
d.add(38.91);
d.add(24.34);
System.out.println(d);
d.remove(24.34);
System.out.println(d);
for(Double x:d)
{
	System.out.println(x);
}
TreeSet<String>s=new TreeSet<>();
s.add("car");
s.add("zebra");
s.add("ant");
s.add("elephant");
s.add("rat");
System.out.println(s);
	}

}
