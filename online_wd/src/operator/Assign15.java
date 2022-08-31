package operator;

public class Assign15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("unused")
Assign15 avg=new Assign15();

/*
 Find biggest of two numbers
 */
int num1=25;
int num2=34;
if (num1>num2) {
	System.out.println("biggest num is"+num1);
}
else
{
	System.out.println("biggest num is"+num2);
}
/*
 Find smallest of three number
 */
int a=30;
int b=45;
int c=52;
if(a<b && a<c)
{
	System.out.println("smallest number is"+a);
}
else if(b<a && b<c)
{
	System.out.println("smallest num is"+b);
}
else
{
	System.out.println("smallest num is"+c);
}


	}
	/*
	 Find average of three number using constructor
	 */
public Assign15()
{
	int n1=12;
	int n2=18;
	int n3=30;
	System.out.println("avg of three num is"+(n1+n2+n3)/3);
}
}
