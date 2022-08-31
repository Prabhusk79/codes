package test;

public class Bmi_c extends Bmi_p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bmi_c obj=new Bmi_c();
		obj.health();
	}
	public void health()
	{
		float w=62.50f;
		double h=1.72;
		double sum=w/(h*h);
		System.out.println("your bmi is:"+sum);
	}
	

}
