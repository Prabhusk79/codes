package test;

public class Child1 extends Parent1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 obj=new Child1();
		obj.avg();
		obj.peri();
	}
    //  find perimeter of circle
	double r=22.75;
	public void peri()
	{
		System.out.println("perimeter of the circle is:"+(2*3.14*r));
	}
}
