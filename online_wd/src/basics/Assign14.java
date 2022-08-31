package basics;

public class Assign14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("area of triangle is"+Assign14.aot());//calling....public
Assign14 pof=new Assign14();//create new obj
pof.product();	
System.out.println("avg of three num is"+Assign14.average());
System.out.println("perimeter of sqare is"+Assign14.perimeter());
System.out.println("bmi is"+Assign14.bmi());
	}
	/*
	 find area of triangle using static method & return result
	 */
	public static float aot()
	{
		int b=25;
		int h=18;
		int sum=(b*h)*1/2;
		return sum;
	}
	/*
  find product of 3 float nums using non static method
	 */
  public void product()
  {
	  float f1=15.6f;
	  float f2=12.8f;
	  float f3=10.34f;
	  float sum=f1*f2*f3;
	  System.out.println("product of three float number is"+sum);
  }
  /*find avg of 3 nums &return result using static method
   */
  public static int average()
  {
	  int n1=25;
	  int n2=35;
	  int n3=30;
	  int sum=(n1+n2+n3)/3;
	  return sum;
  }
  /*perimeter of sqare return result using static method
   */
  public static float perimeter()
  {
	  float s=15.25f;
	  float sum=4*s;
	  return sum;
  }
  /*find bmi using static method
   */
  public static float bmi()
  {
	  float w=63.300f;
	  float h=1.72f;
	  float sum=w/(h*h);
	  return sum;
	  
  }
}
