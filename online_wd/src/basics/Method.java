package basics;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Method.m1();
Method.m2();
Method.sq();
Method.division();
Method.add();
	}
public static void m1()
{
	float l1=20.25f;
	float b1=25.34f;
	System.out.println("area of rectangle is"+l1*b1);
	
}
private static void m2()
{
int pn1=15;
int pn2=10;
System.out.println("output is"+pn1*pn2);
}
/*
 Find perimeter of square using static method
 */
public static void sq()
{
int side=19;
System.out.println("perimeter of square is"+4*side);
int l2=16;
int b2=8;
System.out.println("perimeter of rectangle is"+2*(l2+b2));
}
/*
 find division of two numbers using static method
 */
	private static void division()
	{
		float d1=256.6f;
		float d2=16.36f;
		System.out.println("division of two num is"+d1/d2);
		int pr1=18;
		int pr2=12;
		int sum=pr1*pr2;
		System.out.println("product of two num is"+sum);
	}
	/*
	 find addition of three float numbers
	 */
	public static void add()
	{
		float fn1=86.52f;
		float fn2=48.34f;
		float fn3=112.72f;
		float sum=fn1+fn2+fn3;
		System.out.println("add of three float num is"+sum);
	}
}

