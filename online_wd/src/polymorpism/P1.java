package polymorpism;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub// overloading type
P1 ob=new P1();
ob.area();
ob.area(3);
ob.area(2.34);
	}
public void area()
{
	System.out.println("area");
}
public void area(int n)
{
System.out.println("area of sqare is"+n*n);	
}
public void area(double d)
{
	System.out.println("area of circle is"+3.14*d*d);
}

}
