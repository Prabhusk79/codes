package polymorpism;

public class Triangle extends Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// over riden method
		
		Circle c=new Circle();
		c.area();
		
// over riding method
		Triangle t=new Triangle();
		t.area();
	}
	
public void area()
{
int b=25;
int h=18;
System.out.println("area of triangle is:"+(b*h)*0.5);
}
}
