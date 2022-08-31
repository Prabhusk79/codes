package inheritance;

public class Child extends Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child.cs();
		
Child c=new Child();
c.cn();
Child.ps();
c.pn();
	}
	public static void cs()
	{
		System.out.println("child class static method");
		
	}
	public void cn()
	{
		System.out.println("child class nonstatic method");
	}
}
