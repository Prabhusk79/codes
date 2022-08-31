package polymorpism;

public class Assign25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Assign25.add(15,35);                        //calling addition of 2 num using static method
Assign25.add(75,125,35);                    //calling addition of 3 num using static method

Assign25 ans=new Assign25();               //calling avg of 2 num using non static method
ans.avg(56.27f,87.23f);
ans.avg(120.65f,164.23f,186.12f);         //calling avg of 3 num using non static method
	}
/* overload a static method & find addition of two number and three numbers*/
	public static void add(int a,int b)
	{
		System.out.println("addition of two number is:"+(a+b));
	}
	public static void add(int a,int b,int c)
	{
		System.out.println("addition of three number is:"+(a+b+c));
	}
	
	/* overload a non static method and find average of two numbers and three numbers*/
	public void avg(float a,float b)
	{
		System.out.println("average of two number is:"+(a+b)/2);
	}
	public void avg(float a,float b,float c)
	{
		System.out.println("average of three number is:"+(a+b+c)/3);
	}
}
