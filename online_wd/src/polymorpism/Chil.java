package polymorpism;

public class Chil extends Par {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// overriden method
Chil obj=new Chil();
obj.area();

// overriding method
Chil obj1=new Chil();
obj1.area();
	}
public void area()
{
	double r=5.6;
	System.out.println("area of circle is:"+3.14*r*r);
}
}
